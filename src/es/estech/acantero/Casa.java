package es.estech.acantero;

public class Casa {

    private String direccion;
    private int codigoPostal;
    private int habitaciones;
    private int superficie;

    public Casa(String direccion, int codigoPostal, int habitacioes, int superficie) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.habitaciones = habitaciones;
        this.superficie = superficie;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", habitaciones=" + habitaciones +
                ", superficie=" + superficie +
                '}';
    }
}
