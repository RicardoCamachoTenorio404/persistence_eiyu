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
@Table(name = "persona", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona"),
    @NamedQuery(name = "Persona.findByTipoPersona", query = "SELECT p FROM Persona p WHERE p.tipoPersona = :tipoPersona"),
    @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Persona.findByApellidoPaterno", query = "SELECT p FROM Persona p WHERE p.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Persona.findByApellidoMaterno", query = "SELECT p FROM Persona p WHERE p.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Persona.findByRazonSocial", query = "SELECT p FROM Persona p WHERE p.razonSocial = :razonSocial"),
    @NamedQuery(name = "Persona.findByRfc", query = "SELECT p FROM Persona p WHERE p.rfc = :rfc"),
    @NamedQuery(name = "Persona.findByCurp", query = "SELECT p FROM Persona p WHERE p.curp = :curp"),
    @NamedQuery(name = "Persona.findByLugarNacimiento", query = "SELECT p FROM Persona p WHERE p.lugarNacimiento = :lugarNacimiento"),
    @NamedQuery(name = "Persona.findByIdNacionalidad", query = "SELECT p FROM Persona p WHERE p.idNacionalidad = :idNacionalidad"),
    @NamedQuery(name = "Persona.findByIdEstadoCivil", query = "SELECT p FROM Persona p WHERE p.idEstadoCivil = :idEstadoCivil"),
    @NamedQuery(name = "Persona.findByTelefono", query = "SELECT p FROM Persona p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Persona.findByCelular", query = "SELECT p FROM Persona p WHERE p.celular = :celular"),
    @NamedQuery(name = "Persona.findByCorreo", query = "SELECT p FROM Persona p WHERE p.correo = :correo"),
    @NamedQuery(name = "Persona.findByIdOcupacion", query = "SELECT p FROM Persona p WHERE p.idOcupacion = :idOcupacion"),
    @NamedQuery(name = "Persona.findByFechaNacimiento", query = "SELECT p FROM Persona p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Persona.findBySexo", query = "SELECT p FROM Persona p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Persona.findByIdGradoEstudios", query = "SELECT p FROM Persona p WHERE p.idGradoEstudios = :idGradoEstudios"),
    @NamedQuery(name = "Persona.findByCalle", query = "SELECT p FROM Persona p WHERE p.calle = :calle"),
    @NamedQuery(name = "Persona.findByNumeroExterior", query = "SELECT p FROM Persona p WHERE p.numeroExterior = :numeroExterior"),
    @NamedQuery(name = "Persona.findByNumeroInterior", query = "SELECT p FROM Persona p WHERE p.numeroInterior = :numeroInterior"),
    @NamedQuery(name = "Persona.findByIdColonia", query = "SELECT p FROM Persona p WHERE p.idColonia = :idColonia"),
    @NamedQuery(name = "Persona.findByIdCodigoPostal", query = "SELECT p FROM Persona p WHERE p.idCodigoPostal = :idCodigoPostal"),
    @NamedQuery(name = "Persona.findByReferenciaDireccion", query = "SELECT p FROM Persona p WHERE p.referenciaDireccion = :referenciaDireccion"),
    @NamedQuery(name = "Persona.findByIngresoMensual", query = "SELECT p FROM Persona p WHERE p.ingresoMensual = :ingresoMensual"),
    @NamedQuery(name = "Persona.findByMontoMaximoAhorro", query = "SELECT p FROM Persona p WHERE p.montoMaximoAhorro = :montoMaximoAhorro"),
    @NamedQuery(name = "Persona.findByIdPuesto", query = "SELECT p FROM Persona p WHERE p.idPuesto = :idPuesto"),
    @NamedQuery(name = "Persona.findByIdGiro", query = "SELECT p FROM Persona p WHERE p.idGiro = :idGiro"),
    @NamedQuery(name = "Persona.findByIdDestinoFondo", query = "SELECT p FROM Persona p WHERE p.idDestinoFondo = :idDestinoFondo"),
    @NamedQuery(name = "Persona.findByIdLocalidad", query = "SELECT p FROM Persona p WHERE p.idLocalidad = :idLocalidad"),
    @NamedQuery(name = "Persona.findByFechaCreacion", query = "SELECT p FROM Persona p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Persona.findByAspCodigoPostal", query = "SELECT p FROM Persona p WHERE p.aspCodigoPostal = :aspCodigoPostal"),
    @NamedQuery(name = "Persona.findByExpedienteEnviado", query = "SELECT p FROM Persona p WHERE p.expedienteEnviado = :expedienteEnviado"),
    @NamedQuery(name = "Persona.findByColonia", query = "SELECT p FROM Persona p WHERE p.colonia = :colonia"),
    @NamedQuery(name = "Persona.findBySerieFiel", query = "SELECT p FROM Persona p WHERE p.serieFiel = :serieFiel"),
    @NamedQuery(name = "Persona.findByGeolocalizacion", query = "SELECT p FROM Persona p WHERE p.geolocalizacion = :geolocalizacion"),
    @NamedQuery(name = "Persona.findByNumExt", query = "SELECT p FROM Persona p WHERE p.numExt = :numExt"),
    @NamedQuery(name = "Persona.findByNumInt", query = "SELECT p FROM Persona p WHERE p.numInt = :numInt"),
    @NamedQuery(name = "Persona.findByCalle2", query = "SELECT p FROM Persona p WHERE p.calle2 = :calle2"),
    @NamedQuery(name = "Persona.findByCalle3", query = "SELECT p FROM Persona p WHERE p.calle3 = :calle3"),
    @NamedQuery(name = "Persona.findByIdPais", query = "SELECT p FROM Persona p WHERE p.idPais = :idPais"),
    @NamedQuery(name = "Persona.findByIdEntidad", query = "SELECT p FROM Persona p WHERE p.idEntidad = :idEntidad"),
    @NamedQuery(name = "Persona.findByIdSociedad", query = "SELECT p FROM Persona p WHERE p.idSociedad = :idSociedad"),
    @NamedQuery(name = "Persona.findByCantOpMensual", query = "SELECT p FROM Persona p WHERE p.cantOpMensual = :cantOpMensual"),
    @NamedQuery(name = "Persona.findByCiudad", query = "SELECT p FROM Persona p WHERE p.ciudad = :ciudad"),
    @NamedQuery(name = "Persona.findByNumIdent", query = "SELECT p FROM Persona p WHERE p.numIdent = :numIdent"),
    @NamedQuery(name = "Persona.findByTipoIdentId", query = "SELECT p FROM Persona p WHERE p.tipoIdentId = :tipoIdentId")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona", nullable = false)
    private Integer idPersona;
    @Column(name = "tipo_persona")
    private Character tipoPersona;
    @Column(name = "nombre", length = 45)
    private String nombre;
    @Column(name = "apellido_paterno", length = 45)
    private String apellidoPaterno;
    @Column(name = "apellido_materno", length = 45)
    private String apellidoMaterno;
    @Column(name = "razon_social", length = 200)
    private String razonSocial;
    @Column(name = "rfc", length = 20)
    private String rfc;
    @Column(name = "curp", length = 18)
    private String curp;
    @Column(name = "lugar_nacimiento", length = 100)
    private String lugarNacimiento;
    @Column(name = "id_nacionalidad")
    private Integer idNacionalidad;
    @Column(name = "id_estado_civil")
    private Integer idEstadoCivil;
    @Column(name = "telefono", length = 16)
    private String telefono;
    @Column(name = "celular", length = 16)
    private String celular;
    @Column(name = "correo", length = 45)
    private String correo;
    @Column(name = "id_ocupacion")
    private Integer idOcupacion;
    @Column(name = "fecha_nacimiento", length = 2147483647)
    private String fechaNacimiento;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "id_grado_estudios")
    private Integer idGradoEstudios;
    @Column(name = "calle", length = 100)
    private String calle;
    @Column(name = "numero_exterior")
    private Integer numeroExterior;
    @Column(name = "numero_interior")
    private Integer numeroInterior;
    @Column(name = "id_colonia")
    private Integer idColonia;
    @Column(name = "id_codigo_postal", length = 5)
    private String idCodigoPostal;
    @Column(name = "referencia_direccion", length = 100)
    private String referenciaDireccion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ingreso_mensual", precision = 12, scale = 2)
    private BigDecimal ingresoMensual;
    @Column(name = "monto_maximo_ahorro", precision = 12, scale = 2)
    private BigDecimal montoMaximoAhorro;
    @Column(name = "id_puesto")
    private Integer idPuesto;
    @Column(name = "id_giro")
    private Integer idGiro;
    @Column(name = "id_destino_fondo")
    private Integer idDestinoFondo;
    @Column(name = "id_localidad")
    private Integer idLocalidad;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "asp_codigo_postal", length = 5)
    private String aspCodigoPostal;
    @Column(name = "expediente_enviado")
    private Boolean expedienteEnviado;
    @Column(name = "colonia", length = 400)
    private String colonia;
    @Column(name = "serie_fiel", length = 50)
    private String serieFiel;
    @Column(name = "geolocalizacion", length = 2147483647)
    private String geolocalizacion;
    @Column(name = "num_ext", length = 30)
    private String numExt;
    @Column(name = "num_int", length = 16)
    private String numInt;
    @Column(name = "calle2", length = 100)
    private String calle2;
    @Column(name = "calle3", length = 100)
    private String calle3;
    @Column(name = "id_pais")
    private Integer idPais;
    @Column(name = "id_entidad")
    private Integer idEntidad;
    @Column(name = "id_sociedad")
    private Integer idSociedad;
    @Column(name = "cant_op_mensual", precision = 12, scale = 2)
    private BigDecimal cantOpMensual;
    @Column(name = "ciudad", length = 100)
    private String ciudad;
    @Column(name = "num_ident", length = 30)
    private String numIdent;
    @Column(name = "tipo_ident_id")
    private Integer tipoIdentId;

    public Persona() {
    }

    public Persona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Character getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(Character tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(Integer idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getIdGradoEstudios() {
        return idGradoEstudios;
    }

    public void setIdGradoEstudios(Integer idGradoEstudios) {
        this.idGradoEstudios = idGradoEstudios;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(Integer numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public Integer getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(Integer numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public Integer getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Integer idColonia) {
        this.idColonia = idColonia;
    }

    public String getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(String idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    public String getReferenciaDireccion() {
        return referenciaDireccion;
    }

    public void setReferenciaDireccion(String referenciaDireccion) {
        this.referenciaDireccion = referenciaDireccion;
    }

    public BigDecimal getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(BigDecimal ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public BigDecimal getMontoMaximoAhorro() {
        return montoMaximoAhorro;
    }

    public void setMontoMaximoAhorro(BigDecimal montoMaximoAhorro) {
        this.montoMaximoAhorro = montoMaximoAhorro;
    }

    public Integer getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Integer getIdGiro() {
        return idGiro;
    }

    public void setIdGiro(Integer idGiro) {
        this.idGiro = idGiro;
    }

    public Integer getIdDestinoFondo() {
        return idDestinoFondo;
    }

    public void setIdDestinoFondo(Integer idDestinoFondo) {
        this.idDestinoFondo = idDestinoFondo;
    }

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getAspCodigoPostal() {
        return aspCodigoPostal;
    }

    public void setAspCodigoPostal(String aspCodigoPostal) {
        this.aspCodigoPostal = aspCodigoPostal;
    }

    public Boolean getExpedienteEnviado() {
        return expedienteEnviado;
    }

    public void setExpedienteEnviado(Boolean expedienteEnviado) {
        this.expedienteEnviado = expedienteEnviado;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getSerieFiel() {
        return serieFiel;
    }

    public void setSerieFiel(String serieFiel) {
        this.serieFiel = serieFiel;
    }

    public String getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(String geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public String getCalle3() {
        return calle3;
    }

    public void setCalle3(String calle3) {
        this.calle3 = calle3;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Integer getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(Integer idEntidad) {
        this.idEntidad = idEntidad;
    }

    public Integer getIdSociedad() {
        return idSociedad;
    }

    public void setIdSociedad(Integer idSociedad) {
        this.idSociedad = idSociedad;
    }

    public BigDecimal getCantOpMensual() {
        return cantOpMensual;
    }

    public void setCantOpMensual(BigDecimal cantOpMensual) {
        this.cantOpMensual = cantOpMensual;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumIdent() {
        return numIdent;
    }

    public void setNumIdent(String numIdent) {
        this.numIdent = numIdent;
    }

    public Integer getTipoIdentId() {
        return tipoIdentId;
    }

    public void setTipoIdentId(Integer tipoIdentId) {
        this.tipoIdentId = tipoIdentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Persona[ idPersona=" + idPersona + " ]";
    }
    
}
