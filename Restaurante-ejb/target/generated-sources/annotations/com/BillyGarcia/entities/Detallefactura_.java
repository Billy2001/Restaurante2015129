package com.BillyGarcia.entities;

import com.BillyGarcia.entities.Cocinero;
import com.BillyGarcia.entities.Factura;
import com.BillyGarcia.entities.Platillos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T08:24:17")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Integer> iddetalleFactura;
    public static volatile SingularAttribute<Detallefactura, Platillos> idplatillos;
    public static volatile SingularAttribute<Detallefactura, Integer> idmenu;
    public static volatile SingularAttribute<Detallefactura, Cocinero> idcocinero;
    public static volatile SingularAttribute<Detallefactura, Factura> idfactura;

}