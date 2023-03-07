package homework2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class task2 {
    public class BubbleSort {
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            bubbleSort(arr);
        }
    
        public static void bubbleSort(int[] arr) {
            try {
                FileWriter writer = new FileWriter("log.txt");
                writer.write("Original array: " + Arrays.toString(arr) + "\n");
    
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
    
                            writer.write("After iteration " + (i + 1) + ": " + Arrays.toString(arr) + "\n");
                        }
                    }
                }
    
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    }
    
}
