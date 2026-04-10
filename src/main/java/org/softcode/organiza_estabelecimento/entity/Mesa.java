package org.softcode.organiza_estabelecimento.entity;

public class Mesa {
    private int id;
    private int numero;
    private int pedidos;

    public Mesa(int id, int numero, int pedidos) {
        this.id = id;
        this.numero = numero;
        this.pedidos = pedidos;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }
}
