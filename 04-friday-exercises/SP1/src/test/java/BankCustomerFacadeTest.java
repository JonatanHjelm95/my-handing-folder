/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.BankCustomer;
import facades.BankCustomerFacade;
import java.util.List;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonab
 */
public class BankCustomerFacadeTest {

    public BankCustomerFacadeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
//
//    @Test
//    public void testGetCustomerByID() {
//        BankCustomerFacade bfcTest = BankCustomerFacade.getBankCustomerFacade(Persistence.createEntityManagerFactory("pu"));
//        assertEquals("Unit Test", bfcTest.getCustomerByID(6).getFullName());
//    }
//    @Test
//    public void testGetCustomerByName() {
//        BankCustomerFacade bfcTest = BankCustomerFacade.getBankCustomerFacade(Persistence.createEntityManagerFactory("pu"));
//        assertEquals("Unit Test", bfcTest.getCustomerByName("Unit").get(0).getFullName());
//    }
//    @Test
//    public void testAddCustomer() {
//        BankCustomerFacade bfcTest = BankCustomerFacade.getBankCustomerFacade(Persistence.createEntityManagerFactory("pu"));
//        BankCustomer bc = new BankCustomer("Customer", "Test", "0", 0, 0, "JUnitTest");
//        assertEquals(bc.getAccountNumber(), bfcTest.addCustomer(bc).getAccountNumber());
//    }
//    
//    @Test
//    public void testGetAllCustomers() {
//        BankCustomerFacade bfcTest = BankCustomerFacade.getBankCustomerFacade(Persistence.createEntityManagerFactory("pu"));
//        List<BankCustomer> list = bfcTest.getAllBankCustomers();
//        assertEquals(bfcTest.getCustomerByID(1).getAccountNumber(), bfcTest.getAllBankCustomers().get(0).getAccountNumber());
//    }

}

// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
//     @Test
//     public void hello() {}
