/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "perfil_role", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "PerfilRole.findAll", query = "SELECT p FROM PerfilRole p"),
    @NamedQuery(name = "PerfilRole.findByIdPerfilRole", query = "SELECT p FROM PerfilRole p WHERE p.idPerfilRole = :idPerfilRole"),
    @NamedQuery(name = "PerfilRole.findByIdPerfil", query = "SELECT p FROM PerfilRole p WHERE p.idPerfil = :idPerfil"),
    @NamedQuery(name = "PerfilRole.findByIdRole", query = "SELECT p FROM PerfilRole p WHERE p.idRole = :idRole"),
    @NamedQuery(name = "PerfilRole.findByFechaCreacion", query = "SELECT p FROM PerfilRole p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "PerfilRole.findByUsuarioCreacion", query = "SELECT p FROM PerfilRole p WHERE p.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "PerfilRole.findByActivo", query = "SELECT p FROM PerfilRole p WHERE p.activo = :activo")})
public class PerfilRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perfil_role", nullable = false)
    private Integer idPerfilRole;
    @Basic(optional = false)
    @Column(name = "id_perfil", nullable = false)
    private int idPerfil;
    @Basic(optional = false)
    @Column(name = "id_role", nullable = false)
    private int idRole;
    @Basic(optional = false)
    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 2147483647)
    private String usuarioCreacion;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;

    public PerfilRole() {
    }

    public PerfilRole(Integer idPerfilRole) {
        this.idPerfilRole = idPerfilRole;
    }

    public PerfilRole(Integer idPerfilRole, int idPerfil, int idRole, Date fechaCreacion, boolean activo) {
        this.idPerfilRole = idPerfilRole;
        this.idPerfil = idPerfil;
        this.idRole = idRole;
        this.fechaCreacion = fechaCreacion;
        this.activo = activo;
    }

    public Integer getIdPerfilRole() {
        return idPerfilRole;
    }

    public void setIdPerfilRole(Integer idPerfilRole) {
        this.idPerfilRole = idPerfilRole;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
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

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfilRole != null ? idPerfilRole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilRole)) {
            return false;
        }
        PerfilRole other = (PerfilRole) object;
        if ((this.idPerfilRole == null && other.idPerfilRole != null) || (this.idPerfilRole != null && !this.idPerfilRole.equals(other.idPerfilRole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.PerfilRole[ idPerfilRole=" + idPerfilRole + " ]";
    }
    
}
