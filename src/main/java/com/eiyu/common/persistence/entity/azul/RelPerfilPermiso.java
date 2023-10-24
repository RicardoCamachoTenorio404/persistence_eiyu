/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "rel_perfil_permiso", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "RelPerfilPermiso.findAll", query = "SELECT r FROM RelPerfilPermiso r"),
    @NamedQuery(name = "RelPerfilPermiso.findByIdPerfil", query = "SELECT r FROM RelPerfilPermiso r WHERE r.relPerfilPermisoPK.idPerfil = :idPerfil"),
    @NamedQuery(name = "RelPerfilPermiso.findByIdPermiso", query = "SELECT r FROM RelPerfilPermiso r WHERE r.relPerfilPermisoPK.idPermiso = :idPermiso"),
    @NamedQuery(name = "RelPerfilPermiso.findByActivo", query = "SELECT r FROM RelPerfilPermiso r WHERE r.activo = :activo"),
    @NamedQuery(name = "RelPerfilPermiso.findByFechaCreacion", query = "SELECT r FROM RelPerfilPermiso r WHERE r.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "RelPerfilPermiso.findByUsuarioCreacion", query = "SELECT r FROM RelPerfilPermiso r WHERE r.usuarioCreacion = :usuarioCreacion")})
public class RelPerfilPermiso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RelPerfilPermisoPK relPerfilPermisoPK;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public RelPerfilPermiso() {
    }

    public RelPerfilPermiso(RelPerfilPermisoPK relPerfilPermisoPK) {
        this.relPerfilPermisoPK = relPerfilPermisoPK;
    }

    public RelPerfilPermiso(RelPerfilPermisoPK relPerfilPermisoPK, boolean activo) {
        this.relPerfilPermisoPK = relPerfilPermisoPK;
        this.activo = activo;
    }

    public RelPerfilPermiso(int idPerfil, int idPermiso) {
        this.relPerfilPermisoPK = new RelPerfilPermisoPK(idPerfil, idPermiso);
    }

    public RelPerfilPermisoPK getRelPerfilPermisoPK() {
        return relPerfilPermisoPK;
    }

    public void setRelPerfilPermisoPK(RelPerfilPermisoPK relPerfilPermisoPK) {
        this.relPerfilPermisoPK = relPerfilPermisoPK;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relPerfilPermisoPK != null ? relPerfilPermisoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelPerfilPermiso)) {
            return false;
        }
        RelPerfilPermiso other = (RelPerfilPermiso) object;
        if ((this.relPerfilPermisoPK == null && other.relPerfilPermisoPK != null) || (this.relPerfilPermisoPK != null && !this.relPerfilPermisoPK.equals(other.relPerfilPermisoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.RelPerfilPermiso[ relPerfilPermisoPK=" + relPerfilPermisoPK + " ]";
    }
    
}
