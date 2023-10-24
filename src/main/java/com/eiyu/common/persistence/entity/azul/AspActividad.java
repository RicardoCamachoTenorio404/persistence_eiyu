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
@Table(name = "asp_actividad", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspActividad.findAll", query = "SELECT a FROM AspActividad a"),
    @NamedQuery(name = "AspActividad.findByDescActividad", query = "SELECT a FROM AspActividad a WHERE a.descActividad = :descActividad"),
    @NamedQuery(name = "AspActividad.findByActId", query = "SELECT a FROM AspActividad a WHERE a.actId = :actId")})
public class AspActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_actividad", length = 2147483647)
    private String descActividad;
    @Id
    @Basic(optional = false)
    @Column(name = "act_id", nullable = false)
    private Integer actId;

    public AspActividad() {
    }

    public AspActividad(Integer actId) {
        this.actId = actId;
    }

    public String getDescActividad() {
        return descActividad;
    }

    public void setDescActividad(String descActividad) {
        this.descActividad = descActividad;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actId != null ? actId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspActividad)) {
            return false;
        }
        AspActividad other = (AspActividad) object;
        if ((this.actId == null && other.actId != null) || (this.actId != null && !this.actId.equals(other.actId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspActividad[ actId=" + actId + " ]";
    }
    
}
