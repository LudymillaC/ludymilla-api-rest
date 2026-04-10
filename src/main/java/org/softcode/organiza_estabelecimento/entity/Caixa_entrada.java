package org.softcode.organiza_estabelecimento.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;

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
@Table(name = "tb_caixa_entrada")
public class Caixa_entrada implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    @Column(name = "data_entrada", nullable = false)
    private LocalDateTime dataEntrada;

    @Column(name = "preco_unitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal precoUnitario;

    @Column(name = "fornecedor", length = 150)
    private String fornecedor;

    @Column(name = "numero_nota_fiscal", length = 50)
    private String numeroNotaFiscal;

    @Column(name = "observacoes", length = 500)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "id_estoque", nullable = false, foreignKey = @ForeignKey(name = "fk_entrada_estoque"))
    private Estoque estoque;

    @ManyToOne
    @JoinColumn(name = "id_colaborador", nullable = true, foreignKey = @ForeignKey(name = "fk_entrada_colaborador"))
    private Colaborador colaborador;

    // Construtores
    public Caixa_entrada() {
    }

    public Caixa_entrada(int quantidade, LocalDateTime dataEntrada, BigDecimal precoUnitario,
                         String fornecedor, String numeroNotaFiscal, String observacoes,
                         Estoque estoque, Colaborador colaborador) {
        this.quantidade = quantidade;
        this.dataEntrada = dataEntrada;
        this.precoUnitario = precoUnitario;
        this.fornecedor = fornecedor;
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.observacoes = observacoes;
        this.estoque = estoque;
        this.colaborador = colaborador;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
}
