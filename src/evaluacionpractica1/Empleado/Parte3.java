
package evaluacionpractica1.Empleado;


public class Parte3 {
    int CodigoDeArea;  
  String NombredelArea;
  int cantidadEmpleado;
  int numeroDeEdificio;

    public Parte3() {
    }

    public Parte3(int CodigoDeArea, String NombredelArea, int cantidadEmpleado, int numeroDeEdificio) {
        this.CodigoDeArea = CodigoDeArea;
        this.NombredelArea = NombredelArea;
        this.cantidadEmpleado = cantidadEmpleado;
        this.numeroDeEdificio = numeroDeEdificio;
    }

    public int getCodigoDeArea() {
        return CodigoDeArea;
    }

    public void setCodigoDeArea(int CodigoDeArea) {
        this.CodigoDeArea = CodigoDeArea;
    }

    public String getNombredelArea() {
        return NombredelArea;
    }

    public void setNombredelArea(String NombredelArea) {
        this.NombredelArea = NombredelArea;
    }

    public int getCantidadEmpleado() {
        return cantidadEmpleado;
    }

    public void setCantidadEmpleado(int cantidadEmpleado) {
        this.cantidadEmpleado = cantidadEmpleado;
    }

    public int getNumeroDeEdificio() {
        return numeroDeEdificio;
    }

    public void setNumeroDeEdificio(int numeroDeEdificio) {
        this.numeroDeEdificio = numeroDeEdificio;
    }

    

    
}

