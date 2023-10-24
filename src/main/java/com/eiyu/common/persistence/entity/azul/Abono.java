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
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "abono", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Abono.findAll", query = "SELECT a FROM Abono a"),
    @NamedQuery(name = "Abono.findByCveRastreo", query = "SELECT a FROM Abono a WHERE a.abonoPK.cveRastreo = :cveRastreo"),
    @NamedQuery(name = "Abono.findByIdCveRastreo", query = "SELECT a FROM Abono a WHERE a.idCveRastreo = :idCveRastreo"),
    @NamedQuery(name = "Abono.findByNombreOrigen", query = "SELECT a FROM Abono a WHERE a.nombreOrigen = :nombreOrigen"),
    @NamedQuery(name = "Abono.findByRfcOrigen", query = "SELECT a FROM Abono a WHERE a.rfcOrigen = :rfcOrigen"),
    @NamedQuery(name = "Abono.findByCuentaOrigen", query = "SELECT a FROM Abono a WHERE a.cuentaOrigen = :cuentaOrigen"),
    @NamedQuery(name = "Abono.findByConceptoPago", query = "SELECT a FROM Abono a WHERE a.conceptoPago = :conceptoPago"),
    @NamedQuery(name = "Abono.findByRefCob", query = "SELECT a FROM Abono a WHERE a.refCob = :refCob"),
    @NamedQuery(name = "Abono.findByRefNum", query = "SELECT a FROM Abono a WHERE a.refNum = :refNum"),
    @NamedQuery(name = "Abono.findByNombreDestino", query = "SELECT a FROM Abono a WHERE a.nombreDestino = :nombreDestino"),
    @NamedQuery(name = "Abono.findByRfcDestino", query = "SELECT a FROM Abono a WHERE a.rfcDestino = :rfcDestino"),
    @NamedQuery(name = "Abono.findByCuentaDestino", query = "SELECT a FROM Abono a WHERE a.cuentaDestino = :cuentaDestino"),
    @NamedQuery(name = "Abono.findByFechaOperacion", query = "SELECT a FROM Abono a WHERE a.abonoPK.fechaOperacion = :fechaOperacion"),
    @NamedQuery(name = "Abono.findByFechaAceptado", query = "SELECT a FROM Abono a WHERE a.fechaAceptado = :fechaAceptado"),
    @NamedQuery(name = "Abono.findByFechaCancelado", query = "SELECT a FROM Abono a WHERE a.fechaCancelado = :fechaCancelado"),
    @NamedQuery(name = "Abono.findByFechaCreacion", query = "SELECT a FROM Abono a WHERE a.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Abono.findByFechaLiquidado", query = "SELECT a FROM Abono a WHERE a.fechaLiquidado = :fechaLiquidado"),
    @NamedQuery(name = "Abono.findByFechaRechazo", query = "SELECT a FROM Abono a WHERE a.fechaRechazo = :fechaRechazo"),
    @NamedQuery(name = "Abono.findByFirma", query = "SELECT a FROM Abono a WHERE a.firma = :firma"),
    @NamedQuery(name = "Abono.findByIdPeticion", query = "SELECT a FROM Abono a WHERE a.idPeticion = :idPeticion"),
    @NamedQuery(name = "Abono.findByIva", query = "SELECT a FROM Abono a WHERE a.iva = :iva"),
    @NamedQuery(name = "Abono.findByMontoAbono", query = "SELECT a FROM Abono a WHERE a.montoAbono = :montoAbono"),
    @NamedQuery(name = "Abono.findByIdBancoOrigen", query = "SELECT a FROM Abono a WHERE a.idBancoOrigen = :idBancoOrigen"),
    @NamedQuery(name = "Abono.findByIdBancoDestino", query = "SELECT a FROM Abono a WHERE a.idBancoDestino = :idBancoDestino"),
    @NamedQuery(name = "Abono.findByIdCausaCancelacion", query = "SELECT a FROM Abono a WHERE a.idCausaCancelacion = :idCausaCancelacion"),
    @NamedQuery(name = "Abono.findByIdCausaDevolucion", query = "SELECT a FROM Abono a WHERE a.idCausaDevolucion = :idCausaDevolucion"),
    @NamedQuery(name = "Abono.findByIdCausaRechazo", query = "SELECT a FROM Abono a WHERE a.idCausaRechazo = :idCausaRechazo"),
    @NamedQuery(name = "Abono.findByIdMovimiento", query = "SELECT a FROM Abono a WHERE a.idMovimiento = :idMovimiento"),
    @NamedQuery(name = "Abono.findByIdTipoCuantaDestino", query = "SELECT a FROM Abono a WHERE a.idTipoCuantaDestino = :idTipoCuantaDestino"),
    @NamedQuery(name = "Abono.findByIdTipoPago", query = "SELECT a FROM Abono a WHERE a.idTipoPago = :idTipoPago"),
    @NamedQuery(name = "Abono.findByIdEstadoPago", query = "SELECT a FROM Abono a WHERE a.idEstadoPago = :idEstadoPago"),
    @NamedQuery(name = "Abono.findByCveRastreoOrigen", query = "SELECT a FROM Abono a WHERE a.cveRastreoOrigen = :cveRastreoOrigen"),
    @NamedQuery(name = "Abono.findByInfoAdicional", query = "SELECT a FROM Abono a WHERE a.infoAdicional = :infoAdicional"),
    @NamedQuery(name = "Abono.findByFolioPaquete", query = "SELECT a FROM Abono a WHERE a.abonoPK.folioPaquete = :folioPaquete"),
    @NamedQuery(name = "Abono.findByFolio", query = "SELECT a FROM Abono a WHERE a.abonoPK.folio = :folio"),
    @NamedQuery(name = "Abono.findByFechaBanxico", query = "SELECT a FROM Abono a WHERE a.fechaBanxico = :fechaBanxico"),
    @NamedQuery(name = "Abono.findByCadenaEnrol", query = "SELECT a FROM Abono a WHERE a.cadenaEnrol = :cadenaEnrol"),
    @NamedQuery(name = "Abono.findByActCode", query = "SELECT a FROM Abono a WHERE a.actCode = :actCode"),
    @NamedQuery(name = "Abono.findByJson", query = "SELECT a FROM Abono a WHERE a.json = :json"),
    @NamedQuery(name = "Abono.findByPspei", query = "SELECT a FROM Abono a WHERE a.pspei = :pspei"),
    @NamedQuery(name = "Abono.findByCert", query = "SELECT a FROM Abono a WHERE a.cert = :cert"),
    @NamedQuery(name = "Abono.findByCanal", query = "SELECT a FROM Abono a WHERE a.canal = :canal"),
    @NamedQuery(name = "Abono.findByIdPblu", query = "SELECT a FROM Abono a WHERE a.idPblu = :idPblu"),
    @NamedQuery(name = "Abono.findByIdUdn", query = "SELECT a FROM Abono a WHERE a.idUdn = :idUdn")})
public class Abono implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AbonoPK abonoPK;
    @Basic(optional = false)
    @Column(name = "id_cve_rastreo", nullable = false)
    private int idCveRastreo;
    @Column(name = "nombre_origen", length = 255)
    private String nombreOrigen;
    @Column(name = "rfc_origen", length = 18)
    private String rfcOrigen;
    @Basic(optional = false)
    @Column(name = "cuenta_origen", nullable = false, length = 18)
    private String cuentaOrigen;
    @Column(name = "concepto_pago", length = 100)
    private String conceptoPago;
    @Column(name = "ref_cob", length = 100)
    private String refCob;
    @Column(name = "ref_num", length = 100)
    private String refNum;
    @Column(name = "nombre_destino", length = 255)
    private String nombreDestino;
    @Column(name = "rfc_destino", length = 18)
    private String rfcDestino;
    @Column(name = "cuenta_destino", length = 100)
    private String cuentaDestino;
    @Column(name = "fecha_aceptado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAceptado;
    @Column(name = "fecha_cancelado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCancelado;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "fecha_liquidado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLiquidado;
    @Column(name = "fecha_rechazo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRechazo;
    @Basic(optional = false)
    @Column(name = "firma", nullable = false, length = 800)
    private String firma;
    @Column(name = "id_peticion")
    private Integer idPeticion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "iva", precision = 12, scale = 2)
    private BigDecimal iva;
    @Column(name = "monto_abono", precision = 12, scale = 2)
    private BigDecimal montoAbono;
    @Basic(optional = false)
    @Column(name = "id_banco_origen", nullable = false)
    private int idBancoOrigen;
    @Basic(optional = false)
    @Column(name = "id_banco_destino", nullable = false)
    private int idBancoDestino;
    @Column(name = "id_causa_cancelacion")
    private Integer idCausaCancelacion;
    @Column(name = "id_causa_devolucion")
    private Integer idCausaDevolucion;
    @Column(name = "id_causa_rechazo")
    private Integer idCausaRechazo;
    @Basic(optional = false)
    @Column(name = "id_movimiento", nullable = false)
    private int idMovimiento;
    @Basic(optional = false)
    @Column(name = "id_tipo_cuanta_destino", nullable = false)
    private int idTipoCuantaDestino;
    @Basic(optional = false)
    @Column(name = "id_tipo_pago", nullable = false)
    private int idTipoPago;
    @Basic(optional = false)
    @Column(name = "id_estado_pago", nullable = false)
    private int idEstadoPago;
    @Column(name = "cve_rastreo_origen", length = 255)
    private String cveRastreoOrigen;
    @Column(name = "info adicional", length = 200)
    private String infoAdicional;
    @Column(name = "fecha_banxico")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBanxico;
    @Column(name = "cadena_enrol", length = 1000)
    private String cadenaEnrol;
    @Column(name = "act_code", length = 100)
    private String actCode;
    @Column(name = "json", length = 1000)
    private String json;
    @Column(name = "pspei")
    private Integer pspei;
    @Column(name = "cert")
    private Integer cert;
    @Column(name = "canal")
    private Integer canal;
    @Column(name = "id_pblu")
    private Integer idPblu;
    @Column(name = "id_udn")
    private Integer idUdn;

    public Abono() {
    }

    public Abono(AbonoPK abonoPK) {
        this.abonoPK = abonoPK;
    }

    public Abono(AbonoPK abonoPK, int idCveRastreo, String cuentaOrigen, String firma, int idBancoOrigen, int idBancoDestino, int idMovimiento, int idTipoCuantaDestino, int idTipoPago, int idEstadoPago) {
        this.abonoPK = abonoPK;
        this.idCveRastreo = idCveRastreo;
        this.cuentaOrigen = cuentaOrigen;
        this.firma = firma;
        this.idBancoOrigen = idBancoOrigen;
        this.idBancoDestino = idBancoDestino;
        this.idMovimiento = idMovimiento;
        this.idTipoCuantaDestino = idTipoCuantaDestino;
        this.idTipoPago = idTipoPago;
        this.idEstadoPago = idEstadoPago;
    }

    public Abono(String cveRastreo, Date fechaOperacion, int folioPaquete, int folio) {
        this.abonoPK = new AbonoPK(cveRastreo, fechaOperacion, folioPaquete, folio);
    }

    public AbonoPK getAbonoPK() {
        return abonoPK;
    }

    public void setAbonoPK(AbonoPK abonoPK) {
        this.abonoPK = abonoPK;
    }

    public int getIdCveRastreo() {
        return idCveRastreo;
    }

    public void setIdCveRastreo(int idCveRastreo) {
        this.idCveRastreo = idCveRastreo;
    }

    public String getNombreOrigen() {
        return nombreOrigen;
    }

    public void setNombreOrigen(String nombreOrigen) {
        this.nombreOrigen = nombreOrigen;
    }

    public String getRfcOrigen() {
        return rfcOrigen;
    }

    public void setRfcOrigen(String rfcOrigen) {
        this.rfcOrigen = rfcOrigen;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    public String getRefCob() {
        return refCob;
    }

    public void setRefCob(String refCob) {
        this.refCob = refCob;
    }

    public String getRefNum() {
        return refNum;
    }

    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public String getRfcDestino() {
        return rfcDestino;
    }

    public void setRfcDestino(String rfcDestino) {
        this.rfcDestino = rfcDestino;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public Date getFechaAceptado() {
        return fechaAceptado;
    }

    public void setFechaAceptado(Date fechaAceptado) {
        this.fechaAceptado = fechaAceptado;
    }

    public Date getFechaCancelado() {
        return fechaCancelado;
    }

    public void setFechaCancelado(Date fechaCancelado) {
        this.fechaCancelado = fechaCancelado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaLiquidado() {
        return fechaLiquidado;
    }

    public void setFechaLiquidado(Date fechaLiquidado) {
        this.fechaLiquidado = fechaLiquidado;
    }

    public Date getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Date fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getIdPeticion() {
        return idPeticion;
    }

    public void setIdPeticion(Integer idPeticion) {
        this.idPeticion = idPeticion;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getMontoAbono() {
        return montoAbono;
    }

    public void setMontoAbono(BigDecimal montoAbono) {
        this.montoAbono = montoAbono;
    }

    public int getIdBancoOrigen() {
        return idBancoOrigen;
    }

    public void setIdBancoOrigen(int idBancoOrigen) {
        this.idBancoOrigen = idBancoOrigen;
    }

    public int getIdBancoDestino() {
        return idBancoDestino;
    }

    public void setIdBancoDestino(int idBancoDestino) {
        this.idBancoDestino = idBancoDestino;
    }

    public Integer getIdCausaCancelacion() {
        return idCausaCancelacion;
    }

    public void setIdCausaCancelacion(Integer idCausaCancelacion) {
        this.idCausaCancelacion = idCausaCancelacion;
    }

    public Integer getIdCausaDevolucion() {
        return idCausaDevolucion;
    }

    public void setIdCausaDevolucion(Integer idCausaDevolucion) {
        this.idCausaDevolucion = idCausaDevolucion;
    }

    public Integer getIdCausaRechazo() {
        return idCausaRechazo;
    }

    public void setIdCausaRechazo(Integer idCausaRechazo) {
        this.idCausaRechazo = idCausaRechazo;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public int getIdTipoCuantaDestino() {
        return idTipoCuantaDestino;
    }

    public void setIdTipoCuantaDestino(int idTipoCuantaDestino) {
        this.idTipoCuantaDestino = idTipoCuantaDestino;
    }

    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public int getIdEstadoPago() {
        return idEstadoPago;
    }

    public void setIdEstadoPago(int idEstadoPago) {
        this.idEstadoPago = idEstadoPago;
    }

    public String getCveRastreoOrigen() {
        return cveRastreoOrigen;
    }

    public void setCveRastreoOrigen(String cveRastreoOrigen) {
        this.cveRastreoOrigen = cveRastreoOrigen;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public Date getFechaBanxico() {
        return fechaBanxico;
    }

    public void setFechaBanxico(Date fechaBanxico) {
        this.fechaBanxico = fechaBanxico;
    }

    public String getCadenaEnrol() {
        return cadenaEnrol;
    }

    public void setCadenaEnrol(String cadenaEnrol) {
        this.cadenaEnrol = cadenaEnrol;
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public Integer getPspei() {
        return pspei;
    }

    public void setPspei(Integer pspei) {
        this.pspei = pspei;
    }

    public Integer getCert() {
        return cert;
    }

    public void setCert(Integer cert) {
        this.cert = cert;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public Integer getIdPblu() {
        return idPblu;
    }

    public void setIdPblu(Integer idPblu) {
        this.idPblu = idPblu;
    }

    public Integer getIdUdn() {
        return idUdn;
    }

    public void setIdUdn(Integer idUdn) {
        this.idUdn = idUdn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (abonoPK != null ? abonoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abono)) {
            return false;
        }
        Abono other = (Abono) object;
        if ((this.abonoPK == null && other.abonoPK != null) || (this.abonoPK != null && !this.abonoPK.equals(other.abonoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Abono[ abonoPK=" + abonoPK + " ]";
    }
    
}
