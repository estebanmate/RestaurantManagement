/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Customer;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HaHai
 */
public class customerDAO {
    public static java.util.List<Customer> getCustomerList() {
        java.util.List<Customer> customerList = new ArrayList<Customer>();
        customerList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String queryString = "from Customer";
            Query query = session.createQuery(queryString);
            customerList = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return customerList;
    }
    
  
     
   

  

    public static boolean createCustomer(Customer customer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean kq = true;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
            kq = false;
        } finally {
            session.close();
        }
        return kq;
    }

   
}
