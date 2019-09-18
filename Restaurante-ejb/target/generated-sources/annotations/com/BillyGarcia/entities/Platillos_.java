package com.BillyGarcia.entities;

import com.BillyGarcia.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T08:24:17")
@StaticMetamodel(Platillos.class)
public class Platillos_ { 

    public static volatile SingularAttribute<Platillos, String> descripcion;
    public static volatile SingularAttribute<Platillos, Double> precio;
    public static volatile SingularAttribute<Platillos, Integer> idplatillos;
    public static volatile ListAttribute<Platillos, Detallefactura> detallefacturaList;

}