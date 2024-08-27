public class Main {
    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");


        Conta contaCorrente = new ContaCorrente(bruno);
        contaCorrente.depositar(100);    

        Conta contaPoupanca = new ContaPoupanca(bruno);
        contaCorrente.transferir(70, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
