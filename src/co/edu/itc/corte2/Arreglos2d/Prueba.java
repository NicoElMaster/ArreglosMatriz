//                  ENUNCIADO : Elabore un programa en Java el cual permita al usuario ingresar las calificaciones de tres materias 
//                      (Matemáticas, Español e Inglés) para un conjunto de estudiantes. Luego, calcula y muestra los promedios
//                                      de cada estudiante y presenta la matriz de calificaciones ingresadas.

package co.edu.itc.corte2.Arreglos2d;

import java.util.Scanner;

public class Prueba {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Double[][] calificaciones = new Double[3][5];
        System.out.println("          Bienvenido al programa de digitación de notas");
        System.out.println("               Realizado por Nicolas Moreno Jiménez");
        System.out.println("\nDigita tu nombre y apellido :");
        String nombre = sc.nextLine();
        System.out.println("\nBienvenido "+ nombre);
        System.out.println("\nDigita el semestre que estas cursando :");
        String semestre = sc.nextLine();
        System.out.println("\nTener en cuenta lo siguiente :");
        System.out.println("Son 3 materias y los números de cada una son los siguientes : "+"\n(Recordar que en informática siempre se inicia desde 0)"+"\n0 - Matemáticas"+"\n1 - Español"+"\n2- Inglés");
        System.out.println("\nAhora si, por favor digite sus notas :");

        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.println("\nDigite la nota " + j + " para la materia " + i);
                calificaciones[i][j] = Double.parseDouble(sc.next());
            }
        }

        System.out.println("\nVamos a ver la matriz creada :");
        Double[] miPromedio = calcularPromedio(calificaciones);
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");

            }
            System.out.println("");
        }

        System.out.println("\nLos promedios son :");
        for (Double d : miPromedio) {
            System.out.println(d);
        }
        System.out.println("\nGracias por utilizar mi programa "+nombre+" espero termines de cursar tu "+semestre+ " semestre con éxito");
    }

    public static Double[] calcularPromedio(Double[][] notas) {
        Double[] promedios = new Double[3];

        for (int i = 0; i < notas.length; i++) {
            Double prom = 0D;
            for (int j = 0; j < notas[i].length; j++) {
                prom += notas[i][j];
                promedios[i] = prom;
            }
            promedios[i] = promedios[i] / notas[i].length;
        }
        return promedios;

    } 

}
