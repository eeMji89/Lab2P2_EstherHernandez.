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
                    if (jugadores.size()<12) {                    
                    System.out.println("Ingrese nombre del jugador:");
                    String name= lea.next();
                    System.out.println("Ingrese caracter para ser representado en el mapa: ");
                    char cj = lea.next().charAt(0);
                   
                          while (jugadores.contains(cj)) {
                              System.out.println("Caracter ya esta en uso. Ingrese otro:");
                              cj = lea.next().charAt(0);
                          }

                    jugadores.add(new Jugador(name, cj, 0, 0));
                    }
                    else{
                        System.out.println("No se permiten mas jugadores en el juego.");
                    }
                    break;
                case 2:
                    System.out.println("Agregar Bots");
                    if (bots.size() < (jugadores.size() / 4 + 1)) {
                        int v = 70;
                        System.out.println("Ingrese aspecto del bot: ");
                        String aspecto = lea.nextLine();
                        aspecto = lea.next();
                        System.out.println("Ingrese nombre del audio del bot: ");
                        String Audio = lea.nextLine();
                        Audio = lea.next();
                        bots.add(new Bots(v, 'B', aspecto, Audio, "Post Mortem"));
                        
                    }
                    else{
                        System.out.println("Ha llegado al limite de bots en el juego");
                    }
                    
                    break;
                case 3:
                    Agregaritem(jugadores);     
                    
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo");
            }
        }
    }
    public static void Agregaritem(ArrayList jugadores){
        System.out.println("Ingrese la posicion del jugador en la lista: ");
                    int p = lea.nextInt();
                    if (p<= jugadores.size()) {
                        if (((Jugador)jugadores.get(p)).items.size()<5) {
                        System.out.println("Los items disponibles son:"
                                + "\n1. Cola: 60 "
                                + "\n2. Acelerador: 30"
                                + "\n3. Mina: 45"
                                + "\n4: Iluminador: 45"
                                + "\n5. Detector: 30");
                        System.out.println("Ingrese numero del Item:");
                        int pi= lea.nextInt();
                       
                        if (pi==1) {
                             if(((Jugador)jugadores.get(p)).getDinero()>=60){
                            ((Jugador)jugadores.get(p)).items.add("Cola");
                             }
                             else{
                               System.out.println("Eljugador no tiene dinero suficiente");
                             }
                        }
                        else if (pi==2) {
                              if(((Jugador)jugadores.get(p)).getDinero()>=30){
                            ((Jugador)jugadores.get(p)).items.add("Acelerador");
                             }
                             else{
                               System.out.println("Eljugador no tiene dinero suficiente");
                             }
                        }
                        else if (pi==3) {
                              if(((Jugador)jugadores.get(p)).getDinero()>=45){
                            ((Jugador)jugadores.get(p)).items.add("Mina");
                             }
                             else{
                               System.out.println("Eljugador no tiene dinero suficiente");
                             }
                        }
                        else if (pi==4) {
                            if(((Jugador)jugadores.get(p)).getDinero()>=45){
                            ((Jugador)jugadores.get(p)).items.add("Iluminador");
                             }
                             else{
                               System.out.println("Eljugador no tiene dinero suficiente");
                             }
                        }
                        else if (pi==5) {
                            if(((Jugador)jugadores.get(p)).getDinero()>=30){
                            ((Jugador)jugadores.get(p)).items.add("Detector");
                             }
                             else{
                               System.out.println("Eljugador no tiene dinero suficiente");
                             }
                        }}
                        else{
                            System.out.println("No hay espacio suficiente en la mochila");
                        }}
                        else{
                            System.out.println("Opcion no disponible");
                        }
                        
    }
    public static void Defaultjugadoresybots(ArrayList j,ArrayList bots ){
       j.add(new Jugador("jugador1", 'a', 0, 50));
       j.add(new Jugador("jugador2", 'b', 0, 50));
       j.add(new Jugador("jugador3", 'c', 0, 50));
    }

    public static void imprimirM(Object[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
    }
    public Object[][] GenerarM(Object [][]tablero){
        
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                int r1 = 1+ rd.nextInt(30);
                int r2 = 1+ rd.nextInt(30);
                tablero[r1][r2]= 'X';
            }
        }
        return tablero;
        }
    
}
