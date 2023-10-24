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
@Table(name = "request", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Request.findAll", query = "SELECT r FROM Request r"),
    @NamedQuery(name = "Request.findByIdPeticion", query = "SELECT r FROM Request r WHERE r.idPeticion = :idPeticion"),
    @NamedQuery(name = "Request.findByIdPblu", query = "SELECT r FROM Request r WHERE r.idPblu = :idPblu"),
    @NamedQuery(name = "Request.findByIdStatus", query = "SELECT r FROM Request r WHERE r.idStatus = :idStatus"),
    @NamedQuery(name = "Request.findByApplication", query = "SELECT r FROM Request r WHERE r.application = :application"),
    @NamedQuery(name = "Request.findByFhPeticion", query = "SELECT r FROM Request r WHERE r.fhPeticion = :fhPeticion"),
    @NamedQuery(name = "Request.findBySignature", query = "SELECT r FROM Request r WHERE r.signature = :signature"),
    @NamedQuery(name = "Request.findByUserAgent", query = "SELECT r FROM Request r WHERE r.userAgent = :userAgent"),
    @NamedQuery(name = "Request.findByRequest", query = "SELECT r FROM Request r WHERE r.request = :request"),
    @NamedQuery(name = "Request.findByResponse", query = "SELECT r FROM Request r WHERE r.response = :response")})
public class Request implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_peticion", nullable = false)
    private Integer idPeticion;
    @Basic(optional = false)
    @Column(name = "id_pblu", nullable = false)
    private int idPblu;
    @Basic(optional = false)
    @Column(name = "id_status", nullable = false)
    private int idStatus;
    @Column(name = "application", length = 50)
    private String application;
    @Column(name = "fh_peticion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fhPeticion;
    @Basic(optional = false)
    @Column(name = "signature", nullable = false, length = 600)
    private String signature;
    @Basic(optional = false)
    @Column(name = "user_agent", nullable = false, length = 600)
    private String userAgent;
    @Column(name = "request", length = 2147483647)
    private String request;
    @Column(name = "response", length = 2147483647)
    private String response;

    public Request() {
    }

    public Request(Integer idPeticion) {
        this.idPeticion = idPeticion;
    }

    public Request(Integer idPeticion, int idPblu, int idStatus, String signature, String userAgent) {
        this.idPeticion = idPeticion;
        this.idPblu = idPblu;
        this.idStatus = idStatus;
        this.signature = signature;
        this.userAgent = userAgent;
    }

    public Integer getIdPeticion() {
        return idPeticion;
    }

    public void setIdPeticion(Integer idPeticion) {
        this.idPeticion = idPeticion;
    }

    public int getIdPblu() {
        return idPblu;
    }

    public void setIdPblu(int idPblu) {
        this.idPblu = idPblu;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Date getFhPeticion() {
        return fhPeticion;
    }

    public void setFhPeticion(Date fhPeticion) {
        this.fhPeticion = fhPeticion;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeticion != null ? idPeticion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Request)) {
            return false;
        }
        Request other = (Request) object;
        if ((this.idPeticion == null && other.idPeticion != null) || (this.idPeticion != null && !this.idPeticion.equals(other.idPeticion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Request[ idPeticion=" + idPeticion + " ]";
    }
    
}
