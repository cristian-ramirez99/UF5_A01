package base;

import Circulo.Circulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    List<Circulo> circulos = new ArrayList<>();

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    private void start() {
        generarLista();
        preguntarUsuario();
        imprimirLista();
    }

    private void generarLista() {
        double radio;
        do {
            radio = generateRandomNum();

            if (radio >= 0.01) {
                circulos.add(new Circulo(radio));
            }
        } while (radio >= 0.01);
    }

    private void ordenarAscendente() {
        Collections.sort(circulos);
    }

    private void ordenarDescendente() {
        Collections.sort(circulos, Collections.reverseOrder());
    }

    private void preguntarUsuario() {
        Scanner scanner = new Scanner(System.in);

        boolean datoOk = false;
        int respuesta;
        do {
            System.out.println("Introduce la opcion deseada:\n"
                    + "1-Ordenar de manera ascendente\n"
                    + "2-Ordenar de manera descendente\n");
            if (scanner.hasNextInt()) {
                respuesta = scanner.nextInt();
                datoOk = menu(respuesta);
            } else {
                System.out.println("Introduce un respuesta valida\n");
                scanner.nextLine();
            }
        } while (!datoOk);
    }

    private boolean menu(int respuesta) {
        switch (respuesta) {
            case 1:
                ordenarAscendente();
                return true;
            case 2:
                ordenarDescendente();
                return true;
            default:
                return false;
        }
    }

    private void imprimirLista() {
        int index = 0;
        for (var circulo : circulos) {
            System.out.println("Circulo " + (++index) + ":\n" + circulo);
        }
    }

    private double generateRandomNum() {
        return Math.random();
    }
}
