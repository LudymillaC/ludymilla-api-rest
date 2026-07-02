package org.softcode.organiza_estabelecimento.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

    @Entity

    @Table(name = "tb_consumo")
    public class Consumo implements Serializable {
    private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Mesa mesa;
    private Pagamento pagamento;
    private String cod_mesa;
    private String pedidos;
    private String subtotal;
    private String estabelecimento;
    private String data;
    private String hora;
    private String status;
    private String estoque;


    public Consumo() {
    }

    public Consumo(int id, String cliente, long quantidade, String frequencia, String produto, String data, String hora, String status, String estoque) {
        this.id = id;
        this.cliente = cliente;
        this.quantidade = quantidade;
        this.frequencia = frequencia;
        this.produto = produto;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }   


    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }
}
