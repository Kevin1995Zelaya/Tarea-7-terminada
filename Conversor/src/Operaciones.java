/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KEVIN EDUARDO ZELAYA
 */
public class Operaciones {
    private double valor,resultado;
    private int divisa,divisaz;
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisaz() {
        return divisaz;
    }

    public void setDivisaz(int divisaz) {
        this.divisaz = divisaz;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    //Contructor

    public Operaciones() {
        
          
        
    }
    
    //Operaciones
    public double convertir(){
    if(divisa == 0 && divisaz ==1){//empiras a Euros
    resultado = valor * 24.95;
    }
    else if(divisa == 0 && divisa ==0){
        resultado = valor;
    }
    
    return resultado;
    }
    
    
}
