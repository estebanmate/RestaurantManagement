/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Menu;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author emtp
 */
public class menuDAO {
     public static java.util.List<Menu> getMenuList(){
        java.util.List<Menu> menuList = new ArrayList<Menu>();
        menuList = null;
        Session session = HibernateUtil.getSessionFactory().openSession(); 
         try{
             String queryString = "from Menu where delFlag = 0";
             Query query = session.createQuery(queryString);
             menuList = query.list();
         }catch (HibernateException ex){
             System.err.println(ex);
         }finally{
             session.close();
         }
         return menuList;
    }
     
     public static boolean createMenu(Menu menu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean kq = true;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(menu);
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
     
     public static Menu getMenuInfo(int menuId) {
        Menu menu = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            menu = (Menu) session.get(Menu.class, menuId);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return menu;
    }
     
      public static boolean deleteMenu(Menu menu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (dishDAO.getDishInfo(menu.getId()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(menu);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
      
    
}
