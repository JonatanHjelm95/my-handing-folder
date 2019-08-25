package facades;

import dto.CustomerDTO;
import entities.BankCustomer;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class BankCustomerFacade {

    private static BankCustomerFacade instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private BankCustomerFacade() {
    }

    /**
     *
     * @param _emf
     * @return an instance of this facade class.
     */
    public static BankCustomerFacade getBankCustomerFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new BankCustomerFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public CustomerDTO getCustomerByID(int id) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<BankCustomer> query = em.createQuery("Select b from BankCustomer b WHERE b.id = :id", BankCustomer.class).setParameter("id", id);
            BankCustomer bc = query.getResultList().get(0);
            return new CustomerDTO(bc);
        } finally {
            em.close();
        }

    }

    public List<CustomerDTO> getCustomerByName(String name) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<BankCustomer> query = em.createQuery("Select bc from BankCustomer bc WHERE bc.firstName = :firstName", BankCustomer.class).setParameter("firstName", name);
            List<CustomerDTO> customers = new ArrayList();
            for (int i = 0; i < query.getResultList().size(); i++) {
                customers.add(new CustomerDTO(query.getResultList().get(i)));
            }
            return customers;
        } finally {
            em.close();
        }
    }

    //internals
    public BankCustomer addCustomer(BankCustomer bc) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(new BankCustomer(bc.getFirstName(), bc.getLastName(), bc.getAccountNumber(), bc.getBalance(), bc.getCustomerRanking(), bc.getInteralInfo()));
            em.getTransaction().commit();
            return bc;
        } finally {
            em.close();
        }
    }

    public List<BankCustomer> getAllBankCustomers() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<BankCustomer> query = em.createQuery("Select bc from BankCustomer bc", BankCustomer.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
    public static void main(String[] args) {
        BankCustomerFacade bcf = getBankCustomerFacade(Persistence.createEntityManagerFactory("pu"));
        BankCustomer customer = new BankCustomer("Unit", "Test", "123", 0, 0, "JUnitTest");
        bcf.addCustomer(customer);
        System.out.println(bcf.getCustomerByName("Unit").toString());
        
    }

}
