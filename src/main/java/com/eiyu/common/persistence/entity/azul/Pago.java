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
@Table(name = "pago", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p"),
    @NamedQuery(name = "Pago.findByCveRastreo", query = "SELECT p FROM Pago p WHERE p.pagoPK.cveRastreo = :cveRastreo"),
    @NamedQuery(name = "Pago.findByIdCveRastreo", query = "SELECT p FROM Pago p WHERE p.idCveRastreo = :idCveRastreo"),
    @NamedQuery(name = "Pago.findByCuentaOrigen", query = "SELECT p FROM Pago p WHERE p.cuentaOrigen = :cuentaOrigen"),
    @NamedQuery(name = "Pago.findByConceptoPago", query = "SELECT p FROM Pago p WHERE p.conceptoPago = :conceptoPago"),
    @NamedQuery(name = "Pago.findByRefCob", query = "SELECT p FROM Pago p WHERE p.refCob = :refCob"),
    @NamedQuery(name = "Pago.findByRefNum", query = "SELECT p FROM Pago p WHERE p.refNum = :refNum"),
    @NamedQuery(name = "Pago.findByNombreDestino", query = "SELECT p FROM Pago p WHERE p.nombreDestino = :nombreDestino"),
    @NamedQuery(name = "Pago.findByRfcDestino", query = "SELECT p FROM Pago p WHERE p.rfcDestino = :rfcDestino"),
    @NamedQuery(name = "Pago.findByCuentaDestino", query = "SELECT p FROM Pago p WHERE p.cuentaDestino = :cuentaDestino"),
    @NamedQuery(name = "Pago.findByFechaOperacion", query = "SELECT p FROM Pago p WHERE p.fechaOperacion = :fechaOperacion"),
    @NamedQuery(name = "Pago.findByFechaAceptado", query = "SELECT p FROM Pago p WHERE p.fechaAceptado = :fechaAceptado"),
    @NamedQuery(name = "Pago.findByFechaCancelado", query = "SELECT p FROM Pago p WHERE p.fechaCancelado = :fechaCancelado"),
    @NamedQuery(name = "Pago.findByFechaCreacion", query = "SELECT p FROM Pago p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Pago.findByFechaLiquidado", query = "SELECT p FROM Pago p WHERE p.fechaLiquidado = :fechaLiquidado"),
    @NamedQuery(name = "Pago.findByFechaRechazo", query = "SELECT p FROM Pago p WHERE p.fechaRechazo = :fechaRechazo"),
    @NamedQuery(name = "Pago.findByFirma", query = "SELECT p FROM Pago p WHERE p.firma = :firma"),
    @NamedQuery(name = "Pago.findByIdPeticion", query = "SELECT p FROM Pago p WHERE p.idPeticion = :idPeticion"),
    @NamedQuery(name = "Pago.findByIva", query = "SELECT p FROM Pago p WHERE p.iva = :iva"),
    @NamedQuery(name = "Pago.findByMontoCargo", query = "SELECT p FROM Pago p WHERE p.montoCargo = :montoCargo"),
    @NamedQuery(name = "Pago.findByIdBancoOrigen", query = "SELECT p FROM Pago p WHERE p.idBancoOrigen = :idBancoOrigen"),
    @NamedQuery(name = "Pago.findByIdBancoDestino", query = "SELECT p FROM Pago p WHERE p.idBancoDestino = :idBancoDestino"),
    @NamedQuery(name = "Pago.findByIdCausaCancelacion", query = "SELECT p FROM Pago p WHERE p.idCausaCancelacion = :idCausaCancelacion"),
    @NamedQuery(name = "Pago.findByIdCausaDevolucion", query = "SELECT p FROM Pago p WHERE p.idCausaDevolucion = :idCausaDevolucion"),
    @NamedQuery(name = "Pago.findByIdCausaRechazo", query = "SELECT p FROM Pago p WHERE p.idCausaRechazo = :idCausaRechazo"),
    @NamedQuery(name = "Pago.findByIdMovimiento", query = "SELECT p FROM Pago p WHERE p.pagoPK.idMovimiento = :idMovimiento"),
    @NamedQuery(name = "Pago.findByIdTipoCuantaDestino", query = "SELECT p FROM Pago p WHERE p.idTipoCuantaDestino = :idTipoCuantaDestino"),
    @NamedQuery(name = "Pago.findByIdTipoPago", query = "SELECT p FROM Pago p WHERE p.idTipoPago = :idTipoPago"),
    @NamedQuery(name = "Pago.findByIdEstadoPago", query = "SELECT p FROM Pago p WHERE p.idEstadoPago = :idEstadoPago"),
    @NamedQuery(name = "Pago.findByCveRastreoOrigen", query = "SELECT p FROM Pago p WHERE p.cveRastreoOrigen = :cveRastreoOrigen"),
    @NamedQuery(name = "Pago.findByCveRastreoPblu", query = "SELECT p FROM Pago p WHERE p.cveRastreoPblu = :cveRastreoPblu"),
    @NamedQuery(name = "Pago.findByUuid", query = "SELECT p FROM Pago p WHERE p.uuid = :uuid"),
    @NamedQuery(name = "Pago.findByJson", query = "SELECT p FROM Pago p WHERE p.json = :json"),
    @NamedQuery(name = "Pago.findByEstadoAsp", query = "SELECT p FROM Pago p WHERE p.estadoAsp = :estadoAsp"),
    @NamedQuery(name = "Pago.findByEstadoCacao", query = "SELECT p FROM Pago p WHERE p.estadoCacao = :estadoCacao"),
    @NamedQuery(name = "Pago.findByLlave", query = "SELECT p FROM Pago p WHERE p.llave = :llave"),
    @NamedQuery(name = "Pago.findByEstadoPblu", query = "SELECT p FROM Pago p WHERE p.estadoPblu = :estadoPblu"),
    @NamedQuery(name = "Pago.findByFechaNotificacionPblu", query = "SELECT p FROM Pago p WHERE p.fechaNotificacionPblu = :fechaNotificacionPblu"),
    @NamedQuery(name = "Pago.findByIdError", query = "SELECT p FROM Pago p WHERE p.idError = :idError"),
    @NamedQuery(name = "Pago.findByInfoAdicional", query = "SELECT p FROM Pago p WHERE p.infoAdicional = :infoAdicional"),
    @NamedQuery(name = "Pago.findByFolioPaquete", query = "SELECT p FROM Pago p WHERE p.folioPaquete = :folioPaquete"),
    @NamedQuery(name = "Pago.findByFolio", query = "SELECT p FROM Pago p WHERE p.folio = :folio"),
    @NamedQuery(name = "Pago.findByFechaBanxico", query = "SELECT p FROM Pago p WHERE p.fechaBanxico = :fechaBanxico"),
    @NamedQuery(name = "Pago.findByIdPblu", query = "SELECT p FROM Pago p WHERE p.idPblu = :idPblu"),
    @NamedQuery(name = "Pago.findByIdUdn", query = "SELECT p FROM Pago p WHERE p.idUdn = :idUdn")})
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PagoPK pagoPK;
    @Basic(optional = false)
    @Column(name = "id_cve_rastreo", nullable = false)
    private int idCveRastreo;
    @Basic(optional = false)
    @Column(name = "cuenta_origen", nullable = false, length = 18)
    private String cuentaOrigen;
    @Column(name = "concepto_pago", length = 100)
    private String conceptoPago;
    @Column(name = "ref_cob", length = 100)
    private String refCob;
    @Column(name = "ref_num", length = 100)
    private String refNum;
    @Column(name = "nombre_destino", length = 100)
    private String nombreDestino;
    @Column(name = "rfc_destino", length = 20)
    private String rfcDestino;
    @Column(name = "cuenta_destino", length = 100)
    private String cuentaDestino;
    @Column(name = "fecha_operacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOperacion;
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
    @Column(name = "monto_cargo", precision = 12, scale = 2)
    private BigDecimal montoCargo;
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
    @Column(name = "cve_rastreo_pblu", length = 40)
    private String cveRastreoPblu;
    @Column(name = "uuid", length = 40)
    private String uuid;
    @Column(name = "json", length = 1000)
    private String json;
    @Column(name = "estado_asp")
    private Integer estadoAsp;
    @Column(name = "estado_cacao")
    private Integer estadoCacao;
    @Column(name = "llave")
    private Integer llave;
    @Column(name = "estado_pblu")
    private Integer estadoPblu;
    @Column(name = "fecha_notificacion_pblu")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNotificacionPblu;
    @Column(name = "id_error")
    private Integer idError;
    @Column(name = "info_adicional", length = 200)
    private String infoAdicional;
    @Column(name = "folio_paquete")
    private Integer folioPaquete;
    @Column(name = "folio")
    private Integer folio;
    @Column(name = "fecha_banxico")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBanxico;
    @Column(name = "id_pblu")
    private Integer idPblu;
    @Column(name = "id_udn")
    private Integer idUdn;

    public Pago() {
    }

    public Pago(PagoPK pagoPK) {
        this.pagoPK = pagoPK;
    }

    public Pago(PagoPK pagoPK, int idCveRastreo, String cuentaOrigen, String firma, int idBancoOrigen, int idBancoDestino, int idTipoCuantaDestino, int idTipoPago, int idEstadoPago) {
        this.pagoPK = pagoPK;
        this.idCveRastreo = idCveRastreo;
        this.cuentaOrigen = cuentaOrigen;
        this.firma = firma;
        this.idBancoOrigen = idBancoOrigen;
        this.idBancoDestino = idBancoDestino;
        this.idTipoCuantaDestino = idTipoCuantaDestino;
        this.idTipoPago = idTipoPago;
        this.idEstadoPago = idEstadoPago;
    }

    public Pago(String cveRastreo, int idMovimiento) {
        this.pagoPK = new PagoPK(cveRastreo, idMovimiento);
    }

    public PagoPK getPagoPK() {
        return pagoPK;
    }

    public void setPagoPK(PagoPK pagoPK) {
        this.pagoPK = pagoPK;
    }

    public int getIdCveRastreo() {
        return idCveRastreo;
    }

    public void setIdCveRastreo(int idCveRastreo) {
        this.idCveRastreo = idCveRastreo;
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

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
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

    public BigDecimal getMontoCargo() {
        return montoCargo;
    }

    public void setMontoCargo(BigDecimal montoCargo) {
        this.montoCargo = montoCargo;
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

    public String getCveRastreoPblu() {
        return cveRastreoPblu;
    }

    public void setCveRastreoPblu(String cveRastreoPblu) {
        this.cveRastreoPblu = cveRastreoPblu;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public Integer getEstadoAsp() {
        return estadoAsp;
    }

    public void setEstadoAsp(Integer estadoAsp) {
        this.estadoAsp = estadoAsp;
    }

    public Integer getEstadoCacao() {
        return estadoCacao;
    }

    public void setEstadoCacao(Integer estadoCacao) {
        this.estadoCacao = estadoCacao;
    }

    public Integer getLlave() {
        return llave;
    }

    public void setLlave(Integer llave) {
        this.llave = llave;
    }

    public Integer getEstadoPblu() {
        return estadoPblu;
    }

    public void setEstadoPblu(Integer estadoPblu) {
        this.estadoPblu = estadoPblu;
    }

    public Date getFechaNotificacionPblu() {
        return fechaNotificacionPblu;
    }

    public void setFechaNotificacionPblu(Date fechaNotificacionPblu) {
        this.fechaNotificacionPblu = fechaNotificacionPblu;
    }

    public Integer getIdError() {
        return idError;
    }

    public void setIdError(Integer idError) {
        this.idError = idError;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public Integer getFolioPaquete() {
        return folioPaquete;
    }

    public void setFolioPaquete(Integer folioPaquete) {
        this.folioPaquete = folioPaquete;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Date getFechaBanxico() {
        return fechaBanxico;
    }

    public void setFechaBanxico(Date fechaBanxico) {
        this.fechaBanxico = fechaBanxico;
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
        hash += (pagoPK != null ? pagoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.pagoPK == null && other.pagoPK != null) || (this.pagoPK != null && !this.pagoPK.equals(other.pagoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Pago[ pagoPK=" + pagoPK + " ]";
    }
    
}
