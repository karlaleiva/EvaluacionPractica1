
package evaluacionpractica1.Empleado;


public class Edificio {
    String Ubicacion;
    String Nombre;
    int cantidadDeDepartamentos;
    int CantidadDePisos;

    public Edificio() {
    }

    public Edificio(String Ubicacion, String Nombre, int cantidadDeDepartamentos, int CantidadDePisos) {
        this.Ubicacion = Ubicacion;
        this.Nombre = Nombre;
        this.cantidadDeDepartamentos = cantidadDeDepartamentos;
        this.CantidadDePisos = CantidadDePisos;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidadDeDepartamentos() {
        return cantidadDeDepartamentos;
    }

    public void setCantidadDeDepartamentos(int cantidadDeDepartamentos) {
        this.cantidadDeDepartamentos = cantidadDeDepartamentos;
    }

    public int getCantidadDePisos() {
        return CantidadDePisos;
    }

    public void setCantidadDePisos(int CantidadDePisos) {
        this.CantidadDePisos = CantidadDePisos;
    }
}
