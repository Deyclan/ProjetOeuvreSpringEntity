package com.epul.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class EntityService {

    protected EntityManager entityManager;
    protected EntityManagerFactory entityManagerFactory;

    public EntityTransaction startTransaction() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("oeuvresUnit");
        entityManager = entityManagerFactory.createEntityManager();

        return entityManager.getTransaction();
    }
}
