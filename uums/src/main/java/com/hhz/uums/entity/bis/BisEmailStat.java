// 
package com.hhz.uums.entity.bis;
// Generated 2012-4-5 18:22:52 by Hibernate Tools 3.2.2.GA


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * BisEmailStat generated by hbm2java
 */
@Entity
@Table(name="BIS_EMAIL_STAT"
    
)
public class BisEmailStat  implements java.io.Serializable {


     private String bisEmailStatId;    //邮件id
     private Date recordDate;          //统计日期
     private String uiid;              //账号
     private String userName;          //用户姓名
     private String relOrgId;          //部门Id
     private String relOrgName;        //部门名称
     
     private Long noReadCount;         //未读邮件数
     private Long totalCount;          //邮件总数
     private Long noReadCountSize;     //未读邮件占用空间
     private Long totalCountSize;      //总占用空间
     
     private String remark;            //备注
     private String creator;           //创建者
     private String createdCenterCd;   //
     private String createdDeptCd;     //
     private String createdPositionCd; //
     private Date createdDate;         //创建日期
     private String updator;           //更新者
     private String updatedCenterCd;   //
     private String updatedDeptCd;     //
     private String updatedPositionCd; //
     private Date updatedDate;         //更新日期
     private long recordVersion;       //发布版本

    public BisEmailStat() {
    }

	
    public BisEmailStat(String bisEmailStatId, long recordVersion) {
        this.bisEmailStatId = bisEmailStatId;
        this.recordVersion = recordVersion;
    }
    public BisEmailStat(String bisEmailStatId, Date recordDate, String uiid, String userName, String relOrgId, String relOrgName, Long noReadCount, Long totalCount, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, Long noReadCountSize, Long totalCountSize) {
       this.bisEmailStatId = bisEmailStatId;
       this.recordDate = recordDate;
       this.uiid = uiid;
       this.userName = userName;
       this.relOrgId = relOrgId;
       this.relOrgName = relOrgName;
       this.noReadCount = noReadCount;
       this.totalCount = totalCount;
       this.remark = remark;
       this.creator = creator;
       this.createdCenterCd = createdCenterCd;
       this.createdDeptCd = createdDeptCd;
       this.createdPositionCd = createdPositionCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedPositionCd = updatedPositionCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.noReadCountSize = noReadCountSize;
       this.totalCountSize = totalCountSize;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
    
    @Column(name="BIS_EMAIL_STAT_ID", unique=true, nullable=false, length=50)
    public String getBisEmailStatId() {
        return this.bisEmailStatId;
    }
    
    public void setBisEmailStatId(String bisEmailStatId) {
        this.bisEmailStatId = bisEmailStatId;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORD_DATE", length=7)
    public Date getRecordDate() {
        return this.recordDate;
    }
    
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
    
    @Column(name="UIID", length=50)
    public String getUiid() {
        return this.uiid;
    }
    
    public void setUiid(String uiid) {
        this.uiid = uiid;
    }
    
    @Column(name="USER_NAME", length=50)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name="REL_ORG_ID", length=50)
    public String getRelOrgId() {
        return this.relOrgId;
    }
    
    public void setRelOrgId(String relOrgId) {
        this.relOrgId = relOrgId;
    }
    
    @Column(name="REL_ORG_NAME", length=100)
    public String getRelOrgName() {
        return this.relOrgName;
    }
    
    public void setRelOrgName(String relOrgName) {
        this.relOrgName = relOrgName;
    }
    
    @Column(name="NO_READ_COUNT", precision=10, scale=0)
    public Long getNoReadCount() {
        return this.noReadCount;
    }
    
    public void setNoReadCount(Long noReadCount) {
        this.noReadCount = noReadCount;
    }
    
    @Column(name="TOTAL_COUNT", precision=10, scale=0)
    public Long getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
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
    
    @Column(name="NO_READ_COUNT_SIZE", precision=18, scale=0)
    public Long getNoReadCountSize() {
        return this.noReadCountSize;
    }
    
    public void setNoReadCountSize(Long noReadCountSize) {
        this.noReadCountSize = noReadCountSize;
    }
    
    @Column(name="TOTAL_COUNT_SIZE", precision=18, scale=0)
    public Long getTotalCountSize() {
        return this.totalCountSize;
    }
    
    public void setTotalCountSize(Long totalCountSize) {
        this.totalCountSize = totalCountSize;
    }




}

