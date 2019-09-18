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
@Table(name = "platillos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platillos.findAll", query = "SELECT p FROM Platillos p")
    , @NamedQuery(name = "Platillos.findByIdplatillos", query = "SELECT p FROM Platillos p WHERE p.idplatillos = :idplatillos")
    , @NamedQuery(name = "Platillos.findByDescripcion", query = "SELECT p FROM Platillos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Platillos.findByPrecio", query = "SELECT p FROM Platillos p WHERE p.precio = :precio")})
public class Platillos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idplatillos")
    private Integer idplatillos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idplatillos")
    private List<Detallefactura> detallefacturaList;

    public Platillos() {
    }

    public Platillos(Integer idplatillos) {
        this.idplatillos = idplatillos;
    }

    public Platillos(Integer idplatillos, String descripcion) {
        this.idplatillos = idplatillos;
        this.descripcion = descripcion;
    }

    public Integer getIdplatillos() {
        return idplatillos;
    }

    public void setIdplatillos(Integer idplatillos) {
        this.idplatillos = idplatillos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idplatillos != null ? idplatillos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platillos)) {
            return false;
        }
        Platillos other = (Platillos) object;
        if ((this.idplatillos == null && other.idplatillos != null) || (this.idplatillos != null && !this.idplatillos.equals(other.idplatillos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.BillyGarcia.entities.Platillos[ idplatillos=" + idplatillos + " ]";
    }
    
}
