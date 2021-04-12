public class Findenumber {

    public  static boolean BuscarNumero(int n, int arr[]){
        int cont=0;
        int k =0;

        boolean encontrado = false;

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]){
                cont++;
            }
            if (cont>0){
                k++;
                System.out.println("El numero "+ n  +" se encontro en el "+ k +" espacio");
                encontrado=true;
                break;
            }else {
                k++;
                //System.out.println("Se busco el numero en: " + k);
                encontrado=false;
            }

        }
        return encontrado;
    }
}
