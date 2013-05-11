// 
package com.hhz.ump.entity.bis;
// Generated 2011-12-29 10:50:13 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
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
 * BisMustRentHis generated by hbm2java
 */
@Entity
@Table(name="BIS_MUST_RENT_HIS"
    
)
public class BisMustRentHis  implements java.io.Serializable {


     private String bisMustRentHisId;
     private BisContHis bisContHis;
     private String bisMustRentId;
     private BigDecimal unitMoney;
     private BigDecimal totalMoney;
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

    public BisMustRentHis() {
    }

	
    public BisMustRentHis(String bisMustRentHisId, BisContHis bisContHis, long recordVersion) {
        this.bisMustRentHisId = bisMustRentHisId;
        this.bisContHis = bisContHis;
        this.recordVersion = recordVersion;
    }
    public BisMustRentHis(String bisMustRentHisId, BisContHis bisContHis, String bisMustRentId, BigDecimal unitMoney, BigDecimal totalMoney, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.bisMustRentHisId = bisMustRentHisId;
       this.bisContHis = bisContHis;
       this.bisMustRentId = bisMustRentId;
       this.unitMoney = unitMoney;
       this.totalMoney = totalMoney;
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
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BIS_MUST_RENT_HIS_ID", unique=true, nullable=false, length=50)
    public String getBisMustRentHisId() {
        return this.bisMustRentHisId;
    }
    
    public void setBisMustRentHisId(String bisMustRentHisId) {
        this.bisMustRentHisId = bisMustRentHisId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIS_CONT_HIS_ID", nullable=false)
    public BisContHis getBisContHis() {
        return this.bisContHis;
    }
    
    public void setBisContHis(BisContHis bisContHis) {
        this.bisContHis = bisContHis;
    }
    
    @Column(name="BIS_MUST_RENT_ID", length=50)
    public String getBisMustRentId() {
        return this.bisMustRentId;
    }
    
    public void setBisMustRentId(String bisMustRentId) {
        this.bisMustRentId = bisMustRentId;
    }
    
    @Column(name="UNIT_MONEY", precision=10)
    public BigDecimal getUnitMoney() {
        return this.unitMoney;
    }
    
    public void setUnitMoney(BigDecimal unitMoney) {
        this.unitMoney = unitMoney;
    }
    
    @Column(name="TOTAL_MONEY", precision=10)
    public BigDecimal getTotalMoney() {
        return this.totalMoney;
    }
    
    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
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




}

