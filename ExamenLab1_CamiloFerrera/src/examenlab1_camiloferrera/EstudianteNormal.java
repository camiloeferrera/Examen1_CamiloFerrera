package examenlab1_camiloferrera;

import java.util.ArrayList;

public class EstudianteNormal extends Alumno {
    private int conocimientoacumulado = 0, niveldeaprendizaje;
    private ArrayList<Examen> examenes = new ArrayList();

    public EstudianteNormal(int niveldeaprendizaje, String nombre, String carrera, String lugarnacimiento, String numerocuenta, String usuario, String contraseña, int edad) {
        super(nombre, carrera, lugarnacimiento, numerocuenta, usuario, contraseña, edad);
        this.niveldeaprendizaje = niveldeaprendizaje;
    }
    public EstudianteNormal(int niveldeaprendizaje) {
        this.niveldeaprendizaje = niveldeaprendizaje;
    }

    public int getConocimientoacumulado() {
        return conocimientoacumulado;
    }
    public int getNiveldeaprendizaje() {
        return niveldeaprendizaje;
    }
    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setConocimientoacumulado(int conocimientoacumulado) {
        this.conocimientoacumulado += conocimientoacumulado;
    }
    public void setNiveldeaprendizaje(int niveldeaprendizaje) {
        this.niveldeaprendizaje = niveldeaprendizaje;
    }
    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

    @Override
    public boolean HacerExamen(Examen e) {
        if (this.conocimientoacumulado > e.getIqrequerido()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void DarTutorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
}
