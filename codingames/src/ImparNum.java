import java.util.Scanner;

public class ImparNum {
    public static void imparNum() {

        int numScanner[] = new int[10];

        int cont = 1;

        System.out.println("type a number to identify: ");
        Scanner inputNum = new Scanner(System.in);

        for (int k = 0; k < numScanner.length; k++) {
            do {
                numScanner[k] = inputNum.nextInt();
                System.out.println(cont+") "+numScanner[k] );
                ++cont;
                if (numScanner[k]%2 != 0){
                    for (int i = 0; i < numScanner.length ; i++) {
                        System.out.println(numScanner[i]);
                    }
                    System.out.println("");
                }
            }while (numScanner[k]%2==0);
            System.out.println("Its impar with: " + numScanner[k]);
        }

    }
}
