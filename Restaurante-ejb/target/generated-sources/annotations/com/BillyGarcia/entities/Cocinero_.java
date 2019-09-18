package com.BillyGarcia.entities;

import com.BillyGarcia.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T08:24:17")
@StaticMetamodel(Cocinero.class)
public class Cocinero_ { 

    public static volatile ListAttribute<Cocinero, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Cocinero, String> apellido;
    public static volatile SingularAttribute<Cocinero, Integer> idcocinero;
    public static volatile SingularAttribute<Cocinero, String> nombre;

}