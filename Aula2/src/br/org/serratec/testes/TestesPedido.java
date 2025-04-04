package br.org.serratec.testes;

import java.time.LocalDate;

import br.org.serratec.exemplos.Pedido;

public class TestesPedido {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(123, LocalDate.of(2025, 02, 03), 2000.,2);

        System.out.println("N°Pedido:" + pedido1.getNumero() + " Total:" + pedido1.getTotal());

    }

}