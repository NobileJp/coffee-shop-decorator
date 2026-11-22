package br.edu.ifsp.decorator;

import br.edu.ifsp.decorator.toppings.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- PEDIDO 1 ---");
        Cafe pedido1 = new CafeSimples();
        pedido1 = new Leite(pedido1);
        pedido1 = new Chocolate(pedido1);
        System.out.println("Descrição: " + pedido1.getDescricao());
        System.out.printf("Total: R$ %.2f%n", pedido1.getPreco());

        System.out.println("\n--- PEDIDO 2 (Personalizado) ---");
        Cafe pedido2 = new CafeSimples();
        pedido2 = new LeiteDeSoja(pedido2);
        pedido2 = new Chantilly(pedido2);
        pedido2 = new CaldaDeBaunilha(pedido2);
        pedido2 = new Chocolate(pedido2);
        System.out.println("Descrição: " + pedido2.getDescricao());
        System.out.printf("Total: R$ %.2f%n", pedido2.getPreco());
    }
}