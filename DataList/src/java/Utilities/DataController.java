/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import entities.helper;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author luqman.sahidin
 */
@Named(value = "dataController")
@SessionScoped
public class DataController implements Serializable {

    helper dataHelper;
    DataModel datauser;
    /**
     * Creates a new instance of DataController
     */
    public DataController() {
        dataHelper = new helper();
    }
    
    public DataModel getRetrieveData(){
        if (datauser == null) {
            datauser = new ListDataModel(dataHelper.getAllData());
        }
        return datauser;
    }
    
    public int getJumlahRow(){
        return datauser.getRowCount();
    }
    
}
