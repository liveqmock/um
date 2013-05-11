// 
package com.hhz.uums.entity.plas;
// Generated 2011-1-28 17:13:01 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
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
 * PlasApp generated by hbm2java
 */
@Entity
@Table(name="PLAS_APP"
    
)
public class PlasApp  implements java.io.Serializable {


     private String plasAppId;
     private String appCd;
     private String appBizCd;
     private String appEngName;
     private String appChnName;
     private String chiefDocDesc;
     private String appMgrDeptName;
     private String appDevDeptName;
     private String appTypeCd;
     private BigDecimal appUserCount;
     private String appPpChnName;
     private String appPpUiid;
     private String appPpTelphone;
     private String appLinkName;
     private String appLinkTelphone;
     private Date prepareDate;
     private Date productDate;
     private String osPlatformCd;
     private String webAppServerTypeCd;
     private String j2eeServerTypeCd;
     private String baseProdFlg;
     private String prodDesc;
     private String supportLdapFlg;
     private String supportLdapCds;
     private String supportSsoFlg;
     private String joinLoginDomainFlg;
     private String securityPassword;
     private Long sequenceNo;
     private String remark;
     private String creator;
     private String createdCenterCd;
     private String createdPositionCd;
     private Date createdDate;
     private String updator;
     private String updatedCenterCd;
     private String updatedPositionCd;
     private Date updatedDate;
     private long recordVersion;
     private List<PlasRole> plasRoles = new ArrayList<PlasRole>();

    public PlasApp() {
    }

	
    public PlasApp(String plasAppId, long recordVersion) {
        this.plasAppId = plasAppId;
        this.recordVersion = recordVersion;
    }
    public PlasApp(String plasAppId, String appCd, String appBizCd, String appEngName, String appChnName, String chiefDocDesc, String appMgrDeptName, String appDevDeptName, String appTypeCd, BigDecimal appUserCount, String appPpChnName, String appPpUiid, String appPpTelphone, String appLinkName, String appLinkTelphone, Date prepareDate, Date productDate, String osPlatformCd, String webAppServerTypeCd, String j2eeServerTypeCd, String baseProdFlg, String prodDesc, String supportLdapFlg, String supportLdapCds, String supportSsoFlg, String joinLoginDomainFlg, String securityPassword, Long sequenceNo, String remark, String creator, String createdCenterCd, String createdPositionCd, Date createdDate, String updator, String updatedCenterCd, String updatedPositionCd, Date updatedDate, long recordVersion, List<PlasRole> plasRoles) {
       this.plasAppId = plasAppId;
       this.appCd = appCd;
       this.appBizCd = appBizCd;
       this.appEngName = appEngName;
       this.appChnName = appChnName;
       this.chiefDocDesc = chiefDocDesc;
       this.appMgrDeptName = appMgrDeptName;
       this.appDevDeptName = appDevDeptName;
       this.appTypeCd = appTypeCd;
       this.appUserCount = appUserCount;
       this.appPpChnName = appPpChnName;
       this.appPpUiid = appPpUiid;
       this.appPpTelphone = appPpTelphone;
       this.appLinkName = appLinkName;
       this.appLinkTelphone = appLinkTelphone;
       this.prepareDate = prepareDate;
       this.productDate = productDate;
       this.osPlatformCd = osPlatformCd;
       this.webAppServerTypeCd = webAppServerTypeCd;
       this.j2eeServerTypeCd = j2eeServerTypeCd;
       this.baseProdFlg = baseProdFlg;
       this.prodDesc = prodDesc;
       this.supportLdapFlg = supportLdapFlg;
       this.supportLdapCds = supportLdapCds;
       this.supportSsoFlg = supportSsoFlg;
       this.joinLoginDomainFlg = joinLoginDomainFlg;
       this.securityPassword = securityPassword;
       this.sequenceNo = sequenceNo;
       this.remark = remark;
       this.creator = creator;
       this.createdCenterCd = createdCenterCd;
       this.createdPositionCd = createdPositionCd;
       this.createdDate = createdDate;
       this.updator = updator;
       this.updatedCenterCd = updatedCenterCd;
       this.updatedPositionCd = updatedPositionCd;
       this.updatedDate = updatedDate;
       this.recordVersion = recordVersion;
       this.plasRoles = plasRoles;
    }
   
     @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex") 
    
    @Column(name="PLAS_APP_ID", unique=true, nullable=false, length=50)
    public String getPlasAppId() {
        return this.plasAppId;
    }
    
    public void setPlasAppId(String plasAppId) {
        this.plasAppId = plasAppId;
    }
    
    @Column(name="APP_CD", length=20)
    public String getAppCd() {
        return this.appCd;
    }
    
    public void setAppCd(String appCd) {
        this.appCd = appCd;
    }
    
    @Column(name="APP_BIZ_CD", length=20)
    public String getAppBizCd() {
        return this.appBizCd;
    }
    
    public void setAppBizCd(String appBizCd) {
        this.appBizCd = appBizCd;
    }
    
    @Column(name="APP_ENG_NAME", length=100)
    public String getAppEngName() {
        return this.appEngName;
    }
    
    public void setAppEngName(String appEngName) {
        this.appEngName = appEngName;
    }
    
    @Column(name="APP_CHN_NAME", length=100)
    public String getAppChnName() {
        return this.appChnName;
    }
    
    public void setAppChnName(String appChnName) {
        this.appChnName = appChnName;
    }
    
    @Column(name="CHIEF_DOC_DESC", length=100)
    public String getChiefDocDesc() {
        return this.chiefDocDesc;
    }
    
    public void setChiefDocDesc(String chiefDocDesc) {
        this.chiefDocDesc = chiefDocDesc;
    }
    
    @Column(name="APP_MGR_DEPT_NAME", length=100)
    public String getAppMgrDeptName() {
        return this.appMgrDeptName;
    }
    
    public void setAppMgrDeptName(String appMgrDeptName) {
        this.appMgrDeptName = appMgrDeptName;
    }
    
    @Column(name="APP_DEV_DEPT_NAME", length=100)
    public String getAppDevDeptName() {
        return this.appDevDeptName;
    }
    
    public void setAppDevDeptName(String appDevDeptName) {
        this.appDevDeptName = appDevDeptName;
    }
    
    @Column(name="APP_TYPE_CD", length=20)
    public String getAppTypeCd() {
        return this.appTypeCd;
    }
    
    public void setAppTypeCd(String appTypeCd) {
        this.appTypeCd = appTypeCd;
    }
    
    @Column(name="APP_USER_COUNT", precision=38, scale=0)
    public BigDecimal getAppUserCount() {
        return this.appUserCount;
    }
    
    public void setAppUserCount(BigDecimal appUserCount) {
        this.appUserCount = appUserCount;
    }
    
    @Column(name="APP_PP_CHN_NAME", length=50)
    public String getAppPpChnName() {
        return this.appPpChnName;
    }
    
    public void setAppPpChnName(String appPpChnName) {
        this.appPpChnName = appPpChnName;
    }
    
    @Column(name="APP_PP_UIID", length=50)
    public String getAppPpUiid() {
        return this.appPpUiid;
    }
    
    public void setAppPpUiid(String appPpUiid) {
        this.appPpUiid = appPpUiid;
    }
    
    @Column(name="APP_PP_TELPHONE", length=100)
    public String getAppPpTelphone() {
        return this.appPpTelphone;
    }
    
    public void setAppPpTelphone(String appPpTelphone) {
        this.appPpTelphone = appPpTelphone;
    }
    
    @Column(name="APP_LINK_NAME", length=50)
    public String getAppLinkName() {
        return this.appLinkName;
    }
    
    public void setAppLinkName(String appLinkName) {
        this.appLinkName = appLinkName;
    }
    
    @Column(name="APP_LINK_TELPHONE", length=100)
    public String getAppLinkTelphone() {
        return this.appLinkTelphone;
    }
    
    public void setAppLinkTelphone(String appLinkTelphone) {
        this.appLinkTelphone = appLinkTelphone;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PREPARE_DATE", length=7)
    public Date getPrepareDate() {
        return this.prepareDate;
    }
    
    public void setPrepareDate(Date prepareDate) {
        this.prepareDate = prepareDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PRODUCT_DATE", length=7)
    public Date getProductDate() {
        return this.productDate;
    }
    
    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }
    
    @Column(name="OS_PLATFORM_CD", length=20)
    public String getOsPlatformCd() {
        return this.osPlatformCd;
    }
    
    public void setOsPlatformCd(String osPlatformCd) {
        this.osPlatformCd = osPlatformCd;
    }
    
    @Column(name="WEB_APP_SERVER_TYPE_CD", length=20)
    public String getWebAppServerTypeCd() {
        return this.webAppServerTypeCd;
    }
    
    public void setWebAppServerTypeCd(String webAppServerTypeCd) {
        this.webAppServerTypeCd = webAppServerTypeCd;
    }
    
    @Column(name="J2EE_SERVER_TYPE_CD", length=20)
    public String getJ2eeServerTypeCd() {
        return this.j2eeServerTypeCd;
    }
    
    public void setJ2eeServerTypeCd(String j2eeServerTypeCd) {
        this.j2eeServerTypeCd = j2eeServerTypeCd;
    }
    
    @Column(name="BASE_PROD_FLG", length=1)
    public String getBaseProdFlg() {
        return this.baseProdFlg;
    }
    
    public void setBaseProdFlg(String baseProdFlg) {
        this.baseProdFlg = baseProdFlg;
    }
    
    @Column(name="PROD_DESC", length=500)
    public String getProdDesc() {
        return this.prodDesc;
    }
    
    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }
    
    @Column(name="SUPPORT_LDAP_FLG", length=1)
    public String getSupportLdapFlg() {
        return this.supportLdapFlg;
    }
    
    public void setSupportLdapFlg(String supportLdapFlg) {
        this.supportLdapFlg = supportLdapFlg;
    }
    
    @Column(name="SUPPORT_LDAP_CDS", length=200)
    public String getSupportLdapCds() {
        return this.supportLdapCds;
    }
    
    public void setSupportLdapCds(String supportLdapCds) {
        this.supportLdapCds = supportLdapCds;
    }
    
    @Column(name="SUPPORT_SSO_FLG", length=1)
    public String getSupportSsoFlg() {
        return this.supportSsoFlg;
    }
    
    public void setSupportSsoFlg(String supportSsoFlg) {
        this.supportSsoFlg = supportSsoFlg;
    }
    
    @Column(name="JOIN_LOGIN_DOMAIN_FLG", length=1)
    public String getJoinLoginDomainFlg() {
        return this.joinLoginDomainFlg;
    }
    
    public void setJoinLoginDomainFlg(String joinLoginDomainFlg) {
        this.joinLoginDomainFlg = joinLoginDomainFlg;
    }
    
    @Column(name="SECURITY_PASSWORD", length=50)
    public String getSecurityPassword() {
        return this.securityPassword;
    }
    
    public void setSecurityPassword(String securityPassword) {
        this.securityPassword = securityPassword;
    }
    
    @Column(name="SEQUENCE_NO", precision=10, scale=0)
    public Long getSequenceNo() {
        return this.sequenceNo;
    }
    
    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
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
@OneToMany(fetch=FetchType.LAZY, mappedBy="plasApp")
    @BatchSize(size=10)
public List<PlasRole> getPlasRoles() {
        return this.plasRoles;
    }
    
    public void setPlasRoles(List<PlasRole> plasRoles) {
        this.plasRoles = plasRoles;
    }

    private String createdDeptCd;
    private String updatedDeptCd;
    @Column(name="CREATED_DEPT_CD", length=20)
	public String getCreatedDeptCd() {
		return createdDeptCd;
	}


	public void setCreatedDeptCd(String createdDeptCd) {
		this.createdDeptCd = createdDeptCd;
	}

	@Column(name="UPDATED_DEPT_CD", length=20)
	public String getUpdatedDeptCd() {
		return updatedDeptCd;
	}


	public void setUpdatedDeptCd(String updatedDeptCd) {
		this.updatedDeptCd = updatedDeptCd;
	}




}

