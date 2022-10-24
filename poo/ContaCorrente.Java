public class ContaCorrente implements IContaBancaria{
private float valorConta;


public ContaCorrente(float valor){
    this.valorConta = this.valorConta + valor;
}

@Override
public void depositar(float valor) {
    this.valorConta = this.valorConta + valor;
}

@Override
public void sacar(float valor) {
    this.valorConta = this.valorConta - valor;

}

@Override
public float obterSaldo() {
    return this.valorConta;
}




}