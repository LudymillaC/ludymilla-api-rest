package org.softcode.organiza_estabelecimento.entity;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "tb_perfil")
public class Perfil implements Serializable {
private static final long serialVersionUID = 1L;

    @Id

    private int id;
    private String nome;

    public Perfil(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

}
