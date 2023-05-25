package Exercicio2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Forma forma[] = new Forma[5];

        Retangulo retangulo = new Retangulo(7, 2);
        Circulo circulo = new Circulo(2);
        Quadrado quadrado = new Quadrado(7, 2);


        retangulo.setAltura(2);
        retangulo.setLado(8);
        circulo.setRaio(2);
        quadrado.setAltura(2);
        quadrado.setLado(7);

        System.out.println("AREA E PERIMETRO DO RETANGULO");
        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());
        System.out.println("AREA E PERIMETRO DO CIRCULO");
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println("AREA E PERIMETRO DA AREA");
        System.out.println("Area: " + quadrado.calcularArea());
        System.out.println("Perimetro: " + quadrado.calcularPerimetro());


        for (int i = 0; i < forma.length; i++) {
            int numero = random.nextInt(3);
            switch (numero) {
                case 0:
                    forma[i] = retangulo;
                    break;
                case 1:
                    forma[i] = circulo;
                    break;
                case 2:
                    forma[i] = quadrado;
                    break;
            }
        }

        for (Forma formas : forma) {
            System.out.println(formas.calcularArea());
            System.out.println(formas.calcularPerimetro());
        }
    }
}

