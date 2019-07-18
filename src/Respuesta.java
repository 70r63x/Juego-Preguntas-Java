import javax.swing.*;

public class Respuesta {
    boolean estado;

    public Respuesta(String pregunta[][],int preguntaAleatoria, String respuesta) {

        if (respuesta.equalsIgnoreCase(pregunta[preguntaAleatoria][5])){
            JOptionPane.showMessageDialog(null, "Respuesta correcta");
            this.estado = true;

        }else{
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
            this.estado = false;
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
