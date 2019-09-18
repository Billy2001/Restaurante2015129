/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BillyGarcia.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author billy
 */
@Entity
@Table(name = "detallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefactura.findAll", query = "SELECT d FROM Detallefactura d")
    , @NamedQuery(name = "Detallefactura.findByIddetalleFactura", query = "SELECT d FROM Detallefactura d WHERE d.iddetalleFactura = :iddetalleFactura")
    , @NamedQuery(name = "Detallefactura.findByIdmenu", query = "SELECT d FROM Detallefactura d WHERE d.idmenu = :idmenu")})
public class Detallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalleFactura")
    private Integer iddetalleFactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmenu")
    private int idmenu;
    @JoinColumn(name = "idcocinero", referencedColumnName = "idcocinero")
    @ManyToOne(optional = false)
    private Cocinero idcocinero;
    @JoinColumn(name = "idfactura", referencedColumnName = "idfactura")
    @ManyToOne(optional = false)
    private Factura idfactura;
    @JoinColumn(name = "idplatillos", referencedColumnName = "idplatillos")
    @ManyToOne(optional = false)
    private Platillos idplatillos;

    public Detallefactura() {
    }

    public Detallefactura(Integer iddetalleFactura) {
        this.iddetalleFactura = iddetalleFactura;
    }

    public Detallefactura(Integer iddetalleFactura, int idmenu) {
        this.iddetalleFactura = iddetalleFactura;
        this.idmenu = idmenu;
    }

    public Integer getIddetalleFactura() {
        return iddetalleFactura;
    }

    public void setIddetalleFactura(Integer iddetalleFactura) {
        this.iddetalleFactura = iddetalleFactura;
    }

    public int getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(int idmenu) {
        this.idmenu = idmenu;
    }

    public Cocinero getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Cocinero idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Factura getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Factura idfactura) {
        this.idfactura = idfactura;
    }

    public Platillos getIdplatillos() {
        return idplatillos;
    }

    public void setIdplatillos(Platillos idplatillos) {
        this.idplatillos = idplatillos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalleFactura != null ? iddetalleFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.iddetalleFactura == null && other.iddetalleFactura != null) || (this.iddetalleFactura != null && !this.iddetalleFactura.equals(other.iddetalleFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.BillyGarcia.entities.Detallefactura[ iddetalleFactura=" + iddetalleFactura + " ]";
    }
    
}
