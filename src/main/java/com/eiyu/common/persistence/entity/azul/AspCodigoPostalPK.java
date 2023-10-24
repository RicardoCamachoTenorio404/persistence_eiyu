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
public class AspCodigoPostalPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "codigo_postal", nullable = false, length = 2147483647)
    private String codigoPostal;
    @Basic(optional = false)
    @Column(name = "col_id", nullable = false)
    private int colId;
    @Basic(optional = false)
    @Column(name = "loc_id", nullable = false)
    private int locId;

    public AspCodigoPostalPK() {
    }

    public AspCodigoPostalPK(String codigoPostal, int colId, int locId) {
        this.codigoPostal = codigoPostal;
        this.colId = colId;
        this.locId = locId;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getColId() {
        return colId;
    }

    public void setColId(int colId) {
        this.colId = colId;
    }

    public int getLocId() {
        return locId;
    }

    public void setLocId(int locId) {
        this.locId = locId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPostal != null ? codigoPostal.hashCode() : 0);
        hash += (int) colId;
        hash += (int) locId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AspCodigoPostalPK)) {
            return false;
        }
        AspCodigoPostalPK other = (AspCodigoPostalPK) object;
        if ((this.codigoPostal == null && other.codigoPostal != null) || (this.codigoPostal != null && !this.codigoPostal.equals(other.codigoPostal))) {
            return false;
        }
        if (this.colId != other.colId) {
            return false;
        }
        if (this.locId != other.locId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AspCodigoPostalPK[ codigoPostal=" + codigoPostal + ", colId=" + colId + ", locId=" + locId + " ]";
    }
    
}
