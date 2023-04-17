package com.jl.testejl.model;

import com.jl.testejl.model.Produto;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-16T21:32:34")
@StaticMetamodel(MovimentoEstoque.class)
public class MovimentoEstoque_ { 

    public static volatile SingularAttribute<MovimentoEstoque, String> observacao;
    public static volatile SingularAttribute<MovimentoEstoque, Produto> produto;
    public static volatile SingularAttribute<MovimentoEstoque, LocalDate> dataMovimento;
    public static volatile SingularAttribute<MovimentoEstoque, Integer> id;
    public static volatile SingularAttribute<MovimentoEstoque, Integer> quantidade;
    public static volatile SingularAttribute<MovimentoEstoque, String> tipoMovimento;

}