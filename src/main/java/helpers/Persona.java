
package helpers;

public abstract class Persona {
    private String nombre;
    private String residencia;
    int edad;

    public Persona(String nombre,String residencia, int edad) {
        this.nombre = nombre;
        this.residencia = residencia;
        this.edad = edad;
    }

    public abstract void setInformacionPersonal(String informacion);
    public abstract String getInformacionPersonal();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
