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
@Table(name = "asp_ocupacion", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspOcupacion.findAll", query = "SELECT a FROM AspOcupacion a"),
    @NamedQuery(name = "AspOcupacion.findByDescOcupacion", query = "SELECT a FROM AspOcupacion a WHERE a.descOcupacion = :descOcupacion"),
    @NamedQuery(name = "AspOcupacion.findByOcuId", query = "SELECT a FROM AspOcupacion a WHERE a.ocuId = :ocuId")})
public class AspOcupacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_ocupacion", length = 2147483647)
    private String descOcupacion;
    @Id
    @Basic(optional = false)
    @Column(name = "ocu_id", nullable = false)
    private Integer ocuId;

    public AspOcupacion() {
    }

    public AspOcupacion(Integer ocuId) {
        this.ocuId = ocuId;
    }

    public String getDescOcupacion() {
        return descOcupacion;
    }

    public void setDescOcupacion(String descOcupacion) {
        this.descOcupacion = descOcupacion;
    }

    public Integer getOcuId() {
        return ocuId;
    }

    public void setOcuId(Integer ocuId) {
        this.ocuId = ocuId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocuId != null ? ocuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspOcupacion)) {
            return false;
        }
        AspOcupacion other = (AspOcupacion) object;
        if ((this.ocuId == null && other.ocuId != null) || (this.ocuId != null && !this.ocuId.equals(other.ocuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspOcupacion[ ocuId=" + ocuId + " ]";
    }
    
}
