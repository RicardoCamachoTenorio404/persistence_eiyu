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
public class PlantillasPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "file_name", nullable = false, length = 2147483647)
    private String fileName;
    @Basic(optional = false)
    @Column(name = "pblu", nullable = false)
    private int pblu;

    public PlantillasPK() {
    }

    public PlantillasPK(String fileName, int pblu) {
        this.fileName = fileName;
        this.pblu = pblu;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getPblu() {
        return pblu;
    }

    public void setPblu(int pblu) {
        this.pblu = pblu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fileName != null ? fileName.hashCode() : 0);
        hash += (int) pblu;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlantillasPK)) {
            return false;
        }
        PlantillasPK other = (PlantillasPK) object;
        if ((this.fileName == null && other.fileName != null) || (this.fileName != null && !this.fileName.equals(other.fileName))) {
            return false;
        }
        if (this.pblu != other.pblu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.PlantillasPK[ fileName=" + fileName + ", pblu=" + pblu + " ]";
    }
    
}
