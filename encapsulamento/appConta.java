public class appConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(500.00f);
        conta.setCodigo(1030);
        conta.depositar(250.00f);

        System.out.println("Código: " + conta.getCodigo());
        System.out.println("Correntista: " + conta.getCorrentista());
        System.out.println("Saldo: " + conta.getSaldo());


        if (conta.sacar(10)) {
            System.out.println("Saldo: " + conta.getSaldo());
        }
    }
}
