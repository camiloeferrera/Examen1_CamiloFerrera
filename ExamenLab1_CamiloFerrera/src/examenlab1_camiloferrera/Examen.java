package examenlab1_camiloferrera;

public class Examen {
    private String clase, tema;
    private int iqrequerido = 0, puntaje;

    public Examen(String clase, String tema, int iqrequerido, int puntaje) {
        this.clase = clase;
        this.tema = tema;
        this.puntaje = puntaje;
        this.iqrequerido = iqrequerido;
    }
    public Examen() {
    }

    public String getClase() {
        return clase;
    }
    public String getTema() {
        return tema;
    }
    public int getIqrequerido() {
        return iqrequerido;
    }
    public int getPuntaje() {
        return puntaje;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public void setIqrequerido(int iqrequerido) {
        this.iqrequerido = iqrequerido;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return this.clase;
    }
    
}
