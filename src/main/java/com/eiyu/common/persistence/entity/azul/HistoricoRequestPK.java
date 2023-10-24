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
public class HistoricoRequestPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_peticion", nullable = false)
    private int idPeticion;
    @Basic(optional = false)
    @Column(name = "fh_peticion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fhPeticion;

    public HistoricoRequestPK() {
    }

    public HistoricoRequestPK(int idPeticion, Date fhPeticion) {
        this.idPeticion = idPeticion;
        this.fhPeticion = fhPeticion;
    }

    public int getIdPeticion() {
        return idPeticion;
    }

    public void setIdPeticion(int idPeticion) {
        this.idPeticion = idPeticion;
    }

    public Date getFhPeticion() {
        return fhPeticion;
    }

    public void setFhPeticion(Date fhPeticion) {
        this.fhPeticion = fhPeticion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPeticion;
        hash += (fhPeticion != null ? fhPeticion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoRequestPK)) {
            return false;
        }
        HistoricoRequestPK other = (HistoricoRequestPK) object;
        if (this.idPeticion != other.idPeticion) {
            return false;
        }
        if ((this.fhPeticion == null && other.fhPeticion != null) || (this.fhPeticion != null && !this.fhPeticion.equals(other.fhPeticion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.HistoricoRequestPK[ idPeticion=" + idPeticion + ", fhPeticion=" + fhPeticion + " ]";
    }
    
}
