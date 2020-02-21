package examenlab1_camiloferrera;

import java.util.ArrayList;

public class Tutor extends Alumno {
    private ArrayList <String> clases = new ArrayList ();
    private int ganancias = 0, nivelenseñanza;
    private ArrayList <Tutoria> tutorias = new ArrayList ();

    public Tutor() {
    }

    public Tutor(int nivelenseñanza, String nombre, String carrera, String lugarnacimiento, String numerocuenta, String usuario, String contraseña, int edad) {
        super(nombre, carrera, lugarnacimiento, numerocuenta, usuario, contraseña, edad);
        this.nivelenseñanza = nivelenseñanza;
    }
    public Tutor(int nivelenseñanza) {
        this.nivelenseñanza = nivelenseñanza;
    }

    public ArrayList<String> getClases() {
        return clases;
    }
    public int getGanancias() {
        return ganancias;
    }
    public int getNivelenseñanza() {
        return nivelenseñanza;
    }
    public ArrayList<Tutoria> getTutorias() {
        return tutorias;
    }

    public void setClases(ArrayList<String> clases) {
        this.clases = clases;
    }
    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
    public void setNivelenseñanza(int nivelenseñanza) {
        this.nivelenseñanza = nivelenseñanza;
    }
    public void setTutorias(ArrayList<Tutoria> tutorias) {
        this.tutorias = tutorias;
    }

    @Override
    public String toString() {
        return "Tutor{" + "clases=" + clases + ", ganancias=" + ganancias + ", nivelense\u00f1anza=" + nivelenseñanza + ", tutorias=" + tutorias + '}';
    }

    @Override
    public void HacerExamen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DarTutorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
