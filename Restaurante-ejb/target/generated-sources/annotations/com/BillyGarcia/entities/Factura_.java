package com.BillyGarcia.entities;

import com.BillyGarcia.entities.Cliente;
import com.BillyGarcia.entities.Detallefactura;
import com.BillyGarcia.entities.Mesa;
import com.BillyGarcia.entities.Mesero;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T08:24:17")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Mesa> idmesa;
    public static volatile SingularAttribute<Factura, Double> totalapagar;
    public static volatile ListAttribute<Factura, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Factura, Cliente> idcliente;
    public static volatile SingularAttribute<Factura, Mesero> idmesero;
    public static volatile SingularAttribute<Factura, Integer> idfactura;

}