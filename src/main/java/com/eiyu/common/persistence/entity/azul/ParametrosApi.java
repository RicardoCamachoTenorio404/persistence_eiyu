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
@Table(name = "parametros_api", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "ParametrosApi.findAll", query = "SELECT p FROM ParametrosApi p"),
    @NamedQuery(name = "ParametrosApi.findByIdParam", query = "SELECT p FROM ParametrosApi p WHERE p.idParam = :idParam"),
    @NamedQuery(name = "ParametrosApi.findByVersion", query = "SELECT p FROM ParametrosApi p WHERE p.version = :version"),
    @NamedQuery(name = "ParametrosApi.findByDescripcion", query = "SELECT p FROM ParametrosApi p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "ParametrosApi.findByActivo", query = "SELECT p FROM ParametrosApi p WHERE p.activo = :activo"),
    @NamedQuery(name = "ParametrosApi.findByValor", query = "SELECT p FROM ParametrosApi p WHERE p.valor = :valor"),
    @NamedQuery(name = "ParametrosApi.findByFechaCreacion", query = "SELECT p FROM ParametrosApi p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "ParametrosApi.findByUsuarioCreacion", query = "SELECT p FROM ParametrosApi p WHERE p.usuarioCreacion = :usuarioCreacion")})
public class ParametrosApi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_param", nullable = false)
    private Integer idParam;
    @Basic(optional = false)
    @Column(name = "version", nullable = false)
    private int version;
    @Basic(optional = false)
    @Column(name = "descripcion", nullable = false, length = 40)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Basic(optional = false)
    @Column(name = "valor", nullable = false, length = 100)
    private String valor;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;

    public ParametrosApi() {
    }

    public ParametrosApi(Integer idParam) {
        this.idParam = idParam;
    }

    public ParametrosApi(Integer idParam, int version, String descripcion, boolean activo, String valor) {
        this.idParam = idParam;
        this.version = version;
        this.descripcion = descripcion;
        this.activo = activo;
        this.valor = valor;
    }

    public Integer getIdParam() {
        return idParam;
    }

    public void setIdParam(Integer idParam) {
        this.idParam = idParam;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
        hash += (idParam != null ? idParam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosApi)) {
            return false;
        }
        ParametrosApi other = (ParametrosApi) object;
        if ((this.idParam == null && other.idParam != null) || (this.idParam != null && !this.idParam.equals(other.idParam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.ParametrosApi[ idParam=" + idParam + " ]";
    }
    
}
