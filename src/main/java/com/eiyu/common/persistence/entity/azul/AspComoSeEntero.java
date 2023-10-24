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
@Table(name = "asp_como_se_entero", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspComoSeEntero.findAll", query = "SELECT a FROM AspComoSeEntero a"),
    @NamedQuery(name = "AspComoSeEntero.findByComoseentero", query = "SELECT a FROM AspComoSeEntero a WHERE a.comoseentero = :comoseentero"),
    @NamedQuery(name = "AspComoSeEntero.findById", query = "SELECT a FROM AspComoSeEntero a WHERE a.id = :id"),
    @NamedQuery(name = "AspComoSeEntero.findByIdEstatus", query = "SELECT a FROM AspComoSeEntero a WHERE a.idEstatus = :idEstatus")})
public class AspComoSeEntero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "comoseentero", length = 2147483647)
    private String comoseentero;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "id_estatus")
    private Integer idEstatus;

    public AspComoSeEntero() {
    }

    public AspComoSeEntero(Integer id) {
        this.id = id;
    }

    public String getComoseentero() {
        return comoseentero;
    }

    public void setComoseentero(String comoseentero) {
        this.comoseentero = comoseentero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
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
        if (!(object instanceof AspComoSeEntero)) {
            return false;
        }
        AspComoSeEntero other = (AspComoSeEntero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspComoSeEntero[ id=" + id + " ]";
    }
    
}
