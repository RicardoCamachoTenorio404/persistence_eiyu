/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "cuentasclabe", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Cuentasclabe.findAll", query = "SELECT c FROM Cuentasclabe c"),
    @NamedQuery(name = "Cuentasclabe.findById", query = "SELECT c FROM Cuentasclabe c WHERE c.id = :id"),
    @NamedQuery(name = "Cuentasclabe.findByCuentaClabe", query = "SELECT c FROM Cuentasclabe c WHERE c.cuentaClabe = :cuentaClabe"),
    @NamedQuery(name = "Cuentasclabe.findByPblu", query = "SELECT c FROM Cuentasclabe c WHERE c.pblu = :pblu"),
    @NamedQuery(name = "Cuentasclabe.findByIdBanco", query = "SELECT c FROM Cuentasclabe c WHERE c.idBanco = :idBanco")})
public class Cuentasclabe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "cuenta_clabe", length = 255)
    private String cuentaClabe;
    @Column(name = "pblu")
    private Integer pblu;
    @Column(name = "id_banco")
    private Integer idBanco;

    public Cuentasclabe() {
    }

    public Cuentasclabe(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCuentaClabe() {
        return cuentaClabe;
    }

    public void setCuentaClabe(String cuentaClabe) {
        this.cuentaClabe = cuentaClabe;
    }

    public Integer getPblu() {
        return pblu;
    }

    public void setPblu(Integer pblu) {
        this.pblu = pblu;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
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
        if (!(object instanceof Cuentasclabe)) {
            return false;
        }
        Cuentasclabe other = (Cuentasclabe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Cuentasclabe[ id=" + id + " ]";
    }
    
}
