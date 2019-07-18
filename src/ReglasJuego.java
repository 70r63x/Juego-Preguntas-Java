public class ReglasJuego {
    private String textoReglas = "<html>" +
            "<h1>Reglas:</h1>" +
            "<p>Las preguntas constarán de temas sobre Desarrollo de Software y Analisis y Diseño de Sistemas Informaticos.</p>" +
            "<p>En el menú principal el jugador debe seleccionar una opcion para ingresar a la funcion.</p>" +
            "<p>Para iniciar el juego seleccionar la opcion 1.</p>" +
            "<p>Si responde correctamente su puntaje se ira acumulando.</p>" +
            "<p>Cada ronda constara de 5 preguntas aleatorias.</p>" +
            "<p>El jugador contará con una ayuda en las preguntas, al utilizar una ya no podra utilizarla de nuevo.</p>" +
            "<p>Al finalizar el juego se mostrará en pantalla el puntaje acumulado.</p>" +
            "</html>";

    public ReglasJuego(){};

    public String getTextoReglas() {
        return textoReglas;
    }

    public void setTextoReglas(String textoReglas) {
        this.textoReglas = textoReglas;
    }
}
