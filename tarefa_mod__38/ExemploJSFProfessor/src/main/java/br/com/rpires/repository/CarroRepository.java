package br.com.rpires.repository;

import javax.persistence.*;
import br.com.rpires.domain.Carro;

public class CarroRepository {
    public void salvar(Carro carro) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}