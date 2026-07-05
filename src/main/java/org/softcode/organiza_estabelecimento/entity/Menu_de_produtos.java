package org.softcode.organiza_estabelecimento.entity;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Entity
@Table(name = "tb_menu_de_produtos")
public class Menu_de_produtos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Descricao")
    private String descricao;

    public Menu_de_produtos() {
    }

    public Menu_de_produtos(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

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
