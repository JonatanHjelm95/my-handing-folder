/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jonab
 */
public class MakeTestData {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(new BankCustomer("Lars", "Larsen", "111111111", 10000, 8, "info"));
            em.persist(new BankCustomer("Ib", "Ibsen", "22222222", 1500, 4, "info"));
            em.persist(new BankCustomer("Donald", "Trump", "123456789", 10000000, 9, "info"));
            em.persist(new BankCustomer("Vladimir", "Putin", "345346367", 800000, 6, "info"));
            em.persist(new BankCustomer("Angela", "Merkel", "88418841", 700000, 3, "info"));
            em.getTransaction().commit();

        } finally {
            em.close();
        }
    }
}
