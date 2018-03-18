package com.epul.dao;

import javax.persistence.*;

public abstract class EntityService {

    protected EntityManager entityManager;
    protected EntityManagerFactory entityManagerFactory;

    public EntityTransaction startTransaction() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("oeuvresUnit");
        entityManager = entityManagerFactory.createEntityManager();

        return entityManager.getTransaction();
    }
}
