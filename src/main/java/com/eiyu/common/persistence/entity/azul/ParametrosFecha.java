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
@Table(name = "parametros_fecha", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "ParametrosFecha.findAll", query = "SELECT p FROM ParametrosFecha p"),
    @NamedQuery(name = "ParametrosFecha.findByIdFecha", query = "SELECT p FROM ParametrosFecha p WHERE p.idFecha = :idFecha"),
    @NamedQuery(name = "ParametrosFecha.findByVersion", query = "SELECT p FROM ParametrosFecha p WHERE p.version = :version"),
    @NamedQuery(name = "ParametrosFecha.findByDescripcion", query = "SELECT p FROM ParametrosFecha p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "ParametrosFecha.findByActivo", query = "SELECT p FROM ParametrosFecha p WHERE p.activo = :activo"),
    @NamedQuery(name = "ParametrosFecha.findByFechaCreacion", query = "SELECT p FROM ParametrosFecha p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "ParametrosFecha.findByFecha", query = "SELECT p FROM ParametrosFecha p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "ParametrosFecha.findByUsuarioCreacion", query = "SELECT p FROM ParametrosFecha p WHERE p.usuarioCreacion = :usuarioCreacion")})
public class ParametrosFecha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fecha", nullable = false)
    private Integer idFecha;
    @Basic(optional = false)
    @Column(name = "version", nullable = false)
    private int version;
    @Basic(optional = false)
    @Column(name = "descripcion", nullable = false, length = 40)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public ParametrosFecha() {
    }

    public ParametrosFecha(Integer idFecha) {
        this.idFecha = idFecha;
    }

    public ParametrosFecha(Integer idFecha, int version, String descripcion, boolean activo) {
        this.idFecha = idFecha;
        this.version = version;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdFecha() {
        return idFecha;
    }

    public void setIdFecha(Integer idFecha) {
        this.idFecha = idFecha;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        hash += (idFecha != null ? idFecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosFecha)) {
            return false;
        }
        ParametrosFecha other = (ParametrosFecha) object;
        if ((this.idFecha == null && other.idFecha != null) || (this.idFecha != null && !this.idFecha.equals(other.idFecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.ParametrosFecha[ idFecha=" + idFecha + " ]";
    }
    
}
