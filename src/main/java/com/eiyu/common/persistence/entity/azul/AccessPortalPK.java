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
public class AccessPortalPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_access", nullable = false)
    private int idAccess;
    @Basic(optional = false)
    @Column(name = "id_pblu", nullable = false)
    private int idPblu;

    public AccessPortalPK() {
    }

    public AccessPortalPK(int idAccess, int idPblu) {
        this.idAccess = idAccess;
        this.idPblu = idPblu;
    }

    public int getIdAccess() {
        return idAccess;
    }

    public void setIdAccess(int idAccess) {
        this.idAccess = idAccess;
    }

    public int getIdPblu() {
        return idPblu;
    }

    public void setIdPblu(int idPblu) {
        this.idPblu = idPblu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idAccess;
        hash += (int) idPblu;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessPortalPK)) {
            return false;
        }
        AccessPortalPK other = (AccessPortalPK) object;
        if (this.idAccess != other.idAccess) {
            return false;
        }
        if (this.idPblu != other.idPblu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AccessPortalPK[ idAccess=" + idAccess + ", idPblu=" + idPblu + " ]";
    }
    
}
