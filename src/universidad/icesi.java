
package universidad;

import java.util.Date;

public class icesi extends Universidad{
    
    private int aula;
    private String nombreDeAula;
    private Date fechaInauguracion;  

    public icesi(int aula, String nombreDeAula, Date fechaInauguracion, Date fechaDeInauguracion, String nombre, String nombresDeEstudiantes, boolean seguroEstudiantil, int numeroDeSalones) {
        super(fechaDeInauguracion, nombre, nombresDeEstudiantes, seguroEstudiantil, numeroDeSalones);
        this.aula = aula;
        this.nombreDeAula = nombreDeAula;
        this.fechaInauguracion = fechaInauguracion;
    }
    
    public void aumentarAula(String nuevaAula){
        this.nombreDeAula = nuevaAula;
    }
    
    public void aumentarAula(String nuevaAula, String especialidad){
        this.nombreDeAula = nuevaAula + " de " + especialidad;
    }
    

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getNombreDeAula() {
        return nombreDeAula;
    }

    public void setNombreDeAula(String nombreDeAula) {
        this.nombreDeAula = nombreDeAula;
    }

    public Date getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(Date fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }
    
    

    
    
}
