package br.edu.ifsp.decorator;

public class CafeSimples implements Cafe {
    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double getPreco() {
        return 5.00;
    }
}