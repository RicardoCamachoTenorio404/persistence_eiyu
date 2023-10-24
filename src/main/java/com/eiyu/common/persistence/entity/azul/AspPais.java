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
@Table(name = "asp_pais", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspPais.findAll", query = "SELECT a FROM AspPais a"),
    @NamedQuery(name = "AspPais.findByDescPais", query = "SELECT a FROM AspPais a WHERE a.descPais = :descPais"),
    @NamedQuery(name = "AspPais.findByPaisId", query = "SELECT a FROM AspPais a WHERE a.paisId = :paisId")})
public class AspPais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_pais", length = 2147483647)
    private String descPais;
    @Id
    @Basic(optional = false)
    @Column(name = "pais_id", nullable = false)
    private Integer paisId;

    public AspPais() {
    }

    public AspPais(Integer paisId) {
        this.paisId = paisId;
    }

    public String getDescPais() {
        return descPais;
    }

    public void setDescPais(String descPais) {
        this.descPais = descPais;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paisId != null ? paisId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspPais)) {
            return false;
        }
        AspPais other = (AspPais) object;
        if ((this.paisId == null && other.paisId != null) || (this.paisId != null && !this.paisId.equals(other.paisId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspPais[ paisId=" + paisId + " ]";
    }
    
}
