public class Cliente {
    private String username;
    private String senha;
    private String nome;
    private int idade;
    private double saldoTotal;

    public Cliente(String username, String senha) {

        this.username = username;
        this.senha = senha;
    }
    public Cliente(String username, String senha, String nome, int idade, double saldoTotal){
        this.username = username;
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.saldoTotal = saldoTotal;
    }
}
