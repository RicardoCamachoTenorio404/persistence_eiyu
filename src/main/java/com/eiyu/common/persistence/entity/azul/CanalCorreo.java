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
@Table(name = "canal_correo", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "CanalCorreo.findAll", query = "SELECT c FROM CanalCorreo c"),
    @NamedQuery(name = "CanalCorreo.findById", query = "SELECT c FROM CanalCorreo c WHERE c.id = :id"),
    @NamedQuery(name = "CanalCorreo.findByNombre", query = "SELECT c FROM CanalCorreo c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CanalCorreo.findByPblu", query = "SELECT c FROM CanalCorreo c WHERE c.pblu = :pblu"),
    @NamedQuery(name = "CanalCorreo.findByFechaCreacion", query = "SELECT c FROM CanalCorreo c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CanalCorreo.findByUsuarioCreacion", query = "SELECT c FROM CanalCorreo c WHERE c.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "CanalCorreo.findByActivo", query = "SELECT c FROM CanalCorreo c WHERE c.activo = :activo"),
    @NamedQuery(name = "CanalCorreo.findByUdn", query = "SELECT c FROM CanalCorreo c WHERE c.udn = :udn"),
    @NamedQuery(name = "CanalCorreo.findByEvento", query = "SELECT c FROM CanalCorreo c WHERE c.evento = :evento")})
public class CanalCorreo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "nombre", length = 50)
    private String nombre;
    @Column(name = "pblu")
    private Integer pblu;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 50)
    private String usuarioCreacion;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "udn")
    private Integer udn;
    @Column(name = "evento")
    private Integer evento;

    public CanalCorreo() {
    }

    public CanalCorreo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPblu() {
        return pblu;
    }

    public void setPblu(Integer pblu) {
        this.pblu = pblu;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getUdn() {
        return udn;
    }

    public void setUdn(Integer udn) {
        this.udn = udn;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
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
        if (!(object instanceof CanalCorreo)) {
            return false;
        }
        CanalCorreo other = (CanalCorreo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.CanalCorreo[ id=" + id + " ]";
    }
    
}
