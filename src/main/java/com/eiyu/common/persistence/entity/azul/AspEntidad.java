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
@Table(name = "asp_entidad", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspEntidad.findAll", query = "SELECT a FROM AspEntidad a"),
    @NamedQuery(name = "AspEntidad.findByDescEntidad", query = "SELECT a FROM AspEntidad a WHERE a.descEntidad = :descEntidad"),
    @NamedQuery(name = "AspEntidad.findByEntidadId", query = "SELECT a FROM AspEntidad a WHERE a.entidadId = :entidadId")})
public class AspEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_entidad", length = 2147483647)
    private String descEntidad;
    @Id
    @Basic(optional = false)
    @Column(name = "entidad_id", nullable = false)
    private Integer entidadId;

    public AspEntidad() {
    }

    public AspEntidad(Integer entidadId) {
        this.entidadId = entidadId;
    }

    public String getDescEntidad() {
        return descEntidad;
    }

    public void setDescEntidad(String descEntidad) {
        this.descEntidad = descEntidad;
    }

    public Integer getEntidadId() {
        return entidadId;
    }

    public void setEntidadId(Integer entidadId) {
        this.entidadId = entidadId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entidadId != null ? entidadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspEntidad)) {
            return false;
        }
        AspEntidad other = (AspEntidad) object;
        if ((this.entidadId == null && other.entidadId != null) || (this.entidadId != null && !this.entidadId.equals(other.entidadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspEntidad[ entidadId=" + entidadId + " ]";
    }
    
}
