package org.softcode.organiza_estabelecimento.entity;
import java.time.LocalDateTime;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "tb_estabelecimento")
public class Estabelecimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "Endereco", length = 200, nullable = false)
    private String endereco;

    @Column(name = "Telefone", length = 20, nullable = false)
    private String telefone;

    @Column(name = "Email", length = 100, nullable = false)
    private String email;

    @Column(name = "Data_Criacao", nullable = false)
    private LocalDateTime dataCriacao;

    // Construtores
    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String endereco, String telefone, String email, LocalDateTime dataCriacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataCriacao = dataCriacao;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
