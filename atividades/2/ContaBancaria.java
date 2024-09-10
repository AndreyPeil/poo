public class ContaBancaria {

    private  String titular;
    private  double saldo;
    private String numeroConta;

    public ContaBancaria(String titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String numeroConta(){
        return this.numeroConta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }

    public void setnumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void depositar(double quantidade){
        if(quantidade > 0){
            this.saldo += quantidade;
        }
    }

    public void sacar(double quantidade){
        if(quantidade > 0 && quantidade <= this.saldo){
            this.saldo -= quantidade;
        }
    }


}