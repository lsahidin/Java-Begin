/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author luqman.sahidin
 */
@Named(value = "dataController")
@RequestScoped
public class DataController {

    /**
     * Creates a new instance of DataController
     */
    public DataController() {
    }
    
    public String sendData(){
        return "prosesData";
    }
    
}
