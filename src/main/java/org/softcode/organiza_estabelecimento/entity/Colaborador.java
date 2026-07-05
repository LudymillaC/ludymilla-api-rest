package org.softcode.organiza_estabelecimento.entity;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_colaborador")
public class Colaborador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Matricula")
    private String matricula;
    @Column (name = "Nome")
    private String nome;
    @Column (name = "Cargo")
    private String cargo;
    @Column (name = "Estabelecimento")
    private String estabelecimento;
    @Column (name = "Data")
    private String data;
    @Column (name = "Departamento")
    private String departamento;
    @Column (name = "Tipo_Contrato")
    private String tipoContrato;
    @Column (name = "Estado")
    private String estado;
    @Column (name = "Data_admissao")
    private String data_admissao;
    @Column (name = "Periodo")
    private String periodo;
    @Column (name = "Servico")
    private String servico;
    
    public Colaborador(int id, String nome, String cargo, String matricula, String estabelecimento, String data, String departamento, String tipoContrato, String estado, String data_admissao, String periodo, String servico) {
    this.id = id;
    this.nome = nome;
    this.cargo = cargo;
    this.matricula = matricula;
    this.estabelecimento = estabelecimento;
    this.data = data;
    this.departamento = departamento;
    this.tipoContrato = tipoContrato;
    this.estado = estado;
    this.data_admissao = data_admissao;
    this.periodo = periodo;
    this.servico = servico;
    }

    public Colaborador() {
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

    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

}
