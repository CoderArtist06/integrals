package metodi;

import java.util.function.DoubleUnaryOperator;

public class Rettangolo {

    private double a;
    private double b;
    private int n;
    private DoubleUnaryOperator f;

    private double h;
    private double s;

    // Costruttore con parametri
    public Rettangolo(double a, double b, int n, DoubleUnaryOperator f) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.f = f;
        this.h = h;
        this.s = s;

        // Calcolo del passo dell'integrazione
        h = (double) (b - a) / n;
        s = 0; // Somma inizializzata a zero

        // Calcolo la somma dei valori della funzione nei punti giusti
        for (int k = 0; k < n; k++) {
            double xk = a + k * h;  // Calcolo il punto xk
            s += f.applyAsDouble(xk); // Sommo i valori della funzione
        }

        // Moltiplichiamo la somma per il passo h
        s *= h;
    }

    // Metodo per ottenere il risultato finale
    public double getRisultato() {
        return s;
    }
}