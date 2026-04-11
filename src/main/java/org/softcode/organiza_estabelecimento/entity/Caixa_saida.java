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
@Table(name = "tb_caixa_saida")
public class Caixa_saida implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    @Column(name = "data_saida", nullable = false)
    private LocalDateTime dataSaida;

    @Column(name = "preco_unitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal precoUnitario;

    @Column(name = "motivo", length = 100, nullable = false)
    private String motivo;

    @Column(name = "destinatario", length = 150)
    private String destinatario;

    @Column(name = "numero_documento", length = 50)
    private String numeroDocumento;

    @Column(name = "observacoes", length = 500)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "id_estoque", nullable = false, foreignKey = @ForeignKey(name = "fk_saida_estoque"))
    private Estoque estoque;

    @ManyToOne
    @JoinColumn(name = "id_colaborador", nullable = true, foreignKey = @ForeignKey(name = "fk_saida_colaborador"))
    private Colaborador colaborador;

    // Construtores
    public Caixa_saida() {
    }

    public Caixa_saida(int quantidade, LocalDateTime dataSaida, BigDecimal precoUnitario,
                       String motivo, String destinatario, String numeroDocumento,
                       String observacoes, Estoque estoque, Colaborador colaborador) {
        this.quantidade = quantidade;
        this.dataSaida = dataSaida;
        this.precoUnitario = precoUnitario;
        this.motivo = motivo;
        this.destinatario = destinatario;
        this.numeroDocumento = numeroDocumento;
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

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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
