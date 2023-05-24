package Exercicio2;

class Circulo extends Forma {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        float a = (float) (3.14 * (raio * raio));
        return a;
    }

    @Override
    public float calcularPerimetro() {
        float c = (float) (2 * 3.14 * raio);
        return (float) c;
    }
}
