import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {

        Scanner print = new Scanner(System.in);
        boolean salir = false;
        ArrayList<String> tarea = new ArrayList<String>();

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
                    String estTar = print.nextLine();

                    String addTareas = nomTar + " " + estTar + "\n";
                    tarea.add(addTareas);
                    System.out.println("Tarea añadida: " + nomTar + ". Con el estado: " + estTar +"\n");
                    break;
                case 2:
                    System.out.println("Mostrando las tareas actuales...");
                    System.out.println(tarea);
                    break;
                case 3:
                    System.out.println("Que tarea quieres editar? (Empiza por 0)");
                    System.out.println(tarea);
                    int tareaEscogida = print.nextInt();

                    if (tareaEscogida == 0) {
                        System.out.println(tarea.get(0));
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