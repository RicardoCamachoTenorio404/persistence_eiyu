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
@Table(name = "certificado", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Certificado.findAll", query = "SELECT c FROM Certificado c"),
    @NamedQuery(name = "Certificado.findByIdCertificado", query = "SELECT c FROM Certificado c WHERE c.idCertificado = :idCertificado"),
    @NamedQuery(name = "Certificado.findByIdPblu", query = "SELECT c FROM Certificado c WHERE c.idPblu = :idPblu"),
    @NamedQuery(name = "Certificado.findByNumeroSerie", query = "SELECT c FROM Certificado c WHERE c.numeroSerie = :numeroSerie"),
    @NamedQuery(name = "Certificado.findByRuta", query = "SELECT c FROM Certificado c WHERE c.ruta = :ruta"),
    @NamedQuery(name = "Certificado.findByActivo", query = "SELECT c FROM Certificado c WHERE c.activo = :activo"),
    @NamedQuery(name = "Certificado.findByFechaCreacion", query = "SELECT c FROM Certificado c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Certificado.findByUsuarioCreacion", query = "SELECT c FROM Certificado c WHERE c.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "Certificado.findByTipo", query = "SELECT c FROM Certificado c WHERE c.tipo = :tipo")})
public class Certificado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_certificado", nullable = false)
    private Integer idCertificado;
    @Basic(optional = false)
    @Column(name = "id_pblu", nullable = false)
    private int idPblu;
    @Basic(optional = false)
    @Column(name = "numero_serie", nullable = false, length = 100)
    private String numeroSerie;
    @Basic(optional = false)
    @Column(name = "ruta", nullable = false, length = 500)
    private String ruta;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;
    @Column(name = "tipo")
    private Character tipo;

    public Certificado() {
    }

    public Certificado(Integer idCertificado) {
        this.idCertificado = idCertificado;
    }

    public Certificado(Integer idCertificado, int idPblu, String numeroSerie, String ruta, boolean activo) {
        this.idCertificado = idCertificado;
        this.idPblu = idPblu;
        this.numeroSerie = numeroSerie;
        this.ruta = ruta;
        this.activo = activo;
    }

    public Integer getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(Integer idCertificado) {
        this.idCertificado = idCertificado;
    }

    public int getIdPblu() {
        return idPblu;
    }

    public void setIdPblu(int idPblu) {
        this.idPblu = idPblu;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
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

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCertificado != null ? idCertificado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Certificado)) {
            return false;
        }
        Certificado other = (Certificado) object;
        if ((this.idCertificado == null && other.idCertificado != null) || (this.idCertificado != null && !this.idCertificado.equals(other.idCertificado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Certificado[ idCertificado=" + idCertificado + " ]";
    }
    
}
