import java.util.Arrays;
import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] datos = new String[4];

        datos[0] = sc.nextLine();
        datos[1] = sc.nextLine();
        datos[2] = sc.nextLine();
        datos[3] = sc.nextLine();

        System.out.println(Arrays.toString(datos));
        
    }
}
