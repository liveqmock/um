// 
package com.hhz.ump.entity.bis;
// Generated 2011-8-3 22:32:28 by Hibernate Tools 3.2.2.GA


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

/**
 * BisFloor generated by hbm2java
 */
@Entity
@Table(name="BIS_FLOOR"
    ,schema="POWERDESK"
)
public class BisFloor  implements java.io.Serializable {


     private String bisFloorId;
     private BisProject bisProject;
     private String floorType;
     private String subFloorType;
     private String subFloorTypeName;
     private String buildingNum;
     private String floorNum;
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
     private String floorUrl;
     private String bigPicUrl;
     private String parentId;
     private Long sequenceNo;
     private List<BisFlat> bisFlats = new ArrayList<BisFlat>();
     private List<BisStore> bisStores = new ArrayList<BisStore>();

    public BisFloor() {
    }

	
    public BisFloor(String bisFloorId, BisProject bisProject, long recordVersion) {
        this.bisFloorId = bisFloorId;
        this.bisProject = bisProject;
        this.recordVersion = recordVersion;
    }
    public BisFloor(String bisFloorId, BisProject bisProject, String floorType, String buildingNum, String floorNum, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion, String floorUrl, String bigPicUrl, List<BisFlat> bisFlats, List<BisStore> bisStores) {
       this.bisFloorId = bisFloorId;
       this.bisProject = bisProject;
       this.floorType = floorType;
       this.buildingNum = buildingNum;
       this.floorNum = floorNum;
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
       this.floorUrl = floorUrl;
       this.bigPicUrl = bigPicUrl;
       this.bisFlats = bisFlats;
       this.bisStores = bisStores;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="BIS_FLOOR_ID", unique=true, nullable=false, length=50)
    public String getBisFloorId() {
        return this.bisFloorId;
    }
    
    public void setBisFloorId(String bisFloorId) {
        this.bisFloorId = bisFloorId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIS_PROJECT_ID", nullable=false)
    public BisProject getBisProject() {
        return this.bisProject;
    }
    
    public void setBisProject(BisProject bisProject) {
        this.bisProject = bisProject;
    }
    
    @Column(name="FLOOR_TYPE", length=1)
    public String getFloorType() {
        return this.floorType;
    }
    
    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    @Column(name="SUB_FLOOR_TYPE", length=1)
    public String getSubFloorType() {
        return this.subFloorType;
    }
    
    public void setSubFloorType(String subFloorType) {
        this.subFloorType = subFloorType;
    }
    
    @Column(name="SUB_FLOOR_TYPE_NAME", length=100)
    public String getSubFloorTypeName() {
    	return this.subFloorTypeName;
    }
    
    public void setSubFloorTypeName(String subFloorTypeName) {
    	this.subFloorTypeName = subFloorTypeName;
    }
    
    @Column(name="BUILDING_NUM", length=100)
    public String getBuildingNum() {
        return this.buildingNum;
    }
    
    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }
    
    @Column(name="FLOOR_NUM", precision=20)
    public String getFloorNum() {
        return this.floorNum;
    }
    
    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum;
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
    
    @Column(name="FLOOR_URL", length=100)
    public String getFloorUrl() {
        return this.floorUrl;
    }
    
    public void setFloorUrl(String floorUrl) {
        this.floorUrl = floorUrl;
    }
    @Column(name="BIG_PIC_URL", length=100)
    public String getBigPicUrl() {
        return this.bigPicUrl;
    }
    
    public void setBigPicUrl(String bigPicUrl) {
        this.bigPicUrl = bigPicUrl;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bisFloor")
    @BatchSize(size=10)
public List<BisFlat> getBisFlats() {
        return this.bisFlats;
    }
    
    public void setBisFlats(List<BisFlat> bisFlats) {
        this.bisFlats = bisFlats;
    }
@OneToMany(fetch=FetchType.LAZY, mappedBy="bisFloor")
    @BatchSize(size=10)
public List<BisStore> getBisStores() {
        return this.bisStores;
    }
    
    public void setBisStores(List<BisStore> bisStores) {
        this.bisStores = bisStores;
    }
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
    @Column(name="PARENT_ID", precision=50, scale=0)
    public String getParentId() {
    	return this.parentId;
    }
    
    public void setParentId(String parentId) {
    	this.parentId = parentId;
    }



}

