package org.softcode.organiza_estabelecimento.entity;

public class Pagamento {
    private int id;
    private String metodo;
    private double valor;

    public Pagamento(int id, String metodo, double valor) {
        this.id = id;
        this.metodo = metodo;
        this.valor = valor;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
