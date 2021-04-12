import java.util.Scanner;

public class PrintReverse {
    public static void Print_Reverse() {

        int arr[] = new int[5];
        int i = 0;

        System.out.println("Type random numbers: ");
        Scanner inputArr = new Scanner(System.in);

        for (;i < arr.length ; i++) {
            arr[i] = inputArr.nextInt();
            System.out.println(i+")" + arr[i]);
        }
        // its four becouse of the positions of the array
        int k = 4;
        while (k>=0){
            System.out.print(arr[k] + "\n");
            k--;
        }
        System.out.print("\n");
        for (int j = 4; j >= 0 ; j--) {
            System.out.print(arr[j]);
        }




    }
}
