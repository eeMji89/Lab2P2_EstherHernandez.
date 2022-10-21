package EVADE;

import java.util.ArrayList;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Jugador {
    private String name;
    private char cj;
    private int victorias;
    private int dinero;
    ArrayList <String> items = new ArrayList();

    public Jugador() {
    }

    public Jugador(String name, char cj, int victorias, int dinero) {
        this.name = name;
        this.cj = cj;
        this.victorias = victorias;
        this.dinero = dinero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getCj() {
        return cj;
    }

    public void setCj(char cj) {
        this.cj = cj;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
    
    
}
