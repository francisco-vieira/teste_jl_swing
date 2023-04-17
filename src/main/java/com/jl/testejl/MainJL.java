/*
 */
package com.jl.testejl;

import com.jl.testejl.model.Produto;
import com.jl.testejl.model.cinterface.Services;
import com.jl.testejl.service.ProdutoService;
import com.jl.testejl.telas.MainFrame;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author francisco
 */
public class MainJL {

    public static void main(String[] args) {
        Services service = new ProdutoService();
        Produto produto = new Produto(null, "produto 1", 10, new BigDecimal("15.95"), new Date());
        service.salvar(produto);
        produto = new Produto(null, "produto 2", 15, new BigDecimal("13.95"), new Date());
        service.salvar(produto);
        produto = new Produto(null, "produto 3", 20, new BigDecimal("12.95"), new Date());
        service.salvar(produto);
        MainFrame.main(args);

    }
}
