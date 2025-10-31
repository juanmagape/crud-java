import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Crud {
    public static void main(String[] args) throws IOException {

        Scanner print = new Scanner(System.in);
        boolean salir = false;
        ArrayList<Tarea> tarea = new ArrayList<Tarea>();

        String estado1 = "Finalizado";
        String estado2 = "En proceso";
        String estado3 = "Por comenzar";
        String nomTar = "";
        File archivo = new File("tarea.csv");

        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        int i = 0;

        while (!salir) {

            System.out.println("\n===================== SISTEMA CRUD DE TAREAS =====================\n");
            System.out.println("1: Crear tarea");
            System.out.println("2: Mostrar las tareas");
            System.out.println("3: Editar tarea");
            System.out.println("4: Salir");
            int opcion = print.nextInt();
            print.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre de la tarea a añadir");
                    nomTar = print.nextLine();

                    System.out.println("En que estado está?");
                    System.out.println("1: " + estado3 + ", 2: " + estado2 + ", 3: " + estado1);
                    int estTar = print.nextInt();

                    String estadoSeleccionado;
                    if (estTar == 1) {
                        estadoSeleccionado = estado3;
                    } else if (estTar == 2) {
                        estadoSeleccionado = estado2;
                    } else {
                        estadoSeleccionado = estado1;
                    }

                    tarea.add(new Tarea(nomTar, estadoSeleccionado));

                    FileWriter fw = new FileWriter(archivo, true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println(nomTar + "," + estadoSeleccionado);
                    pw.close();
                    System.out.println("Tarea guardada");

                    break;
                case 2:
                    i = 0;
                    System.out.println("Mostrando las tareas actuales...");

                    Scanner lector = new Scanner(archivo);

                    while (lector.hasNextLine()) {
                        String linea = lector.nextLine();
                        System.out.println(i + ", " + linea);
                        i++;
                    }

                    lector.close();

                    break;

                case 3:
                    i = 0;
                    Scanner lectorEdit = new Scanner(archivo);
                    ArrayList<Tarea> listaCSV = new ArrayList<>();

                        System.out.println("Que tarea quieres editar? (Empiza por 0)");

                        while (lectorEdit.hasNextLine()) {
                            String linea = lectorEdit.nextLine();
                            String[] partes = linea.split(",", 2); // separa nombre y estado
                            if (partes.length == 2) {
                                listaCSV.add(new Tarea(partes[0], partes[1]));
                            }
                            System.out.println(i + ": " + linea);
                            i++;
                        }
                        lectorEdit.close();

                        int tareaEscogida = print.nextInt();
                        print.nextLine();

                        if (tareaEscogida >= 0 && tareaEscogida < listaCSV.size()) {
                            Tarea tareaEditar = listaCSV.get(tareaEscogida);
                            System.out.println(tareaEditar);
                            System.out.println("Que quieres modificar de la tarea? (1: Nombre / 2: Estado)");
                            int modificar = print.nextInt();
                            print.nextLine();


                            if (modificar == 1) {
                                System.out.println("Introduce el nuevo nombre de la tarea");
                                String nombreCam = print.nextLine();
                                tareaEditar.setNombre(nombreCam);

                                System.out.println("Tarea modificada");
                            } else if (modificar == 2) {
                                System.out.println("Introduce el nuevo estado de la tarea");
                                System.out.println("1: " + estado3 + ", 2: " + estado2 + ", 3: " + estado1);
                                int estadoNuevo = print.nextInt();

                                switch (estadoNuevo) {
                                    case 1: tareaEditar.setEstado("Por comenzar"); break;
                                    case 2: tareaEditar.setEstado("En proceso"); break;
                                    case 3: tareaEditar.setEstado("Finalizado"); break;

                                }
                            }
                        }

                        FileWriter fwEdit = new FileWriter(archivo, false);
                        PrintWriter pwEdit = new PrintWriter(fwEdit);
                        for (Tarea t : listaCSV) {
                            pwEdit.println(t.getNombre() + "," + t.getEstado());
                        }

                        pwEdit.close();
                        fwEdit.close();
                    break;
                case 4:
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