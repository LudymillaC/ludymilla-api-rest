// Pacote onde a entidade está localizada
package org.softcode.organiza_estabelecimento.entity;
// Importações necessárias
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


    //Indica que está classe é uma entidade JPA (representa uma tabela no banco de dados)
    @Entity

    //Indica o nome da tabela no banco de dados que esta entidade irá mapear
    @Table(name = "tb_comanda")
    public class Comanda implements Serializable { // Serializable é uma interface que permite que os objetos sejam convertidos em fluxo de bytes (Necessário para persistência em banco de dados)  
    private static final long serialVersionUID = 1L;
    
        //Chave primária da entidade
        @Id
        //Estratégia de geração de valor (auto-increment no banco de dados)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Atributos da entidade (correspondem às colunas da tabela no banco de dados)
    private int id;
    //Código da mesa associada à comanda (Relacionamento ManyToOne)
    @Column(name = "Cod_mesa")
    private String cod_mesa;
    //Pedidos realizados na comanda (Ex: "2x Coca-Cola, 1x Pizza")
    @Column(name = "Pedidos")
    private String pedidos;
    //Subtotal da comanda
    @Column(name = "Subtotal")
    private BigDecimal subtotal;
    //Estabelecimento onde a comanda foi realizada
    @Column(name = "Estabelecimento")
    private String estabelecimento;
    //Data da realização da comanda
    @Column(name = "Data")
    private LocalDate data;
    //Hora da realização da comanda
    @Column(name = "Hora")
    private LocalTime hora;
    //Status da comanda (ex: aberta, fechada, cancelada)    
    @Column(name = "Status")
    private String status;
    //Informação sobre o estoque relacionada à comanda
    @Column(name = "Estoque")
    private boolean estoque;

    public Comanda() {
    }

    public Comanda(int id, String cod_mesa, String pedidos, BigDecimal subtotal, String estabelecimento, LocalDate data, LocalTime hora, String status, boolean estoque) {
        this.id = id;
        this.cod_mesa = cod_mesa;
        this.pedidos = pedidos;
        this.subtotal = subtotal;
        this.estabelecimento = estabelecimento;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   

    public String getCod_mesa() {
        return cod_mesa;
    }

    public void setCod_mesa(String cod_mesa) {
        this.cod_mesa = cod_mesa;
    }

    public String getPedidos() {
        return pedidos;
    }

    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }   

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getEstoque() {
        return estoque;
    }

    public void setEstoque(boolean estoque) {
        this.estoque = estoque;
    }   
    

    public Colaborador getId_colaborador() {
        return getId_colaborador();
    }

    public void setId_colaborador(Colaborador id_colaborador) {
    }
 }

    





