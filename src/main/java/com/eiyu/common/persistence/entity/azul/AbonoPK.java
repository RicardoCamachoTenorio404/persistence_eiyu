/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author Ricardo Camacho
 */
@Embeddable
public class AbonoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cve_rastreo", nullable = false, length = 30)
    private String cveRastreo;
    @Basic(optional = false)
    @Column(name = "fecha_operacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOperacion;
    @Basic(optional = false)
    @Column(name = "folio_paquete", nullable = false)
    private int folioPaquete;
    @Basic(optional = false)
    @Column(name = "folio", nullable = false)
    private int folio;

    public AbonoPK() {
    }

    public AbonoPK(String cveRastreo, Date fechaOperacion, int folioPaquete, int folio) {
        this.cveRastreo = cveRastreo;
        this.fechaOperacion = fechaOperacion;
        this.folioPaquete = folioPaquete;
        this.folio = folio;
    }

    public String getCveRastreo() {
        return cveRastreo;
    }

    public void setCveRastreo(String cveRastreo) {
        this.cveRastreo = cveRastreo;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public int getFolioPaquete() {
        return folioPaquete;
    }

    public void setFolioPaquete(int folioPaquete) {
        this.folioPaquete = folioPaquete;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveRastreo != null ? cveRastreo.hashCode() : 0);
        hash += (fechaOperacion != null ? fechaOperacion.hashCode() : 0);
        hash += (int) folioPaquete;
        hash += (int) folio;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AbonoPK)) {
            return false;
        }
        AbonoPK other = (AbonoPK) object;
        if ((this.cveRastreo == null && other.cveRastreo != null) || (this.cveRastreo != null && !this.cveRastreo.equals(other.cveRastreo))) {
            return false;
        }
        if ((this.fechaOperacion == null && other.fechaOperacion != null) || (this.fechaOperacion != null && !this.fechaOperacion.equals(other.fechaOperacion))) {
            return false;
        }
        if (this.folioPaquete != other.folioPaquete) {
            return false;
        }
        if (this.folio != other.folio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AbonoPK[ cveRastreo=" + cveRastreo + ", fechaOperacion=" + fechaOperacion + ", folioPaquete=" + folioPaquete + ", folio=" + folio + " ]";
    }
    
}
