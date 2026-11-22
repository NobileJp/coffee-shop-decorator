package br.edu.ifsp.decorator.toppings;

import br.edu.ifsp.decorator.Cafe;
import br.edu.ifsp.decorator.CafeDecorator;

public class LeiteDeSoja extends CafeDecorator {
    public LeiteDeSoja(Cafe cafe) { super(cafe); }

    @Override
    public String getDescricao() { return cafe.getDescricao() + ", Leite de Soja"; }

    @Override
    public double getPreco() { return cafe.getPreco() + 3.50; }
}