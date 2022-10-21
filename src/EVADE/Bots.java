package EVADE;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Bots {
    private double velocidad;
    private char nombre;
    private String aspecto;
    private String audios;
    private String audioPM;

    public Bots() {
    }

    public Bots(double velocidad, char nombre, String aspecto, String audios, String audioPM) {
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.aspecto = aspecto;
        this.audios = audios;
        this.audioPM = audioPM;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public String getAudios() {
        return audios;
    }

    public void setAudios(String audios) {
        this.audios = audios;
    }

    public String getAudioPM() {
        return audioPM;
    }

    public void setAudioPM(String audioPM) {
        this.audioPM = audioPM;
    }

    @Override
    public String toString() {
        return "Bot{" + "velocidad=" + velocidad + ", nombre=" + nombre + ", aspecto=" + aspecto + ", audios=" + audios + ", audioPM=" + audioPM + '}';
    }
    
    
}
