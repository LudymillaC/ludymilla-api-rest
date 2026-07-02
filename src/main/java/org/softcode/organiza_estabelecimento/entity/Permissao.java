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

public class Permissao {
    private int id;
    private String nome;
    private String descricao;
    private Object acao;

    /**
     * @param id
     * @param nome
     * @param descricao
     * @param acao
     */
    public Permissao(int id, String nome, String descricao, Boolean acao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
       
        
    }

    public Object getAcao() {
        return acao;
    }

    public void setAcao(Object acao) {
        this.acao = acao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
