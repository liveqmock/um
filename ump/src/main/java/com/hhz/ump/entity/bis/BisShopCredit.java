// 
package com.hhz.ump.entity.bis;
// Generated 2011-8-3 22:32:28 by Hibernate Tools 3.2.2.GA


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
 * BisShopCredit generated by hbm2java
 */
@Entity
@Table(name="BIS_SHOP_CREDIT"
    
)
public class BisShopCredit  implements java.io.Serializable {


     private String bisshopcreditId;
     private BisShop bisShop;
     private String inforName;
     private String summaryDesc;
     private Date inforTime;
     private String attachBl;
     private String attachId;
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

    public BisShopCredit() {
    }

	
    public BisShopCredit(String bisshopcreditId, BisShop bisShop, long recordVersion) {
        this.bisshopcreditId = bisshopcreditId;
        this.bisShop = bisShop;
        this.recordVersion = recordVersion;
    }
    public BisShopCredit(String bisshopcreditId, BisShop bisShop, String inforName, String summaryDesc, Date inforTime, String attachBl, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion,String attachId) {
       this.bisshopcreditId = bisshopcreditId;
       this.bisShop = bisShop;
       this.inforName = inforName;
       this.summaryDesc = summaryDesc;
       this.inforTime = inforTime;
       this.attachBl = attachBl;
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
       this.attachId = attachId;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BISSHOPCREDIT_ID", unique=true, nullable=false, length=50)
    public String getBisshopcreditId() {
        return this.bisshopcreditId;
    }
    
    public void setBisshopcreditId(String bisshopcreditId) {
        this.bisshopcreditId = bisshopcreditId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIS_SHOP_ID", nullable=false)
    public BisShop getBisShop() {
        return this.bisShop;
    }
    
    public void setBisShop(BisShop bisShop) {
        this.bisShop = bisShop;
    }
    
    @Column(name="INFOR_NAME", length=200)
    public String getInforName() {
        return this.inforName;
    }
    
    public void setInforName(String inforName) {
        this.inforName = inforName;
    }
    
    @Column(name="SUMMARY_DESC", length=400)
    public String getSummaryDesc() {
        return this.summaryDesc;
    }
    
    public void setSummaryDesc(String summaryDesc) {
        this.summaryDesc = summaryDesc;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="INFOR_TIME", length=7)
    public Date getInforTime() {
        return this.inforTime;
    }
    
    public void setInforTime(Date inforTime) {
        this.inforTime = inforTime;
    }
    
    @Column(name="ATTACH_BL", length=2)
    public String getAttachBl() {
        return this.attachBl;
    }
    
    public void setAttachBl(String attachBl) {
        this.attachBl = attachBl;
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

    @Column(name="ATTACH_ID", length=50)
	public String getAttachId() {
		return attachId;
	}


	public void setAttachId(String attachId) {
		this.attachId = attachId;
	}




}


