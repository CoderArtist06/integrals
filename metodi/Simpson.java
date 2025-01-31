package metodi;

import java.util.function.DoubleUnaryOperator;

public class Simpson {
    private double a;
    private double b;
    private int n;
    private int m;
    private DoubleUnaryOperator f;
    
    private double risultato; // Variabile per memorizzare il risultato

    public Simpson(double a, double b, int n, DoubleUnaryOperator f) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.f = f;
        this.m = m;
        double h;
        double s0;
        double s1;
        double s2;
        
        m = n / 2;
        h = (b - a) / n;

        s0 = f.applyAsDouble(a) + f.applyAsDouble(b); // Valori agli estremi
        s1 = 0; // Somma per i punti dispari
        s2 = 0; // Somma per i punti pari

        for (int k = 1; k < n; k++) {
            double xk = a + k * h;
            if (k % 2 == 1) { // k dispari
                s1 += f.applyAsDouble(xk);
            } else { // k pari
                s2 += f.applyAsDouble(xk);
            }
        }

        double s = (h / 3) * (s0 + 4 * s1 + 2 * s2);
        
        this.risultato = s; // Memorizzo il risultato
    }

    public double getRisultato() {
        return risultato;
    }
}
