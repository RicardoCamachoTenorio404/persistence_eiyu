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
@Table(name = "udn", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Udn.findAll", query = "SELECT u FROM Udn u"),
    @NamedQuery(name = "Udn.findByIdUdn", query = "SELECT u FROM Udn u WHERE u.idUdn = :idUdn"),
    @NamedQuery(name = "Udn.findByDescripcion", query = "SELECT u FROM Udn u WHERE u.descripcion = :descripcion"),
    @NamedQuery(name = "Udn.findBySaldo", query = "SELECT u FROM Udn u WHERE u.saldo = :saldo"),
    @NamedQuery(name = "Udn.findByActivo", query = "SELECT u FROM Udn u WHERE u.activo = :activo"),
    @NamedQuery(name = "Udn.findByFechaCreacion", query = "SELECT u FROM Udn u WHERE u.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Udn.findByUsuarioCreacion", query = "SELECT u FROM Udn u WHERE u.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "Udn.findByPblu", query = "SELECT u FROM Udn u WHERE u.pblu = :pblu"),
    @NamedQuery(name = "Udn.findBySaldoMin", query = "SELECT u FROM Udn u WHERE u.saldoMin = :saldoMin"),
    @NamedQuery(name = "Udn.findByNotificacionActiva", query = "SELECT u FROM Udn u WHERE u.notificacionActiva = :notificacionActiva"),
    @NamedQuery(name = "Udn.findByPrefijoClabe", query = "SELECT u FROM Udn u WHERE u.prefijoClabe = :prefijoClabe"),
    @NamedQuery(name = "Udn.findByContadorClabe", query = "SELECT u FROM Udn u WHERE u.contadorClabe = :contadorClabe"),
    @NamedQuery(name = "Udn.findByClabe", query = "SELECT u FROM Udn u WHERE u.clabe = :clabe"),
    @NamedQuery(name = "Udn.findByMontoLimite", query = "SELECT u FROM Udn u WHERE u.montoLimite = :montoLimite")})
public class Udn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_udn", nullable = false)
    private Integer idUdn;
    @Basic(optional = false)
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "saldo", nullable = false, precision = 12, scale = 2)
    private BigDecimal saldo;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;
    @Basic(optional = false)
    @Column(name = "pblu", nullable = false)
    private int pblu;
    @Basic(optional = false)
    @Column(name = "saldo_min", nullable = false, precision = 12, scale = 2)
    private BigDecimal saldoMin;
    @Basic(optional = false)
    @Column(name = "notificacion_activa", nullable = false)
    private boolean notificacionActiva;
    @Column(name = "prefijo_clabe", length = 6)
    private String prefijoClabe;
    @Column(name = "contador_clabe")
    private Integer contadorClabe;
    @Column(name = "clabe", length = 20)
    private String clabe;
    @Column(name = "monto_limite", precision = 12, scale = 2)
    private BigDecimal montoLimite;

    public Udn() {
    }

    public Udn(Integer idUdn) {
        this.idUdn = idUdn;
    }

    public Udn(Integer idUdn, String descripcion, BigDecimal saldo, boolean activo, int pblu, BigDecimal saldoMin, boolean notificacionActiva) {
        this.idUdn = idUdn;
        this.descripcion = descripcion;
        this.saldo = saldo;
        this.activo = activo;
        this.pblu = pblu;
        this.saldoMin = saldoMin;
        this.notificacionActiva = notificacionActiva;
    }

    public Integer getIdUdn() {
        return idUdn;
    }

    public void setIdUdn(Integer idUdn) {
        this.idUdn = idUdn;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
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

    public int getPblu() {
        return pblu;
    }

    public void setPblu(int pblu) {
        this.pblu = pblu;
    }

    public BigDecimal getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(BigDecimal saldoMin) {
        this.saldoMin = saldoMin;
    }

    public boolean getNotificacionActiva() {
        return notificacionActiva;
    }

    public void setNotificacionActiva(boolean notificacionActiva) {
        this.notificacionActiva = notificacionActiva;
    }

    public String getPrefijoClabe() {
        return prefijoClabe;
    }

    public void setPrefijoClabe(String prefijoClabe) {
        this.prefijoClabe = prefijoClabe;
    }

    public Integer getContadorClabe() {
        return contadorClabe;
    }

    public void setContadorClabe(Integer contadorClabe) {
        this.contadorClabe = contadorClabe;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public BigDecimal getMontoLimite() {
        return montoLimite;
    }

    public void setMontoLimite(BigDecimal montoLimite) {
        this.montoLimite = montoLimite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUdn != null ? idUdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Udn)) {
            return false;
        }
        Udn other = (Udn) object;
        if ((this.idUdn == null && other.idUdn != null) || (this.idUdn != null && !this.idUdn.equals(other.idUdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Udn[ idUdn=" + idUdn + " ]";
    }
    
}
