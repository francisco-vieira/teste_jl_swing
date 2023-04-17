/*
 */
package com.jl.testejl.model;

import com.jl.testejl.enums.TipoMovimento;
import com.jl.testejl.model.cinterface.EntityModel;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author francisco
 */
@Entity
@Table(name = "tbl_movimento")
public class MovimentoEstoque implements EntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movimento_estoque_seq")
    @SequenceGenerator(name = "movimento_estoque_seq", sequenceName = "movimento_estoque_seq")
    private Long id;

    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    private Integer quantidade;
    private LocalDate dataMovimento;
    private String tipoMovimento;
    private String observacao;

    public MovimentoEstoque() {
    }

    public MovimentoEstoque(Long movimentoId, Integer quantidade, LocalDate dataMovimento, String observacao, Object obj) {
        this.id = movimentoId;
        this.quantidade = quantidade;
        this.dataMovimento = dataMovimento;
        this.observacao = observacao;
        this.tipoMovimento = TipoMovimento.valueOfDefault(obj).getValue();

    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(LocalDate dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(Object obj) {
        this.tipoMovimento = TipoMovimento.valueOfDefault(obj).getValue();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MovimentoEstoque other = (MovimentoEstoque) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "MovimentoEstoque{" + "movimentoId=" + id + ", produto=" + produto + ", quantidade=" + quantidade + ", dataMovimento=" + dataMovimento + ", tipoMovimento=" + tipoMovimento + '}';
    }

}
