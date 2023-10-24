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
@Table(name = "asp_tipo_identificador", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspTipoIdentificador.findAll", query = "SELECT a FROM AspTipoIdentificador a"),
    @NamedQuery(name = "AspTipoIdentificador.findByCveTipoIdent", query = "SELECT a FROM AspTipoIdentificador a WHERE a.cveTipoIdent = :cveTipoIdent"),
    @NamedQuery(name = "AspTipoIdentificador.findByDescTipoIdentificador", query = "SELECT a FROM AspTipoIdentificador a WHERE a.descTipoIdentificador = :descTipoIdentificador"),
    @NamedQuery(name = "AspTipoIdentificador.findByTipoIdenId", query = "SELECT a FROM AspTipoIdentificador a WHERE a.tipoIdenId = :tipoIdenId")})
public class AspTipoIdentificador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "cve_tipo_ident", length = 2147483647)
    private String cveTipoIdent;
    @Column(name = "desc_tipo_identificador", length = 2147483647)
    private String descTipoIdentificador;
    @Id
    @Basic(optional = false)
    @Column(name = "tipo_iden_id", nullable = false)
    private Integer tipoIdenId;

    public AspTipoIdentificador() {
    }

    public AspTipoIdentificador(Integer tipoIdenId) {
        this.tipoIdenId = tipoIdenId;
    }

    public String getCveTipoIdent() {
        return cveTipoIdent;
    }

    public void setCveTipoIdent(String cveTipoIdent) {
        this.cveTipoIdent = cveTipoIdent;
    }

    public String getDescTipoIdentificador() {
        return descTipoIdentificador;
    }

    public void setDescTipoIdentificador(String descTipoIdentificador) {
        this.descTipoIdentificador = descTipoIdentificador;
    }

    public Integer getTipoIdenId() {
        return tipoIdenId;
    }

    public void setTipoIdenId(Integer tipoIdenId) {
        this.tipoIdenId = tipoIdenId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoIdenId != null ? tipoIdenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspTipoIdentificador)) {
            return false;
        }
        AspTipoIdentificador other = (AspTipoIdentificador) object;
        if ((this.tipoIdenId == null && other.tipoIdenId != null) || (this.tipoIdenId != null && !this.tipoIdenId.equals(other.tipoIdenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspTipoIdentificador[ tipoIdenId=" + tipoIdenId + " ]";
    }
    
}
