// 
package com.hhz.ump.entity.cost;
// Generated 2012-3-29 14:45:31 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
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
 * CostContPlanDetail generated by hbm2java
 */
@Entity
@Table(name="COST_CONT_PLAN_DETAIL"
    ,schema="POWERDESK"
)
public class CostContPlanDetail  implements java.io.Serializable {


     private String costContPlanDetailId;
     private CostContPlan costContPlan;
     private String dispOrderDesc;
     private Long  subjectSequNo;
     private String subjectCd;
     private String contTypeCd;
     private String contName;
     private String contCharTypeCd;
     private BigDecimal contSubTargetAmt;
     private BigDecimal contCaliAmt;
     private BigDecimal targCaliDiffAmt;
     private String landDesc;
     private String unitDefineDesc;
     private BigDecimal amount;
     private String workReqDesc;
     private String partMateTypeCds;
     private String partMateTypeNames;
     private String partMateTypeIds;
     private String relParentContId;
     private String inviPreCondCds;
     private String inviPreCondNames;
     private String inviPreCondIds;
     private Date outDrawDate;
     private Date planStartDate;
     private String relTplDetailId;
     private Date planEndDate;
     private Date tendStartDate;
     private String memoDesc;
     private String rowTypeCd;
     private Long contSequNo;
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

    public CostContPlanDetail() {
    }

	
    public CostContPlanDetail(String costContPlanDetailId, CostContPlan costContPlan, long recordVersion) {
        this.costContPlanDetailId = costContPlanDetailId;
        this.costContPlan = costContPlan;
        this.recordVersion = recordVersion;
    }
    public CostContPlanDetail(String costContPlanDetailId, CostContPlan costContPlan, String dispOrderDesc, Long subjectSequNo, String subjectCd, String contTypeCd, String contName, String contCharTypeCd, BigDecimal contSubTargetAmt, BigDecimal contCaliAmt, BigDecimal targCaliDiffAmt, String landDesc, String unitDefineDesc, BigDecimal amount, String workReqDesc, String partMateTypeCds, String partMateTypeNames, String partMateTypeIds, String relParentContId, String inviPreCondCds, String inviPreCondNames, String inviPreCondIds, Date outDrawDate, Date planStartDate, String relTplDetailId, Date planEndDate, Date tendStartDate, String memoDesc, String rowTypeCd, Long contSequNo, String remark, String creator, String createdCenterCd, String createdDeptCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedDeptCd, String updatedPositionCd, Date updatedDate, long recordVersion) {
       this.costContPlanDetailId = costContPlanDetailId;
       this.costContPlan = costContPlan;
       this.dispOrderDesc = dispOrderDesc;
       this.subjectSequNo = subjectSequNo;
       this.subjectCd = subjectCd;
       this.contTypeCd = contTypeCd;
       this.contName = contName;
       this.contCharTypeCd = contCharTypeCd;
       this.contSubTargetAmt = contSubTargetAmt;
       this.contCaliAmt = contCaliAmt;
       this.targCaliDiffAmt = targCaliDiffAmt;
       this.landDesc = landDesc;
       this.unitDefineDesc = unitDefineDesc;
       this.amount = amount;
       this.workReqDesc = workReqDesc;
       this.partMateTypeCds = partMateTypeCds;
       this.partMateTypeNames = partMateTypeNames;
       this.partMateTypeIds = partMateTypeIds;
       this.relParentContId = relParentContId;
       this.inviPreCondCds = inviPreCondCds;
       this.inviPreCondNames = inviPreCondNames;
       this.inviPreCondIds = inviPreCondIds;
       this.outDrawDate = outDrawDate;
       this.planStartDate = planStartDate;
       this.relTplDetailId = relTplDetailId;
       this.planEndDate = planEndDate;
       this.tendStartDate = tendStartDate;
       this.memoDesc = memoDesc;
       this.rowTypeCd = rowTypeCd;
       this.contSequNo = contSequNo;
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
    
    @Column(name="COST_CONT_PLAN_DETAIL_ID", unique=true, nullable=false, length=50)
    public String getCostContPlanDetailId() {
        return this.costContPlanDetailId;
    }
    
    public void setCostContPlanDetailId(String costContPlanDetailId) {
        this.costContPlanDetailId = costContPlanDetailId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COST_CONT_PLAN_ID", nullable=false)
    public CostContPlan getCostContPlan() {
        return this.costContPlan;
    }
    
    public void setCostContPlan(CostContPlan costContPlan) {
        this.costContPlan = costContPlan;
    }
    
    @Column(name="DISP_ORDER_DESC", length=40)
    public String getDispOrderDesc() {
        return this.dispOrderDesc;
    }
    
    public void setDispOrderDesc(String dispOrderDesc) {
        this.dispOrderDesc = dispOrderDesc;
    }


    
    @Column(name="SUBJECT_SEQU_NO", precision=10, scale=0)
    public Long getSubjectSequNo() {
        return this.subjectSequNo;
    }
    
    public void setSubjectSequNo(Long subjectSequNo) {
        this.subjectSequNo = subjectSequNo;
    }
    
    
    @Column(name="SUBJECT_CD", length=20)
    public String getSubjectCd() {
        return this.subjectCd;
    }
    
    public void setSubjectCd(String subjectCd) {
        this.subjectCd = subjectCd;
    }
    
    @Column(name="CONT_TYPE_CD", length=20)
    public String getContTypeCd() {
        return this.contTypeCd;
    }
    
    public void setContTypeCd(String contTypeCd) {
        this.contTypeCd = contTypeCd;
    }
    
    @Column(name="CONT_NAME", length=200)
    public String getContName() {
        return this.contName;
    }
    
    public void setContName(String contName) {
        this.contName = contName;
    }
    
    @Column(name="CONT_CHAR_TYPE_CD", length=20)
    public String getContCharTypeCd() {
        return this.contCharTypeCd;
    }
    
    public void setContCharTypeCd(String contCharTypeCd) {
        this.contCharTypeCd = contCharTypeCd;
    }
    
    @Column(name="CONT_SUB_TARGET_AMT", precision=18)
    public BigDecimal getContSubTargetAmt() {
        return this.contSubTargetAmt;
    }
    
    public void setContSubTargetAmt(BigDecimal contSubTargetAmt) {
        this.contSubTargetAmt = contSubTargetAmt;
    }
    
    @Column(name="CONT_CALI_AMT", precision=18)
    public BigDecimal getContCaliAmt() {
        return this.contCaliAmt;
    }
    
    public void setContCaliAmt(BigDecimal contCaliAmt) {
        this.contCaliAmt = contCaliAmt;
    }
    
    @Column(name="TARG_CALI_DIFF_AMT", precision=18)
    public BigDecimal getTargCaliDiffAmt() {
        return this.targCaliDiffAmt;
    }
    
    public void setTargCaliDiffAmt(BigDecimal targCaliDiffAmt) {
        this.targCaliDiffAmt = targCaliDiffAmt;
    }
    
    @Column(name="LAND_DESC", length=200)
    public String getLandDesc() {
        return this.landDesc;
    }
    
    public void setLandDesc(String landDesc) {
        this.landDesc = landDesc;
    }
    
    @Column(name="UNIT_DEFINE_DESC", length=100)
    public String getUnitDefineDesc() {
        return this.unitDefineDesc;
    }
    
    public void setUnitDefineDesc(String unitDefineDesc) {
        this.unitDefineDesc = unitDefineDesc;
    }
    
    @Column(name="AMOUNT", precision=18)
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    
    @Column(name="WORK_REQ_DESC", length=400)
    public String getWorkReqDesc() {
        return this.workReqDesc;
    }
    
    public void setWorkReqDesc(String workReqDesc) {
        this.workReqDesc = workReqDesc;
    }
    
    @Column(name="PART_MATE_TYPE_CDS", length=400)
    public String getPartMateTypeCds() {
        return this.partMateTypeCds;
    }
    
    public void setPartMateTypeCds(String partMateTypeCds) {
        this.partMateTypeCds = partMateTypeCds;
    }
    
    @Column(name="PART_MATE_TYPE_NAMES", length=400)
    public String getPartMateTypeNames() {
        return this.partMateTypeNames;
    }
    
    public void setPartMateTypeNames(String partMateTypeNames) {
        this.partMateTypeNames = partMateTypeNames;
    }
    
    @Column(name="PART_MATE_TYPE_IDS", length=400)
    public String getPartMateTypeIds() {
        return this.partMateTypeIds;
    }
    
    public void setPartMateTypeIds(String partMateTypeIds) {
        this.partMateTypeIds = partMateTypeIds;
    }
    
    @Column(name="REL_PARENT_CONT_ID", length=50)
    public String getRelParentContId() {
        return this.relParentContId;
    }
    
    public void setRelParentContId(String relParentContId) {
        this.relParentContId = relParentContId;
    }
    
    @Column(name="INVI_PRE_COND_CDS", length=400)
    public String getInviPreCondCds() {
        return this.inviPreCondCds;
    }
    
    public void setInviPreCondCds(String inviPreCondCds) {
        this.inviPreCondCds = inviPreCondCds;
    }
    
    @Column(name="INVI_PRE_COND_NAMES", length=400)
    public String getInviPreCondNames() {
        return this.inviPreCondNames;
    }
    
    public void setInviPreCondNames(String inviPreCondNames) {
        this.inviPreCondNames = inviPreCondNames;
    }
    
    @Column(name="INVI_PRE_COND_IDS", length=400)
    public String getInviPreCondIds() {
        return this.inviPreCondIds;
    }
    
    public void setInviPreCondIds(String inviPreCondIds) {
        this.inviPreCondIds = inviPreCondIds;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="OUT_DRAW_DATE", length=7)
    public Date getOutDrawDate() {
        return this.outDrawDate;
    }
    
    public void setOutDrawDate(Date outDrawDate) {
        this.outDrawDate = outDrawDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PLAN_START_DATE", length=7)
    public Date getPlanStartDate() {
        return this.planStartDate;
    }
    
    public void setPlanStartDate(Date planStartDate) {
        this.planStartDate = planStartDate;
    }
    
    @Column(name="REL_TPL_DETAIL_ID", length=50)
    public String getRelTplDetailId() {
        return this.relTplDetailId;
    }
    
    public void setRelTplDetailId(String relTplDetailId) {
        this.relTplDetailId = relTplDetailId;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PLAN_END_DATE", length=7)
    public Date getPlanEndDate() {
        return this.planEndDate;
    }
    
    public void setPlanEndDate(Date planEndDate) {
        this.planEndDate = planEndDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TEND_START_DATE", length=7)
    public Date getTendStartDate() {
        return this.tendStartDate;
    }
    
    public void setTendStartDate(Date tendStartDate) {
        this.tendStartDate = tendStartDate;
    }
    
    @Column(name="MEMO_DESC", length=1000)
    public String getMemoDesc() {
        return this.memoDesc;
    }
    
    public void setMemoDesc(String memoDesc) {
        this.memoDesc = memoDesc;
    }
    
    @Column(name="ROW_TYPE_CD", length=20)
    public String getRowTypeCd() {
        return this.rowTypeCd;
    }
    
    public void setRowTypeCd(String rowTypeCd) {
        this.rowTypeCd = rowTypeCd;
    }
    
    @Column(name="CONT_SEQU_NO", precision=10, scale=0)
    public Long getContSequNo() {
        return this.contSequNo;
    }
    
    public void setContSequNo(Long contSequNo) {
        this.contSequNo = contSequNo;
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

