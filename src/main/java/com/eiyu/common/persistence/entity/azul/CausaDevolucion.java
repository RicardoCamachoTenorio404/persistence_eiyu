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
@Table(name = "causa_devolucion", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "CausaDevolucion.findAll", query = "SELECT c FROM CausaDevolucion c"),
    @NamedQuery(name = "CausaDevolucion.findByIdCausaDevolucion", query = "SELECT c FROM CausaDevolucion c WHERE c.idCausaDevolucion = :idCausaDevolucion"),
    @NamedQuery(name = "CausaDevolucion.findByDescripcion", query = "SELECT c FROM CausaDevolucion c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CausaDevolucion.findByActivo", query = "SELECT c FROM CausaDevolucion c WHERE c.activo = :activo"),
    @NamedQuery(name = "CausaDevolucion.findByFechaCreacion", query = "SELECT c FROM CausaDevolucion c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CausaDevolucion.findByUsuarioCreacion", query = "SELECT c FROM CausaDevolucion c WHERE c.usuarioCreacion = :usuarioCreacion")})
public class CausaDevolucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_causa_devolucion", nullable = false)
    private Integer idCausaDevolucion;
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

    public CausaDevolucion() {
    }

    public CausaDevolucion(Integer idCausaDevolucion) {
        this.idCausaDevolucion = idCausaDevolucion;
    }

    public CausaDevolucion(Integer idCausaDevolucion, String descripcion, boolean activo) {
        this.idCausaDevolucion = idCausaDevolucion;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdCausaDevolucion() {
        return idCausaDevolucion;
    }

    public void setIdCausaDevolucion(Integer idCausaDevolucion) {
        this.idCausaDevolucion = idCausaDevolucion;
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
        hash += (idCausaDevolucion != null ? idCausaDevolucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CausaDevolucion)) {
            return false;
        }
        CausaDevolucion other = (CausaDevolucion) object;
        if ((this.idCausaDevolucion == null && other.idCausaDevolucion != null) || (this.idCausaDevolucion != null && !this.idCausaDevolucion.equals(other.idCausaDevolucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.CausaDevolucion[ idCausaDevolucion=" + idCausaDevolucion + " ]";
    }
    
}
