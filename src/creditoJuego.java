public class creditoJuego {

    private String textoCredito = "<html>" +
            "<body style='text-align: center;'>" +
            "<h1>Proyecto de Final de Semestre</h1>" +
            "<p>Este software fue realizado por motivos educativos y realizar entrega de una responsabilidad academica</p>" +
            "<p>Realizado por:</p>" +
            "<p>Alejandra Betancurt</p>" +
            "<p>Jorge Herrera</p>" +
            "<p>Mariana Betnacurt</p>" +
            "<p>Desarrollo de Software II y Analisis y Diseño de Sistemas de Información" +
            "<p>UCP TDS Cuba- Grupo 2 2019</p>" +
            "</body>" +
            "</html>";

    public creditoJuego(){};

    public String getTextoCredito() {
        return textoCredito;
    }

    public void setTextoCredito(String textoCredito) {
        this.textoCredito = textoCredito;
    }
}
