/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase;

/**
 *
 * @author walbonis1
 */
public class Cuenta {
    private long numero_cuenta;
    private long numero_identificacion;
    private double saldo_actual;

    public Cuenta(long numero_cuenta, long numero_identificacion, long saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.numero_identificacion = numero_identificacion;
        this.saldo_actual = saldo_actual;
    
    }
    public Cuenta(long numero_cuenta, long numero_identificacion){
        this.numero_cuenta = numero_cuenta;
        this.numero_identificacion = numero_identificacion;
        this.saldo_actual = 0;
        
    }
    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public long getNumero_identificacion() {
        return numero_identificacion;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public void setNumero_identificacion(long numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }
    
    public void actualizar_saldo(double ian){
        double auxi,auxi2;
        auxi =this.getSaldo_actual()*(ian/365);
        auxi2=this.getSaldo_actual()+ auxi;
        this.setSaldo_actual(auxi2);
    }
        
    public void ingresar(double ingreso){
        double auxi;
        auxi =this.getSaldo_actual() + ingreso;
        this.setSaldo_actual(auxi);
        
    }
    public void retira(double egreso){
        double auxi;
        auxi=this.getSaldo_actual()-egreso;
       
     this.setSaldo_actual(auxi);
    }
    
}
