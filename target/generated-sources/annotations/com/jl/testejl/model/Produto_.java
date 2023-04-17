package com.jl.testejl.model;

import com.jl.testejl.model.MovimentoEstoque;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-16T21:32:34")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, BigDecimal> preco;
    public static volatile SingularAttribute<Produto, Integer> quantidadeMinima;
    public static volatile SingularAttribute<Produto, Integer> id;
    public static volatile SingularAttribute<Produto, MovimentoEstoque> movimento;
    public static volatile SingularAttribute<Produto, Date> dataCadastro;
    public static volatile SingularAttribute<Produto, String> descricao;

}