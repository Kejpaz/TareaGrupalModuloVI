package helpers;

public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, String residencia, int edad, String especialidad) {
        super(nombre,residencia, edad);
        this.especialidad = especialidad;
    }
    @Override
    public void setInformacionPersonal(String informacion) {
        this.especialidad = informacion;
    }

    @Override
    public String getInformacionPersonal() {
        return "Especialidad: " + especialidad;
    }
}
