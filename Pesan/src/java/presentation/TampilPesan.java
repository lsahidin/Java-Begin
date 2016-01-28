/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import boundary.PesanFacade;
import entities.Pesan;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author luqman.sahidin
 */
@Named(value = "tampilPesan")
@RequestScoped
public class TampilPesan {

    @EJB
    private PesanFacade pesanFacade;
    private final Pesan pesan;
    /**
     * Creates a new instance of TampilPesan
     */
    
    public TampilPesan() {
        this.pesan = new Pesan();
    }
    
    public Pesan getPesan(){
        return pesan;
    }
    
    public int jumlahPesan(){
        return pesanFacade.findAll().size();
    }
    
    public String postPesan(){
        this.pesanFacade.create(pesan);
        return "selesai";
    }
    
}
