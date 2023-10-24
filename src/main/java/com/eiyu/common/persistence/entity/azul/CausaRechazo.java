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
@Table(name = "causa_rechazo", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "CausaRechazo.findAll", query = "SELECT c FROM CausaRechazo c"),
    @NamedQuery(name = "CausaRechazo.findByIdCausaRechazo", query = "SELECT c FROM CausaRechazo c WHERE c.idCausaRechazo = :idCausaRechazo"),
    @NamedQuery(name = "CausaRechazo.findByDescripcion", query = "SELECT c FROM CausaRechazo c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CausaRechazo.findByActivo", query = "SELECT c FROM CausaRechazo c WHERE c.activo = :activo"),
    @NamedQuery(name = "CausaRechazo.findByFechaCreacion", query = "SELECT c FROM CausaRechazo c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CausaRechazo.findByUsuarioCreacion", query = "SELECT c FROM CausaRechazo c WHERE c.usuarioCreacion = :usuarioCreacion")})
public class CausaRechazo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_causa_rechazo", nullable = false)
    private Integer idCausaRechazo;
    @Basic(optional = false)
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public CausaRechazo() {
    }

    public CausaRechazo(Integer idCausaRechazo) {
        this.idCausaRechazo = idCausaRechazo;
    }

    public CausaRechazo(Integer idCausaRechazo, String descripcion, boolean activo) {
        this.idCausaRechazo = idCausaRechazo;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdCausaRechazo() {
        return idCausaRechazo;
    }

    public void setIdCausaRechazo(Integer idCausaRechazo) {
        this.idCausaRechazo = idCausaRechazo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idCausaRechazo != null ? idCausaRechazo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CausaRechazo)) {
            return false;
        }
        CausaRechazo other = (CausaRechazo) object;
        if ((this.idCausaRechazo == null && other.idCausaRechazo != null) || (this.idCausaRechazo != null && !this.idCausaRechazo.equals(other.idCausaRechazo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.CausaRechazo[ idCausaRechazo=" + idCausaRechazo + " ]";
    }
    
}
