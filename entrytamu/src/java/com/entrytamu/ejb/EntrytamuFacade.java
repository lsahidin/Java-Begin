/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entrytamu.ejb;

import com.entrytamu.entities.Entrytamu;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author luqman.sahidin
 */
@Stateless
public class EntrytamuFacade extends AbstractFacade<Entrytamu> {

    @PersistenceContext(unitName = "entrytamuPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntrytamuFacade() {
        super(Entrytamu.class);
    }
    
}
