package com.mycompany.empresa;

import javax.swing.JOptionPane;

public class Empresa {

    public static void main(String[] args) {
        
        //Atributos
        String nombre = "";
        int Ced ;
        String Codigo;
        double Monto;
        String Mes;
        int Ano;
       
        
        //Variables para decision 
        double VOperacionada;
        double montoSum = 0;
        int Estado;
        int i;
        int CantFact = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de Facturas que va a ingresar"));
        
        //Repetidor
        for (i = 0; i < CantFact; i++) {
            
            nombre = JOptionPane.showInputDialog("Digite el nombre del cliente");
            Ced = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cedula del cliente"));
            Codigo = JOptionPane.showInputDialog("Digite el codigo de la factura");
            Monto = Double.parseDouble(JOptionPane.showInputDialog("Digite el monto de la factura"));
            Mes = JOptionPane.showInputDialog("Digite el numero de mes de la factura");
            Ano = Integer.parseInt(JOptionPane.showInputDialog("Digite el ano de la factura"));
            Estado = Integer.parseInt(JOptionPane.showInputDialog("Digite el Estado de La factura (1)Pagada (2)No Pagada"));
         
        //Variable Copiladora    
        if(Estado == 2){
            
            montoSum = montoSum + Monto;
            
            
        }    
        }
        
        //Variable creda con la operacion para las cuotas
        VOperacionada = ((montoSum*0.15)+montoSum)/4;
        
        JOptionPane.showMessageDialog(null, "Hola "+ nombre + "su plan de cuotas a 4 meses para sus facturas no pagadas es el siguiente");
        JOptionPane.showMessageDialog(null, "Cuota 1 " + VOperacionada + "Fecha de pago Marzo 2024 "+ 
                                            "\n Cuota 2 " + VOperacionada + "Fecha de pago Abril 2024"+
                                            "\n Cuota 3 " + VOperacionada + "Fecha de pago Mayo 2024"+
                                            "\n Cuota 4 " + VOperacionada + "Fecha de pago Junio 2024");
    }
}
