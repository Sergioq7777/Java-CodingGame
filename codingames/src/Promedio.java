import java.util.Scanner;

//Sacar promedio de numero positivos y negativos
public class Promedio {
    public static void PromNum() {
        // ------ positivos
        int sumaPositivos = 0;
        int contP = 0;
        int promedioP = 0;
        int numMayorP = 0;

        /// ----- negativos
        int sumaNegativos = 0;
        int contN = 0;
        double promedioN = 0;
        int numMayorN = 0;

        //

        // ------ Scaner
        int inputNum = 0;
        Scanner inputN = new Scanner(System.in);
        System.out.println("Type random numbers:  ");
        // Contador
        int k = 0;
        int cantidadZero = 0;
        int contZero = 0;


        while (k<10){
            inputNum = inputN.nextInt();

            // se aumenta en cero, cada vez que se escribe uno.
            if (inputNum == 0){
                cantidadZero += inputNum;
                contZero ++;
                System.out.println(contZero+")"+ inputNum );

            }
            else if(inputNum>0){
                sumaPositivos += inputNum;
                contP ++;
                System.out.println(contP+")"+"Num: "+inputNum );
                if (inputNum>numMayorP)numMayorP=inputNum;


            }
            else if(inputNum<0){
                sumaNegativos += inputNum;
                contN ++;
                System.out.println(contN+")"+"Num: "+inputNum );
                if (inputNum>numMayorN)numMayorN=inputNum;

            }
            k++;
        }
        promedioP = sumaPositivos/contP;
        promedioN = sumaNegativos/contN;

        System.out.println("\n");
        System.out.println("Cantidad de ceros: " + contZero);
        System.out.println("Suma positivo : "+ sumaPositivos);
        System.out.println("Promedio positivo : "+ promedioP);
        System.out.println("Numero mayor Positivos : "+ numMayorP);
        System.out.println("Suma negativo : "+ sumaNegativos);
        System.out.println("Promedio negativo : "+ promedioN);
        System.out.println("Numero mayor Negativos : "+ numMayorN);

    }
}
