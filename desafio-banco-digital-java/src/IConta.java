public interface IConta {
    public void sacar(double valor);

    public void depositar(double valor);

    public void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
// interface obriga a todas classes que usam ela, a implementar tudo que ela tem. Como se fosse um contrato.

// contrato: assinatura de metodos que as classes vão ter que respeitar.