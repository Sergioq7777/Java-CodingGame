import java.util.Scanner;


public class Ventas{

    public static String[] MONTHS = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };

    public static void ventasAño() {

        //Create an Array with x positions to use the Scaner in order to fill it with the info
        double sellYear[] = new double[12];
        System.out.println("Type month sell: ");
        Scanner inputVentas = new Scanner(System.in);
        double total = 0;
        double tot = 0;
        String inS = "yes";

        //This for run the length of the months and the same time asign
        // a new number to each month.
        for (int i = 0; i < MONTHS.length; i++) {
            sellYear[i] = inputVentas.nextDouble();
            total++;
            tot = total * sellYear[i];
            System.out.println("month: " + MONTHS[i] + ": " + sellYear[i] + "\n");

            if (sellYear[i] > 70) {
                System.out.println("Are you sure? ...");
                Scanner inSure = new Scanner(System.in);
                inS = inSure.next();
            }if (inS.equals("no")){
                break;
            }

        }

        System.out.println("Total ventas en el año: " + tot +"$");



    }


}

