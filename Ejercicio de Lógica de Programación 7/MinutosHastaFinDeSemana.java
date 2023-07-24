package LogicaDeProgramacionJava;

import java.util.Scanner;

public class MinutosHastaFinDeSemana {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Solicitar al usuario el día de la semana y la hora (horas y minutos)
        String diaSemana;
        int horas, minutos;

        // Validación del día de la semana
        do {
            System.out.print("Ingresa un día de la semana (Lunes - Viernes): ");
            diaSemana = scanner.nextLine().trim().toLowerCase();
        } while (!esDiaSemanaValido(diaSemana));

        // Validación de las horas
        do {
            System.out.print("Ingresa la hora (horas): ");
            horas = scanner.nextInt();
        } while (horas < 0 || horas > 23);

        // Validación de los minutos
        do {
            System.out.print("Ingresa los minutos: ");
            minutos = scanner.nextInt();
        } while (minutos < 0 || minutos > 59);

        scanner.close();

        // Paso 3: Calcular cuántos minutos faltan para el fin de semana
        int minutosHastaFinDeSemana = calcularMinutosHastaFinDeSemana(diaSemana, horas, minutos);

        // Paso 4: Mostrar el resultado por un mensaje en la consola
        System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana.");
    }

    // Método para verificar si el día de la semana es válido
    public static boolean esDiaSemanaValido(String diaSemana) {
        return diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miércoles")
                || diaSemana.equals("miercoles") || diaSemana.equals("jueves") || diaSemana.equals("viernes");
    }

    // Método para calcular cuántos minutos faltan para el fin de semana
    public static int calcularMinutosHastaFinDeSemana(String diaSemana, int horas, int minutos) {
        int minutosDesdeViernesInicio = 0;

        switch (diaSemana) {
            case "lunes":
                minutosDesdeViernesInicio = (4 * 24 * 60) + (15 * 60) - (horas * 60 + minutos);
                break;
            case "martes":
                minutosDesdeViernesInicio = (3 * 24 * 60) + (15 * 60) - (horas * 60 + minutos);
                break;
            case "miércoles":
            case "miercoles":
                minutosDesdeViernesInicio = (2 * 24 * 60) + (15 * 60) - (horas * 60 + minutos);
                break;
            case "jueves":
                minutosDesdeViernesInicio = (1 * 24 * 60) + (15 * 60) - (horas * 60 + minutos);
                break;
            case "viernes":
                minutosDesdeViernesInicio = (15 * 60) - (horas * 60 + minutos);
                break;
        }

        return minutosDesdeViernesInicio;
    }

}
