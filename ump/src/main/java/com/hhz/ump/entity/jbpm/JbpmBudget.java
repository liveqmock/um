// 
package com.hhz.ump.entity.jbpm;
// Generated 2010-8-4 11:22:38 by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.BatchSize;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JbpmBudget generated by hbm2java
 */
@Entity
@Table(name="JBPM_BUDGET"
    
)
public class JbpmBudget  implements java.io.Serializable {


     private String jbpmBudgetId;
     private String deptCd;
     private BigDecimal budgetYear;
     private BigDecimal budgetMonth;
     private BigDecimal budgetAmount;
     private String remark;
     private String creator;
     private String createdDeptCd;
     private Date createdDate;
     private String updator;
     private String updatedDeptCd;
     private Date updatedDate;
     private long recordVersion;
     private List<JbpmBudgetDetail> jbpmBudgetDetails = new ArrayList<JbpmBudgetDetail>();

    public JbpmBudget() {
    }

	
    public JbpmBudget(String jbpmBudgetId, BigDecimal budgetYear, BigDecimal budgetMonth, long recordVersion) {
        this.jbpmBudgetId = jbpmBudgetId;
        this.budgetYear = budgetYear;
        this.budgetMonth = budgetMonth;
        this.recordVersion = recordVersion;
    }
    public JbpmBudget(String jbpmBudgetId, String deptCd, BigDecimal budgetYear, BigDecimal budgetMonth, BigDecimal budgetAmount, String remark, String creator, String createdDeptCd, Date createdDate, String updator, String updatedDeptCd, Date updatedDate, long recordVersion, List<JbpmBudgetDetail> jbpmBudgetDetails) {
       this.jbpmBudgetId = jbpmBudgetId;
       this.deptCd = deptCd;
       this.budgetYear = budgetYear;
       this.budgetMonth = budgetMonth;
       this.budgetAmount = budgetAmount;
       this.remark = remark;
       this.creator = creator;
       this.createdDeptCd = createdDeptCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedDeptCd = updatedDeptCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.jbpmBudgetDetails = jbpmBudgetDetails;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 

    
    @Column(name="JBPM_BUDGET_ID", unique=true, nullable=false, length=50)
    public String getJbpmBudgetId() {
        return this.jbpmBudgetId;
    }
    
    public void setJbpmBudgetId(String jbpmBudgetId) {
        this.jbpmBudgetId = jbpmBudgetId;
    }

    
    @Column(name="DEPT_CD", length=20)
    public String getDeptCd() {
        return this.deptCd;
    }
    
    public void setDeptCd(String deptCd) {
        this.deptCd = deptCd;
    }

    
    @Column(name="BUDGET_YEAR", nullable=false, precision=38, scale=0)
    public BigDecimal getBudgetYear() {
        return this.budgetYear;
    }
    
    public void setBudgetYear(BigDecimal budgetYear) {
        this.budgetYear = budgetYear;
    }

    
    @Column(name="BUDGET_MONTH", nullable=false, precision=38, scale=0)
    public BigDecimal getBudgetMonth() {
        return this.budgetMonth;
    }
    
    public void setBudgetMonth(BigDecimal budgetMonth) {
        this.budgetMonth = budgetMonth;
    }

    
    @Column(name="BUDGET_AMOUNT", precision=18, scale=4)
    public BigDecimal getBudgetAmount() {
        return this.budgetAmount;
    }
    
    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="jbpmBudget")
    @BatchSize(size=10)
public List<JbpmBudgetDetail> getJbpmBudgetDetails() {
        return this.jbpmBudgetDetails;
    }
    
    public void setJbpmBudgetDetails(List<JbpmBudgetDetail> jbpmBudgetDetails) {
        this.jbpmBudgetDetails = jbpmBudgetDetails;
    }




}


