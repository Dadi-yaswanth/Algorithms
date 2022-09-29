//Time complexity of selection sort is: O(n^2)
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i = 0 ; i <5; i++){
            arr[i] =  sc.nextInt();
        }

        for(int i = 0; i<size; i++ ){
            int index = i;
            for(int j = i+1; j <size; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }
        for (int a: arr){
            System.out.print( a +" ");
        }
    }
}
