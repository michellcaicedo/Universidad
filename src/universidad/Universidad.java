package universidad;

import java.util.Date;

public class Universidad {

    private Date fechaDeInauguracion;
    private String nombre;
    private String nombresDeEstudiantes;
    private boolean seguroEstudiantil;
    private int numeroDeSalones;

    
    
    public void estudiar(int cantidadDeAulas,String segundoNombreDeEstudiantes){
            if(cantidadDeAulas<0){
                   System.out.println("No hay clases");
            }else{
                if(numeroDeSalones<cantidadDeAulas){
                    System.out.println("No hay clases");
                }else{
                    numeroDeSalones = cantidadDeAulas;
                    nombresDeEstudiantes = segundoNombreDeEstudiantes;
                    
                           
                }
              
            }
        
    }
}
