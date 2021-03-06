<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>业态详情维护</title>
	
	<meta http-equiv="Content-Type" content="text/html" />
	<%@ include file="/common/global.jsp" %>
	<%@ include file="/common/meta.jsp"%>
	<link type="text/css" rel="stylesheet" href="${ctx}/resources/css/common/common.css"/>
	<link type="text/css" rel="stylesheet" href="${ctx}/resources/css/common/TreePanel.css"/>
	<link type="text/css" rel="stylesheet" href="${ctx}/resources/css/common/thickbox.css"  />	
	<link type="text/css" rel="stylesheet" href="${ctx}/resources/css/ct/ct.css"  />
	<script type="text/javascript" src="${ctx}/resources/js/jquery/jquery.js"></script>
	<script type="text/javascript" src="${ctx}/resources/js/jquery/jquery.form.pack.js"></script>
	<script type="text/javascript" src="${ctx}/resources/js/common/common.js"></script>
	<script type="text/javascript" src="${ctx}/resources/js/common/TreePanel.js"></script>
	<script type="text/javascript" src="${ctx}/resources/js/common/MaskLayer.js"></script>
	<script type="text/javascript" src="${ctx}/resources/js/jquery/jquery.select.js"></script>
	<script type="text/javascript" src="${ctx}/resources/js/datePicker/WdatePicker.js"></script>
	<script type="text/javascript" src="${ctx}/js/validate/PdValidate.js"></script>
</head>
<body>
	<form action="${ctx}/ct/ct-base-operation!list.action" method="post" id="ctOperationForm" >
	<div id="bodyHead" class="bodyHead">
		<div class="headTitle">
		业态信息维护 &nbsp;&nbsp;&nbsp;&nbsp;
		业态名称：<input type="text"  name="queOperTypeName" value="${operTypeName}" />
		&nbsp;&nbsp;<input  class="btn_green" type="button" onclick="queOperation();"  value="搜索"/>
		&nbsp;&nbsp;<input  class="btn_orange"  type="button" onclick="newOperation();"  value="新增"/>
		</div>
	</div>
	<div style="padding-left:10px;padding-right:10px;border:#DBE5F1;">
	<table width="100%" id="result_table" class="content_table" style="float:left;">
		<thead>
		<tr class="header">
		 	<th style="background: none;" width="10%">序号</th>
		 	<th class="pd-chill-tip" title="业态名称" width="20%">业态名称</th>
		 	<th width="40%">业态说明</th>
		 	<th width="10%">编辑</th>
		 	<th width="10%">删除</th>
		</tr>
		</thead>
		<tbody>
			<s:iterator value="page.result" status="stat">
			<tr class="mainTr"  style="cursor: pointer;">
				<td>
					${stat.index+1}
				</td>	
				<%-- 业态名称 --%>
				<td>
					${operName}
				</td>
				<%-- 业态描述 --%>
				<td>
					${operDesc}
				</td>
				<td>
					<input  class="btn_green" style="width: 60px;" type="button" onclick="editOperation('${ctBaseOperationId}');" value="编辑"/>
				</td>
				<td>
					<input  class="btn_red" style="width: 60px;" type="button" onclick="delCtOperation('${ctBaseOperationId}');" value="删除"/>
				</td>
			</tr>
			</s:iterator>
			<tr>
				<td colspan="9" class="pageFooter">
			  		<p:page pageInfo="page"/>
				</td>
			</tr>
		</tbody>
	</table>
	</div>
	</form>
	<form action="${ctx}/ct/ct-base-operation!vilidateOperName.action" method="post" style="display: none;float:left;" id="ctOperSaveForm">
			<input type="hidden" name="id" class="clear" id="id" />
			<fieldset style="padding-left: 10px;padding-right: 10px;border:#DBE5F1 ">
				 <legend >&nbsp;&nbsp;&nbsp;&nbsp;业态详细信息<font class="editOperation" style="display: none;">[修改]</font></legend>
				 <table class="shop-table">
			          <col width="100"/>
				      <col />
					  <col width="100"/>
					  <col />
					<tr>
					     <td><font style="color:red;">*</font>业态名称</td>
					     <td colspan="3"><input type="hidden" id="orginOperName"/>
					     <input type="hidden" id=""/>
					     <input type="text" class="clear" maxlength="50" name="operName" id="operName" validate="required" /></td>
					</tr>
					  <tr>
					   <td>业态说明</td>
				       <td colspan="3" rowspan="3"><textarea class="clear" id="operDesc"   onKeyUp="if(this.value.length > 200) this.value=this.value.substr(0,200)" style="width:100%;height:100px;background-color: #DBE5F1;border: none;" name="operDesc"></textarea></td>
					 </tr>
				 </table>
				 <div style="float:left;font-size:12px;padding-right:20px;line-height:30px;width:100%;">
					<table  class="main_content" border="0" cellpadding="0" cellspacing="0"  style="width:100%;height:100%;table-layout:fixed">
						<col width="750"/>
						<tr>
							<td   style="padding-right: 0px">
							<input  class="btn_green"  type="button" onclick="saveCtOperation();" value="保存"/>
							<input  class="btn_green"  type="button" onclick="outCtOperation();" value="取消"/>
							</td>
						</tr>
					</table>
				</div>
			 </fieldset>
		</div>	
	</form>
<script type="text/javascript">
$(function(){
}); 
String.prototype.trim = function() {
	// 用正则表达式将前后空格
	// 用空字符串替代。
	var t = this.replace(/(^\s*)|(\s*$)/g, "");
	return t.replace(/(^　*)|(　*$)/g, "");
};
function saveCtOperation(){
	var pdv = new Validate("ctOperSaveForm");
	var operName =  $("#operName").val().trim();
	if (operName==""){
		alert("业态名称不能为空");
		$("#operName").focus();
		return;
		}
	$("#operName").val(operName);
	if (pdv.validate()) {
		$('#ctOperSaveForm').ajaxSubmit(function(result) {
			if(result=="业态名称已存在" ){
				alert(result);
			}else{
				$("#ctOperationForm").submit();
			}
		});
	}
}
function jumpPage(pageNo) {
	$("#pageNo").val(pageNo);
	$("#ctOperationForm").submit();
}
function jumpPageTo() {
		var index = $("#pageTo").val();
		index = parseInt(index);
		if (index > 0) {
			jumpPage(index);
		}
}
function editOperation(id){
	$('.editOperation').show();
	$('#ctOperSaveForm').show();
	$('#operDesc').val('');
	//$('#operName').val('');
	var data={id:id};
	$.post("${ctx}/ct/ct-base-operation!editOperation.action",
			data,
			function(data) {
				var data = eval('('+data+')');
				$.each(data,function(i,n){
				if(i=="operName"){
                         $("#orginOperName").val(n);
					}
					     $('#'+i).val(n);
					   
				});
			}
		);
}
function outCtOperation(){
	//$('.editOperation').hide();
	$('#ctOperSaveForm').hide();
}
function newOperation(){
	$("#id").val('');
	$('.clear').val('');
	$('.editOperation').hide();
	$('#ctOperSaveForm').show();
}
function delCtOperation(id){
	if(id!=null){
		if(confirm("确定要删除该条记录吗？")){
			var url="${ctx}/ct/ct-base-operation!delete.action";
			$.post(url,{id:id},
					function(result) {
				if('success' == result){
					queOperation();
				}else{
					alert(result);
					return false;
				}
					});
		}
	}
}
function queOperation(){
	$("#ctOperationForm").submit();
}
</script>
</body>
</html>