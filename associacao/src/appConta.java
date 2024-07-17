public class appConta {

    public static void main(String[] args) {
        Pessoa p;
        Conta c;

        p = new Pessoa("Fernando", "fernando@mail", 999998);
        c = new Conta(1231231, p);

        System.out.println("Conta: " + c.codigo);
        System.out.println("\nCorrentista: " + c.pessoa.getNome());
        System.out.println("\nEmail: " + c.pessoa.getEmail());
        System.out.println("\nCelular: " + c.pessoa.getCelular());
        System.out.printf("\nSaldo: R$%.2f", c.getSaldo());
    }
}
