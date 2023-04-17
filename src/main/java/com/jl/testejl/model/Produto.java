/*
 */
package com.jl.testejl.model;

import com.jl.testejl.model.cinterface.EntityModel;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author francisco
 */
@Entity
@Table(name="tbl_produto")
public class Produto implements EntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
    @SequenceGenerator(name = "produto_seq", sequenceName = "produto_seq")
    private Long id;
    private String descricao;
    private Integer quantidadeMinima;
    @OneToOne(mappedBy="produto")
    private MovimentoEstoque movimento;
    private BigDecimal preco;
    
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;

    public Produto() {
    }

    public Produto(Long id) {
        this.id = id;
    }

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public Produto(Long id, String descricao, Integer quantidadeMinima, BigDecimal preco, Date dataCadastro) {
        this.id = id;
        this.descricao = descricao;
        this.quantidadeMinima = quantidadeMinima;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
    }
    
        

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(Integer quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

        
    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public MovimentoEstoque getMovimento() {
        return movimento;
    }

    public void setMovimento(MovimentoEstoque movimento) {
        this.movimento = movimento;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Produto other = (Produto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", quantidadeMinima=" + quantidadeMinima + ", preco=" + preco + ", dataCadastro=" + dataCadastro + '}';
    }
    
    
    

}
