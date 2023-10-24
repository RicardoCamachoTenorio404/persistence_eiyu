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
@Table(name = "cuenta", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c"),
    @NamedQuery(name = "Cuenta.findByClabe", query = "SELECT c FROM Cuenta c WHERE c.clabe = :clabe"),
    @NamedQuery(name = "Cuenta.findByUdn", query = "SELECT c FROM Cuenta c WHERE c.udn = :udn"),
    @NamedQuery(name = "Cuenta.findByEstado", query = "SELECT c FROM Cuenta c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cuenta.findByToken", query = "SELECT c FROM Cuenta c WHERE c.token = :token"),
    @NamedQuery(name = "Cuenta.findByActivo", query = "SELECT c FROM Cuenta c WHERE c.activo = :activo"),
    @NamedQuery(name = "Cuenta.findByFechaCreacion", query = "SELECT c FROM Cuenta c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Cuenta.findByUsuarioCreacion", query = "SELECT c FROM Cuenta c WHERE c.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "Cuenta.findByIdPersona", query = "SELECT c FROM Cuenta c WHERE c.idPersona = :idPersona"),
    @NamedQuery(name = "Cuenta.findByIdEstatusAhorro", query = "SELECT c FROM Cuenta c WHERE c.idEstatusAhorro = :idEstatusAhorro"),
    @NamedQuery(name = "Cuenta.findByAspCuenta", query = "SELECT c FROM Cuenta c WHERE c.aspCuenta = :aspCuenta"),
    @NamedQuery(name = "Cuenta.findByAspIdCuenta", query = "SELECT c FROM Cuenta c WHERE c.aspIdCuenta = :aspIdCuenta"),
    @NamedQuery(name = "Cuenta.findByUuid", query = "SELECT c FROM Cuenta c WHERE c.uuid = :uuid"),
    @NamedQuery(name = "Cuenta.findByBluBlackList", query = "SELECT c FROM Cuenta c WHERE c.bluBlackList = :bluBlackList"),
    @NamedQuery(name = "Cuenta.findByBluLimite", query = "SELECT c FROM Cuenta c WHERE c.bluLimite = :bluLimite"),
    @NamedQuery(name = "Cuenta.findByMontoPermitido", query = "SELECT c FROM Cuenta c WHERE c.montoPermitido = :montoPermitido"),
    @NamedQuery(name = "Cuenta.findByPblu", query = "SELECT c FROM Cuenta c WHERE c.pblu = :pblu"),
    @NamedQuery(name = "Cuenta.findByNivel", query = "SELECT c FROM Cuenta c WHERE c.nivel = :nivel"),
    @NamedQuery(name = "Cuenta.findByFechaActualizacion", query = "SELECT c FROM Cuenta c WHERE c.fechaActualizacion = :fechaActualizacion"),
    @NamedQuery(name = "Cuenta.findByUsuarioActualizacion", query = "SELECT c FROM Cuenta c WHERE c.usuarioActualizacion = :usuarioActualizacion"),
    @NamedQuery(name = "Cuenta.findByInfoAdicional", query = "SELECT c FROM Cuenta c WHERE c.infoAdicional = :infoAdicional"),
    @NamedQuery(name = "Cuenta.findByNoNotificarAbono", query = "SELECT c FROM Cuenta c WHERE c.noNotificarAbono = :noNotificarAbono"),
    @NamedQuery(name = "Cuenta.findByActualizar", query = "SELECT c FROM Cuenta c WHERE c.actualizar = :actualizar")})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "clabe", nullable = false, length = 20)
    private String clabe;
    @Basic(optional = false)
    @Column(name = "udn", nullable = false)
    private int udn;
    @Basic(optional = false)
    @Column(name = "estado", nullable = false, length = 10)
    private String estado;
    @Column(name = "token", length = 8)
    private String token;
    @Basic(optional = false)
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;
    @Column(name = "id_persona")
    private Integer idPersona;
    @Column(name = "id_estatus_ahorro")
    private Integer idEstatusAhorro;
    @Column(name = "asp_cuenta", length = 20)
    private String aspCuenta;
    @Column(name = "asp_id_cuenta")
    private Integer aspIdCuenta;
    @Column(name = "uuid", length = 40)
    private String uuid;
    @Column(name = "blu_black_list")
    private Boolean bluBlackList;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "blu_limite", precision = 12, scale = 2)
    private BigDecimal bluLimite;
    @Column(name = "monto_permitido")
    private Boolean montoPermitido;
    @Column(name = "pblu")
    private Integer pblu;
    @Column(name = "nivel")
    private Integer nivel;
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    @Column(name = "usuario_actualizacion", length = 100)
    private String usuarioActualizacion;
    @Column(name = "info_adicional", length = 50)
    private String infoAdicional;
    @Column(name = "no_notificar_abono")
    private Boolean noNotificarAbono;
    @Column(name = "actualizar")
    private Integer actualizar;

    public Cuenta() {
    }

    public Cuenta(String clabe) {
        this.clabe = clabe;
    }

    public Cuenta(String clabe, int udn, String estado, boolean activo) {
        this.clabe = clabe;
        this.udn = udn;
        this.estado = estado;
        this.activo = activo;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public int getUdn() {
        return udn;
    }

    public void setUdn(int udn) {
        this.udn = udn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIdEstatusAhorro() {
        return idEstatusAhorro;
    }

    public void setIdEstatusAhorro(Integer idEstatusAhorro) {
        this.idEstatusAhorro = idEstatusAhorro;
    }

    public String getAspCuenta() {
        return aspCuenta;
    }

    public void setAspCuenta(String aspCuenta) {
        this.aspCuenta = aspCuenta;
    }

    public Integer getAspIdCuenta() {
        return aspIdCuenta;
    }

    public void setAspIdCuenta(Integer aspIdCuenta) {
        this.aspIdCuenta = aspIdCuenta;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getBluBlackList() {
        return bluBlackList;
    }

    public void setBluBlackList(Boolean bluBlackList) {
        this.bluBlackList = bluBlackList;
    }

    public BigDecimal getBluLimite() {
        return bluLimite;
    }

    public void setBluLimite(BigDecimal bluLimite) {
        this.bluLimite = bluLimite;
    }

    public Boolean getMontoPermitido() {
        return montoPermitido;
    }

    public void setMontoPermitido(Boolean montoPermitido) {
        this.montoPermitido = montoPermitido;
    }

    public Integer getPblu() {
        return pblu;
    }

    public void setPblu(Integer pblu) {
        this.pblu = pblu;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public Boolean getNoNotificarAbono() {
        return noNotificarAbono;
    }

    public void setNoNotificarAbono(Boolean noNotificarAbono) {
        this.noNotificarAbono = noNotificarAbono;
    }

    public Integer getActualizar() {
        return actualizar;
    }

    public void setActualizar(Integer actualizar) {
        this.actualizar = actualizar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clabe != null ? clabe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.clabe == null && other.clabe != null) || (this.clabe != null && !this.clabe.equals(other.clabe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Cuenta[ clabe=" + clabe + " ]";
    }
    
}
