/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdata.Utils;

import inputdata.Entities.Identitas;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luqman.sahidin
 */
@Named(value = "dataController")
@SessionScoped
public class dataController implements Serializable {

    DataModel dataID;
    dataHelper helper;
    
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    String firstname, lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    /**
     * Creates a new instance of dataController
     */
    public dataController() {
        helper = new dataHelper();
    }
    
    public DataModel getRetrieveDataUser(){
        if (dataID == null){
            dataID = new ListDataModel(helper.getUserData());
        }
        return dataID;
    } 
    
    public String sendLink(){
        String getBack = null;
        if (helper.setInsertData(id, firstname, lastname) != 0){
            getBack = "throw"; // sucess throw to the other to look the result :D
        } else {
            getBack = "index"; // fail! back to the index
        }
        return getBack;
    }
    
}
