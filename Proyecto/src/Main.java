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
                        System.out.println("DETALLES DE LA PELÍCULA JOHN WICK 3: PARABELLUM");
                        mostrarDetallesPelicula(pelicula1);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA BLOODSHOT");
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
                        System.out.println("DETALLES DE LA PELÍCULA JUMANJI: EN LA SELVA");
                        mostrarDetallesPelicula(peliculas3);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA EL JUEGO DE ENDER");
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
        Peliculas peliculas5 = new Peliculas("George Lucas", "Inglès", 1977, 136, "MTV Movie Award a Mejor Escena de Acción", "Obi-Wan Kenobi (Ewan McGregor)", "La trama descrita en las nueve películas que componen la serie principal de Star Wars relata las vivencias de la familia Skywalker,17 «hace mucho tiempo en una galaxia muy muy lejana»,18 cuyos integrantes son capaces de percibir y utilizar «La Fuerza», lo cual les permite desarrollar habilidades como la telequinesis, la clarividencia y el control mental, entre otras.");
        Peliculas peliculas6 = new Peliculas("James Gunn", "Inglés", 2014, 122, "Premio Kerrang! a la Mejor Película", "Star-Lord (Steve Englehart)", "En 1988, tras la muerte de su madre, un joven, Peter Quill es abducido de la Tierra por los Devastadores (Ravagers, en inglés), un grupo de piratas espaciales liderados por Yondu Udonta. Veintiséis años más tarde en el planeta Morag, Quill roba un artefacto en forma de esfera, solo para ser interceptado por Korath el Perseguidor, un subordinado de un fanático Kree llamado Ronan el Acusador. A pesar de que Quill escapa con el artefacto, Yondu descubre su robo y publica una recompensa por su captura, mientras que Ronan envía a la asesina Gamora tras el Orbe, el cual Ronan busca dar al malvado titán Thanos a cambio de la destrucción de los Xandarianos.");
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la película Star Wars");
            System.out.println("2. Detalles de la película Guardianes de la Galaxia: ");
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
                        System.out.println("DETALLES DE LA PELÍCULA STAR WARS");
                        mostrarDetallesPelicula(peliculas5);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA GUARDIANES DE LA GALAXIA");
                        mostrarDetallesPelicula(peliculas6);
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

    public static void submenuComedia() {
        int opcion;
        Peliculas peliculas7 = new Peliculas("Dennis Dugan", "Inglés", 2010, 102, "MTV Movie Award a la Mejor Frase de una Película", "Lenny Feder (Adam Sandler)", "Cinco amigos que formaban un equipo de baloncesto ganaron un campeonato juvenil. Durante la celebración en una casa junto a un lago, su entrenador les anima a vivir sus vidas de la misma forma que jugaron el partido. Treinta años después, los cinco amigos, que permanecieron juntos hasta su graduación, han hecho sus vidas por separado y han perdido el contacto. Lenny Feder es un exitoso representante de estrellas de Hollywood, casado con Roxanne, una diseñadora de moda, y con tres hijos, Greg, Keithie y Becky. Lenny está molesto con el comportamiento consentido de Greg y Keithie, acostumbrados a todo tipo de privilegios y comodidades. Eric Lamonsoff dice ser el copropietario de una empresa de muebles, está casado con Sally, y tiene dos hijos, Donna y Bean. Sally sigue amamantando a Bean a pesar de que tiene cuatro años, lo que avergüenza a Eric. Kurt McKenzie es un amo de casa casado con Deanne, el principal sostén de la familia, y tiene dos hijos, Andre y Charlotte. Deanne está embarazada de un tercer hijo, y su madre Ronzoni vive con ellos. Rob Hilliard se ha divorciado tres veces y tiene tres hijas, Jasmine, Amber y Bridget, de sus anteriores matrimonios, a quienes apenas conoce. Su nueva esposa, Gloria, es 30 años mayor que él. Marcus Higgins es un soltero promiscuo. A lo largo de la película, los cinco amigos se burlan entre ellos de forma amistosa: Lenny por ser rico y consentido, Eric por ser obeso y goloso, Kurt por su color y por vivir dominado por su esposa, Rob por su baja estatura, su pelo y por tener una esposa anciana, y Marcus por su forma de vida desordenada y perezosa.");
        Peliculas peliculas8 = new Peliculas("Chris Columbus", "Inglés", 2015, 106, "No tiene ningùn premio", "Sam Brenner (Adam Sandler)", "Los jóvenes Sam Brenner y Will Cooper esperan la gran inauguración de una sala de arcade. Después de abrir la sala de arcade, Sam descubre que es bastante bueno en varios videojuegos, a pesar de ser un novato. Will le dice a Sam que se inscriba al campeonato mundial de videojuegos de arcade que se realizará ese día en la misma sala. Durante el evento se encuentran con Ludlow Lamonsoff, un chico raro pero brillante, quien también compite al saber lo bien que maneja el videojuego Centipede y que, además, está enamorado de Lady Lisa, un personaje del videojuego Dojo Quest. Antes de empezar el campeonato, informan que los ejemplos de los videojuegos que van a jugar se pondrán dentro de una cápsula del tiempo junto a otros ejemplos de la vida y cultura para poder contactar con otras formas de vida.");
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la película Son como niños");
            System.out.println("2. Detalles de la película Pixels");
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
                        System.out.println("DETALLES DE LA PELÍCULA SON COMO NIÑOS");
                        mostrarDetallesPelicula(peliculas7);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    }
                    while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA PIXELS");
                        mostrarDetallesPelicula(peliculas8);
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

    public static void submenuDrama() {
        int opcion;
        Peliculas peliculas9 = new Peliculas("Ric Roman Waugh", "Inglés", 2013, 112, " En la 64ª entrega de los Globos de Oro: Premio al mejor director, \nmejor película dramática,  mejor actor de reparto, mejor guion ", "Leonardo DiCaprio ",
                "El Infiltrado es una película de suspenso y acción dirigida por Martin Scorsese. La trama\n gira en torno a Billy Costigan (interpretado por Leonardo DiCaprio), un joven policía que se\n infiltra en la mafia irlandesa en Boston para desmantelarla desde adentro. Mientras tanto,\n Colin Sullivan (interpretado por Matt Damon), un miembro de la fuerza policial, trabaja como\n espía para la mafia dentro del departamento de policía. Ambos personajes se ven atrapados\n en una red de engaños y traiciones, sin saber quién está realmente del lado de la justicia. A\n medida que la tensión aumenta, Billy y Colin se acercan peligrosamente a descubrir la\n " +
                        "verdad y se enfrentan a decisiones difíciles que pondrán en peligro sus vidas. La película es\n reconocida por su estilo visualmente impactante, su narrativa compleja y las actuaciones\n destacadas de su elenco.");
        Peliculas peliculas10 = new Peliculas("Lasse Hallström", "Ingles", 2009, 93, "Premio a la Mejor Película del 2010 en el Festival de Cine de Sedona.", "Richard Gere",
                "Siempre a tu lado es un drama basado en la historia real de Hachiko, un perro Akita que\n demuestra una lealtad inquebrantable hacia su dueño, el profesor Parker Wilson. Tras la\n muerte de Parker, Hachiko sigue acudiendo diariamente a la estación de tren, esperando su\n regreso. La historia conmueve a la comunidad y muestra el poder del amor incondicional y la\n conexión entre humanos y animales. La película destaca los valores de la amistad y la\n lealtad, dejando una huella imborrable en quienes la presencian.");
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la pelicula El Infiltrado");
            System.out.println("2. Detalles de la película Siempre a tu lado");
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
                        System.out.println("DETALLES DE LA PELÍCULA EL INFILTRADO");
                        mostrarDetallesPelicula(peliculas9);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    } while (opcion == 1);

                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA SIEMPRE A TU LADO");
                        mostrarDetallesPelicula(peliculas10);
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

    public static void submenuTerror() {
        int opcion;
        Peliculas pelicula11 = new Peliculas("Andrés Muschietti", "Inglés", 2017, 135, "Mejor Película de Terror y el Premio MTV Movie & TV al Mejor Villano (Bill Skarsgård).", "Jaeden Martell",
                "La película IT se desarrolla en el pueblo de Derry, donde un grupo de niños enfrenta a una\n entidad malévola que adopta la forma de un payaso llamado Pennywise. Los niños,\n autodenominados El Club de los Perdedores, luchan contra sus miedos más profundos\n mientras intentan derrotar a Pennywise. La historia se desarrolla en dos líneas temporales,\n mostrando el enfrentamiento con el payaso tanto en su infancia como en su vida adulta. La\n película combina elementos de terror, suspenso y drama, destacando las actuaciones y el\n icónico papel de Pennywise interpretado por Bill Skarsgård. IT es una adaptación de la\n novela de Stephen King y recibió premios y reconocimiento por su impacto en el género del terror.");
        Peliculas peliculas12 = new Peliculas("James Wan", "Inglés", 2010, 103, " Fright Meter Award for Best Actress In A Supporting Role,\n Fright Meter Award for Best Horror Movie", "Patrick Wilson",
                "Insidious cuenta la historia de una familia que se muda a una nueva casa y comienza a\n experimentar fenómenos paranormales, especialmente con su hijo Dalton, quien entra en un\n inexplicable coma. Desesperados por encontrar respuestas, los padres recurren a expertos\n en lo sobrenatural y descubren que su hijo está atrapado en un plano astral llamado La\n Dimensión de los Espíritus. A medida que profundizan en el mundo de los espíritus, se\n enfrentan a fuerzas malignas y secretos oscuros que amenazan su vida y su cordura.");
        do {
            System.out.println("\n\tAcción");
            System.out.println("1. Detalles de la película IT(ESO)");
            System.out.println("2. Detalles de la película INSIDIOUS");
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
                        System.out.println("DETALLES DE LA PELÍCULA IT(ESO)");
                        mostrarDetallesPelicula(pelicula11);
                        System.out.println("Desea continuar en esta seccion 1.-Si 2.-No:");
                        opcion = scanner.nextInt();
                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE LA PELÍCULA INSIDIOUS");
                        mostrarDetallesPelicula(peliculas12);
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
