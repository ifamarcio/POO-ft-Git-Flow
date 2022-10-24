package com.poo;

public class Pessoa {

    private String nome;
    private float peso;
    private float altura;

    //Contrutor : sobrecarga

    public Pessoa(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }


    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {                                                                                                                                                                         
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String falar(){

        return "eu falo o idioma português.";
    }

    private String determinarMassaCorporal(){
        String massaCorporal ="";
        float imc = 0;

        imc = (float) (this.peso / (this.altura *this.altura));
        
        if (imc <= 18.5){
            massaCorporal = "Magresa. IMC = " + Float.toString(imc) + ", grau de obesidade 0.";
        }else if (imc <= 24.9){
            massaCorporal = "Normal. IMC = " + Float.toString(imc) + ", grau de obesidade 0.";
        }else if (imc <= 29.9){
            massaCorporal = "Sobrepeso. IMC = " + Float.toString(imc) + ", grau de obesidade 1.";
        }else if (imc <= 39.9){
            massaCorporal = "Obsidade. IMC = " + Float.toString(imc) + ", grau de obesidade 2.";
        }else {//maior que 40
            massaCorporal = "Obesidade Grave. IMC = " + Float.toString(imc) + ", grau de obesidade 3.";

        }

   
        return massaCorporal;

 }


    }
    

 