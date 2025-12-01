import java.io.FileWriter;
import java.io.PrintWriter;
public class Fibonacci {

    public static int fibonacciIterativo(int n) {
        int a = 0, b = 1, c = 0, valor;

        if (n == 0) {
            valor = 0;
        } else if (n == 1) {
            valor = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            valor = c;
        }
        return valor;
    }
    public static int fibonacciRecursivo(int n) {

        int valor;

        if (n <= 1) {
            valor= n;
        }else{
            valor=fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
        }

        return valor;
    }

    public static void main(String[] args) {
        int[] pruebas = {5, 10, 20, 30, 35, 40};

        try (PrintWriter salida = new PrintWriter(new FileWriter("tiempos_fibonacci.txt"))) {

            salida.println("n\tIterativo(ns)\tRecursivo(ns)");

            for (int n : pruebas) {
                long inicioIter = System.nanoTime();
                fibonacciIterativo(n);
                long finIter = System.nanoTime();
                long tiempoIter = finIter - inicioIter;

                long inicioRec = System.nanoTime();
                fibonacciRecursivo(n);
                long finRec = System.nanoTime();
                long tiempoRec = finRec - inicioRec;

                salida.println(n + "\t" + tiempoIter + "\t" + tiempoRec);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}



