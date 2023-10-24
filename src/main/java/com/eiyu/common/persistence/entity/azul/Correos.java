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
@Table(name = "correos", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Correos.findAll", query = "SELECT c FROM Correos c"),
    @NamedQuery(name = "Correos.findById", query = "SELECT c FROM Correos c WHERE c.id = :id"),
    @NamedQuery(name = "Correos.findByIdUser", query = "SELECT c FROM Correos c WHERE c.idUser = :idUser"),
    @NamedQuery(name = "Correos.findByCorreo", query = "SELECT c FROM Correos c WHERE c.correo = :correo"),
    @NamedQuery(name = "Correos.findByActivo", query = "SELECT c FROM Correos c WHERE c.activo = :activo"),
    @NamedQuery(name = "Correos.findByFehaCreacion", query = "SELECT c FROM Correos c WHERE c.fehaCreacion = :fehaCreacion"),
    @NamedQuery(name = "Correos.findByUsuarioCreacion", query = "SELECT c FROM Correos c WHERE c.usuarioCreacion = :usuarioCreacion")})
public class Correos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "correo", length = 80)
    private String correo;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "feha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fehaCreacion;
    @Column(name = "usuario_creacion", length = 50)
    private String usuarioCreacion;

    public Correos() {
    }

    public Correos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFehaCreacion() {
        return fehaCreacion;
    }

    public void setFehaCreacion(Date fehaCreacion) {
        this.fehaCreacion = fehaCreacion;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correos)) {
            return false;
        }
        Correos other = (Correos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Correos[ id=" + id + " ]";
    }
    
}
