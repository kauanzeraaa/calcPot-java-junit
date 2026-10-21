package com.senai.exercicio2;

public class CalcPotencia{
    private double tensao;
    private double corrente;
    private double potencia;

    // Constructor
    public CalcPotencia(){
        
    }

    // Getter And Setter of Tensao
    public double getTensao(){
        return this.tensao;
    }
    public void setTensao(double t){
        this.tensao = t;
    }

    // Getter And Setter of Corrente
    public double getCorrente(){
        return this.corrente;
    }
    public void setCorrente(double c){
        this.corrente = c;
    }

    // Getter And Setter of Potencia
    public double getPotencia(){
        return this.potencia;
    }
    public void setPotencia(double p){
        this.potencia = p;
    }

    public double calcularPotencia(double tensao, double corrente){
        setPotencia(tensao * corrente);
        return this.potencia;
    }
}