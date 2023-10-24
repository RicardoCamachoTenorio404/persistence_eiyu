/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "historico_request", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "HistoricoRequest.findAll", query = "SELECT h FROM HistoricoRequest h"),
    @NamedQuery(name = "HistoricoRequest.findByIdPeticion", query = "SELECT h FROM HistoricoRequest h WHERE h.historicoRequestPK.idPeticion = :idPeticion"),
    @NamedQuery(name = "HistoricoRequest.findByIdPblu", query = "SELECT h FROM HistoricoRequest h WHERE h.idPblu = :idPblu"),
    @NamedQuery(name = "HistoricoRequest.findByIdStatus", query = "SELECT h FROM HistoricoRequest h WHERE h.idStatus = :idStatus"),
    @NamedQuery(name = "HistoricoRequest.findByApplication", query = "SELECT h FROM HistoricoRequest h WHERE h.application = :application"),
    @NamedQuery(name = "HistoricoRequest.findByFhPeticion", query = "SELECT h FROM HistoricoRequest h WHERE h.historicoRequestPK.fhPeticion = :fhPeticion"),
    @NamedQuery(name = "HistoricoRequest.findBySignature", query = "SELECT h FROM HistoricoRequest h WHERE h.signature = :signature"),
    @NamedQuery(name = "HistoricoRequest.findByUserAgent", query = "SELECT h FROM HistoricoRequest h WHERE h.userAgent = :userAgent"),
    @NamedQuery(name = "HistoricoRequest.findByRequest", query = "SELECT h FROM HistoricoRequest h WHERE h.request = :request"),
    @NamedQuery(name = "HistoricoRequest.findByResponse", query = "SELECT h FROM HistoricoRequest h WHERE h.response = :response")})
public class HistoricoRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistoricoRequestPK historicoRequestPK;
    @Basic(optional = false)
    @Column(name = "id_pblu", nullable = false)
    private int idPblu;
    @Basic(optional = false)
    @Column(name = "id_status", nullable = false)
    private int idStatus;
    @Column(name = "application", length = 50)
    private String application;
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

    public HistoricoRequest() {
    }

    public HistoricoRequest(HistoricoRequestPK historicoRequestPK) {
        this.historicoRequestPK = historicoRequestPK;
    }

    public HistoricoRequest(HistoricoRequestPK historicoRequestPK, int idPblu, int idStatus, String signature, String userAgent) {
        this.historicoRequestPK = historicoRequestPK;
        this.idPblu = idPblu;
        this.idStatus = idStatus;
        this.signature = signature;
        this.userAgent = userAgent;
    }

    public HistoricoRequest(int idPeticion, Date fhPeticion) {
        this.historicoRequestPK = new HistoricoRequestPK(idPeticion, fhPeticion);
    }

    public HistoricoRequestPK getHistoricoRequestPK() {
        return historicoRequestPK;
    }

    public void setHistoricoRequestPK(HistoricoRequestPK historicoRequestPK) {
        this.historicoRequestPK = historicoRequestPK;
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
        hash += (historicoRequestPK != null ? historicoRequestPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoRequest)) {
            return false;
        }
        HistoricoRequest other = (HistoricoRequest) object;
        if ((this.historicoRequestPK == null && other.historicoRequestPK != null) || (this.historicoRequestPK != null && !this.historicoRequestPK.equals(other.historicoRequestPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.HistoricoRequest[ historicoRequestPK=" + historicoRequestPK + " ]";
    }
    
}
