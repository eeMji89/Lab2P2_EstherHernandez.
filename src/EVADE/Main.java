package EVADE;

 import java.util.Scanner;
 import java.util.Random;
/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Main {
    public static Scanner lea = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag1 = true;
        while (flag1 == true) {

            System.out.println("++++EVADE MENU++++");
            System.out.println("0. Salir\n1. Agregar Jugador"
                    + "\n2. Agregar Bot"
                    + "\n3. Agregar item a jugador"
                    + "\n4. Jugar");
            System.out.println("Ingrese la opcion: ");
            int op = lea.nextInt();
            switch (op) {
                case 0:
                    flag1 = false;
                    break;
                case 1:
                    System.out.println("Agregar jugador");
                    System.out.println("Ingrese nombre del jugador:");
                    String name= lea.next();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo");
            }
        }


    }
    
}
