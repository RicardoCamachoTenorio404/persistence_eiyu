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
@Table(name = "flyway_schema_history", catalog = "asp_azul", schema = "public")
@NamedQueries({
    @NamedQuery(name = "FlywaySchemaHistory.findAll", query = "SELECT f FROM FlywaySchemaHistory f"),
    @NamedQuery(name = "FlywaySchemaHistory.findByInstalledRank", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.installedRank = :installedRank"),
    @NamedQuery(name = "FlywaySchemaHistory.findByVersion", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.version = :version"),
    @NamedQuery(name = "FlywaySchemaHistory.findByDescription", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.description = :description"),
    @NamedQuery(name = "FlywaySchemaHistory.findByType", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.type = :type"),
    @NamedQuery(name = "FlywaySchemaHistory.findByScript", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.script = :script"),
    @NamedQuery(name = "FlywaySchemaHistory.findByChecksum", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.checksum = :checksum"),
    @NamedQuery(name = "FlywaySchemaHistory.findByInstalledBy", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.installedBy = :installedBy"),
    @NamedQuery(name = "FlywaySchemaHistory.findByInstalledOn", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.installedOn = :installedOn"),
    @NamedQuery(name = "FlywaySchemaHistory.findByExecutionTime", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.executionTime = :executionTime"),
    @NamedQuery(name = "FlywaySchemaHistory.findBySuccess", query = "SELECT f FROM FlywaySchemaHistory f WHERE f.success = :success")})
public class FlywaySchemaHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "installed_rank", nullable = false)
    private Integer installedRank;
    @Column(name = "version", length = 50)
    private String version;
    @Basic(optional = false)
    @Column(name = "description", nullable = false, length = 200)
    private String description;
    @Basic(optional = false)
    @Column(name = "type", nullable = false, length = 20)
    private String type;
    @Basic(optional = false)
    @Column(name = "script", nullable = false, length = 1000)
    private String script;
    @Column(name = "checksum")
    private Integer checksum;
    @Basic(optional = false)
    @Column(name = "installed_by", nullable = false, length = 100)
    private String installedBy;
    @Basic(optional = false)
    @Column(name = "installed_on", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date installedOn;
    @Basic(optional = false)
    @Column(name = "execution_time", nullable = false)
    private int executionTime;
    @Basic(optional = false)
    @Column(name = "success", nullable = false)
    private boolean success;

    public FlywaySchemaHistory() {
    }

    public FlywaySchemaHistory(Integer installedRank) {
        this.installedRank = installedRank;
    }

    public FlywaySchemaHistory(Integer installedRank, String description, String type, String script, String installedBy, Date installedOn, int executionTime, boolean success) {
        this.installedRank = installedRank;
        this.description = description;
        this.type = type;
        this.script = script;
        this.installedBy = installedBy;
        this.installedOn = installedOn;
        this.executionTime = executionTime;
        this.success = success;
    }

    public Integer getInstalledRank() {
        return installedRank;
    }

    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Integer getChecksum() {
        return checksum;
    }

    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    public String getInstalledBy() {
        return installedBy;
    }

    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    public Date getInstalledOn() {
        return installedOn;
    }

    public void setInstalledOn(Date installedOn) {
        this.installedOn = installedOn;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (installedRank != null ? installedRank.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlywaySchemaHistory)) {
            return false;
        }
        FlywaySchemaHistory other = (FlywaySchemaHistory) object;
        if ((this.installedRank == null && other.installedRank != null) || (this.installedRank != null && !this.installedRank.equals(other.installedRank))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eiyu.common.persistence.entity.azul.FlywaySchemaHistory[ installedRank=" + installedRank + " ]";
    }
    
}
