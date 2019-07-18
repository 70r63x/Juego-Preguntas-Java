

import javax.swing.*;

public class main {

    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "Ha respondido correctamente. Felicitaciones..","Respuesta", JOptionPane.DEFAULT_OPTION);
        PreguntaRespuesta bancoPreguntas = new PreguntaRespuesta();
        String pregunta[][] = bancoPreguntas.getPreguntaRespuesta();
        String jugadores = "";
        int opcionMenu = 0;
        /*for (int i = 0; i < pregunta.length; i++){
            for (int j = 0; j < pregunta[i].length; j++){
                System.out.println(pregunta[i][j]);
            }
        }*/
        while (opcionMenu != 4){
            try {
                String opcionMenuTexto = JOptionPane.showInputDialog(null, "Ingresa la siguiente opcion:\n"
                        + "1. Jugar\n"
                        + "2. Instrucciones\n"
                        + "3. Creditos\n"
                        + "4. Salir", "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                opcionMenu = Integer.parseInt(opcionMenuTexto);

                switch (opcionMenu) {
                    case 1:
                        boolean jugadorValido = true;
                        while(jugadorValido == true ) {
                            try {
                                int numeroJugadores = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al juego \n" +
                                        "Ingrese número de jugadores", "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE));
                                for (int i = 1; i <= numeroJugadores; i++) {
                                    String nombreJugador = JOptionPane.showInputDialog(null,"Iniciar partida\n" + "Ingrese nombre Jugador " + i, "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);
                                    Jugador jugador = new Jugador(nombreJugador, "0");
                                    int puntaje = 0;
                                    for (int j = 1; j <= 5; j++) {
                                        int preguntaAleatoria = (int)(Math.random()*(pregunta.length))+1;
                                        String respuestaPregunta = JOptionPane.showInputDialog(null, "<html>" +
                                                "<h5>Jugando ahora: <strong>"+ nombreJugador +"</strong></h5>" +
                                                "<p>Pregunta N°"+ j +"<h3>"+ pregunta[preguntaAleatoria][0] +"</h3></p>" +
                                                "<p>A. "+ pregunta[preguntaAleatoria][1] +"</p> "+
                                                "<p>B. "+ pregunta[preguntaAleatoria][2] +"</p> "+
                                                "<p>C. "+ pregunta[preguntaAleatoria][3] +"</p> "+
                                                "<p>D. "+ pregunta[preguntaAleatoria][4] +"</p> "+
                                                "</html>", "Juego de Preguntas", JOptionPane.INFORMATION_MESSAGE);

                                        if (respuestaPregunta.equalsIgnoreCase(pregunta[preguntaAleatoria][5])){
                                            JOptionPane.showMessageDialog(null, "Respuesta correcta");
                                            puntaje = puntaje+10;
                                        }else{
                                            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
                                        }
                                    }
                                    jugador.setPuntaje(String.valueOf(puntaje));
                                    String resultadoJugadorNombre = jugador.getNombre();
                                    String resultadoJugadorPuntaje = jugador.getPuntaje();
                                    jugadores= jugadores +resultadoJugadorNombre + " Puntaje: " + resultadoJugadorPuntaje + "\n";
                                }
                                jugadorValido = false;
                            } catch (Exception e) {
                                opcionErrada("Ingrese un número de jugadores correcto");
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Marcador:\n" + jugadores, "Puntajes Jugadores", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        ReglasJuego textoReglas = new ReglasJuego();
                        String reglas = textoReglas.getTextoReglas();
                        JOptionPane.showMessageDialog(null, reglas, "Reglas del Juego", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        creditoJuego textoCreditos = new creditoJuego();
                        String creditos = textoCreditos.getTextoCredito();
                        JOptionPane.showMessageDialog(null, creditos, "Creditos", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        opcionErrada("Seleccione una de las opciones");
                        break;
                }
            }catch(Exception e)
            {
                opcionErrada("Datos incorrectos, intente de nuevo");
            }
        }

    }

    public static void opcionErrada(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje,
                "Juego de Preguntas", JOptionPane.ERROR_MESSAGE);
    }
}
