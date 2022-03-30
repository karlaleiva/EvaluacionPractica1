/*
En la escuela especializada en ingeniería ITCA-FEPADE se manejan un número grande de empleados,
recursos humanos proporciono la siguiente información. Todo empleado tiene nombre, código de empleado,
edad, dirección, área a la que pertenece, cargo que desempeña en el área, sueldo base, fecha de ingreso. Los
empleados pueden ser docentes o administrativos. El docente puede ser permanente o por servicio. El área
cuenta con código de área, nombre, cantidad de empleados, numero de edificio.
Al final se desea capturar la información del empleado, imprimir los datos personales y el área a la que
pertenece. Del edificio se conoce la ubicación, el nombre, cantidad de departamentos que alberga,
cantidad de pisos. Además, se desea saber el salario final del empleado tomando en cuenta todos los
descuentos de ley (ISSS, AFP Y RENTA), recordar que si es empleado por servicio solo se le debe
descontar renta.

 */
package evaluacionpractica1.Empleado;

    

public class Empleado extends Edificio {

    String NombredelTrabajador;
    int CodigoEmpleado;
    int Edad;
    String DirecciondelTrabajador;
    String AreaenqueTrabaja;
    String CargoqueDesempeñado;
    String FechaDeIngreso;
    double SueldoBase;
    boolean TipodeContrato;

    public Empleado() {
    }

    public Empleado(String NombredelTrabajador, int CodigoEmpleado, int Edad, String DirecciondelTrabajador, String AreaenqueTrabaja, String CargoqueDesempeñado, String FechaDeIngreso, double SueldoBase, boolean TipodeContrato) {
        this.NombredelTrabajador = NombredelTrabajador;
        this.CodigoEmpleado = CodigoEmpleado;
        this.Edad = Edad;
        this.DirecciondelTrabajador = DirecciondelTrabajador;
        this.AreaenqueTrabaja = AreaenqueTrabaja;
        this.CargoqueDesempeñado = CargoqueDesempeñado;
        this.FechaDeIngreso = FechaDeIngreso;
        this.SueldoBase = SueldoBase;
        this.TipodeContrato = TipodeContrato;
    }

    public String getNombredelTrabajador() {
        return NombredelTrabajador;
    }

    public void setNombredelTrabajador(String NombredelTrabajador) {
        this.NombredelTrabajador = NombredelTrabajador;
    }

    public int getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public void setCodigoEmpleado(int CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDirecciondelTrabajador() {
        return DirecciondelTrabajador;
    }

    public void setDirecciondelTrabajador(String DirecciondelTrabajador) {
        this.DirecciondelTrabajador = DirecciondelTrabajador;
    }

    public String getAreaenqueTrabaja() {
        return AreaenqueTrabaja;
    }

    public void setAreaenqueTrabaja(String AreaenqueTrabaja) {
        this.AreaenqueTrabaja = AreaenqueTrabaja;
    }

    public String getCargoqueDesempeñado() {
        return CargoqueDesempeñado;
    }

    public void setCargoqueDesempeñado(String CargoqueDesempeñado) {
        this.CargoqueDesempeñado = CargoqueDesempeñado;
    }

    public String getFechaDeIngreso() {
        return FechaDeIngreso;
    }

    public void setFechaDeIngreso(String FechaDeIngreso) {
        this.FechaDeIngreso = FechaDeIngreso;
    }

    public double getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public boolean isTipodeContrato() {
        return TipodeContrato;
    }

    public void setTipodeContrato(boolean TipodeContrato) {
        this.TipodeContrato = TipodeContrato;
    }

    String inforTrabajador(){
        String info = "";
        
        info +="El nombre es :"+NombredelTrabajador+"\n";
        info +="El codigo del empleado es :"+CodigoEmpleado+"\n";
        info +="La edad del empleado es :"+Edad+"\n";
        info +="La direccion del empleado es :"+DirecciondelTrabajador+"\n";
        info +="El area de trabajo es :"+AreaenqueTrabaja+"\n";
        info +="El cargo a desempeñar es :"+CargoqueDesempeñado+"\n";
        info +="El sueldo base es : $"+SueldoBase+"\n";
        
        return info;
    }
    
    boolean tipoContrato(){
        
        return TipodeContrato;
    }
}

