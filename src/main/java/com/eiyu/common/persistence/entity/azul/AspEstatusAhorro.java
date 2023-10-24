/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "asp_estatus_ahorro", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspEstatusAhorro.findAll", query = "SELECT a FROM AspEstatusAhorro a"),
    @NamedQuery(name = "AspEstatusAhorro.findByClave", query = "SELECT a FROM AspEstatusAhorro a WHERE a.clave = :clave"),
    @NamedQuery(name = "AspEstatusAhorro.findById", query = "SELECT a FROM AspEstatusAhorro a WHERE a.id = :id"),
    @NamedQuery(name = "AspEstatusAhorro.findByDescripcion", query = "SELECT a FROM AspEstatusAhorro a WHERE a.descripcion = :descripcion")})
public class AspEstatusAhorro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "clave", length = 2147483647)
    private String clave;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "descripcion", length = 2147483647)
    private String descripcion;

    public AspEstatusAhorro() {
    }

    public AspEstatusAhorro(Integer id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspEstatusAhorro)) {
            return false;
        }
        AspEstatusAhorro other = (AspEstatusAhorro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspEstatusAhorro[ id=" + id + " ]";
    }
    
}
