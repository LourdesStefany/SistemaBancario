import java.util.Scanner; 
public class ContaBancaria{
    //Encapsulamento: atributos privados 
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;

    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque insuficiente ou valor invalido.");
        }
    
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do titular: ");
        String nome = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria (nome, 5000.00);

        System.out.println("Conta criada para " + conta.getTitular() + " com saldo inicial de R$ " + conta.getSaldo());
        conta.depositar(150.0);
        conta.sacar(1000.0);
        System.out.println("Saldo final: R$ " + conta.getSaldo());

        scanner.close();
    }
}
