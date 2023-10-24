/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 *
 * @author Ricardo Camacho
 */
@Embeddable
public class DocumentoCuentaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "clabe", nullable = false, length = 20)
    private String clabe;
    @Basic(optional = false)
    @Column(name = "cve_documento", nullable = false, length = 20)
    private String cveDocumento;

    public DocumentoCuentaPK() {
    }

    public DocumentoCuentaPK(String clabe, String cveDocumento) {
        this.clabe = clabe;
        this.cveDocumento = cveDocumento;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getCveDocumento() {
        return cveDocumento;
    }

    public void setCveDocumento(String cveDocumento) {
        this.cveDocumento = cveDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clabe != null ? clabe.hashCode() : 0);
        hash += (cveDocumento != null ? cveDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoCuentaPK)) {
            return false;
        }
        DocumentoCuentaPK other = (DocumentoCuentaPK) object;
        if ((this.clabe == null && other.clabe != null) || (this.clabe != null && !this.clabe.equals(other.clabe))) {
            return false;
        }
        if ((this.cveDocumento == null && other.cveDocumento != null) || (this.cveDocumento != null && !this.cveDocumento.equals(other.cveDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.DocumentoCuentaPK[ clabe=" + clabe + ", cveDocumento=" + cveDocumento + " ]";
    }
    
}
