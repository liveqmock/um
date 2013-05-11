// 
package com.hhz.ump.entity.sup;
// Generated 2011-6-1 16:54:22 by Hibernate Tools 3.2.2.GA


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * SupApproveRes generated by hbm2java
 */
@Entity
@Table(name="SUP_APPROVE_RES"
    
)
public class SupApproveRes  implements java.io.Serializable {


     private String supApproveResId;
     private String supAppType;
     private String projectName;
     private String projectCd;
     private String resApproveInfoId;
     private String appProjectName;
     private Date appCompTime;
     private String remark;
     private String creator;
     private String createdCenterCd;
     private String createdDeptCd;
     private String createdPositionCd;
     private Date createdDate;
     private String updator;
     private String updatedCenterCd;
     private String updatedDeptCd;
     private String updatedPositionCd;
     private Date updatedDate;
     private long recordVersion;
     private SupBasic supBasic;

    public SupApproveRes() {
    }

	
    public SupApproveRes(String supApproveResId, long recordVersion, SupBasic supBasic) {
        this.supApproveResId = supApproveResId;
        this.recordVersion = recordVersion;
        this.supBasic = supBasic;
    }
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="SUP_APPROVE_RES_ID", unique=true, nullable=false, length=50)
    public String getSupApproveResId() {
        return this.supApproveResId;
    }
    
    public void setSupApproveResId(String supApproveResId) {
        this.supApproveResId = supApproveResId;
    }
    
    @Column(name="SUP_APP_TYPE", length=50)
    public String getSupAppType() {
        return this.supAppType;
    }
    
    public void setSupAppType(String supAppType) {
        this.supAppType = supAppType;
    }
    
    @Column(name="PROJECT_NAME", length=100)
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    @Column(name="PROJECT_CD", length=50)
    public String getProjectCd() {
        return this.projectCd;
    }
    
    public void setProjectCd(String projectCd) {
        this.projectCd = projectCd;
    }
    
    @Column(name="RES_APPROVE_INFO_ID", length=50)
    public String getResApproveInfoId() {
        return this.resApproveInfoId;
    }
    
    public void setResApproveInfoId(String resApproveInfoId) {
        this.resApproveInfoId = resApproveInfoId;
    }
    
    @Column(name="APP_PROJECT_NAME", length=100)
    public String getAppProjectName() {
        return this.appProjectName;
    }
    
    public void setAppProjectName(String appProjectName) {
        this.appProjectName = appProjectName;
    }
    
    @Column(name="REMARK", length=200)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Column(name="CREATOR", length=20)
    public String getCreator() {
        return this.creator;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    @Column(name="CREATED_CENTER_CD", length=20)
    public String getCreatedCenterCd() {
        return this.createdCenterCd;
    }
    
    public void setCreatedCenterCd(String createdCenterCd) {
        this.createdCenterCd = createdCenterCd;
    }
    
    @Column(name="CREATED_DEPT_CD", length=20)
    public String getCreatedDeptCd() {
        return this.createdDeptCd;
    }
    
    public void setCreatedDeptCd(String createdDeptCd) {
        this.createdDeptCd = createdDeptCd;
    }
    
    @Column(name="CREATED_POSITION_CD", length=20)
    public String getCreatedPositionCd() {
        return this.createdPositionCd;
    }
    
    public void setCreatedPositionCd(String createdPositionCd) {
        this.createdPositionCd = createdPositionCd;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_DATE", length=7)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    @Column(name="UPDATOR", length=20)
    public String getUpdator() {
        return this.updator;
    }
    
    public void setUpdator(String updator) {
        this.updator = updator;
    }
    
    @Column(name="UPDATED_CENTER_CD", length=20)
    public String getUpdatedCenterCd() {
        return this.updatedCenterCd;
    }
    
    public void setUpdatedCenterCd(String updatedCenterCd) {
        this.updatedCenterCd = updatedCenterCd;
    }
    
    @Column(name="UPDATED_DEPT_CD", length=20)
    public String getUpdatedDeptCd() {
        return this.updatedDeptCd;
    }
    
    public void setUpdatedDeptCd(String updatedDeptCd) {
        this.updatedDeptCd = updatedDeptCd;
    }
    
    @Column(name="UPDATED_POSITION_CD", length=20)
    public String getUpdatedPositionCd() {
        return this.updatedPositionCd;
    }
    
    public void setUpdatedPositionCd(String updatedPositionCd) {
        this.updatedPositionCd = updatedPositionCd;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE", length=7)
    public Date getUpdatedDate() {
        return this.updatedDate;
    }
    
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    @Column(name="RECORD_VERSION", nullable=false, precision=10, scale=0)
    @Version 
    public long getRecordVersion() {
        return this.recordVersion;
    }
    
    public void setRecordVersion(long recordVersion) {
        this.recordVersion = recordVersion;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SUP_BASIC_ID", nullable=false)
    public SupBasic getSupBasic() {
        return this.supBasic;
    }
    
    public void setSupBasic(SupBasic supBasic) {
        this.supBasic = supBasic;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="APP_COMP_TIME", length=7)
	public Date getAppCompTime() {
		return appCompTime;
	}


	public void setAppCompTime(Date appCompTime) {
		this.appCompTime = appCompTime;
	}




}

