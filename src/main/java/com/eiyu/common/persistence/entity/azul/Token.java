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
@Table(name = "token", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Token.findAll", query = "SELECT t FROM Token t"),
    @NamedQuery(name = "Token.findByIdToken", query = "SELECT t FROM Token t WHERE t.idToken = :idToken"),
    @NamedQuery(name = "Token.findByIdPblu", query = "SELECT t FROM Token t WHERE t.idPblu = :idPblu"),
    @NamedQuery(name = "Token.findByIdAccessPortal", query = "SELECT t FROM Token t WHERE t.idAccessPortal = :idAccessPortal"),
    @NamedQuery(name = "Token.findByToken", query = "SELECT t FROM Token t WHERE t.token = :token"),
    @NamedQuery(name = "Token.findBySerial", query = "SELECT t FROM Token t WHERE t.serial = :serial"),
    @NamedQuery(name = "Token.findByStatusToken", query = "SELECT t FROM Token t WHERE t.statusToken = :statusToken"),
    @NamedQuery(name = "Token.findByActivo", query = "SELECT t FROM Token t WHERE t.activo = :activo"),
    @NamedQuery(name = "Token.findByFechaCreacion", query = "SELECT t FROM Token t WHERE t.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Token.findByUsuarioCreacion", query = "SELECT t FROM Token t WHERE t.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "Token.findByPassword", query = "SELECT t FROM Token t WHERE t.password = :password"),
    @NamedQuery(name = "Token.findByCuentaDestino", query = "SELECT t FROM Token t WHERE t.cuentaDestino = :cuentaDestino"),
    @NamedQuery(name = "Token.findByCadenaEnrol", query = "SELECT t FROM Token t WHERE t.cadenaEnrol = :cadenaEnrol"),
    @NamedQuery(name = "Token.findByActCode", query = "SELECT t FROM Token t WHERE t.actCode = :actCode")})
public class Token implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_token", nullable = false)
    private Integer idToken;
    @Column(name = "id_pblu")
    private Integer idPblu;
    @Column(name = "id_access_portal")
    private Integer idAccessPortal;
    @Column(name = "token", length = 200)
    private String token;
    @Column(name = "serial", length = 100)
    private String serial;
    @Column(name = "status_token", length = 20)
    private String statusToken;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "usuario_creacion", length = 100)
    private String usuarioCreacion;
    @Column(name = "password", length = 100)
    private String password;
    @Column(name = "cuenta_destino", length = 100)
    private String cuentaDestino;
    @Column(name = "cadena_enrol", length = 1000)
    private String cadenaEnrol;
    @Column(name = "act_code", length = 100)
    private String actCode;

    public Token() {
    }

    public Token(Integer idToken) {
        this.idToken = idToken;
    }

    public Integer getIdToken() {
        return idToken;
    }

    public void setIdToken(Integer idToken) {
        this.idToken = idToken;
    }

    public Integer getIdPblu() {
        return idPblu;
    }

    public void setIdPblu(Integer idPblu) {
        this.idPblu = idPblu;
    }

    public Integer getIdAccessPortal() {
        return idAccessPortal;
    }

    public void setIdAccessPortal(Integer idAccessPortal) {
        this.idAccessPortal = idAccessPortal;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getStatusToken() {
        return statusToken;
    }

    public void setStatusToken(String statusToken) {
        this.statusToken = statusToken;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idToken != null ? idToken.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Token)) {
            return false;
        }
        Token other = (Token) object;
        if ((this.idToken == null && other.idToken != null) || (this.idToken != null && !this.idToken.equals(other.idToken))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Token[ idToken=" + idToken + " ]";
    }
    
}
