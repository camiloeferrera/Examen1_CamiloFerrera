/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab1_camiloferrera;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Camilo
 */
public class Tutoria {
    String clase, tema;
    Date fecha;
    private int hora, aula;
    private Tutor tutor;
    private ArrayList<Alumno> alumnos = new ArrayList();

    public Tutoria(String clase, String tema, Date fecha, int hora, int aula, Tutor tutor) {
        this.clase = clase;
        this.tema = tema;
        this.fecha = fecha;
        this.hora = hora;
        this.aula = aula;
        this.tutor = tutor;
    }
    public Tutoria() {
    }

    public String getClase() {
        return clase;
    }
    public String getTema() {
        return tema;
    }
    public Date getFecha() {
        return fecha;
    }
    public int getHora() {
        return hora;
    }
    public int getAula() {
        return aula;
    }
    public Tutor getTutor() {
        return tutor;
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setAula(int aula) {
        this.aula = aula;
    }
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Tutoria{" + "clase=" + clase + ", tema=" + tema + ", fecha=" + fecha + ", hora=" + hora + ", aula=" + aula + ", tutor=" + tutor + ", alumnos=" + alumnos + '}';
    }
    
    
}
