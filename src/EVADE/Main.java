package EVADE;

import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Random;
/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Main {
    public static Scanner lea = new Scanner(System.in);
    public static Random rd = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag1 = true;
        ArrayList jugadores = new ArrayList();
        ArrayList bots = new ArrayList();
        while (flag1 == true) {
            Object [][]tablero = new Object[30][30];
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
                    System.out.println("Ingrese caracter para ser representado en el mapa: ");
                    char cj = lea.next().charAt(0);
                     
                          while (jugadores.contains(cj)) {
                              System.out.println("Caracter ya esta en uso. Ingrese otro:");
                              cj = lea.next().charAt(0);
                          }

                    jugadores.add(new Jugador(name, cj, 0, 0));
                    break;
                case 2:
                    System.out.println("Agregar Bots");
                    System.out.println("Ingrese la velocidad del bot:");
                    int v = lea.nextInt();
                    System.out.println("Ingrese aspecto del bot: ");
                    String aspecto = lea.nextLine(); aspecto = lea.next();
                    System.out.println("Ingrese nombre del audio del bot: ");
                    String Audio = lea.nextLine(); Audio = lea.next();
                     bots.add(new Bots(v,'B', aspecto, Audio, "Post Mortem"));
                    
                    break;
                case 3:
                    
                    System.out.println("Ingrese la posicion del jugador en la lista: ");
                    int p = lea.nextInt();
                    if (p<= jugadores.size()) {
                        System.out.println("Los items disponibles son:"
                                + "\n1. Cola: 60 "
                                + "\n2. Acelerador: 30"
                                + "\n3. Mina: 45"
                                + "\n4: Iluminador: 45"
                                + "\n5. Detector: 30");
                        System.out.println("Ingrese nombre del Item:");
                    }
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo");
            }
        }
    }
    
    public static void Defaultjugadoresybots(ArrayList j,ArrayList bots ){
        
    }

    public static void imprimirM(){
        
        
    }
  /*  public Object[][] GenerarM(Object [][]tablero){
        
        for (int i = 0; i < 30; i++) {
        
            for (int j = 0; j < 30; j++) {
        
                tablero[i][j]=;
            }
        }
        return tablero;
        }*/
    
}
