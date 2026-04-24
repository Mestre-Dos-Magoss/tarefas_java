package br.com.rpires.dao;

import javax.persistence.*;
import br.com.rpires.domain.Carro;

public class CarroDao implements ICarroDao {
    @Override
    public Carro cadastrar(Carro carro) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();
        em.close();
        emf.close();
        return carro;
    }

    @Override
    public void excluir(Carro carro) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        carro = em.merge(carro);
        em.remove(carro);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}