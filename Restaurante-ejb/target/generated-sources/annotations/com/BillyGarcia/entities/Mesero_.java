package com.BillyGarcia.entities;

import com.BillyGarcia.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T08:24:17")
@StaticMetamodel(Mesero.class)
public class Mesero_ { 

    public static volatile SingularAttribute<Mesero, String> apellido;
    public static volatile ListAttribute<Mesero, Factura> facturaList;
    public static volatile SingularAttribute<Mesero, Integer> idmesero;
    public static volatile SingularAttribute<Mesero, String> nombre;

}