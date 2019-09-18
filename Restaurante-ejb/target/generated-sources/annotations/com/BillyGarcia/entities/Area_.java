package com.BillyGarcia.entities;

import com.BillyGarcia.entities.Mesa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T08:24:17")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, String> descripcion;
    public static volatile SingularAttribute<Area, Integer> idarea;
    public static volatile ListAttribute<Area, Mesa> mesaList;

}