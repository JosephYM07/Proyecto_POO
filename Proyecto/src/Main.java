import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int opcion = 0;

    public static void main(String[] args) {
        while (opcion != 7) {
            opcion = mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    submenuAccion();
                    break;
                case 2:
                    submenuAventura();
                    break;
                case 3:
                    submenuCienciaFiccion();
                    break;
                case 4:
                    submenuComedia();
                    break;
                case 5:
                    submenuDrama();
                    break;
                case 6:
                    submenuTerror();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
            }
        }
    }

    public static int mostrarMenuPrincipal() {
        System.out.println("\n\tCartelera de Películas");
        System.out.println("1. Acción");
        System.out.println("2. Aventura");
        System.out.println("3. Ciencia Ficción");
        System.out.println("4. Comedia");
        System.out.println("5. Drama");
        System.out.println("6. Terror");
        System.out.println("7. Salir");
        System.out.print("\n~ Ingrese una opción: ");
        opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 7) {
            System.out.println("=================================================================================");
            System.out.println("\n[~ Ingrese una opción válida ~]");
            System.out.println("\n=================================================================================");
            System.out.print("\nDígite la opción: ");
            opcion = scanner.nextInt();
        }
        return opcion;
    }

    public static void submenuAccion() {
        // objetos de la clase Peliculas
        Peliculas pelicula1 = new Peliculas("Chad Stahelski", "Español", 2019, 131, "Nominado a Premio Razzie a la Redención (Keanu Reeves)", "Keanu Reeves", "John Wick (Keanu Reeves) regresa a la acción, solo que esta vez con una recompensa\n de 14 millones de dólares sobre su cabeza y con un ejército de mercenarios intentando darle caza.\n Tras asesinar a uno de los miembros del gremio de asesinos al que pertenecía, Wick es expulsado de la organización, \npasando a convertirse en el centro de atención de multitud de asesinos a sueldo que esperan detrás de\n cada esquina para tratar de deshacerse de él.");
        Peliculas pelicula2 = new Peliculas("Dave Wilson", "Español", 2020, 109, "Nominado a Premio Razzie a la Redención (Vin Diesel)", "Vin Diesel", "Ray Garrison (Vin Diesel) es un soldado caído en combate que es resucitado por el \ncientífico Emil Harting (Guy Pearce) mediante el uso de la nanotecnología. \nComo resultado de la reconstrucción de su cuerpo, Ray adquiere poderes sobrehumanos, \ncomo la capacidad de sanar rápidamente y la de cambiar de forma. Posteriormente, \nRay, que ahora se hace llamar Bloodshot, comienza a recordar quién era en realidad \ny, guiado por la venganza, se propone acabar con los responsables de la muerte de su esposa, \ncon la ayuda de Emil Harting.");
        int opcion;
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la película John Wick 3: Parabellum");
            System.out.println("2. Detalles de la película Bloodshot");
            System.out.println("3. Volver al menú principal");
            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("=================================================================================");
                System.out.println("\n[~ Ingrese una opción válida ~]");
                System.out.println("\n=================================================================================");
                System.out.print("\nDígite la opción: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {

                case 1:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA John Wick 3: Parabellum");
                        mostrarDetallesPelicula(pelicula1);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA Bloodshot");
                        mostrarDetallesPelicula(pelicula2);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    } while (opcion == 1);

                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
            }
        } while (opcion != 3);
    }

    public static void submenuAventura() {
        int opcion;
        Peliculas peliculas3 = new Peliculas("Jake Kasdan", "Español", 2017, 119, "Nominado a Premio Razzie a la Redención (Dwayne Johnson)", "Dwayne Johnson", "Cuatro adolescentes son absorbidos por un videojuego, en el que se convierten en avatares de personajes arquetípicos. \nAllí vivirán múltiples aventuras, al tiempo que buscan cómo salir de allí para volver a su mundo.");
        Peliculas peliculas4 = new Peliculas("Gavin Hood", "Inglés", 2013, 114, "19 Critics Choice Awards Mejor intérprete joven(Asa Butterfield", "Asa Butterfield", "es una película estadounidense del 2013 de ciencia ficción basada en la novela homónima de Orson Scott Card. \nEstá dirigida y escrita por Gavin Hood y los actores principales son Asa Butterfield ―en el papel de Andrew Ender Wiggin,\n un chico con talento inusual enviado a una avanzada escuela militar en el espacio para prepararse en la lucha contra las invasiones alienígenas―,\n Harrison Ford, Ben Kingsley, Hailee Steinfeld, Viola Davis, Abigail Breslin, Moisés Arias y Nonso Anozie.");
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la película Jumanji: En la selva");
            System.out.println("2. Detalles de la película El juego de Ender");
            System.out.println("3. Volver al menú principal");
            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("=================================================================================");
                System.out.println("\n[~ Ingrese una opción válida ~]");
                System.out.println("\n=================================================================================");
                System.out.print("\nDígite la opción: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA Jumanji: En la selva");
                        mostrarDetallesPelicula(peliculas3);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA El juego de Ender");
                        mostrarDetallesPelicula(peliculas4);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    } while (opcion == 1);
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
            }
        } while (opcion != 3);
    }

    public static void submenuCienciaFiccion() {
        int opcion;
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la película 1");
            System.out.println("2. Detalles de la película 2");
            System.out.println("3. Volver al menú principal");
            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("=================================================================================");
                System.out.println("\n[~ Ingrese una opción válida ~]");
                System.out.println("\n=================================================================================");
                System.out.print("\nDígite la opción: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("DETALLES DE LA PELÍCULA 1");
                    break;
                case 2:
                    System.out.println("DETALLES DE LA PELÍCULA 2");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
            }
        } while (opcion != 3);
    }

    public static void submenuComedia() {
        int opcion;
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la película 1");
            System.out.println("2. Detalles de la película 2");
            System.out.println("3. Volver al menú principal");
            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("=================================================================================");
                System.out.println("\n[~ Ingrese una opción válida ~]");
                System.out.println("\n=================================================================================");
                System.out.print("\nDígite la opción: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("DETALLES DE LA PELÍCULA 1");
                    break;
                case 2:
                    System.out.println("DETALLES DE LA PELÍCULA 2");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
            }
        } while (opcion != 3);
    }

    public static void submenuDrama() {
        int opcion;
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la película 1");
            System.out.println("2. Detalles de la película 2");
            System.out.println("3. Volver al menú principal");
            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("=================================================================================");
                System.out.println("\n[~ Ingrese una opción válida ~]");
                System.out.println("\n=================================================================================");
                System.out.print("\nDígite la opción: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("DETALLES DE LA PELÍCULA 1");
                    break;
                case 2:
                    System.out.println("DETALLES DE LA PELÍCULA 2");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
            }
        } while (opcion != 3);
    }

    public static void submenuTerror() {
        int opcion;
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la película 1");
            System.out.println("2. Detalles de la película 2");
            System.out.println("3. Volver al menú principal");
            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("=================================================================================");
                System.out.println("\n[~ Ingrese una opción válida ~]");
                System.out.println("\n=================================================================================");
                System.out.print("\nDígite la opción: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("DETALLES DE LA PELÍCULA 1");
                    break;
                case 2:
                    System.out.println("DETALLES DE LA PELÍCULA 2");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
            }
        } while (opcion != 3);
    }

    //Métodos para mostrar los detalles de las películas
    public static void mostrarDetallesPelicula(Peliculas pelicula) {
        System.out.println("\nDetalles de la película:");
        System.out.println("Director: " + pelicula.getDirector());
        System.out.println("Idioma: " + pelicula.getIdioma());
        System.out.println("Año: " + pelicula.getAnio());
        System.out.println("Duración: " + pelicula.getTiempo_duracion() + " minutos");
        System.out.println("Premios: " + pelicula.getPremios());
        System.out.println("Protagonista: " + pelicula.getProtagonista());
        System.out.println("Descripción: " + pelicula.getDescripcion());
    }
}
