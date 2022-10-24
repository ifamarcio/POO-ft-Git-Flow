package com.poo;

public class App {

    public static void main(String[] args) {


        // delcarar instaciar atributos dados aos objetos


        Pessoa objPessoa = new Pessoa(nome:"Márcio Ferreira viana", peso: 78, altura: 1.70F);


        // atribuir dados / delcarar instaciar atributos dados aos objetos

    
    //Exibir dados

    System.out.println("Nome .................:" + objPessoa.getNome());
    System.out.println("Altura................:" + Float.toString(objPessoa.getAltura()));
    System.out.println("Peso .................:" + Float.toString(objPessoa.getPeso()));
    System.out.println("Ação Falar............:" + objPessoa.falar());
    System.out.println("Estado Massa Corporal.:" + objPessoa.estadoMassaCorporal() );
    
}

    
}
