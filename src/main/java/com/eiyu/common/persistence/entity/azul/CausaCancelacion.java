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
@Table(name = "causa_cancelacion", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "CausaCancelacion.findAll", query = "SELECT c FROM CausaCancelacion c"),
    @NamedQuery(name = "CausaCancelacion.findByIdCausaCancelacion", query = "SELECT c FROM CausaCancelacion c WHERE c.idCausaCancelacion = :idCausaCancelacion"),
    @NamedQuery(name = "CausaCancelacion.findByDescripcion", query = "SELECT c FROM CausaCancelacion c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CausaCancelacion.findByActivo", query = "SELECT c FROM CausaCancelacion c WHERE c.activo = :activo"),
    @NamedQuery(name = "CausaCancelacion.findByFechaCreacion", query = "SELECT c FROM CausaCancelacion c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CausaCancelacion.findByUsuarioCreacion", query = "SELECT c FROM CausaCancelacion c WHERE c.usuarioCreacion = :usuarioCreacion")})
public class CausaCancelacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_causa_cancelacion", nullable = false)
    private Integer idCausaCancelacion;
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

    public CausaCancelacion() {
    }

    public CausaCancelacion(Integer idCausaCancelacion) {
        this.idCausaCancelacion = idCausaCancelacion;
    }

    public CausaCancelacion(Integer idCausaCancelacion, String descripcion, boolean activo) {
        this.idCausaCancelacion = idCausaCancelacion;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdCausaCancelacion() {
        return idCausaCancelacion;
    }

    public void setIdCausaCancelacion(Integer idCausaCancelacion) {
        this.idCausaCancelacion = idCausaCancelacion;
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
        hash += (idCausaCancelacion != null ? idCausaCancelacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CausaCancelacion)) {
            return false;
        }
        CausaCancelacion other = (CausaCancelacion) object;
        if ((this.idCausaCancelacion == null && other.idCausaCancelacion != null) || (this.idCausaCancelacion != null && !this.idCausaCancelacion.equals(other.idCausaCancelacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.CausaCancelacion[ idCausaCancelacion=" + idCausaCancelacion + " ]";
    }
    
}
