/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import Utilities.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author luqman.sahidin
 */
public class helper {
    
    Session session = null;

    public helper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getAllData(){
        List<Identitas> dataList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Identitas");
            dataList = (List<Identitas>) q.list();
        } catch (Exception e){
            e.printStackTrace();
        }
        return dataList;
    }
}
