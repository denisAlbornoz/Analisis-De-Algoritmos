public class Fibonacci {

    public static int fibonacci(int n) {
        //Algoritmo para hallar el n-ésimo numero de la secuencia fibonacci

        int valor=0, a = 0, b = 1, c = 0;;

        if (n <= 1) {
            valor = n;
        }

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            valor=c;
        }

        return valor;
    }


}
