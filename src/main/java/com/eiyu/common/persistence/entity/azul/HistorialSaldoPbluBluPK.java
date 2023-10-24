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
public class HistorialSaldoPbluBluPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_udn", nullable = false)
    private int idUdn;
    @Basic(optional = false)
    @Column(name = "fecha_operativa", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaOperativa;

    public HistorialSaldoPbluBluPK() {
    }

    public HistorialSaldoPbluBluPK(int idUdn, Date fechaOperativa) {
        this.idUdn = idUdn;
        this.fechaOperativa = fechaOperativa;
    }

    public int getIdUdn() {
        return idUdn;
    }

    public void setIdUdn(int idUdn) {
        this.idUdn = idUdn;
    }

    public Date getFechaOperativa() {
        return fechaOperativa;
    }

    public void setFechaOperativa(Date fechaOperativa) {
        this.fechaOperativa = fechaOperativa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUdn;
        hash += (fechaOperativa != null ? fechaOperativa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialSaldoPbluBluPK)) {
            return false;
        }
        HistorialSaldoPbluBluPK other = (HistorialSaldoPbluBluPK) object;
        if (this.idUdn != other.idUdn) {
            return false;
        }
        if ((this.fechaOperativa == null && other.fechaOperativa != null) || (this.fechaOperativa != null && !this.fechaOperativa.equals(other.fechaOperativa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.HistorialSaldoPbluBluPK[ idUdn=" + idUdn + ", fechaOperativa=" + fechaOperativa + " ]";
    }
    
}
