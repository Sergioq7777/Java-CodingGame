import java.util.Scanner;

public class PrintNormRevers {
    public static void printNormalReverse() {
        int arr[] = new int[10];
        System.out.println("type 10 numers: ");
        Scanner inputArr = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputArr.nextInt();
            System.out.println(i+")"+ arr[i]);
        }
        int k = 0;
        while (k<5){
            System.out.println("print: " + arr[k]);
            System.out.println("print: " + arr[9-k]);
            k++;
        }

    }
}
