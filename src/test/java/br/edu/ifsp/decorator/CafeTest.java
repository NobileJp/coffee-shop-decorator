package br.edu.ifsp.decorator;

import br.edu.ifsp.decorator.toppings.Chocolate;
import br.edu.ifsp.decorator.toppings.Leite;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CafeTest {

    @Test
    public void deveCalcularPrecoDoCafeSimples() {
        Cafe cafe = new CafeSimples();
        assertEquals(5.00, cafe.getPreco());
        assertEquals("Café Simples", cafe.getDescricao());
    }

    @Test
    public void deveCalcularPrecoComAdicionais() {
        Cafe cafe = new CafeSimples();
        cafe = new Leite(cafe);
        cafe = new Chocolate(cafe);
        assertEquals(10.00, cafe.getPreco());
        assertEquals("Café Simples, Leite, Chocolate", cafe.getDescricao());
    }
}