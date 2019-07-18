import javax.swing.*;

public class Ayuda {
    private String mensaje;
    private String[][] preguntas;
    int preguntaAleatoria;
    String nombre;
    String opcionMenuTexto;
    int opcionAyuda = 0;
    int publico = 1; int mitad = 1; int amigo = 1;

    public Ayuda(String preguntas[][],int preguntaAleatoria, String nombreJugador) {
        this.preguntas = preguntas;
        this.preguntaAleatoria = preguntaAleatoria;
        this.nombre = nombreJugador;
        do{
            try{
                if (this.publico == 0){
                    this.opcionMenuTexto = JOptionPane.showInputDialog(null, "Escoger ayuda:\n"
                                    + "2. 50/50\n"
                                    + "3. Llamada amigo",
                            "Juego de Preguntas - Ayuda", JOptionPane.INFORMATION_MESSAGE);
                }else if(this.mitad == 0){
                    this.opcionMenuTexto = JOptionPane.showInputDialog(null, "Escoger ayuda:\n"
                                    + "1. Ayuda publico\n"
                                    + "3. Llamada amigo",
                            "Juego de Preguntas - Ayuda", JOptionPane.INFORMATION_MESSAGE);
                }else if (this.amigo == 0){
                     this.opcionMenuTexto = JOptionPane.showInputDialog(null, "Escoger ayuda:\n"
                                    + "1. Ayuda publico\n"
                                    + "2. 50/50",
                            "Juego de Preguntas - Ayuda", JOptionPane.INFORMATION_MESSAGE);
                }else{
                     this.opcionMenuTexto = JOptionPane.showInputDialog(null, "Escoger ayuda:\n"
                                    + "1. Ayuda publico\n"
                                    + "2. 50/50\n"
                                    + "3. Llamada amigo",
                            "Juego de Preguntas - Ayuda", JOptionPane.INFORMATION_MESSAGE);
                }
                this.opcionAyuda = Integer.parseInt(this.opcionMenuTexto);
                switch (this.opcionAyuda) {
                    case 1:
                        ayudaPublico();
                        this.publico = 0;
                        break;
                    case 2:
                        mitadMitad();
                        this.mitad = 0;
                        break;
                    case 3:
                        llamadaAmigo();
                        this.amigo = 0;
                        break;
                    default:
                        opcionErrada("Seleccione una de las opciones");
                        break;
                }
            }catch (Exception e){
                opcionErrada("Por favor ingresar un valor verdadero");
            }
        }while (opcionAyuda < 0 || opcionAyuda > 3);

    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void ayudaPublico(){
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

    public void mitadMitad(){
        switch (preguntas[preguntaAleatoria][5]) {
            case "a":
                mensaje = JOptionPane.showInputDialog(null, "Posibles resultados de la pregunta \n" +
                                preguntas[preguntaAleatoria][0] + "\n" +
                                "A) " + preguntas[preguntaAleatoria][1] + "\n" +
                                "B) " + preguntas[preguntaAleatoria][3],
                        "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "b":
                mensaje = JOptionPane.showInputDialog(null, "Posibles resultados de la pregunta \n" +
                                preguntas[preguntaAleatoria][0] + "\n" +
                                "A) " + preguntas[preguntaAleatoria][2] + "\n" +
                                "B) " + preguntas[preguntaAleatoria][4],
                        "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "c":
                mensaje = JOptionPane.showInputDialog(null, "Posibles resultados de la pregunta \n" +
                                preguntas[preguntaAleatoria][0] + "\n" +
                                "A) " + preguntas[preguntaAleatoria][2] + "\n" +
                                "B) " + preguntas[preguntaAleatoria][3],
                        "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                mensaje = JOptionPane.showInputDialog(null,"Posibles resultados de la pregunta \n" +
                                preguntas[preguntaAleatoria][0] + "\n" +
                                "A) " + preguntas[preguntaAleatoria][1] + "\n" +
                                "B) " + preguntas[preguntaAleatoria][4],
                        "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    public void llamadaAmigo(){
        String [] letras = {"A","B","C","D"};
        int letraRamdom = (int)(Math.random()*(4));
        mensaje = JOptionPane.showInputDialog(null, "Llamando amigo.... \n" +
                        "Hola "+ this.nombre + " ¿Como estas? " +
                        "Hermano yo creo que es la "+ letras[letraRamdom]+
                        " Pero no estoy muy seguro.",
                "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void opcionErrada(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje,
                "Juego de Preguntas", JOptionPane.ERROR_MESSAGE);
    }
}
