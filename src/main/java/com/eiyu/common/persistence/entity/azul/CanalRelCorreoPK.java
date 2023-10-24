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
public class CanalRelCorreoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_canal", nullable = false)
    private int idCanal;
    @Basic(optional = false)
    @Column(name = "id_correo", nullable = false)
    private int idCorreo;

    public CanalRelCorreoPK() {
    }

    public CanalRelCorreoPK(int idCanal, int idCorreo) {
        this.idCanal = idCanal;
        this.idCorreo = idCorreo;
    }

    public int getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(int idCanal) {
        this.idCanal = idCanal;
    }

    public int getIdCorreo() {
        return idCorreo;
    }

    public void setIdCorreo(int idCorreo) {
        this.idCorreo = idCorreo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCanal;
        hash += (int) idCorreo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CanalRelCorreoPK)) {
            return false;
        }
        CanalRelCorreoPK other = (CanalRelCorreoPK) object;
        if (this.idCanal != other.idCanal) {
            return false;
        }
        if (this.idCorreo != other.idCorreo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.CanalRelCorreoPK[ idCanal=" + idCanal + ", idCorreo=" + idCorreo + " ]";
    }
    
}
