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
@Table(name = "access_portal", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AccessPortal.findAll", query = "SELECT a FROM AccessPortal a"),
    @NamedQuery(name = "AccessPortal.findByIdAccess", query = "SELECT a FROM AccessPortal a WHERE a.accessPortalPK.idAccess = :idAccess"),
    @NamedQuery(name = "AccessPortal.findByIdPblu", query = "SELECT a FROM AccessPortal a WHERE a.accessPortalPK.idPblu = :idPblu"),
    @NamedQuery(name = "AccessPortal.findByIdPerfil", query = "SELECT a FROM AccessPortal a WHERE a.idPerfil = :idPerfil"),
    @NamedQuery(name = "AccessPortal.findByUsername", query = "SELECT a FROM AccessPortal a WHERE a.username = :username"),
    @NamedQuery(name = "AccessPortal.findByPassword", query = "SELECT a FROM AccessPortal a WHERE a.password = :password"),
    @NamedQuery(name = "AccessPortal.findByIntentosAcceso", query = "SELECT a FROM AccessPortal a WHERE a.intentosAcceso = :intentosAcceso"),
    @NamedQuery(name = "AccessPortal.findByEmail", query = "SELECT a FROM AccessPortal a WHERE a.email = :email"),
    @NamedQuery(name = "AccessPortal.findByFechaCreacion", query = "SELECT a FROM AccessPortal a WHERE a.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "AccessPortal.findByUsuarioCreacion", query = "SELECT a FROM AccessPortal a WHERE a.usuarioCreacion = :usuarioCreacion")})
public class AccessPortal implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccessPortalPK accessPortalPK;
    @Column(name = "id_perfil")
    private Integer idPerfil;
    @Basic(optional = false)
    @Column(name = "username", nullable = false, length = 100)
    private String username;
    @Basic(optional = false)
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Column(name = "intentos_acceso")
    private Short intentosAcceso;
    @Column(name = "email", length = 75)
    private String email;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public AccessPortal() {
    }

    public AccessPortal(AccessPortalPK accessPortalPK) {
        this.accessPortalPK = accessPortalPK;
    }

    public AccessPortal(AccessPortalPK accessPortalPK, String username, String password) {
        this.accessPortalPK = accessPortalPK;
        this.username = username;
        this.password = password;
    }

    public AccessPortal(int idAccess, int idPblu) {
        this.accessPortalPK = new AccessPortalPK(idAccess, idPblu);
    }

    public AccessPortalPK getAccessPortalPK() {
        return accessPortalPK;
    }

    public void setAccessPortalPK(AccessPortalPK accessPortalPK) {
        this.accessPortalPK = accessPortalPK;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getIntentosAcceso() {
        return intentosAcceso;
    }

    public void setIntentosAcceso(Short intentosAcceso) {
        this.intentosAcceso = intentosAcceso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        hash += (accessPortalPK != null ? accessPortalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessPortal)) {
            return false;
        }
        AccessPortal other = (AccessPortal) object;
        if ((this.accessPortalPK == null && other.accessPortalPK != null) || (this.accessPortalPK != null && !this.accessPortalPK.equals(other.accessPortalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AccessPortal[ accessPortalPK=" + accessPortalPK + " ]";
    }
    
}
