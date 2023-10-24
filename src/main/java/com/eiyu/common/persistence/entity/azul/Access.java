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
@Table(name = "access", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Access.findAll", query = "SELECT a FROM Access a"),
    @NamedQuery(name = "Access.findByIdPblu", query = "SELECT a FROM Access a WHERE a.idPblu = :idPblu"),
    @NamedQuery(name = "Access.findByIdPerfil", query = "SELECT a FROM Access a WHERE a.idPerfil = :idPerfil"),
    @NamedQuery(name = "Access.findByUsername", query = "SELECT a FROM Access a WHERE a.username = :username"),
    @NamedQuery(name = "Access.findByPassword", query = "SELECT a FROM Access a WHERE a.password = :password"),
    @NamedQuery(name = "Access.findByIntentosAcceso", query = "SELECT a FROM Access a WHERE a.intentosAcceso = :intentosAcceso"),
    @NamedQuery(name = "Access.findByFechaCreacion", query = "SELECT a FROM Access a WHERE a.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Access.findByUsuarioCreacion", query = "SELECT a FROM Access a WHERE a.usuarioCreacion = :usuarioCreacion")})
public class Access implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pblu", nullable = false)
    private Integer idPblu;
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
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public Access() {
    }

    public Access(Integer idPblu) {
        this.idPblu = idPblu;
    }

    public Access(Integer idPblu, String username, String password) {
        this.idPblu = idPblu;
        this.username = username;
        this.password = password;
    }

    public Integer getIdPblu() {
        return idPblu;
    }

    public void setIdPblu(Integer idPblu) {
        this.idPblu = idPblu;
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
        hash += (idPblu != null ? idPblu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Access)) {
            return false;
        }
        Access other = (Access) object;
        if ((this.idPblu == null && other.idPblu != null) || (this.idPblu != null && !this.idPblu.equals(other.idPblu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Access[ idPblu=" + idPblu + " ]";
    }
    
}
