package co.edu.utadeo;

import java.util.Scanner;

import static co.edu.utadeo.Resultado.resultado;

public class App {

    public static void main(String[] args) {

        int tamano = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, ingresa un valor: ");
        String[] operacion = new String[tamano];

        //Se crea un for que ejecuta los ciclos del ejercicio
        for (int i = 0; i < tamano; i++) {
            operacion[i] = scanner.nextLine();
            System.out.println(resultado(operacion[i]));
        }

    }

}
