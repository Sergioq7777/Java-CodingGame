import java.util.Scanner;

// type numer till fin a zero
public class Difzero {
    public static void DizFzero() {

        int suma = 0;
        int inpuntNum = 0;
        int cont = 0;

        Scanner inPutN = new Scanner(System.in);


        System.out.println("Type a numember: ");
        do {
            inpuntNum = inPutN.nextInt();
            suma += inpuntNum;
            cont++;
            System.out.println(cont+") " +"("+inpuntNum+")"+ " = " + suma);
        }while (inpuntNum != 0);
        System.out.println("Till this number the summatory is: " + suma);
    }
}
