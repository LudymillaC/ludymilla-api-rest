package org.softcode.organiza_estabelecimento.entity;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_permissao")
public class Permissao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "Acao")
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
