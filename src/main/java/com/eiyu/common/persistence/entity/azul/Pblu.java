/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "pblu", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Pblu.findAll", query = "SELECT p FROM Pblu p"),
    @NamedQuery(name = "Pblu.findByIdPblu", query = "SELECT p FROM Pblu p WHERE p.idPblu = :idPblu"),
    @NamedQuery(name = "Pblu.findByPrefijoPblu", query = "SELECT p FROM Pblu p WHERE p.prefijoPblu = :prefijoPblu"),
    @NamedQuery(name = "Pblu.findByIdTipoPart", query = "SELECT p FROM Pblu p WHERE p.idTipoPart = :idTipoPart"),
    @NamedQuery(name = "Pblu.findByClabePblu", query = "SELECT p FROM Pblu p WHERE p.clabePblu = :clabePblu"),
    @NamedQuery(name = "Pblu.findByDescripcion", query = "SELECT p FROM Pblu p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Pblu.findByActivo", query = "SELECT p FROM Pblu p WHERE p.activo = :activo"),
    @NamedQuery(name = "Pblu.findByFechaCreacion", query = "SELECT p FROM Pblu p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Pblu.findByUsuarioCreacion", query = "SELECT p FROM Pblu p WHERE p.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "Pblu.findByContadorUdn", query = "SELECT p FROM Pblu p WHERE p.contadorUdn = :contadorUdn"),
    @NamedQuery(name = "Pblu.findByRfc", query = "SELECT p FROM Pblu p WHERE p.rfc = :rfc"),
    @NamedQuery(name = "Pblu.findByDomicilio", query = "SELECT p FROM Pblu p WHERE p.domicilio = :domicilio"),
    @NamedQuery(name = "Pblu.findByLocalidad", query = "SELECT p FROM Pblu p WHERE p.localidad = :localidad"),
    @NamedQuery(name = "Pblu.findByColonia", query = "SELECT p FROM Pblu p WHERE p.colonia = :colonia"),
    @NamedQuery(name = "Pblu.findByCodigoPostal", query = "SELECT p FROM Pblu p WHERE p.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Pblu.findByTelefono", query = "SELECT p FROM Pblu p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Pblu.findByEmail", query = "SELECT p FROM Pblu p WHERE p.email = :email"),
    @NamedQuery(name = "Pblu.findByFechaInicioMonto", query = "SELECT p FROM Pblu p WHERE p.fechaInicioMonto = :fechaInicioMonto"),
    @NamedQuery(name = "Pblu.findByFechaFinMonto", query = "SELECT p FROM Pblu p WHERE p.fechaFinMonto = :fechaFinMonto"),
    @NamedQuery(name = "Pblu.findByBluLimite", query = "SELECT p FROM Pblu p WHERE p.bluLimite = :bluLimite"),
    @NamedQuery(name = "Pblu.findByAliado", query = "SELECT p FROM Pblu p WHERE p.aliado = :aliado")})
public class Pblu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pblu", nullable = false)
    private Integer idPblu;
    @Column(name = "prefijo_pblu")
    private Integer prefijoPblu;
    @Basic(optional = false)
    @Column(name = "id_tipo_part", nullable = false)
    private int idTipoPart;
    @Basic(optional = false)
    @Column(name = "clabe_pblu", nullable = false, length = 18)
    private String clabePblu;
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
    @Column(name = "contador_udn")
    private Integer contadorUdn;
    @Column(name = "rfc", length = 15)
    private String rfc;
    @Column(name = "domicilio", length = 50)
    private String domicilio;
    @Column(name = "localidad", length = 50)
    private String localidad;
    @Column(name = "colonia", length = 50)
    private String colonia;
    @Column(name = "codigo_postal", length = 7)
    private String codigoPostal;
    @Column(name = "telefono", length = 18)
    private String telefono;
    @Column(name = "email", length = 30)
    private String email;
    @Column(name = "fecha_inicio_monto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioMonto;
    @Column(name = "fecha_fin_monto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinMonto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "blu_limite", precision = 12, scale = 2)
    private BigDecimal bluLimite;
    @Column(name = "aliado", length = 20)
    private String aliado;

    public Pblu() {
    }

    public Pblu(Integer idPblu) {
        this.idPblu = idPblu;
    }

    public Pblu(Integer idPblu, int idTipoPart, String clabePblu, String descripcion, boolean activo) {
        this.idPblu = idPblu;
        this.idTipoPart = idTipoPart;
        this.clabePblu = clabePblu;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdPblu() {
        return idPblu;
    }

    public void setIdPblu(Integer idPblu) {
        this.idPblu = idPblu;
    }

    public Integer getPrefijoPblu() {
        return prefijoPblu;
    }

    public void setPrefijoPblu(Integer prefijoPblu) {
        this.prefijoPblu = prefijoPblu;
    }

    public int getIdTipoPart() {
        return idTipoPart;
    }

    public void setIdTipoPart(int idTipoPart) {
        this.idTipoPart = idTipoPart;
    }

    public String getClabePblu() {
        return clabePblu;
    }

    public void setClabePblu(String clabePblu) {
        this.clabePblu = clabePblu;
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

    public Integer getContadorUdn() {
        return contadorUdn;
    }

    public void setContadorUdn(Integer contadorUdn) {
        this.contadorUdn = contadorUdn;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaInicioMonto() {
        return fechaInicioMonto;
    }

    public void setFechaInicioMonto(Date fechaInicioMonto) {
        this.fechaInicioMonto = fechaInicioMonto;
    }

    public Date getFechaFinMonto() {
        return fechaFinMonto;
    }

    public void setFechaFinMonto(Date fechaFinMonto) {
        this.fechaFinMonto = fechaFinMonto;
    }

    public BigDecimal getBluLimite() {
        return bluLimite;
    }

    public void setBluLimite(BigDecimal bluLimite) {
        this.bluLimite = bluLimite;
    }

    public String getAliado() {
        return aliado;
    }

    public void setAliado(String aliado) {
        this.aliado = aliado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPblu != null ? idPblu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pblu)) {
            return false;
        }
        Pblu other = (Pblu) object;
        if ((this.idPblu == null && other.idPblu != null) || (this.idPblu != null && !this.idPblu.equals(other.idPblu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Pblu[ idPblu=" + idPblu + " ]";
    }
    
}
