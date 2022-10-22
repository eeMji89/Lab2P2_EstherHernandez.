package EVADE;

import java.util.ArrayList;
import java.util.Collections;
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
        jugadores = Defaultjugadores();
         bots =  Defaultbots();
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
                   
                        int v = 70;
                        System.out.println("Ingrese el caracter del bot: ");
                        char nb= lea.next().charAt(0);
                        for (int i = 0; i < bots.size(); i++) {
                        if(nb==(((Bots)bots.get(i)).getNombre())){
                        System.out.println("Este caracter no es posible poner");
                        System.out.println("Ingrese un nuevo el Caracter(minusculas) que represente al Jugador:");
                        nb = lea.next().charAt(0);
                    }  
                    }
                        
                        System.out.println("Ingrese aspecto del bot: ");
                        String aspecto = lea.nextLine();
                        aspecto = lea.next();
                        System.out.println("Ingrese nombre del audio del bot: ");
                        String Audio = lea.nextLine();
                        Audio = lea.next();
                        bots.add(new Bots(v, nb, aspecto, Audio, "Post Mortem"));
                        
                 
                    
                    break;
                case 3:
                         Agregaritem(jugadores);                    
                    break;
                case 4:
                    System.out.println();
                    tablero= GenerarM();
                    imprimirM(tablero);
                    System.out.println("Inicio");
                   
                    imprimirM( Jugar(jugadores,bots,tablero));
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
                            ((Jugador)jugadores.get(p)).
                                    setDinero(((Jugador)jugadores.get(p)).getDinero()-60);
                             }
                             else{
                               System.out.println("Eljugador no tiene dinero suficiente");
                             }
                        }
                        else if (pi==2) {
                              if(((Jugador)jugadores.get(p)).getDinero()>=30){
                            ((Jugador)jugadores.get(p)).items.add("Acelerador");
                             ((Jugador)jugadores.get(p)).
                                    setDinero(((Jugador)jugadores.get(p)).getDinero()-30);
                             }
                             else{
                               System.out.println("Eljugador no tiene dinero suficiente");
                             }
                        }
                        else if (pi==3) {
                              if(((Jugador)jugadores.get(p)).getDinero()>=45){
                            ((Jugador)jugadores.get(p)).items.add("Mina");
                             ((Jugador)jugadores.get(p)).
                                    setDinero(((Jugador)jugadores.get(p)).getDinero()-45);
                             }
                             else{
                               System.out.println("Eljugador no tiene dinero suficiente");
                             }
                        }
                        else if (pi==4) {
                            if(((Jugador)jugadores.get(p)).getDinero()>=45){
                            ((Jugador)jugadores.get(p)).items.add("Iluminador");
                             ((Jugador)jugadores.get(p)).
                                    setDinero(((Jugador)jugadores.get(p)).getDinero()-45);
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
    public static ArrayList Defaultjugadores( ){
         ArrayList j = new ArrayList();
        
       j.add(new Jugador("Italy65", 'a', 0, 50));
       j.add(new Jugador("Elraptukas3000", 'b', 0, 50));
       j.add(new Jugador("estuardo124", 'c', 0, 50));
       j.add(new Jugador("King_calebU", 'd', 0, 50));
       return j;
    }
    public static ArrayList Defaultbots(){
        ArrayList b = new ArrayList();
        b.add(new Bots(70,'Q',"Azul","Audio01","Audio PostMortem"));
        b.add(new Bots(70,'T',"Blanco","Audio45","Audio PostMortem"));
        
        return b;
    }

    public static void imprimirM(Object[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
    }
    public static Object[][] GenerarM(){
        Object [][]tablero = new Object[30][30];
        int cont = 0,cont2 =0;int r2,r1;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                    r1 = 1+ rd.nextInt(29);
                if (cont <150) {
                     tablero[r1][j]= 'X';
                cont=cont+1;
                }
            }
            if (cont2<150) {
                 r2 = 1+ rd.nextInt(29);
             tablero[i][r2]= 'X';
             cont2 = cont2+1;
            }
        }
        for (int m = 0; m < tablero.length; m++) {
            for (int n = 0; n < tablero[m].length; n++) {
                if (tablero[m][n]== null) {
                    tablero[m][n]=" ";
                }
            }
        }
        return tablero;
        }
    public static Object[][]Jugar(ArrayList j,ArrayList b, Object[][]t){
        int r,cont = 0,cont2=0;
        ArrayList nj = new ArrayList();
        ArrayList nb1 = new ArrayList();
        Collections.shuffle(j);
        Collections.shuffle(b);
       if (j.size()>12) {
            for (int i = 0; i < 12; i++) {
                nj.add(j.get(i));
            }
        }
        else{
            nj= j;
        }

        int nb = (nj.size()/4)+1;
        if (b.size()>nb) {
            for (int p = 0; p < nb; p++) {
                nb1.add(b.get(p));
            }
        }
        else{
            nb1=b;
        }
        
        ArrayList njj = new ArrayList();
        for (int i = 0; i < t.length; i++) {
           
            for (int k = 0; k < t[i].length; k++) {
                r = 1+ rd.nextInt(29); int r2= 1+rd.nextInt(29);
                int r3=  1+ rd.nextInt(29);int r4=  1+ rd.nextInt(29);
                
                if (cont< nj.size()) {
                     t[r2][r]= ((Jugador)nj.get(cont)).getCj();
                cont = cont +1;
                }
                
                if (cont2<nb1.size()) {
                    t[r3][r4]=((Bots)nb1.get(cont2)).getNombre();
                    cont2 = cont2+1;
                    
                    if (r2==r3&&r==r4) {
                        System.out.println("EL bot"+((Bots)nb1.get(cont2)).getNombre()+
                                "derribo a"+ ((Jugador)nj.get(cont)).getCj());
                    }
                }
               
            }
        }
        System.out.println("Avanzar al siguiente estado?[s/n]");
        char resp = lea.next().charAt(0);
        if (resp=='s'||resp== 'S') {
             for (int m = 0; m < t.length; m++) {
                for (int n = 0; n < t[m].length; n++) {
                    for (int l = 0; l < nj.size(); l++) {
                        if (t[m][n].equals(((Jugador)nj.get(l)).getCj())) {
                            if (t[m][n+1].equals('X')||t[m][n-1].equals('X')||
                                    t[m+1][n].equals('X')||t[m-1][n].equals('X')) {
                                t[m][n]=((Jugador)nj.get(l)).getCj();
                            
                    }
                            else{
                                
                            }
            }
        }
        }
       
        return t;
    }
}
