public class Cliente {

    private int agencia;
    private int conta;
    private String nome;
    private String email;
    private String telefone;
    private double saldo;


    public void Clientes(int agencia, int conta, String nome, String email, String telefone, double saldo) {
    this .agencia=agencia;
    this.conta=conta;
    this.nome=nome;
    this.email=email;
    this.telefone=telefone;
    this.saldo=saldo;

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
