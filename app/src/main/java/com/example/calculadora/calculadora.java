package com.example.calculadora;

public class calculadora {
    double numA;
    double numB;
    double resultado;

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double getNumA(){
        return numA;
    }

    public double getNumB(){
        return numB;
    }
    public double Sumar(){
        resultado = getNumA() + getNumB();
        return resultado;
    }
    public double Restar(){
        resultado = getNumA() - getNumB();
        return resultado;
    }
    public double Multi() {
        resultado = getNumA() * getNumB();
        return resultado;
    }
    public double Divi() {
        resultado = getNumA() / getNumB();
        return resultado;
    }
}
