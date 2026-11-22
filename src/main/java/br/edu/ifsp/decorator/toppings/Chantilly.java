package br.edu.ifsp.decorator.toppings;

import br.edu.ifsp.decorator.Cafe;
import br.edu.ifsp.decorator.CafeDecorator;

public class Chantilly extends CafeDecorator {
    public Chantilly(Cafe cafe) { super(cafe); }

    @Override
    public String getDescricao() { return cafe.getDescricao() + ", Chantilly"; }

    @Override
    public double getPreco() { return cafe.getPreco() + 2.50; }
}