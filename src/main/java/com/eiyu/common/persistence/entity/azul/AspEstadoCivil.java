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
@Table(name = "asp_estado_civil", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspEstadoCivil.findAll", query = "SELECT a FROM AspEstadoCivil a"),
    @NamedQuery(name = "AspEstadoCivil.findByDescEstadoCivil", query = "SELECT a FROM AspEstadoCivil a WHERE a.descEstadoCivil = :descEstadoCivil"),
    @NamedQuery(name = "AspEstadoCivil.findByCivId", query = "SELECT a FROM AspEstadoCivil a WHERE a.civId = :civId"),
    @NamedQuery(name = "AspEstadoCivil.findByPatmir", query = "SELECT a FROM AspEstadoCivil a WHERE a.patmir = :patmir")})
public class AspEstadoCivil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_estado_civil", length = 2147483647)
    private String descEstadoCivil;
    @Id
    @Basic(optional = false)
    @Column(name = "civ_id", nullable = false, length = 2147483647)
    private String civId;
    @Column(name = "patmir", length = 2147483647)
    private String patmir;

    public AspEstadoCivil() {
    }

    public AspEstadoCivil(String civId) {
        this.civId = civId;
    }

    public String getDescEstadoCivil() {
        return descEstadoCivil;
    }

    public void setDescEstadoCivil(String descEstadoCivil) {
        this.descEstadoCivil = descEstadoCivil;
    }

    public String getCivId() {
        return civId;
    }

    public void setCivId(String civId) {
        this.civId = civId;
    }

    public String getPatmir() {
        return patmir;
    }

    public void setPatmir(String patmir) {
        this.patmir = patmir;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (civId != null ? civId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspEstadoCivil)) {
            return false;
        }
        AspEstadoCivil other = (AspEstadoCivil) object;
        if ((this.civId == null && other.civId != null) || (this.civId != null && !this.civId.equals(other.civId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspEstadoCivil[ civId=" + civId + " ]";
    }
    
}
