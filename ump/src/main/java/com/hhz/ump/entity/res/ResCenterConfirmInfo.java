// 
package com.hhz.ump.entity.res;
// Generated 2011-3-30 13:29:48 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.BatchSize;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ResCenterConfirmInfo generated by hbm2java
 */
@Entity
@Table(name="RES_CENTER_CONFIRM_INFO"
    
)
public class ResCenterConfirmInfo  implements java.io.Serializable {


     private String resCenterConfirmInfoId;
     private ResApproveInfo resApproveInfo;
     private String resTypeCd;
     private String centerCd;
     private String conOption;
     private String conUser;
     private Date conDate;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private String createdCenterCd;
     private String createdPositionCd;
     private String updatedCenterCd;
     private String updatedPositionCd;

    public ResCenterConfirmInfo() {
    }

	
    public ResCenterConfirmInfo(String resCenterConfirmInfoId, ResApproveInfo resApproveInfo, long recordVersion) {
        this.resCenterConfirmInfoId = resCenterConfirmInfoId;
        this.resApproveInfo = resApproveInfo;
        this.recordVersion = recordVersion;
    }
    public ResCenterConfirmInfo(String resCenterConfirmInfoId, ResApproveInfo resApproveInfo, String resTypeCd, String centerCd, String conOption, String conUser, Date conDate, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, String createdCenterCd, String createdPositionCd, String updatedCenterCd, String updatedPositionCd) {
       this.resCenterConfirmInfoId = resCenterConfirmInfoId;
       this.resApproveInfo = resApproveInfo;
       this.resTypeCd = resTypeCd;
       this.centerCd = centerCd;
       this.conOption = conOption;
       this.conUser = conUser;
       this.conDate = conDate;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="RES_CENTER_CONFIRM_INFO_ID", unique=true, nullable=false, length=50)
    public String getResCenterConfirmInfoId() {
        return this.resCenterConfirmInfoId;
    }
    
    public void setResCenterConfirmInfoId(String resCenterConfirmInfoId) {
        this.resCenterConfirmInfoId = resCenterConfirmInfoId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RES_APPROVE_INFO_ID", nullable=false)
    public ResApproveInfo getResApproveInfo() {
        return this.resApproveInfo;
    }
    
    public void setResApproveInfo(ResApproveInfo resApproveInfo) {
        this.resApproveInfo = resApproveInfo;
    }
    
    @Column(name="RES_TYPE_CD", length=20)
    public String getResTypeCd() {
        return this.resTypeCd;
    }
    
    public void setResTypeCd(String resTypeCd) {
        this.resTypeCd = resTypeCd;
    }
    
    @Column(name="CENTER_CD", length=20)
    public String getCenterCd() {
        return this.centerCd;
    }
    
    public void setCenterCd(String centerCd) {
        this.centerCd = centerCd;
    }
    
    @Column(name="CON_OPTION", length=20)
    public String getConOption() {
        return this.conOption;
    }
    
    public void setConOption(String conOption) {
        this.conOption = conOption;
    }
    
    @Column(name="CON_USER", length=20)
    public String getConUser() {
        return this.conUser;
    }
    
    public void setConUser(String conUser) {
        this.conUser = conUser;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CON_DATE", length=7)
    public Date getConDate() {
        return this.conDate;
    }
    
    public void setConDate(Date conDate) {
        this.conDate = conDate;
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
    
    @Column(name="CREATED_DEPT_CD", length=20)
    public String getCreatedDeptCd() {
        return this.createdDeptCd;
    }
    
    public void setCreatedDeptCd(String createdDeptCd) {
        this.createdDeptCd = createdDeptCd;
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
    
    @Column(name="UPDATED_DEPT_CD", length=20)
    public String getUpdatedDeptCd() {
        return this.updatedDeptCd;
    }
    
    public void setUpdatedDeptCd(String updatedDeptCd) {
        this.updatedDeptCd = updatedDeptCd;
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
    
    @Column(name="CREATED_CENTER_CD", length=20)
    public String getCreatedCenterCd() {
        return this.createdCenterCd;
    }
    
    public void setCreatedCenterCd(String createdCenterCd) {
        this.createdCenterCd = createdCenterCd;
    }
    
    @Column(name="CREATED_POSITION_CD", length=20)
    public String getCreatedPositionCd() {
        return this.createdPositionCd;
    }
    
    public void setCreatedPositionCd(String createdPositionCd) {
        this.createdPositionCd = createdPositionCd;
    }
    
    @Column(name="UPDATED_CENTER_CD", length=20)
    public String getUpdatedCenterCd() {
        return this.updatedCenterCd;
    }
    
    public void setUpdatedCenterCd(String updatedCenterCd) {
        this.updatedCenterCd = updatedCenterCd;
    }
    
    @Column(name="UPDATED_POSITION_CD", length=20)
    public String getUpdatedPositionCd() {
        return this.updatedPositionCd;
    }
    
    public void setUpdatedPositionCd(String updatedPositionCd) {
        this.updatedPositionCd = updatedPositionCd;
    }




}

