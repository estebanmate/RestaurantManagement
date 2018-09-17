/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.DishDirectory;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author hotha
 */
public class dishDirectoryDAO {
     public static java.util.List<DishDirectory> getDishDirectoryList(){
        java.util.List<DishDirectory> dishDirectoryList = new ArrayList<DishDirectory>();
        dishDirectoryList = null;
        Session session = HibernateUtil.getSessionFactory().openSession(); 
         try{
             String queryString = "from DishDirectory";
             Query query = session.createQuery(queryString);
             dishDirectoryList = query.list();
         }catch (HibernateException ex){
             System.err.println(ex);
         }finally{
             session.close();
         }
         return dishDirectoryList;
    }
}
