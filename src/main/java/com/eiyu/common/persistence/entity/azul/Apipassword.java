/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eiyu.common.persistence.entity.azul;

import java.io.Serializable;
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

/**
 *
 * @author Ricardo Camacho
 */
@Entity
@Table(name = "apipassword", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Apipassword.findAll", query = "SELECT a FROM Apipassword a"),
    @NamedQuery(name = "Apipassword.findById", query = "SELECT a FROM Apipassword a WHERE a.id = :id"),
    @NamedQuery(name = "Apipassword.findByPassword", query = "SELECT a FROM Apipassword a WHERE a.password = :password"),
    @NamedQuery(name = "Apipassword.findByUsername", query = "SELECT a FROM Apipassword a WHERE a.username = :username"),
    @NamedQuery(name = "Apipassword.findByCertificado", query = "SELECT a FROM Apipassword a WHERE a.certificado = :certificado"),
    @NamedQuery(name = "Apipassword.findByLlave", query = "SELECT a FROM Apipassword a WHERE a.llave = :llave"),
    @NamedQuery(name = "Apipassword.findByPhrase", query = "SELECT a FROM Apipassword a WHERE a.phrase = :phrase")})
public class Apipassword implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "password", length = 255)
    private String password;
    @Column(name = "username", length = 255)
    private String username;
    @Column(name = "certificado", length = 100)
    private String certificado;
    @Column(name = "llave", length = 100)
    private String llave;
    @Column(name = "phrase", length = 100)
    private String phrase;
    @OneToMany(mappedBy = "idPassword")
    private List<Usuario> usuarioList;

    public Apipassword() {
    }

    public Apipassword(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
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
        if (!(object instanceof Apipassword)) {
            return false;
        }
        Apipassword other = (Apipassword) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.Apipassword[ id=" + id + " ]";
    }
    
}
