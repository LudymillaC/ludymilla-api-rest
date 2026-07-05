package org.softcode.organiza_estabelecimento.entity;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pulseira")
public class Pulseira implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Cor")
    private String cor;
    @Column (name = "Tamanho")
    private String tamanho;
    @Column (name = "Material")
    private String material;

    public Pulseira() {
    }

    public Pulseira(int id, String cor, String tamanho, String material) {
        this.id = id;
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
