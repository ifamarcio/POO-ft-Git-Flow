package com.poo;

public interface IContaBancaria {
  public abstract void depositar(float valor);
  public abstract void sacar(float valor);
  public abstract float obterSaldo();   
}
