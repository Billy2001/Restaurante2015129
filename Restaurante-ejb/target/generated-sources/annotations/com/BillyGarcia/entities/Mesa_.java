package com.BillyGarcia.entities;

import com.BillyGarcia.entities.Area;
import com.BillyGarcia.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T08:24:17")
@StaticMetamodel(Mesa.class)
public class Mesa_ { 

    public static volatile SingularAttribute<Mesa, Integer> idmesa;
    public static volatile SingularAttribute<Mesa, Double> nomesa;
    public static volatile SingularAttribute<Mesa, Area> idarea;
    public static volatile ListAttribute<Mesa, Factura> facturaList;

}