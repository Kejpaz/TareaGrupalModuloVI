package helpers;

public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, String residencia, int edad, String deporte) {
        super(nombre,residencia,edad);
        this.deporte = deporte;
    }
    @Override
    public void setInformacionPersonal(String informacion) {
        this.deporte = informacion;
    }
    @Override
    public String getInformacionPersonal() {
        return "Deporte: " + deporte;
    }
}