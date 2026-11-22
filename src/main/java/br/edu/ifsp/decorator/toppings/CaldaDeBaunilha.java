package br.edu.ifsp.decorator.toppings;

import br.edu.ifsp.decorator.Cafe;
import br.edu.ifsp.decorator.CafeDecorator;

public class CaldaDeBaunilha extends CafeDecorator {
    public CaldaDeBaunilha(Cafe cafe) { super(cafe); }

    @Override
    public String getDescricao() { return cafe.getDescricao() + ", Calda de Baunilha"; }

    @Override
    public double getPreco() { return cafe.getPreco() + 1.50; }
}