public class Jugador {

    private String puntaje;
    private String nombre;

    public Jugador(String nombre, String puntaje){
        this.nombre = nombre;
        this.puntaje = puntaje;
    };

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
