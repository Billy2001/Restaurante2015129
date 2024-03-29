/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BillyGarcia.sessionsbeans;

import com.BillyGarcia.entities.Platillos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author billy
 */
@Local
public interface PlatillosFacadeLocal {

    void create(Platillos platillos);

    void edit(Platillos platillos);

    void remove(Platillos platillos);

    Platillos find(Object id);

    List<Platillos> findAll();

    List<Platillos> findRange(int[] range);

    int count();
    
}
