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
@Table(name = "correo_mensaje", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "CorreoMensaje.findAll", query = "SELECT c FROM CorreoMensaje c"),
    @NamedQuery(name = "CorreoMensaje.findByUdn", query = "SELECT c FROM CorreoMensaje c WHERE c.udn = :udn"),
    @NamedQuery(name = "CorreoMensaje.findByUsuario", query = "SELECT c FROM CorreoMensaje c WHERE c.usuario = :usuario"),
    @NamedQuery(name = "CorreoMensaje.findByEvento", query = "SELECT c FROM CorreoMensaje c WHERE c.evento = :evento"),
    @NamedQuery(name = "CorreoMensaje.findByCveRastreo", query = "SELECT c FROM CorreoMensaje c WHERE c.cveRastreo = :cveRastreo"),
    @NamedQuery(name = "CorreoMensaje.findByCanal", query = "SELECT c FROM CorreoMensaje c WHERE c.canal = :canal"),
    @NamedQuery(name = "CorreoMensaje.findById", query = "SELECT c FROM CorreoMensaje c WHERE c.id = :id"),
    @NamedQuery(name = "CorreoMensaje.findBySubject", query = "SELECT c FROM CorreoMensaje c WHERE c.subject = :subject"),
    @NamedQuery(name = "CorreoMensaje.findByMensaje", query = "SELECT c FROM CorreoMensaje c WHERE c.mensaje = :mensaje"),
    @NamedQuery(name = "CorreoMensaje.findByFechaCreacion", query = "SELECT c FROM CorreoMensaje c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CorreoMensaje.findByEstado", query = "SELECT c FROM CorreoMensaje c WHERE c.estado = :estado")})
public class CorreoMensaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "udn")
    private Integer udn;
    @Column(name = "usuario")
    private Integer usuario;
    @Column(name = "evento")
    private Integer evento;
    @Column(name = "cve_rastreo", length = 30)
    private String cveRastreo;
    @Column(name = "canal")
    private Integer canal;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "subject", length = 100)
    private String subject;
    @Column(name = "mensaje", length = 245)
    private String mensaje;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "estado")
    private Integer estado;

    public CorreoMensaje() {
    }

    public CorreoMensaje(Integer id) {
        this.id = id;
    }

    public Integer getUdn() {
        return udn;
    }

    public void setUdn(Integer udn) {
        this.udn = udn;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
    }

    public String getCveRastreo() {
        return cveRastreo;
    }

    public void setCveRastreo(String cveRastreo) {
        this.cveRastreo = cveRastreo;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
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
        if (!(object instanceof CorreoMensaje)) {
            return false;
        }
        CorreoMensaje other = (CorreoMensaje) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.CorreoMensaje[ id=" + id + " ]";
    }
    
}
