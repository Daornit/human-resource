package stud.num.edu.mn.numhumanresource.core;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    @Basic
    @Column(name = "VERSION")
    private int version;

    @Basic
    @Column(name = "ACTIVE_FLAG")
    private int activeFlag;

    @Basic
    @Column(name = "CREATED_BY")
    private int createdBy;

    @Basic
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Basic
    @Column(name = "UPDATED_BY")
    private int updatedBy;

    @Basic
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    public BaseEntity() {
        this.version = 1;
        this.activeFlag = 1;
        this.createdDate = new Date();
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(int activeFlag) {
        this.activeFlag = activeFlag;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
