package org.softcode.organiza_estabelecimento.entity;
import java.io.Serializable;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;   


@Entity
@Table(name = "tb_desconto")
public class Desconto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Nome")
    private String nome;
    @Column (name = "Tipo")
    private long tipo;
    @Column (name = "Preco_Original")
    private String preco_original;
    @Column (name = "Porcentagem_desconto")
    private String porcentagem_desconto;
    @Column (name = "Data")
    private String data;
    @Column (name = "Hora")
    private String hora;
    @Column (name = "Nota_fiscal")
    private String nota_fiscal;
    @Column (name = "Estoque")
    private String estoque;
    @Column (name = "Valor_desconto")
    private Float valor_desconto;

    public Desconto() {
    }

    public Desconto(int id, String nome, long tipo, String preco_original, String porcentagem_desconto, String data, String hora, String nota_fiscal, String estoque, Float valor_desconto) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.preco_original = preco_original;
        this.porcentagem_desconto = porcentagem_desconto;
        this.data = data;
        this.hora = hora;
        this.nota_fiscal = nota_fiscal;
        this.estoque = estoque;
        this.valor_desconto = valor_desconto;
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

    public long getTipo() {
        return tipo;
    }

    public void setTipo(long tipo) {
        this.tipo = tipo;
    }

    public String getPreco_original() {
        return preco_original;
    }

    public void setPreco_original(String preco_original) {
        this.preco_original = preco_original;
    }

    public String getPorcentagem_desconto() {
        return porcentagem_desconto;
    }

    public void setPorcentagem_desconto(String porcentagem_desconto) {
        this.porcentagem_desconto = porcentagem_desconto;
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

    public String getNota_fiscal() {
        return nota_fiscal;
    }


    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }


    public Float getValor_desconto() {
        return valor_desconto;
    }

    public void setValor_desconto(Float valor_desconto) {
        this.valor_desconto = valor_desconto;
    }
}




