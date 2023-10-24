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
@Table(name = "asp_giro", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspGiro.findAll", query = "SELECT a FROM AspGiro a"),
    @NamedQuery(name = "AspGiro.findByDescActividad", query = "SELECT a FROM AspGiro a WHERE a.descActividad = :descActividad"),
    @NamedQuery(name = "AspGiro.findByGirId", query = "SELECT a FROM AspGiro a WHERE a.girId = :girId"),
    @NamedQuery(name = "AspGiro.findByDescGiro", query = "SELECT a FROM AspGiro a WHERE a.descGiro = :descGiro"),
    @NamedQuery(name = "AspGiro.findByActId", query = "SELECT a FROM AspGiro a WHERE a.actId = :actId"),
    @NamedQuery(name = "AspGiro.findByClaveCnbv", query = "SELECT a FROM AspGiro a WHERE a.claveCnbv = :claveCnbv"),
    @NamedQuery(name = "AspGiro.findByClaveFnd", query = "SELECT a FROM AspGiro a WHERE a.claveFnd = :claveFnd")})
public class AspGiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_actividad", length = 2147483647)
    private String descActividad;
    @Id
    @Basic(optional = false)
    @Column(name = "gir_id", nullable = false)
    private Integer girId;
    @Column(name = "desc_giro", length = 2147483647)
    private String descGiro;
    @Column(name = "act_id")
    private Integer actId;
    @Column(name = "clave_cnbv", length = 2147483647)
    private String claveCnbv;
    @Column(name = "clave_fnd", length = 2147483647)
    private String claveFnd;

    public AspGiro() {
    }

    public AspGiro(Integer girId) {
        this.girId = girId;
    }

    public String getDescActividad() {
        return descActividad;
    }

    public void setDescActividad(String descActividad) {
        this.descActividad = descActividad;
    }

    public Integer getGirId() {
        return girId;
    }

    public void setGirId(Integer girId) {
        this.girId = girId;
    }

    public String getDescGiro() {
        return descGiro;
    }

    public void setDescGiro(String descGiro) {
        this.descGiro = descGiro;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getClaveCnbv() {
        return claveCnbv;
    }

    public void setClaveCnbv(String claveCnbv) {
        this.claveCnbv = claveCnbv;
    }

    public String getClaveFnd() {
        return claveFnd;
    }

    public void setClaveFnd(String claveFnd) {
        this.claveFnd = claveFnd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (girId != null ? girId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspGiro)) {
            return false;
        }
        AspGiro other = (AspGiro) object;
        if ((this.girId == null && other.girId != null) || (this.girId != null && !this.girId.equals(other.girId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspGiro[ girId=" + girId + " ]";
    }
    
}
