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
@Table(name = "asp_nacionalidad", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AspNacionalidad.findAll", query = "SELECT a FROM AspNacionalidad a"),
    @NamedQuery(name = "AspNacionalidad.findByIdNacionalidad", query = "SELECT a FROM AspNacionalidad a WHERE a.idNacionalidad = :idNacionalidad"),
    @NamedQuery(name = "AspNacionalidad.findByDescNacionalidad", query = "SELECT a FROM AspNacionalidad a WHERE a.descNacionalidad = :descNacionalidad"),
    @NamedQuery(name = "AspNacionalidad.findByPaisId", query = "SELECT a FROM AspNacionalidad a WHERE a.paisId = :paisId")})
public class AspNacionalidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_nacionalidad", nullable = false)
    private Integer idNacionalidad;
    @Column(name = "desc_nacionalidad", length = 2147483647)
    private String descNacionalidad;
    @Column(name = "pais_id")
    private Integer paisId;

    public AspNacionalidad() {
    }

    public AspNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getDescNacionalidad() {
        return descNacionalidad;
    }

    public void setDescNacionalidad(String descNacionalidad) {
        this.descNacionalidad = descNacionalidad;
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
        hash += (idNacionalidad != null ? idNacionalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspNacionalidad)) {
            return false;
        }
        AspNacionalidad other = (AspNacionalidad) object;
        if ((this.idNacionalidad == null && other.idNacionalidad != null) || (this.idNacionalidad != null && !this.idNacionalidad.equals(other.idNacionalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspNacionalidad[ idNacionalidad=" + idNacionalidad + " ]";
    }
    
}
