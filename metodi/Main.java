package metodi;

import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class Main {

    public static void main(String[] args) {
        double a, b;
        int[] n_values = {10, 100, 1000, 10000}; // Valori prefissati di n

        // Creazione dell'oggetto Scanner per leggere input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci gli estremi dell'intervallo per la funzione x^2+2.");
        System.out.print("Limite inferiore a: ");
        a = scanner.nextDouble();
        System.out.print("Limite superiore b: ");
        b = scanner.nextDouble();

        // Definizione della funzione f(x) = x^2 + 2
        DoubleUnaryOperator f = x -> Math.pow(x, 2) + 2;

        System.out.println("\nConfronto dei metodi di integrazione per diversi valori di n:\n");

        // Loop per confrontare i metodi con i diversi valori di n
        for (int i = 0; i < n_values.length; i++) {
        	int n = n_values[i];
            System.out.println("=== Risultati con n = " + n + " ===");

            Rettangolo rettangolo = new Rettangolo(a, b, n, f);
            Trapezi trapezi = new Trapezi(a, b, n, f);
            Simpson simpson = new Simpson(a, b, n, f);
            Montecarlo monteCarlo = new Montecarlo(a, b, n, f);

            System.out.println("Rettangoli: " + rettangolo.getRisultato());
            System.out.println("Trapezi: " + trapezi.getRisultato());
            System.out.println("Simpson: " + simpson.getRisultato());
            System.out.println("Monte Carlo: " + monteCarlo.getRisultato());
            System.out.println();
        }

        scanner.close();
    }
}

//made by CodeArtist06 (GitHub)