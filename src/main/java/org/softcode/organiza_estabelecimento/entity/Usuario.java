package org.softcode.organiza_estabelecimento.entity;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


    @Entity

    @Table(name = "tb_usuario")
    public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L; 

        @Id    
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    //
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String contato;
    private String permissoes;
    private String condicao;

    public Usuario(Long id, String nome, String email, String senha, String contato , String permissoes, String condicao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.contato = contato;
        this.permissoes = permissoes;
        this.condicao = condicao;

        
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validaEmail(email);
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String permissoes) {
        this.permissoes = permissoes;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public void validaEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido: " + email);
        }
    }

}
