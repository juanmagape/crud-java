import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {

        Scanner print = new Scanner(System.in);
        boolean salir = false;
        ArrayList<String> tarea = new ArrayList<String>();

        String estado1 = "Finalizado";
        String estado2 = "En proceso";
        String estado3 = "Por comenzar";

        while (!salir) {

            System.out.println("Sistema Crud");
            System.out.println("1: Crear tarea");
            System.out.println("2: Mostrar las tareas");
            System.out.println("3: Editar tarea");
            System.out.println("4: Eliminar tarea");
            System.out.println("5: Salir");
            int opcion = print.nextInt();
            print.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre de la tarea a añadir");
                    String nomTar = print.nextLine();

                    System.out.println("En que estado está?");
                    System.out.println("1:" + estado3);
                    System.out.println("2:" + estado2);
                    System.out.println("3:" + estado1);
                    int estTar = print.nextInt();

                    if (estTar == 1) {
                        String addTareas = nomTar + " con el estado: " + estado3 + "\n";
                        tarea.add(addTareas);
                        System.out.println(addTareas);
                    } else if (estTar == 2) {
                        String addTareas = nomTar + " con el estado: " + estado2 + "\n";
                        tarea.add(addTareas);
                        System.out.println(addTareas);

                    } else {
                        String addTareas = nomTar + " con el estado: " + estado1 + "\n";
                        tarea.add(addTareas);
                        System.out.println(addTareas);
                    }

                    break;
                case 2:
                    System.out.println("Mostrando las tareas actuales...");
                    System.out.println(tarea + "\n");
                    break;
                case 3:
                        System.out.println("Que tarea quieres editar? (Empiza por 0)");
                        System.out.println(tarea);
                        int tareaEscogida = print.nextInt();
                        print.nextLine();

                        if (tareaEscogida == 0) {
                            System.out.println(tarea.get(0));
                            System.out.println("Que quieres modificar de la tarea? (1: Nombre / 2: Estado)");
                            int modificar = print.nextInt();
                            print.nextLine();


                            if (modificar == 1) {
                                System.out.println("Introduce el nuevo nombre de la tarea");
                                String nomMod = print.nextLine();

                                tarea.set(tareaEscogida, nomMod);
                                System.out.println("Tarea modificada");
                            }
                        }
                    break;
                case 4:
                    System.out.println("Has elegido la opción 4");
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saleindo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }

    }
}