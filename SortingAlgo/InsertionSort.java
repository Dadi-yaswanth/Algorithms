//Time complexity is O(n)--> for iteration O(n) and for swap O(1) so, O(n)+O(1) = O(n)
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int userSize = sc.nextInt();
        int[] arr = new int[userSize];
        
        // we are using for and while loop!
        for(int i = 0 ; i <userSize; i++){
            arr[i] =sc.nextInt();
                 if(i>=1){
                     int j = i;
                     while (j>0){
                         if (arr[j] <arr[j - 1]) {
                             int temp = arr[j - 1];
                             arr[j - 1] = arr[j];
                             arr[j] = temp;
                         }else{break;}
                         j--;
                     }
            }
        }

        for(int a: arr){
            System.out.print(a+" " );
        }
    }
}
