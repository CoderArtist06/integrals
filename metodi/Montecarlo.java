package metodi;

import java.util.Random;
import java.util.function.DoubleUnaryOperator;

public class Montecarlo {
    private double a, b;
    private int n;
    private DoubleUnaryOperator f;
    private double risultato;

    public Montecarlo(double a, double b, int n, DoubleUnaryOperator f) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.f = f;
        this.risultato = risultato;
        
        Random rand = new Random();
        double somma = 0;

        for (int i = 0; i < n; i++) {
            double x = a + (b - a) * rand.nextDouble(); // Genera x casuale tra [a, b]
            somma += f.applyAsDouble(x); // Valuta f(x) e somma
        }

        risultato = (b - a) * (somma / n); // Formula Monte Carlo
    }

    public double getRisultato() {
        return risultato;
    }
}
