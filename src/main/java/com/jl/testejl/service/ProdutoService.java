/*
 */
package com.jl.testejl.service;

import com.jl.testejl.conn.PersistenceUP;
import com.jl.testejl.model.Produto;
import com.jl.testejl.model.cinterface.Services;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;

/**
 *
 * @author francisco
 */
public class ProdutoService implements Services<Produto> {

    private final EntityManager manager;

    public ProdutoService() {
        this.manager = PersistenceUP.createEntityManager();
    }

    @Override
    public Produto findById(Long id) {
        return manager.find(Produto.class, id);
    }

    @Override
    public List<Produto> findAll() {

        return this.manager.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
    }

    @Override
    public Produto salvar(Produto t) {
        manager.getTransaction().begin();
        t = manager.merge(t);
        manager.getTransaction().commit();
        return t;

    }

    @Override
    public boolean delete(Produto t) {
        if (Objects.nonNull(t)) {
            Produto p = this.findById(t.getId());
            if (Objects.nonNull(p)) {
                manager.getTransaction().begin();
                this.manager.remove(p);
                manager.getTransaction().commit();
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

}
