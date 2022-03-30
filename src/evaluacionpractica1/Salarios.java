
package evaluacionpractica1;

import java.util.Scanner;


public class Salarios {
    public static void main(String[] args) {
        double PrimerSalario = 0.0;
        double SegundoSalario = 0.0;
        double TercerSalario = 0.0;
        EvaluacionPractica1 salario = new EvaluacionPractica1();
        
         
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca las horas trabajadas :");
        salario.setHoraT(leer.nextDouble());
        System.out.println("Introdusca el pago por hora :");
        salario.setPagoH(leer.nextDouble());
        System.out.println("------------------------------------");
        salario.EvaluacioPractico1();
        
        PrimerSalario = salario.EvaluacioPractico1();
        SegundoSalario = salario.renta(salario);
        TercerSalario = salario.SalarioLiquido(salario);
        System.out.println("El salario bruto es : $"+PrimerSalario);
        System.out.println("El monto de la retencion aplicada es : $"+SegundoSalario);
        System.out.println("El salario liquido es : $"+TercerSalario);
    }

}
