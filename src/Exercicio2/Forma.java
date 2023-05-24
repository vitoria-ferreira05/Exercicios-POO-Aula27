package Exercicio2;

import java.util.Random;

public abstract class Forma {

    public Forma() {
    }

    Forma[] forma = new Forma[5];

    public abstract float calcularArea();

    public abstract float calcularPerimetro();
}

