import javax.swing.*;

public class Ayuda {
    String mensaje;

    public Ayuda(String preguntas[][],int preguntaAleatoria) {
        switch (preguntas[preguntaAleatoria][5]) {
            case "a":
                mensaje = JOptionPane.showInputDialog(null, "Posibles resultados de la pregunta \n" +
                        preguntas[preguntaAleatoria][0] + "\n" +
                        "A) " + preguntas[preguntaAleatoria][1] + " (%80)\n" +
                        "B) " + preguntas[preguntaAleatoria][2] + " (%1)\n" +
                        "C) " + preguntas[preguntaAleatoria][3] + " (%14)\n"+
                        "D) " + preguntas[preguntaAleatoria][4] + " (%5)",
                        "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "b":
                mensaje = JOptionPane.showInputDialog(null, "Posibles resultados de la pregunta \n" +
                        preguntas[preguntaAleatoria][0] + "\n" +
                        "A) " + preguntas[preguntaAleatoria][1] + " (%8)\n" +
                        "B) " + preguntas[preguntaAleatoria][2] + " (%72)\n" +
                        "C) " + preguntas[preguntaAleatoria][3] + " (%7)\n"+
                        "D) " + preguntas[preguntaAleatoria][4] + " (%3)",
                        "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "c":
                mensaje = JOptionPane.showInputDialog(null, "Posibles resultados de la pregunta \n" +
                        preguntas[preguntaAleatoria][0] + "\n" +
                        "A) " + preguntas[preguntaAleatoria][1] + " (%8)\n" +
                        "B) " + preguntas[preguntaAleatoria][2] + " (%17)\n" +
                        "C) " + preguntas[preguntaAleatoria][3] + " (%62)\n"+
                        "D) " + preguntas[preguntaAleatoria][4] + " (%13)",
                        "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                mensaje = JOptionPane.showInputDialog(null,"Posibles resultados de la pregunta \n" +
                        preguntas[preguntaAleatoria][0] + "\n" +
                        "A) " + preguntas[preguntaAleatoria][1] + " (%9)\n" +
                        "B) " + preguntas[preguntaAleatoria][2] + " (%1)\n" +
                        "C) " + preguntas[preguntaAleatoria][3] + " (%13)\n"+
                        "D) " + preguntas[preguntaAleatoria][4] + " (%77)",
                        "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
