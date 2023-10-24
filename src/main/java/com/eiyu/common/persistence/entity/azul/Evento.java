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
@Table(name = "evento", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e"),
    @NamedQuery(name = "Evento.findByIdEvento", query = "SELECT e FROM Evento e WHERE e.idEvento = :idEvento"),
    @NamedQuery(name = "Evento.findByCveRastreoGenerica", query = "SELECT e FROM Evento e WHERE e.cveRastreoGenerica = :cveRastreoGenerica"),
    @NamedQuery(name = "Evento.findByCanal", query = "SELECT e FROM Evento e WHERE e.canal = :canal"),
    @NamedQuery(name = "Evento.findBySubject", query = "SELECT e FROM Evento e WHERE e.subject = :subject"),
    @NamedQuery(name = "Evento.findByMensaje", query = "SELECT e FROM Evento e WHERE e.mensaje = :mensaje"),
    @NamedQuery(name = "Evento.findByFechaCreacion", query = "SELECT e FROM Evento e WHERE e.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Evento.findByActivo", query = "SELECT e FROM Evento e WHERE e.activo = :activo"),
    @NamedQuery(name = "Evento.findByUsuario", query = "SELECT e FROM Evento e WHERE e.usuario = :usuario")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_evento", nullable = false)
    private Integer idEvento;
    @Column(name = "cve_rastreo_generica", length = 30)
    private String cveRastreoGenerica;
    @Column(name = "canal")
    private Integer canal;
    @Column(name = "subject", length = 100)
    private String subject;
    @Column(name = "mensaje", length = 245)
    private String mensaje;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "usuario")
    private Integer usuario;

    public Evento() {
    }

    public Evento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Evento(Integer idEvento, boolean activo) {
        this.idEvento = idEvento;
        this.activo = activo;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getCveRastreoGenerica() {
        return cveRastreoGenerica;
    }

    public void setCveRastreoGenerica(String cveRastreoGenerica) {
        this.cveRastreoGenerica = cveRastreoGenerica;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
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

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvento != null ? idEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.idEvento == null && other.idEvento != null) || (this.idEvento != null && !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Evento[ idEvento=" + idEvento + " ]";
    }
    
}
