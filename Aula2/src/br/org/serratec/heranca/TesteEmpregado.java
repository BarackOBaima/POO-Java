package br.org.serratec.heranca;

public class TesteEmpregado {

    public static void main(String[] args) {
        //Polimorfismo
        Gerente gerente = new Gerente("Carla","c@gmail.com","2222",5500.,10);

        System.out.println(gerente.getNome() + "-"+ gerente.getEmail());
        System.out.println(gerente.getNumEmpregadoGerenciados());
    }

}