package metodi;

import java.util.function.DoubleUnaryOperator;

public class Trapezi {

    private double a;
    private double b;
    private int n;
    private DoubleUnaryOperator f;

    private double h;
    private double s;

    public Trapezi(double a, double b, int n, DoubleUnaryOperator f) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.f = f;
        this.h = h;
        this.s = s;

        // Calcolo del passo dell'integrazione
        h = (double) (b - a) / n;
        s = 0; // Somma inizializzata a zero

        // Calcolo della somma usando la formula dei trapezi
        s += (f.applyAsDouble(a) + f.applyAsDouble(b)) / 2; // Aggiungo i bordi (a e b)

        for (int k = 1; k < n; k++) {
            double xk = a + k * h;  // Calcolo il punto xk
            s += f.applyAsDouble(xk); // Sommo i valori della funzione
        }

        s *= h; // Moltiplichiamo la somma per il passo h
    }

    public double getRisultato() {
        return s;
    }
}
