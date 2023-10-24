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
@Table(name = "asp_identificador", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspIdentificador.findAll", query = "SELECT a FROM AspIdentificador a"),
    @NamedQuery(name = "AspIdentificador.findByDescIdentificador", query = "SELECT a FROM AspIdentificador a WHERE a.descIdentificador = :descIdentificador"),
    @NamedQuery(name = "AspIdentificador.findByIdentId", query = "SELECT a FROM AspIdentificador a WHERE a.identId = :identId"),
    @NamedQuery(name = "AspIdentificador.findByCveIdent", query = "SELECT a FROM AspIdentificador a WHERE a.cveIdent = :cveIdent")})
public class AspIdentificador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "desc_identificador", length = 2147483647)
    private String descIdentificador;
    @Id
    @Basic(optional = false)
    @Column(name = "ident_id", nullable = false)
    private Integer identId;
    @Column(name = "cve_ident", length = 2147483647)
    private String cveIdent;

    public AspIdentificador() {
    }

    public AspIdentificador(Integer identId) {
        this.identId = identId;
    }

    public String getDescIdentificador() {
        return descIdentificador;
    }

    public void setDescIdentificador(String descIdentificador) {
        this.descIdentificador = descIdentificador;
    }

    public Integer getIdentId() {
        return identId;
    }

    public void setIdentId(Integer identId) {
        this.identId = identId;
    }

    public String getCveIdent() {
        return cveIdent;
    }

    public void setCveIdent(String cveIdent) {
        this.cveIdent = cveIdent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identId != null ? identId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspIdentificador)) {
            return false;
        }
        AspIdentificador other = (AspIdentificador) object;
        if ((this.identId == null && other.identId != null) || (this.identId != null && !this.identId.equals(other.identId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspIdentificador[ identId=" + identId + " ]";
    }
    
}
