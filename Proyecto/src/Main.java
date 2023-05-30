import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int opcion = 0, op = 0;

    public static void main(String[] args) {
        while (opcion != 7) {//MENU PRINCIPAL
            opcion = mostrarMenuprincipal(op);
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("\n\tAccion");
                        System.out.print("\n-¿Desea continuar en está sección 1.Si o 2.- No?: ");
                        op = scanner.nextInt();
                    } while (op == 1);
                    break;
                case 2:
                    do {

                    } while (op == 1);
                    break;
                case 3:
                    do {

                    } while (op == 1);
                    break;
                case 4:
                    do {

                    } while (op == 1);
                    break;
                case 5:
                    do {

                    } while (op == 1);
                    break;
                case 6:
                    do {

                    } while (op == 1);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...Saliendo del programa...Saliendo del programa...\nSaliendo del programa...\nSaliendo del programa...");
                    System.exit(0);
                    break;
                default:
            }
        }
    }

    static int mostrarMenuprincipal(int opc) {
        System.out.println("=================================================================================");
        System.out.println("\n\tCartelera de Películas");
        System.out.println("\n\t\t\t\t\t\t1.-Accción");
        System.out.println("\n\t\t\t\t\t\t2.-Aventura");
        System.out.println("\n\t\t\t\t\t\t3.-Ciencia Ficción");
        System.out.println("\n\t\t\t\t\t\t4.-Comedia");
        System.out.println("\n\t\t\t\t\t\t5.-Drama");
        System.out.println("\n\t\t\t\t\t\t6.-Terror");
        System.out.println("\n\t\t\t\t\t\t7.-Salir");

        System.out.print("\n~ Ingrese una opción: ");
        opc = scanner.nextInt();
        while (opc < 1 || opc > 7) {
            System.out.println("=================================================================================");
            System.out.println("\n[~ Ingrese una opción válida ~]");
            System.out.println("\n=================================================================================");
            System.out.print("\nDígite la opción: ");
            opc = scanner.nextInt();
        }
        return opc;
    }

}
