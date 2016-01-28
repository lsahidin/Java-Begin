/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdata.Utils;

import inputdata.Entities.Identitas;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luqman.sahidin
 */
public class dataHelper {
    
    Session session = null;
    
    public dataHelper(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getUserData(){
        List<Identitas> identitas = null;
        try{
            Transaction tx = session.beginTransaction();
            Query sql = session.createQuery("from Identitas");
            identitas = (List<Identitas>) sql.list();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return identitas;
    }
    
   public int setInsertData(int id, String first, String last){
       // Get the session from session factory
       session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer status = null;
        try{
           //begin the transaction
           tx = session.beginTransaction();
           //Create a new book object
           Identitas identitas = new Identitas(id, first , last);
           // save the book object.The changes to persistent object will be written to database.
           status = (Integer) session.save(identitas);
          //The changes to persistent object will be written to database.
           tx.commit();
        }catch (HibernateException e) {
           if (tx!=null) tx.rollback();
           e.printStackTrace();
        }finally {
            //close the session.
           session.close();
        }
        return status;
     }
}
