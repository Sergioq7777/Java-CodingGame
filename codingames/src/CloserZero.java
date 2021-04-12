public class CloserZero {
    public static int masCercano(int[] numeros, int numero) {

        int menor = 0;
        int mayor = 0;
        int cercano = 0;

        for (int i = 0; i < numeros.length ; i++) {

            if (numeros[i] == numero) {
                return numeros[i];
            } else if (numeros[i] < numero) {
                menor = numeros[i];
            } else if (numeros[i] > numero) {
                mayor = numeros[i];
            }
        }

        if ((mayor - numero) < (numero - menor)) {
            cercano = mayor;
        } else {
            cercano = menor;
        }

        return cercano;

    }
}
