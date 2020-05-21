package Circulo;

public class Circulo implements Comparable<Circulo> {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return Math.PI * radio * 2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public int compareTo(Circulo c) {
        if (c.getRadio() > radio) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return String.format("Radio: %.2f Perimetro: %.2f Area: %.2f%n", radio, perimetro(), area());
    }

}
