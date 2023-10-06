/**
 * Este programa realiza la simulación del encadenamiento y una aplicación que permite al usuario agregar elementos
 * a una lista de listas y luego mostrar estas listas. El programa utiliza un menú de opciones
 * para que el usuario pueda seleccionar diferentes acciones.
 *
 *
 * @author Oscar Abraham de la Cruz López
 * @author Grecia
 * @author Yael
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * Método principal del programa
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crear una lista de 15 listas de enteros (con índices de 0 a 14)
        /**
         * @param listaDeListas Lista de listas de enteros. Cada lista de enteros representa una lista de elementos
         */
        ArrayList<ArrayList<Integer>> listaDeListas = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            listaDeListas.add(new ArrayList<>());
        }

        // Crear un objeto Scanner para leer la entrada del usuario
        /**
         * @param sc Objeto Scanner para leer la entrada del usuario
         */
        Scanner sc = new Scanner(System.in);

        // Crear un objeto Random para generar números aleatorios
        /**
         * @param rnd Objeto Random para generar números aleatorios
         */
        Random rnd = new Random();

        // Crear una variable para almacenar la opción del usuario
        /**
         * La opción del usuario es un número entero que indica la acción que quiere realizar.
         * El número 1 indica que el usuario quiere agregar un elemento a una lista. El número
         * 2 indica que el usuario quiere mostrar la lista de listas. El número 3 indica que
         * el usuario quiere salir del programa.
         */
        int opcion;

        // Crear un bucle do-while para repetir el menú hasta que el usuario elija salir
        do {
            // Mostrar el menú de opciones
            System.out.println("Menú de opciones:");
            System.out.println("1) Agregar elemento");
            System.out.println("2) Mostrar lista de listas");
            System.out.println("3) Salir");

            // Leer la opción del usuario
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            // Usar un switch para ejecutar la acción correspondiente a la opción elegida
            switch (opcion) {
                case 1 -> {
                    // Agregar elemento
                    // Leer el elemento que quiere agregar el usuario
                    System.out.print("Ingrese el elemento que quiere agregar: ");
                    int elemento = sc.nextInt();

                    // Generar un número aleatorio entre 0 y 14
                    int indice = rnd.nextInt(15);

                    // Agregar el elemento a la lista que corresponde al índice generado
                    listaDeListas.get(indice).add(elemento);

                    // Mostrar un mensaje de confirmación
                    System.out.println("Se ha agregado el elemento " + elemento + " a la lista " + indice);
                }
                case 2 -> {
                    // Mostrar lista de listas
                    // Recorrer la lista de listas y mostrar cada una de sus elementos
                    for (int i = 0; i < listaDeListas.size(); i++) {
                        System.out.print("Lista " + i + ": ");
                        for (int j = 0; j < listaDeListas.get(i).size(); j++) {
                            System.out.print(listaDeListas.get(i).get(j) + " ");
                        }
                        System.out.println();
                    }
                }
                case 3 ->
                    // Salir
                    // Mostrar un mensaje de despedida
                        System.out.println("Gracias por usar este programa. Hasta pronto.");
                default ->
                    // Opción inválida
                    // Mostrar un mensaje de error
                        System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 3);

        // Cerrar el objeto Scanner
        sc.close();
    }
}
