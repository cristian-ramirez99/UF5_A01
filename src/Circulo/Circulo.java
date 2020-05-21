package Circulo;

public class Circulo {

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

}
