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
@Table(name = "access_portal_hist_tpm", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "AccessPortalHistTpm.findAll", query = "SELECT a FROM AccessPortalHistTpm a"),
    @NamedQuery(name = "AccessPortalHistTpm.findByIdAccess", query = "SELECT a FROM AccessPortalHistTpm a WHERE a.accessPortalHistTpmPK.idAccess = :idAccess"),
    @NamedQuery(name = "AccessPortalHistTpm.findByIdPblu", query = "SELECT a FROM AccessPortalHistTpm a WHERE a.accessPortalHistTpmPK.idPblu = :idPblu"),
    @NamedQuery(name = "AccessPortalHistTpm.findByIdPerfil", query = "SELECT a FROM AccessPortalHistTpm a WHERE a.idPerfil = :idPerfil"),
    @NamedQuery(name = "AccessPortalHistTpm.findByUsername", query = "SELECT a FROM AccessPortalHistTpm a WHERE a.username = :username"),
    @NamedQuery(name = "AccessPortalHistTpm.findByPassword", query = "SELECT a FROM AccessPortalHistTpm a WHERE a.password = :password"),
    @NamedQuery(name = "AccessPortalHistTpm.findByIntentosAcceso", query = "SELECT a FROM AccessPortalHistTpm a WHERE a.intentosAcceso = :intentosAcceso"),
    @NamedQuery(name = "AccessPortalHistTpm.findByEmail", query = "SELECT a FROM AccessPortalHistTpm a WHERE a.email = :email"),
    @NamedQuery(name = "AccessPortalHistTpm.findByFechaCreacion", query = "SELECT a FROM AccessPortalHistTpm a WHERE a.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "AccessPortalHistTpm.findByUsuarioCreacion", query = "SELECT a FROM AccessPortalHistTpm a WHERE a.usuarioCreacion = :usuarioCreacion")})
public class AccessPortalHistTpm implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccessPortalHistTpmPK accessPortalHistTpmPK;
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

    public AccessPortalHistTpm() {
    }

    public AccessPortalHistTpm(AccessPortalHistTpmPK accessPortalHistTpmPK) {
        this.accessPortalHistTpmPK = accessPortalHistTpmPK;
    }

    public AccessPortalHistTpm(AccessPortalHistTpmPK accessPortalHistTpmPK, String username, String password) {
        this.accessPortalHistTpmPK = accessPortalHistTpmPK;
        this.username = username;
        this.password = password;
    }

    public AccessPortalHistTpm(int idAccess, int idPblu) {
        this.accessPortalHistTpmPK = new AccessPortalHistTpmPK(idAccess, idPblu);
    }

    public AccessPortalHistTpmPK getAccessPortalHistTpmPK() {
        return accessPortalHistTpmPK;
    }

    public void setAccessPortalHistTpmPK(AccessPortalHistTpmPK accessPortalHistTpmPK) {
        this.accessPortalHistTpmPK = accessPortalHistTpmPK;
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
        hash += (accessPortalHistTpmPK != null ? accessPortalHistTpmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessPortalHistTpm)) {
            return false;
        }
        AccessPortalHistTpm other = (AccessPortalHistTpm) object;
        if ((this.accessPortalHistTpmPK == null && other.accessPortalHistTpmPK != null) || (this.accessPortalHistTpmPK != null && !this.accessPortalHistTpmPK.equals(other.accessPortalHistTpmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.AccessPortalHistTpm[ accessPortalHistTpmPK=" + accessPortalHistTpmPK + " ]";
    }
    
}
