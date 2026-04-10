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
@Table(name = "tb_baixa_de_estoque")
public class Baixa_de_estoque implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    @Column(name = "motivo", length = 100, nullable = false)
    private String motivo;

    @Column(name = "data_baixa", nullable = false)
    private LocalDateTime dataBaixa;

    @Column(name = "observacoes", length = 500)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "id_estoque", nullable = false, foreignKey = @ForeignKey(name = "fk_baixa_estoque"))
    private Estoque estoque;

    @ManyToOne
    @JoinColumn(name = "id_colaborador", nullable = true, foreignKey = @ForeignKey(name = "fk_baixa_colaborador"))
    private Colaborador colaborador;

    // Construtores
    public Baixa_de_estoque() {
    }

    public Baixa_de_estoque(int quantidade, String motivo, LocalDateTime dataBaixa, 
                            String observacoes, Estoque estoque, Colaborador colaborador) {
        this.quantidade = quantidade;
        this.motivo = motivo;
        this.dataBaixa = dataBaixa;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDateTime getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(LocalDateTime dataBaixa) {
        this.dataBaixa = dataBaixa;
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
