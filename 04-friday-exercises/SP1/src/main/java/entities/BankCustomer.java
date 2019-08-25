package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BankCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;

    private String lastName;
    private String accountNumber;
    private double balance;
    //Internals
    private int customerRanking;
    private String interalInfo;

    public BankCustomer(String firstName, String lastName, String accountNumber, double balance, int customerRanking, String interalInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerRanking = customerRanking;
        this.interalInfo = interalInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerRanking() {
        return customerRanking;
    }

    public void setCustomerRanking(int customerRanking) {
        this.customerRanking = customerRanking;
    }

    public String getInteralInfo() {
        return interalInfo;
    }

    public void setInteralInfo(String interalInfo) {
        this.interalInfo = interalInfo;
    }
    

    public BankCustomer() {
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "BankCustomer{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber + ", balance=" + balance + '}';
    }
    
}
