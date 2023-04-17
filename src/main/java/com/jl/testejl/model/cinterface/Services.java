/*
 */
package com.jl.testejl.model.cinterface;

import java.util.List;

/**
 *
 * @author francisco
 * @param <T>
 */
public interface Services<T extends EntityModel> {

    T findById(Long id);

    List<T> findAll();

    T salvar(T t);

    boolean delete(T t);

}
