/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BillyGarcia.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author billy
 */
@Entity
@Table(name = "mesero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesero.findAll", query = "SELECT m FROM Mesero m")
    , @NamedQuery(name = "Mesero.findByIdmesero", query = "SELECT m FROM Mesero m WHERE m.idmesero = :idmesero")
    , @NamedQuery(name = "Mesero.findByNombre", query = "SELECT m FROM Mesero m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Mesero.findByApellido", query = "SELECT m FROM Mesero m WHERE m.apellido = :apellido")})
public class Mesero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmesero")
    private Integer idmesero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido")
    private String apellido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmesero")
    private List<Factura> facturaList;

    public Mesero() {
    }

    public Mesero(Integer idmesero) {
        this.idmesero = idmesero;
    }

    public Mesero(Integer idmesero, String nombre, String apellido) {
        this.idmesero = idmesero;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getIdmesero() {
        return idmesero;
    }

    public void setIdmesero(Integer idmesero) {
        this.idmesero = idmesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @XmlTransient
    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesero != null ? idmesero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesero)) {
            return false;
        }
        Mesero other = (Mesero) object;
        if ((this.idmesero == null && other.idmesero != null) || (this.idmesero != null && !this.idmesero.equals(other.idmesero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.BillyGarcia.entities.Mesero[ idmesero=" + idmesero + " ]";
    }
    
}
