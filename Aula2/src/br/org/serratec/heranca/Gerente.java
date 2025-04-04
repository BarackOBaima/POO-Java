package br.org.serratec.heranca;

public class Gerente extends Empregado{
    private Integer numEmpregadoGerenciados;

    public Gerente(String nome, String email, String telefone, Double salario, Integer numEmpregadoGerenciados) {
        super(nome, email, telefone, salario);
        this.numEmpregadoGerenciados = numEmpregadoGerenciados;
    }

    public Integer getNumEmpregadoGerenciados() {
        return numEmpregadoGerenciados;
    }


}