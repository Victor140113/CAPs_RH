package rh_codes;
public class Funcionario {
    //Encapsulamento
    private String nome;
    private String cpf;
    double salario;

    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Regra de Negócio Encapsulada
    public void aplicarAumento(double percentual){
        if (percentual > 0){
            this.salario +=this.salario * (percentual /100);
        }
    }
}