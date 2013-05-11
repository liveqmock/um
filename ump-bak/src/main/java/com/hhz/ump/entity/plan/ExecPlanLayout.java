// 
package com.hhz.ump.entity.plan;
// Generated 2011-8-14 16:43:29 by Hibernate Tools 3.2.2.GA


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

/**
 * ExecPlanLayout generated by hbm2java
 */
@Entity
@Table(name="EXEC_PLAN_LAYOUT"
    ,schema="POWERDESK"
)
public class ExecPlanLayout  implements java.io.Serializable {


     private String execPlanLayoutId;
     private Boolean ifBis;
     private String executionPlanCd;
     private String executionPlanName;
     private String projectCd;
     private String activeFlg;
     private String planTypeCd;
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
     private Long sequenceNo;
     private List<ExecPlanDetail> execPlanDetails = new ArrayList<ExecPlanDetail>();

    public ExecPlanLayout() {
    }

	
    public ExecPlanLayout(String execPlanLayoutId, long recordVersion) {
        this.execPlanLayoutId = execPlanLayoutId;
        this.recordVersion = recordVersion;
    }
    public ExecPlanLayout(String execPlanLayoutId, Boolean ifBis, String executionPlanCd, String executionPlanName, String projectCd, String activeFlg, String planTypeCd, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, String createdCenterCd, String createdPositionCd, String updatedCenterCd, String updatedPositionCd,Long seqenceNo, List<ExecPlanDetail> execPlanDetails) {
       this.execPlanLayoutId = execPlanLayoutId;
       this.ifBis = ifBis;
       this.executionPlanCd = executionPlanCd;
       this.executionPlanName = executionPlanName;
       this.projectCd = projectCd;
       this.activeFlg = activeFlg;
       this.planTypeCd = planTypeCd;
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
       this.execPlanDetails = execPlanDetails;
       this.sequenceNo = sequenceNo;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="EXEC_PLAN_LAYOUT_ID", unique=true, nullable=false, length=50)
    public String getExecPlanLayoutId() {
        return this.execPlanLayoutId;
    }
    
    public void setExecPlanLayoutId(String execPlanLayoutId) {
        this.execPlanLayoutId = execPlanLayoutId;
    }
    
    @Column(name="IF_BIS", precision=1, scale=0)
    public Boolean getIfBis() {
        return this.ifBis;
    }
    
    public void setIfBis(Boolean ifBis) {
        this.ifBis = ifBis;
    }
    
    @Column(name="EXECUTION_PLAN_CD", length=20)
    public String getExecutionPlanCd() {
        return this.executionPlanCd;
    }
    
    public void setExecutionPlanCd(String executionPlanCd) {
        this.executionPlanCd = executionPlanCd;
    }
    
    @Column(name="EXECUTION_PLAN_NAME", length=100)
    public String getExecutionPlanName() {
        return this.executionPlanName;
    }
    
    public void setExecutionPlanName(String executionPlanName) {
        this.executionPlanName = executionPlanName;
    }
    
    @Column(name="PROJECT_CD", length=20)
    public String getProjectCd() {
        return this.projectCd;
    }
    
    public void setProjectCd(String projectCd) {
        this.projectCd = projectCd;
    }
    
    @Column(name="ACTIVE_FLG", length=1)
    public String getActiveFlg() {
        return this.activeFlg;
    }
    
    public void setActiveFlg(String activeFlg) {
        this.activeFlg = activeFlg;
    }
    
    @Column(name="PLAN_TYPE_CD", length=20)
    public String getPlanTypeCd() {
        return this.planTypeCd;
    }
    
    public void setPlanTypeCd(String planTypeCd) {
        this.planTypeCd = planTypeCd;
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

    
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
    
@OneToMany(fetch=FetchType.LAZY, mappedBy="execPlanLayout")
    @BatchSize(size=10)
public List<ExecPlanDetail> getExecPlanDetails() {
        return this.execPlanDetails;
    }
    
    public void setExecPlanDetails(List<ExecPlanDetail> execPlanDetails) {
        this.execPlanDetails = execPlanDetails;
    }




}

