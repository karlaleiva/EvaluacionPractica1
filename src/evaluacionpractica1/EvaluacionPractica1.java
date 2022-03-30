/*
 Calcular el salario de un trabajador en base a los siguientes criterios.
a) Se debe pedir por teclado el número de horas trabajadas en el mes (HT) y el pago por hora (PH). Trabajar con número
reales para ambos casos.
Evaluar las horas trabajas según lo siguiente:
b) Si las horas trabajadas son menores o iguales a 40, se considera que el empleado no ha realizado horas
extras en el mes.
c) Si las horas trabajadas son mayores a 40 y menores o iguales a 48, se considera que el empleado ha
realizado horas extras que se le pagan al doble del pago de una hora normal. Haciendo para este caso un total
de 8 horas pagadas como máximo al doble.
d) Si las horas trabajadas exceden de 48, se considera que el empleado ha realizado horas extras que se le
pagan al doble y al triple del pago de una hora normal, Haciendo un total de 8 horas extras pagadas al doble y
las que excedan de 8 se pagan al triple del pago de una hora normal
e) Se debe aplicar el descuento de la retención (RENTA) del 10% al salario bruto.
f) Se debe imprimir en pantalla el nombre del empleado, salario bruto (sin renta), salario líquido (con renta) y
finalmente el monto de la retención aplicada.
 */
package evaluacionpractica1;


public class EvaluacionPractica1 {

   
   private double HoraT;
    private double PagoH;
    
    public EvaluacionPractica1() {
    }

    public EvaluacionPractica1(double HoraT, double PagoH) {
        this.HoraT = HoraT;
        this.PagoH = PagoH;
    }

    public double getHoraT() {
        return HoraT;
    }

    public void setHoraT(double HoraT) {
        this.HoraT = HoraT;
    }

    public double getPagoH() {
        return PagoH;
    }

    public void setPagoH(double PagoH) {
        this.PagoH = PagoH;
    }
    
    
    double EvaluacioPractico1() {
        double Salario = 0;
        double HorasDobles;
        double HorasTriples;

    
        if (this.HoraT <= 40) {
            Salario = this.HoraT * this.PagoH;
            return Salario;
        } else if (this.HoraT > 40 && this.HoraT < 48) {
            HorasDobles = this.HoraT - 40;
            Salario = (40 * this.PagoH) + (HorasDobles * this.PagoH * 2);
            return Salario; 
        } else if (this.HoraT > 48) {
            HorasTriples = this.HoraT - 48;
            Salario = (40 * this.PagoH) + (8 * this.PagoH * 2)+(HorasTriples * this.PagoH * 3);
            return Salario;
        }
        return Salario;
    }
    
    double renta(EvaluacionPractica1 Salario){
    double renta;
    Salario.EvaluacioPractico1();
    renta = Salario.EvaluacioPractico1() * 0.10  ;
    return renta;
    }
    double SalarioLiquido(EvaluacionPractica1 Salario){
        double salarioBruto;
        
        salarioBruto = Salario.EvaluacioPractico1() - Salario.renta(Salario);
        return salarioBruto;
    }
    }
    

