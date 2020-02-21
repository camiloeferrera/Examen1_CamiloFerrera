package examenlab1_camiloferrera;

public class Alumno {
    private String nombre, carrera, lugarnacimiento, numerocuenta, usuario, contraseña;
    private int edad;

    public Alumno(String nombre, String carrera, String lugarnacimiento, String numerocuenta, String usuario, String contraseña, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.lugarnacimiento = lugarnacimiento;
        this.numerocuenta = numerocuenta;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
    }
    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }
    public String getCarrera() {
        return carrera;
    }
    public String getLugarnacimiento() {
        return lugarnacimiento;
    }
    public String getNumerocuenta() {
        return numerocuenta;
    }
    public String getUsuario() {
        return usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }
    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
