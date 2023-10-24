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
@Table(name = "asp_estudios", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspEstudios.findAll", query = "SELECT a FROM AspEstudios a"),
    @NamedQuery(name = "AspEstudios.findByEstId", query = "SELECT a FROM AspEstudios a WHERE a.estId = :estId"),
    @NamedQuery(name = "AspEstudios.findByDescEstudios", query = "SELECT a FROM AspEstudios a WHERE a.descEstudios = :descEstudios")})
public class AspEstudios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "est_id", nullable = false)
    private Integer estId;
    @Column(name = "desc_estudios", length = 2147483647)
    private String descEstudios;

    public AspEstudios() {
    }

    public AspEstudios(Integer estId) {
        this.estId = estId;
    }

    public Integer getEstId() {
        return estId;
    }

    public void setEstId(Integer estId) {
        this.estId = estId;
    }

    public String getDescEstudios() {
        return descEstudios;
    }

    public void setDescEstudios(String descEstudios) {
        this.descEstudios = descEstudios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estId != null ? estId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspEstudios)) {
            return false;
        }
        AspEstudios other = (AspEstudios) object;
        if ((this.estId == null && other.estId != null) || (this.estId != null && !this.estId.equals(other.estId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspEstudios[ estId=" + estId + " ]";
    }
    
}
