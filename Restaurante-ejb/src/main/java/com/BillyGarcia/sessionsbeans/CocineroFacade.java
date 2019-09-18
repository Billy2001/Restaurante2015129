/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BillyGarcia.sessionsbeans;

import com.BillyGarcia.entities.Cocinero;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author billy
 */
@Stateless
public class CocineroFacade extends AbstractFacade<Cocinero> implements CocineroFacadeLocal {

    @PersistenceContext(unitName = "com.BillyGarcia_Restaurante-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CocineroFacade() {
        super(Cocinero.class);
    }
    
}
