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
@Table(name = "asp_domicilio", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspDomicilio.findAll", query = "SELECT a FROM AspDomicilio a"),
    @NamedQuery(name = "AspDomicilio.findByAbreviacion", query = "SELECT a FROM AspDomicilio a WHERE a.abreviacion = :abreviacion"),
    @NamedQuery(name = "AspDomicilio.findByDescDomicilio", query = "SELECT a FROM AspDomicilio a WHERE a.descDomicilio = :descDomicilio"),
    @NamedQuery(name = "AspDomicilio.findByDomId", query = "SELECT a FROM AspDomicilio a WHERE a.domId = :domId")})
public class AspDomicilio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "abreviacion", length = 2147483647)
    private String abreviacion;
    @Column(name = "desc_domicilio", length = 2147483647)
    private String descDomicilio;
    @Id
    @Basic(optional = false)
    @Column(name = "dom_id", nullable = false)
    private Integer domId;

    public AspDomicilio() {
    }

    public AspDomicilio(Integer domId) {
        this.domId = domId;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public String getDescDomicilio() {
        return descDomicilio;
    }

    public void setDescDomicilio(String descDomicilio) {
        this.descDomicilio = descDomicilio;
    }

    public Integer getDomId() {
        return domId;
    }

    public void setDomId(Integer domId) {
        this.domId = domId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (domId != null ? domId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspDomicilio)) {
            return false;
        }
        AspDomicilio other = (AspDomicilio) object;
        if ((this.domId == null && other.domId != null) || (this.domId != null && !this.domId.equals(other.domId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspDomicilio[ domId=" + domId + " ]";
    }
    
}
