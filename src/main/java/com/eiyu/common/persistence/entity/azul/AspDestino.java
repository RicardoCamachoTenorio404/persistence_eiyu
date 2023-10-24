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
@Table(name = "asp_destino", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspDestino.findAll", query = "SELECT a FROM AspDestino a"),
    @NamedQuery(name = "AspDestino.findByDescDestino", query = "SELECT a FROM AspDestino a WHERE a.descDestino = :descDestino"),
    @NamedQuery(name = "AspDestino.findByClaveCnbv", query = "SELECT a FROM AspDestino a WHERE a.claveCnbv = :claveCnbv"),
    @NamedQuery(name = "AspDestino.findByDesId", query = "SELECT a FROM AspDestino a WHERE a.desId = :desId")})
public class AspDestino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_destino", length = 2147483647)
    private String descDestino;
    @Column(name = "clave_cnbv")
    private Integer claveCnbv;
    @Id
    @Basic(optional = false)
    @Column(name = "des_id", nullable = false)
    private Integer desId;

    public AspDestino() {
    }

    public AspDestino(Integer desId) {
        this.desId = desId;
    }

    public String getDescDestino() {
        return descDestino;
    }

    public void setDescDestino(String descDestino) {
        this.descDestino = descDestino;
    }

    public Integer getClaveCnbv() {
        return claveCnbv;
    }

    public void setClaveCnbv(Integer claveCnbv) {
        this.claveCnbv = claveCnbv;
    }

    public Integer getDesId() {
        return desId;
    }

    public void setDesId(Integer desId) {
        this.desId = desId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (desId != null ? desId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspDestino)) {
            return false;
        }
        AspDestino other = (AspDestino) object;
        if ((this.desId == null && other.desId != null) || (this.desId != null && !this.desId.equals(other.desId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspDestino[ desId=" + desId + " ]";
    }
    
}
