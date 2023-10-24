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
public class RelPerfilPermisoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_perfil", nullable = false)
    private int idPerfil;
    @Basic(optional = false)
    @Column(name = "id_permiso", nullable = false)
    private int idPermiso;

    public RelPerfilPermisoPK() {
    }

    public RelPerfilPermisoPK(int idPerfil, int idPermiso) {
        this.idPerfil = idPerfil;
        this.idPermiso = idPermiso;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPerfil;
        hash += (int) idPermiso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelPerfilPermisoPK)) {
            return false;
        }
        RelPerfilPermisoPK other = (RelPerfilPermisoPK) object;
        if (this.idPerfil != other.idPerfil) {
            return false;
        }
        if (this.idPermiso != other.idPermiso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.RelPerfilPermisoPK[ idPerfil=" + idPerfil + ", idPermiso=" + idPermiso + " ]";
    }
    
}
