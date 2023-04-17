/*
 */
package com.jl.testejl.service;

import com.jl.testejl.conn.PersistenceUP;
import com.jl.testejl.model.MovimentoEstoque;
import com.jl.testejl.model.cinterface.Services;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;

/**
 *
 * @author francisco
 */
public class MovimentoService implements Services<MovimentoEstoque> {

    private final EntityManager manager;

    public MovimentoService() {
        this.manager = PersistenceUP.createEntityManager();
    }

    @Override
    public MovimentoEstoque findById(Long id) {
        return manager.find(MovimentoEstoque.class, id);
    }

    @Override
    public List<MovimentoEstoque> findAll() {

        return this.manager.createQuery("SELECT p FROM MovimentoEstoque p", MovimentoEstoque.class).getResultList();
    }

    @Override
    public MovimentoEstoque salvar(MovimentoEstoque t) {
        manager.getTransaction().begin();
        t = manager.merge(t);
        manager.getTransaction().commit();
        return t;

    }

    @Override
    public boolean delete(MovimentoEstoque t) {
        if (Objects.nonNull(t)) {
            MovimentoEstoque p = this.findById(t.getId());
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
