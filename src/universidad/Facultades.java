
package universidad;

import java.util.Date;

public class Facultades extends Universidad{

    private int numeroDeFacultades;
    private boolean seguroEstudiantil;
    private int numeroDeMaestros;

    public Facultades(int numeroDeFacultades,int numeroDeMaestros, Date fechaDeInauguracion, String nombre, String nombresDeEstudiantes, boolean seguroEstudiantil, int numeroDeSalones) {
        super(fechaDeInauguracion, nombre, nombresDeEstudiantes, seguroEstudiantil, numeroDeSalones);
        this.numeroDeFacultades = numeroDeFacultades;
        this.seguroEstudiantil = seguroEstudiantil;
        this.numeroDeMaestros = numeroDeMaestros;
    }

    public void accidenteEstudiantil(){
        this.seguroEstudiantil = true;
    }    
    
    public void accidenteEstudiantil(int accidente){
        this.seguroEstudiantil = true;
        this.numeroDeFacultades += accidente;
    }
    
    public int getNumeroDeFacultades() {
        return numeroDeFacultades;
    }

    public void setNumeroDeFacultades(int numeroDeFacultades) {
        this.numeroDeFacultades = numeroDeFacultades;
    }

    public boolean isSeguroEstudiantil() {
        return seguroEstudiantil;
    }

    public void setSeguroEstudiantil(boolean seguroEstudiantil) {
        this.seguroEstudiantil = seguroEstudiantil;
    }

    public int getNumeroDeMaestros() {
        return numeroDeMaestros;
    }

    public void setNumeroDeMaestros(int numeroDeMaestros) {
        this.numeroDeMaestros = numeroDeMaestros;
    }


    
    }
    
    


