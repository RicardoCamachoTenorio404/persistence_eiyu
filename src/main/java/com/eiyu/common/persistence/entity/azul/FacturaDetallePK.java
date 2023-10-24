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
public class FacturaDetallePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cve_factura", nullable = false, length = 12)
    private String cveFactura;
    @Basic(optional = false)
    @Column(name = "sku", nullable = false, length = 16)
    private String sku;
    @Basic(optional = false)
    @Column(name = "cve_concepto", nullable = false, length = 12)
    private String cveConcepto;

    public FacturaDetallePK() {
    }

    public FacturaDetallePK(String cveFactura, String sku, String cveConcepto) {
        this.cveFactura = cveFactura;
        this.sku = sku;
        this.cveConcepto = cveConcepto;
    }

    public String getCveFactura() {
        return cveFactura;
    }

    public void setCveFactura(String cveFactura) {
        this.cveFactura = cveFactura;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCveConcepto() {
        return cveConcepto;
    }

    public void setCveConcepto(String cveConcepto) {
        this.cveConcepto = cveConcepto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cveFactura != null ? cveFactura.hashCode() : 0);
        hash += (sku != null ? sku.hashCode() : 0);
        hash += (cveConcepto != null ? cveConcepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaDetallePK)) {
            return false;
        }
        FacturaDetallePK other = (FacturaDetallePK) object;
        if ((this.cveFactura == null && other.cveFactura != null) || (this.cveFactura != null && !this.cveFactura.equals(other.cveFactura))) {
            return false;
        }
        if ((this.sku == null && other.sku != null) || (this.sku != null && !this.sku.equals(other.sku))) {
            return false;
        }
        if ((this.cveConcepto == null && other.cveConcepto != null) || (this.cveConcepto != null && !this.cveConcepto.equals(other.cveConcepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.FacturaDetallePK[ cveFactura=" + cveFactura + ", sku=" + sku + ", cveConcepto=" + cveConcepto + " ]";
    }
    
}
