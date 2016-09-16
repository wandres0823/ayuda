/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase;
import excepciones.*;
/**
 *
 * @author walbonis1
 */
public class Cuenta {
    private long numero_cuenta;
    private long numero_identificacion;
    private double saldo_actual;

    public Cuenta(long numero_cuenta, long numero_identificacion, long saldo_actual) throws NoNegativoException, NoCeroException {
        if(numero_cuenta<0){
            throw new NoNegativoException("el numero de la cuenta no puede ser negativo");
        }
        
        if(numero_cuenta == 0){
            throw new NoCeroException("el numero de cuenta no puede ser cero");
        }
        
        if(numero_identificacion<0){
            throw new NoNegativoException("el numero identificacion  no puede ser negativo");
        }
        
        if(numero_identificacion == 0){
            throw new NoCeroException("el numero de cuenta no puede ser cero");
        }
        
        this.numero_cuenta = numero_cuenta;
        this.numero_identificacion = numero_identificacion;
        this.saldo_actual = saldo_actual;
    
    }
    public Cuenta(long numero_cuenta, long numero_identificacion) throws NoNegativoException, NoCeroException{
        if(numero_cuenta<0){
            throw new NoNegativoException("el numero de la cuenta no puede ser negativo");
        }
        
        if(numero_cuenta == 0){
            throw new NoCeroException("el numero de cuenta no puede ser cero");
        }
        
        if(numero_identificacion<0){
            throw new NoNegativoException("el numero identificacion  no puede ser negativo");
        }
        
        if(numero_identificacion == 0){
            throw new NoCeroException("el numero de cuenta no puede ser cero");
        }
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

   public void setSaldo_actual(double saldo_actual) throws NoNegativoException, NoCeroException {
       if(saldo_actual<0){
            throw new NoNegativoException("el saldo actual no puede ser negativo");
        }
        
       this.saldo_actual = saldo_actual;
    }
   public void actualizarsaldo(double ian) throws NoNegativoException, NoCeroException{
       if (ian <0){
           throw new NoNegativoException("el interes no puede ser negativo");
       }
       double aux,auxi2;
       aux=this.getSaldo_actual()*(ian/365);
       auxi2=this.getSaldo_actual()+aux;
       this.setSaldo_actual(auxi2);
   }
   
   public void ingresar(double ingreso) throws NoNegativoException, NoCeroException{
       if (ingreso <0){
           throw new NoNegativoException("el egreso no puede ser negativo");
       }
       if(ingreso == 0){
            throw new NoCeroException("el ingreso no puede ser cero");
        }
       double aux;
       aux=this.getSaldo_actual()+ingreso;
       this.setSaldo_actual(aux);
   }

    public void setNumero_cuenta(long numero_cuenta) throws NoNegativoException, NoCeroException {
        if(numero_cuenta<0){
            throw new NoNegativoException("el numero de la cuenta no puede ser negativo");
        }
        
        if(numero_cuenta == 0){
            throw new NoCeroException("el numero de cuenta no puede ser cero");
        }
        
        if(numero_identificacion<0){
            throw new NoNegativoException("el numero identificacion  no puede ser negativo");
        }
        
        if(numero_identificacion == 0){
            throw new NoCeroException("el numero de cuenta no puede ser cero");
        }
        this.numero_cuenta = numero_cuenta;
    }

    public void setNumero_identificacion(long numero_identificacion) throws NoNegativoException, NoCeroException {
         if(numero_cuenta<0){
            throw new NoNegativoException("el numero de la cuenta no puede ser negativo");
        }
        
        if(numero_cuenta == 0){
            throw new NoCeroException("el numero de cuenta no puede ser cero");
        }
        
        if(numero_identificacion<0){
            throw new NoNegativoException("el numero identificacion  no puede ser negativo");
        }
        
        if(numero_identificacion == 0){
            throw new NoCeroException("el numero de cuenta no puede ser cero");
        }
        this.numero_identificacion = numero_identificacion;
    }
   
   
  
   
   
   public void retirar(double egreso) throws NoNegativoException, NoCeroException{
       
       if(egreso<0){
            throw new NoNegativoException("el egreso no puede ser negativo");
       }
            if (egreso == 0){
           throw new NoCeroException("el numero no puede ser cero");
       }
            
            
            double aux;
       aux = this.getSaldo_actual() - egreso;
       
       
       this.setSaldo_actual(aux);
       
   }
   public String mostrar(){
       String aux;
       aux = "No. de la cuenta: "+this.getNumero_cuenta()+"\n"
           + "No. de Identificación: "+this.getNumero_identificacion()+"\n"
           + "Saldo Actual: "+this.getSaldo_actual();
        return aux;
              
   }

    public void actulizarSaldo(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }
   
   

