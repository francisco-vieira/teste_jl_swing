/*
 */
package com.jl.testejl.conn;

import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author francisco
 */
public class PersistenceUP {

    private static EntityManagerFactory fact;

    public static EntityManager createEntityManager() {
        if (Objects.isNull(fact)) {
            fact = Persistence.createEntityManagerFactory("persistenceUP");
        }
        return fact.createEntityManager();
    }

}
