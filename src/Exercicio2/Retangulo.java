package Exercicio2;

class Retangulo extends Forma {
    private float lado, altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;

    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(int i) {
        this.lado = lado;
    }

    @Override
    public float calcularPerimetro() {
        float p = 2 * (getAltura() + getLado());
        return p;
    }

    @Override
    public float calcularArea() {
        return getAltura() * getLado();
    }
}
