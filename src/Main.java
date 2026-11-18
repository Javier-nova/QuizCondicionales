import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;

        System.out.println("1. ¿Cuál es la capital de España?");
        String respuesta1 = sc.nextLine();

        if (respuesta1.equalsIgnoreCase("Madrid")) {
            System.out.println("¡Correcto!");
            puntos = puntos + 1;
        } else {
            System.out.println("¡Incorrecto! Era Madrid.");
        }

        System.out.println("2. ¿Que jugador de futbol es el mejor de la historia?");
        String respuesta2 = sc.nextLine();

        if (respuesta2.equalsIgnoreCase("Messi")) {
            System.out.println("¡Correcto!");
            puntos = puntos + 1;
        } else {
            System.out.println("¡Incorrecto! Era Messi");
        }

        System.out.println("3. ¿Cuantos Oceanos existen?");
        String respuesta3 = sc.nextLine();

        if (respuesta3.equalsIgnoreCase("5")) {
            System.out.println("¡Correcto!");
            puntos = puntos + 1;
        } else {
            System.out.println("¡Incorrecto! Eran 5");
        }

        System.out.println("4. ¿En que año se termino la Segunda Guerra Mundial?");
        String respuesta4 = sc.nextLine();

        if (respuesta4.equalsIgnoreCase("1945")) {
            System.out.println("¡Correcto!");
            puntos = puntos + 1;
        } else {
            System.out.println("¡Incorrecto! Era 1945");
        }

        System.out.println("5. ¿Cuantas Champions tiene el FC Barcelona?");
        String respuesta5 = sc.nextLine();

        if (respuesta5.equalsIgnoreCase("5")) {
            System.out.println("¡Correcto!");
            puntos = puntos + 1;
        } else {
            System.out.println("¡Incorrecto! Eran 5");
        }

        System.out.println("Has acertado " + puntos + " de 5 preguntas.");

        if (puntos == 5) {
            System.out.println("¡Perfecto!");
        } else if (puntos >= 3) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspendido");
        }

        sc.close();
    }
}