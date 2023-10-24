/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "tokens", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Tokens.findAll", query = "SELECT t FROM Tokens t"),
    @NamedQuery(name = "Tokens.findById", query = "SELECT t FROM Tokens t WHERE t.id = :id"),
    @NamedQuery(name = "Tokens.findByIdTokenTesseract", query = "SELECT t FROM Tokens t WHERE t.idTokenTesseract = :idTokenTesseract"),
    @NamedQuery(name = "Tokens.findByCadenaEnrolamiento", query = "SELECT t FROM Tokens t WHERE t.cadenaEnrolamiento = :cadenaEnrolamiento"),
    @NamedQuery(name = "Tokens.findByCodigoActivacion", query = "SELECT t FROM Tokens t WHERE t.codigoActivacion = :codigoActivacion"),
    @NamedQuery(name = "Tokens.findByFechaCreacion", query = "SELECT t FROM Tokens t WHERE t.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Tokens.findByFechaActualizacion", query = "SELECT t FROM Tokens t WHERE t.fechaActualizacion = :fechaActualizacion"),
    @NamedQuery(name = "Tokens.findByActivo", query = "SELECT t FROM Tokens t WHERE t.activo = :activo"),
    @NamedQuery(name = "Tokens.findByIntentosOtp", query = "SELECT t FROM Tokens t WHERE t.intentosOtp = :intentosOtp"),
    @NamedQuery(name = "Tokens.findByEstatusToken", query = "SELECT t FROM Tokens t WHERE t.estatusToken = :estatusToken")})
public class Tokens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "id_token_tesseract")
    private Integer idTokenTesseract;
    @Column(name = "cadena_enrolamiento", length = 2147483647)
    private String cadenaEnrolamiento;
    @Column(name = "codigo_activacion", length = 2147483647)
    private String codigoActivacion;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "intentos_otp")
    private Integer intentosOtp;
    @Column(name = "estatus_token", length = 2147483647)
    private String estatusToken;
    @OneToMany(mappedBy = "idTokenFk")
    private List<Usuario> usuarioList;

    public Tokens() {
    }

    public Tokens(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTokenTesseract() {
        return idTokenTesseract;
    }

    public void setIdTokenTesseract(Integer idTokenTesseract) {
        this.idTokenTesseract = idTokenTesseract;
    }

    public String getCadenaEnrolamiento() {
        return cadenaEnrolamiento;
    }

    public void setCadenaEnrolamiento(String cadenaEnrolamiento) {
        this.cadenaEnrolamiento = cadenaEnrolamiento;
    }

    public String getCodigoActivacion() {
        return codigoActivacion;
    }

    public void setCodigoActivacion(String codigoActivacion) {
        this.codigoActivacion = codigoActivacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getIntentosOtp() {
        return intentosOtp;
    }

    public void setIntentosOtp(Integer intentosOtp) {
        this.intentosOtp = intentosOtp;
    }

    public String getEstatusToken() {
        return estatusToken;
    }

    public void setEstatusToken(String estatusToken) {
        this.estatusToken = estatusToken;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tokens)) {
            return false;
        }
        Tokens other = (Tokens) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Tokens[ id=" + id + " ]";
    }
    
}
