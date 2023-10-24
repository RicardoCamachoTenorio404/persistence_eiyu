/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 *
 * @author Ricardo Camacho
 */
@Embeddable
public class PagoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cve_rastreo", nullable = false, length = 30)
    private String cveRastreo;
    @Basic(optional = false)
    @Column(name = "id_movimiento", nullable = false)
    private int idMovimiento;

    public PagoPK() {
    }

    public PagoPK(String cveRastreo, int idMovimiento) {
        this.cveRastreo = cveRastreo;
        this.idMovimiento = idMovimiento;
    }

    public String getCveRastreo() {
        return cveRastreo;
    }

    public void setCveRastreo(String cveRastreo) {
        this.cveRastreo = cveRastreo;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveRastreo != null ? cveRastreo.hashCode() : 0);
        hash += (int) idMovimiento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagoPK)) {
            return false;
        }
        PagoPK other = (PagoPK) object;
        if ((this.cveRastreo == null && other.cveRastreo != null) || (this.cveRastreo != null && !this.cveRastreo.equals(other.cveRastreo))) {
            return false;
        }
        if (this.idMovimiento != other.idMovimiento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.PagoPK[ cveRastreo=" + cveRastreo + ", idMovimiento=" + idMovimiento + " ]";
    }
    
}
