package com.hhz.ump.web.bid;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springside.modules.orm.Page;
import org.springside.modules.orm.PropertyFilter;
import org.springside.modules.orm.hibernate.HibernateWebUtils;
import org.springside.modules.web.struts2.Struts2Utils;

import com.hhz.core.web.CrudActionSupport;
import com.hhz.ump.dao.bid.BidLedgerManager;
import com.hhz.ump.dao.bid.BidSporadicSupRelManager;
import com.hhz.ump.entity.bid.BidLedger;
import com.hhz.ump.entity.bid.BidSporadicSupRel;

public class BidSporadicSupRelAction  extends
CrudActionSupport<BidSporadicSupRel>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4962783739476402333L;


	@Autowired
	protected BidSporadicSupRelManager bidSporadicSupRelManager;
	@Autowired
	protected BidLedgerManager bidLedgerManager;

	private Page<BidSporadicSupRel> bidSporadicSupRelRs;
	/**
	 * 供应商ID
	 */
	private String bidSupId;
	/**
	 * 工程ID
	 */
	private String projectId;
	/**
	 * 标段
	 */
	private BidLedger bidLedger;
	
	@Override
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBatch() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String list() throws Exception {
		bidSporadicSupRelRs = new Page<BidSporadicSupRel>();
		String sortField = Struts2Utils.getParameter("sort");
		String order = Struts2Utils.getParameter("order");
		String pageNo = Struts2Utils.getParameter("page");
		String rows = Struts2Utils.getParameter("rows");

		List<PropertyFilter> criterions = HibernateWebUtils
				.buildPropertyFilters(Struts2Utils.getRequest());
		PropertyFilter filter;

		// 工程
		if (StringUtils.isNotBlank(this.getProjectId())) {
			filter = new PropertyFilter("EQA_bidProject.bidProjectId", this
					.getProjectId());
			criterions.add(filter);
		}
		// 供应商
		if (StringUtils.isNotBlank(this.getBidSupId())) {
			filter = new PropertyFilter("EQA_bidSup.bidSupId", this
					.getBidSupId());
			criterions.add(filter);
		}
		//轮次号
		String batchNo=Struts2Utils.getParameter("batchno");
		if(StringUtils.isNotBlank(batchNo)){
			if(StringUtils.isNumeric(batchNo)){
				filter=new PropertyFilter("EQA_batchNo",Long.parseLong(batchNo));
				criterions.add(filter);
			}
		}
		if (pageNo != null) {
			page.setPageNo(Integer.valueOf(pageNo));
		}
		if (rows != null) {
			page.setPageSize(Integer.valueOf(rows));
		}
		// 设置默认排序方式
		if (StringUtils.isEmpty(sortField)) {
			page.setOrderBy("rowNo");
			page.setOrder(Page.ASC);
		} else {
			page.setOrderBy(sortField + ",rowNo");
			page.setOrder(order + "," + Page.ASC);
		}
		bidSporadicSupRelRs = bidSporadicSupRelManager.findPage(page, criterions);
		//搜索标段信息
		bidLedger=bidLedgerManager.getBidLedgerByBidSup(this.getBidSupId());
		return "list";
	}

	@Override
	protected void prepareModel() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String save() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BidSporadicSupRel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<BidSporadicSupRel> getBidSporadicSupRelRs() {
		return bidSporadicSupRelRs;
	}

	public void setBidSporadicSupRelRs(Page<BidSporadicSupRel> bidSporadicSupRelRs) {
		this.bidSporadicSupRelRs = bidSporadicSupRelRs;
	}

	public String getBidSupId() {
		return bidSupId;
	}

	public void setBidSupId(String bidSupId) {
		this.bidSupId = bidSupId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public BidLedger getBidLedger() {
		return bidLedger;
	}

	public void setBidLedger(BidLedger bidLedger) {
		this.bidLedger = bidLedger;
	}
	
	

}
