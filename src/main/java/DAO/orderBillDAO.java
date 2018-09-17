/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.OrderBill;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hotha
 */
public class orderBillDAO {
    public static java.util.List<OrderBill> getOrderBillList(){
        java.util.List<OrderBill> branchList = new ArrayList<OrderBill>();
        branchList = null;
        Session session = HibernateUtil.getSessionFactory().openSession(); 
         try{
             String queryString = "from OrderBill";
             Query query = session.createQuery(queryString);
             branchList = query.list();
         }catch (HibernateException ex){
             System.err.println(ex);
         }finally{
             session.close();
         }
         return branchList;
    }
    public static boolean createOrderBill (OrderBill orderbill)
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        boolean kq=true;
        Transaction transaction=null;
        try{
            transaction=session.beginTransaction();
            session.save(orderbill);
            transaction.commit();
            
        }catch (HibernateException ex){
            System.err.println(ex);
        }
        finally {
            session.close();
        }
        return kq;
    }
   
}
