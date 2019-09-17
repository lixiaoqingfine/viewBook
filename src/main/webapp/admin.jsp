<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><!--ssssssss-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><!--5555-->
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%><!--33-->

<!--2222-->
<link rel="stylesheet" type="text/css" href="${APP_PATH }/css/common/bootstrap.min.css" />
  <link rel="stylesheet" type="text/css" href="${APP_PATH }/css/common/bootstrap-table.css" />
  <link rel="stylesheet" type="text/css" href="${APP_PATH }/css/common/jquery-ui-1.10.0.custom.css" />
  <link rel="stylesheet" type="t221ext/css" href="${APP_PATH }/css/common/bootstrap-table.css" />
  <link rel="stylesheet" type="t222ext/css" href="${APP_PATH }/css/common/jquery-ui-1.10.0.custom.css" />
  <link rel="stylesheet" type="text/css" href="${APP_PATH }/css/templatemo/templatemo_main.css" />
  <!--动态标签页的样式-->
  <link rel="stylesheet" type="text/css" href="${APP_PATH }/css/ui-tabs/ui-tabs.css" />
  <!--manage页面的样式-->
  
  <!--login页面的样式-->
  <link rel="stylesheet" href="${APP_PATH }/page/login/login.css" />
  <!--register页面的样式-->
  <link rel="stylesheet" type="text/css" href="${APP_PATH }/page/register/register.css"/>
 <script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
  <script src="${APP_PATH }/js/common/jquery.min.js"></script> 
  <script src="${APP_PATH }/js/common/jquery-ui-1.9.2.custom.min.js"></script>
  <script src="${APP_PATH }/js/common/bootstrap.min.js"></script>
  <script src="${APP_PATH }/js/common/bootstrap-table.js"></script>

<title>Insert title here</title>

<script>
function setCookie(cname,cvalue,exdays){
	var d = new Date();
	d.setTime(d.getTime()+(exdays*24*60*60*1000));
	var expires = "expires="+d.toGMTString();
	document.cookie = cname+"="+cvalue+"; "+expires;
}
function getCookie(cname){
	var name = cname + "=";
	var ca = document.cookie.split(';');
	for(var i=0; i<ca.length; i++) {
		var c = ca[i].trim();
		if (c.indexOf(name)==0) { return c.substring(name.length,c.length); }
	}
	return "";
}
function checkCookie(){
	var user=getCookie("username");
	 if (user==""){
		window.history.back(-1);
	} 
	}
</script>

</head>

<body onload="checkCookie()">
<!-- 新增景点信息模态框-->
 <div class="modal fade" id="scenicAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" style="width:1300px">
    <div class="modal-content" style="height:440px">
      <div class="modal-header" style="height:70px">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">景点信息添加</h4>
      </div>
      <div class="modal-body" style="height:300px">
       <form class="form-inline ">
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">景区名称</label>
		    <input type="text" class="form-control" name="scenicName">
		  </div>
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">星级</label>
		    <input type="text" class="form-control" name="level">
		  </div>
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">评分</label>
		    <input type="text" class="form-control" name="score">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">地址</label>
		    <input type="text" class="form-control" name="address">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">标签一</label>
		    <input type="text" class="form-control" name="typeOne">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">标签二</label>
		    <input type="text" class="form-control" name="typeTwo">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">标签三</label>
		    <input type="text" class="form-control" name="typeThree">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">搜索量</label>
		    <input type="text" class="form-control" name="searchNum">
		  </div>
		  
		 <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">坐标位置</label>
		    <input type="text" class="form-control" name="location">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">经度</label>
		    <input type="text" class="form-control" name="longitude">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">纬度</label>
		    <input type="text" class="form-control" name="latitude">
		  </div>
		  

		  
				  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">景点简介一</label>
		    <input type="text" class="form-control" name="scenicpresentOne">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">景点简介二</label>
		    <input type="text" class="form-control" name="scenicpresentTwo">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图一</label>
		     <input type="text" class="form-control" name="wheelImgOne">
		  </div>
		    <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图二</label>
		     <input type="text" class="form-control" name="wheelImgTwo">
		  </div>
		    <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图三</label>
		    <input type="text" class="form-control" name="wheelImgThree">
		  </div>
		    <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图四</label>
		  <input type="text" class="form-control" name="wheelImgFour">
		  </div>
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图五</label>
		    <input type="text" class="form-control" name="wheelImgFive">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">详情页图一</label>
		    <input type="text" class="form-control" name="photoOne">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">详情页图二</label>
		    <input type="text" class="form-control" name="photoTwo">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">详情页图三</label>
		    <input type="text" class="form-control" name="photoThree">
		  </div>
		  
		    <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">成人票价格</label>
		    <input type="text" class="form-control" name="price">
		  </div>
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">儿童票价格</label>
		    <input type="text" class="form-control" name="childPrice">
		  </div>
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">老人票价格</label>
		    <input type="text" class="form-control" name="olderPrice">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">境内/境外</label>
		    <select class="form-control" id="worldName" name="worldId">
		      </select>
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">所属区域</label>
		    <select class="form-control" id="addressName" name="addressId">
		      </select>
		  </div>
		  
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">所在地区</label>
		    <select class="form-control" id="regionName" name="regionId">
		      </select>
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">主题类型</label>
		    <select class="form-control" id="themeName" name="themeId">
		      </select>
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">是否推荐</label>
		        <label class="radio-inline">
				  <input type="radio" name="isRecommend" id="recommend1_add_input" value="1" checked="checked"> 是
				</label>
				<label class="radio-inline">
				  <input type="radio" name="isRecommend" id="recommend2_add_input" value="0"> 否
				</label>
		  </div>
		  
		    <div class="form-group col-md-2">
		     <label for="exampleInputPassword1">是否特价</label>
		        <label class="radio-inline">
				  <input type="radio" name="isCheap" id="cheap1_add_input" value="1" checked="checked"> 是
				</label>
				<label class="radio-inline">
				  <input type="radio" name="isCheap" id="cheap2_add_input" value="0"> 否
				</label>
		  </div>	  
	</form>
      </div>
      <div class="modal-footer" style="height:70px">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="scenic_save_btn">保存</button>
      </div>
    </div>
  </div>
</div> 

<!-- 修改景点信息模态框-->
 <div class="modal fade" id="scenicUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" style="width:1300px">
    <div class="modal-content" style="height:440px">
      <div class="modal-header" style="height:70px">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">修改景点信息</h4>
      </div>
      <div class="modal-body" style="height:300px">
       <form class="form-inline ">
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">景区名称</label>
		    <input type="text" class="form-control" id="scenicName_update_input" name="scenicName">
		  </div>
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">星级</label>
		    <input type="text" class="form-control" id="level_update_input" name="level">
		  </div>
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">评分</label>
		    <input type="text" class="form-control" id="score_update_input" name="score">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">地址</label>
		    <input type="text" class="form-control" id="address_update_input" name="address">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">标签一</label>
		    <input type="text" class="form-control" id="typeOne_update_input" name="typeOne">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">标签二</label>
		    <input type="text" class="form-control" id="typeTwo_update_input" name="typeTwo">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">标签三</label>
		    <input type="text" class="form-control" id="typeThree_update_input"  name="typeThree">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">搜索量</label>
		    <input type="text" class="form-control" id="searchNum_update_input" name="searchNum">
		  </div>
		  
		 <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">坐标位置</label>
		    <input type="text" class="form-control" id="location_update_input" name="location">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">经度</label>
		    <input type="text" class="form-control" id="longitude_update_input" name="longitude">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">纬度</label>
		    <input type="text" class="form-control" id="latitude_update_input" name="latitude">
		  </div>
		  

		  
				  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">景点简介一</label>
		    <input type="text" class="form-control" id="scenicpresentOne_update_input" name="scenicpresentOne">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">景点简介二</label>
		    <input type="text" class="form-control" id="scenicpresentTwo_update_input" name="scenicpresentTwo">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图一</label>
		     <input type="text" class="form-control" id="wheelImgOne_update_input" name="wheelImgOne">
		  </div>
		    <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图二</label>
		     <input type="text" class="form-control" id="wheelImgTwo_update_input" name="wheelImgTwo">
		  </div>
		    <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图三</label>
		    <input type="text" class="form-control"  id="wheelImgThree_update_input" name="wheelImgThree">
		  </div>
		    <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图四</label>
		  <input type="text" class="form-control" id="wheelImgFour_update_input" name="wheelImgFour">
		  </div>
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">轮播图五</label>
		    <input type="text" class="form-control" id="wheelImgFive_update_input" name="wheelImgFive">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">详情页图一</label>
		    <input type="text" class="form-control" id="photoOne_update_input" name="photoOne">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">详情页图二</label>
		    <input type="text" class="form-control" id="photoTwo_update_input" name="photoTwo">
		  </div>
		  
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">详情页图三</label>
		    <input type="text" class="form-control" id="photoThree_update_input" name="photoThree">
		  </div>
		  
		    <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">成人票价格</label>
		    <input type="text" class="form-control" id="price_update_input" name="price">
		  </div>
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">儿童票价格</label>
		    <input type="text" class="form-control" id="childPrice_update_input" name="childPrice">
		  </div>
		   <div class="form-group col-md-2">
		    <label for="exampleInputEmail1">老人票价格</label>
		    <input type="text" class="form-control" id="olderPrice_update_input" name="olderPrice">
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">境内/境外</label>
		    <select class="form-control" id="worldName_update" name="worldId">
		      </select>
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">所属区域</label>
		    <select class="form-control" id="addressName_update" name="addressId">
		      </select>
		  </div>
		  
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">所在地区</label>
		    <select class="form-control" id="regionName_update" name="regionId">
		      </select>
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">主题类型</label>
		    <select class="form-control" id="themeName_update" name="themeId">
		      </select>
		  </div>
		  
		  <div class="form-group col-md-2">
		    <label for="exampleInputPassword1">是否推荐</label>
		        <label class="radio-inline">
				  <input type="radio" name="isRecommend" id="recommend1_update_input" value="1" checked="checked"> 是
				</label>
				<label class="radio-inline">
				  <input type="radio" name="isRecommend" id="recommend2_update_input" value="0"> 否
				</label>
		  </div>
		  
		    <div class="form-group col-md-2">
		     <label for="exampleInputPassword1">是否特价</label>
		        <label class="radio-inline">
				  <input type="radio" name="isCheap" id="cheap1_update_input" value="1" checked="checked"> 是
				</label>
				<label class="radio-inline">
				  <input type="radio" name="isCheap" id="cheap2_update_input" value="0"> 否
				</label>
		  </div>	  
	</form>
      </div>
      <div class="modal-footer" style="height:70px">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="scenic_update_btn">更新</button>
      </div>
    </div>
  </div>
</div> 


<!-- 弹出评论模态框-->
 <div class="modal fade" id="commentModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" style="width:700px">
    <div class="modal-content" style="height:280px">
      <div class="modal-header" style="height:60px">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">查看评论</h4>
      </div>
      <div class="modal-body" style="height:160px">
       <form class="form-inline ">
		   <div class="form-group col-md-6">
		    <label for="exampleInputEmail1">客人评论</label>
		   <textarea cols="25" class="form-control" rows="3" id="visitorcomment"></textarea>
		  </div>
		  <div class="form-group col-md-6">
		    <label for="exampleInputEmail1">管理员回复</label>
		   <textarea cols="25" class="form-control" rows="3" id="admincomment"></textarea>
		  </div>	  
	</form>
      </div>
      <div class="modal-footer" style="height:60px">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="comment_btn">回复</button>
      </div>
    </div>
  </div>
  </div>





<div class="container">
    <div class="navbar navbar-inverse" role="navigation">
    <div class="navbar-header">
      <div class="logo">
        <h1 style="color:white">景区门票后台管理系统</h1>
         <a href="#"  data-toggle="modal" data-target="#confirmModal" style="position:absolute;right:80px;top:50%;margin-top:-10px;color:white;">
          <i class="fa fa-sign-out"></i>注销登录
        </a>
      </div>
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
    </div>
  </div>
  <div class="template-page-wrapper">
    <!--/.navbar-collapse -->
    <div class="navbar-collapse collapse templatemo-sidebar">
      <ul class="templatemo-sidebar-menu tabsmenu" id="tabr">
        <!-- 点击部分 -->
      <!--   <li class="active">
          <a href="#" id="menu1"><i class="fa fa-suitcase"></i>Position</a>
        </li> -->
        <li class="active">
          <a href="#" id="menu1"><i class="fa fa-suitcase"></i>景点管理</a>
        </li>
        <li>
          <a href="#" id="menu4"><i class="fa fa-suitcase"></i>订单管理</a>
        </li>
        <!-- <li>
          <a href="#" id="menu2"><i class="fa fa-user"></i>Log In</a>
        </li>
         <li>
          <a href="#" id="menu3"><i class="fa fa-user"></i>地区管理</a>
        </li> --> 
       
        <!-- /点击部分 -->
      </ul>
    </div>
    <div class="templatemo-content-wrapper">
      <div class="templatemo-content">
        <!-- 内容部分 -->
        <div id="tabs2" class="tabs">
          <ul class="nav">
            <li>
            	<a href="#tabs-menu0">Welcome</a>
            </li>
          </ul>
          <div class="tab-content" id="tabcontent">
          	<div id="tabs-menu0" class="tab-pane active"><h1>欢迎您！进入景点门票后台管理系统 </h1></div>
            <div id="tabs-menu1" class="tab-pane"></div>
            <div id="tabs-menu2" class="tab-pane"></div>
            <div id="tabs-menu3" class="tab-pane"></div>
             <div id="tabs-menu4" class="tab-pane"></div>
           
           
          </div>
        </div>
      </div>
    </div>
    <footer class="templatemo-footer">
      <div class="templatemo-copyright">
        <p>景区门票后台管理系统</p>
      </div>
    </footer>
    <div id="modals-menu1"></div>
  </div>

<script>
//点击更新，更新景点信息
$("#scenic_update_btn").click(function(){
	var adultticket=$(this).attr("adultticket-id");
	var childticket=$(this).attr("childticket-id");
	var olderticket=$(this).attr("olderticket-id");
	 $.ajax({
		url:"${APP_PATH}/updatescenic/"+$(this).attr("edit-id"),
		type:"PUT",
		data:$("#scenicUpdateModal form").serialize(),
		success:function(result){	
			 $.ajax({
					url:"${APP_PATH}/updateadultticket/"+adultticket,
					type:"PUT",
					data:$("#scenicUpdateModal form").serialize(),
					success:function(result){	
						  $.ajax({
								url:"${APP_PATH}/updatechildticket/"+childticket,
								type:"PUT",
								data:$("#scenicUpdateModal form").serialize(),
								success:function(result){	
										 $.ajax({
												url:"${APP_PATH}/updateolderticket/"+olderticket,
												type:"PUT",
												data:$("#scenicUpdateModal form").serialize(),
												success:function(result){	
										            
												}
										 });	
								}
						 });	 
					}
			 });	
			$("#scenicUpdateModal").modal("hide");
			to_page(currentPage);
		}
	}); 
});

//管理员回复评论
$("#comment_btn").click(function(){
	//alert($('#commentModal #admincomment').val());
	$.ajax({
		url:"${APP_PATH}/updatecomment/"+$(this).attr("comment-id"),
		data:{
			adminContent:$('#commentModal #admincomment').val()
		},
		type:"PUT",
		success:function(result){
			console.log("管理员回复成功");
			$("#commentModal").modal("hide");
			to_page(currentPage1);
		}
	});
});


function quit(){
	var user=getCookie("username");
	setCookie("username",user,-30);
	checkCookie();
   }
   
$(function(){
	//去首页
	to_page(1);
	to_page1(1);
});

function to_page(pn){
	$.ajax({
		url:"${APP_PATH}/searchHot_page",
		data:"pn="+pn,
		type:"GET",
		success:function(result){
			//显示table数据
			 build_scenic_table(result); 
			//显示页码数据
			 build_page_info(result);
				//3、解析显示分页条数据
			build_page_nav(result);
		}
	});
}

function to_page1(pn){
	$.ajax({
		url:"${APP_PATH}/searchOrder_page",
		data:"pn="+pn,
		type:"GET",
		success:function(result){
			//显示table数据
			 build_order_table(result); 
			//显示页码数据
			 build_page_info1(result);
				//3、解析显示分页条数据
			build_page_nav1(result);
		}
	});
}

//显示table数据
function build_scenic_table(result){
	 $("#scenic_table tbody").empty(); 
	var scenic=result.extend.pageInfo.list;
	$.each(scenic,function(index,item){
		var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
		var scenicIdTd=$("<td></td>").append(item.scenicId);
	   var scenicName = $("<td></td>").append(item.scenicName);
	   var level=$("<td></td>").append(item.level);
	   var score=$("<td></td>").append(item.score);
	   var worldName=$("<td></td>").append(item.world.worldName);
	   var addressName=$("<td></td>").append(item.address1.addressName);
	   var regionName=$("<td></td>").append(item.region.regionName);
	   var themeName=$("<td></td>").append(item.theme.themeName);
	   var isRecommend=$("<td></td>").append(item.isRecommend=="1"?"是":"否");
	   var isCheap=$("<td></td>").append(item.isCheap=="1"?"是":"否");
	   var searchNum=$("<td></td>").append(item.searchNum);
	   var typeOne=$("<td></td>").append(item.typeOne);
	   var typeTwo=$("<td></td>").append(item.typeTwo);
	   var typeThree=$("<td></td>").append(item.typeThree);
	   var adultprice=$("<td></td>").append(item.adultticket.price);
	   var olderprice=$("<td></td>").append(item.olderticket.olderPrice);
	   var childprice=$("<td></td>").append(item.childticket.childPrice);
	   var location=$("<td></td>").append(item.location);
	   var latitude=$("<td></td>").append(item.latitude);
	   var longitude=$("<td></td>").append(item.longitude);
	   var scenicpresentOne=$("<td></td>").append(item.scenicpresentOne);
	   var scenicpresentTwo=$("<td></td>").append(item.scenicpresentTwo);
	  /*  var wheelImgOne=$("<td></td>").append(item.wheelImgOne);
	   var wheelImgTwo=$("<td></td>").append(item.wheelImgTwo);
	   var wheelImgThree=$("<td></td>").append(item.wheelImgThree);
	   var wheelImgFour=$("<td></td>").append(item.wheelImgFour);
	   var wheelImgFive=$("<td></td>").append(item.wheelImgFive);
	  var photoOne=$("<td></td>").append(item.photoOne);
	   var photoTwo=$("<td></td>").append(item.photoTwo);
	   var photoThree=$("<td></td>").append(item.photoThree);
	   var photoFour=$("<td></td>").append(item.photoFour);	 */
	    var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-primary btn-sm edit_btn")
		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
		//为编辑按钮添加一个自定义的属性，来表示当前员工id
		 editBtn.attr("edit-id",item.scenicId);
		 editBtn.attr("adultticket-id",item.adultId); 
		 editBtn.attr("childticket-id",item.childId); 
		 editBtn.attr("olderticket-id",item.olderId); 
	  var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
				.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
	//为删除按钮添加一个自定义的属性来表示当前删除的员工id
		 delBtn.attr("del-id",item.scenicId); 
		var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);  
		//append方法执行完成以后还是返回原来的元素
		$("<tr></tr>").append(checkBoxTd)
			.append(scenicIdTd)
			 .append(scenicName)
			.append(level)
			 .append(score)
			.append(worldName)
			.append(addressName)
			.append(regionName)
			.append(themeName)
			.append(isRecommend)
			.append(isCheap)
			.append(searchNum)
			.append(typeOne)
			.append(typeTwo)
			.append(typeThree)
			.append(adultprice)
			.append(olderprice)
			.append(childprice)
			.append(location)
			.append(latitude)
			.append(longitude)
			.append(scenicpresentOne)
			.append(scenicpresentTwo)
			/* .append(wheelImgOne)
			.append(wheelImgTwo)
			.append(wheelImgThree)
			.append(wheelImgFour)
			.append(wheelImgFive)
			.append(photoOne)
			.append(photoTwo)
			.append(photoThree)
			.append(photoFour) */
			.append(btnTd)  
			.appendTo("#scenic_table tbody");
	});
}


function build_order_table(result){
	 $("#order_table tbody").empty(); 
	var order=result.extend.pageInfo.list;
	$.each(order,function(index,item){
		var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
		checkBoxTd.attr("order-id",item.orderId); 
		var orderIdTd=$("<td></td>").append(item.orderId);
	   var userId = $("<td></td>").append(item.userId);
	   var scenicName=$("<td></td>").append(item.scenicName);
	   var ticketNum=$("<td></td>").append(item.ticketNum);
	   var ticketPrice=$("<td></td>").append(item.ticketPrice);
	   
	   var orderComment=$("<td></td>").append(item.orderComment=="1"?"待评论":"已评论");
	   var orderUsed=$("<td></td>").append(item.orderUsed=="1"?"已使用":"待使用");
	   var orderbuildTime=$("<td></td>").append(item.orderbuildTime);
	   var orderuseTime=$("<td></td>").append(item.orderuseTime);
	   var visitorName=$("<td></td>").append(item.visitorName);
	   var visitorPhone=$("<td></td>").append(item.visitorPhone);
	   var code=$("<td></td>").append(item.code);
	    if(item.orderUsed =="0"){
	    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm replay_btn")
	 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批");
	 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
	 		 editBtn.attr("edit1-id",item.orderId); 
	    }else{
	    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm disabled replay_btn")
		 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批"); 	
	    }
	   if(item.commentId==""||item.commentId==null){
		   var commentBtn = $('<button id="editBtn1"></button>').addClass("btn btn-info btn-sm disabled comment_btn")
	 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("查看评论");
	   }else{
		   var commentBtn = $('<button id="editBtn1"></button>').addClass("btn btn-info btn-sm comment_btn")
	 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("查看评论");
	 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
	 		 commentBtn.attr("comment-id",item.commentId); 
	 		 commentBtn.attr("order-id",item.orderId); 
	   }
	   
	  var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete1_btn")
				.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
	//为删除按钮添加一个自定义的属性来表示当前删除的员工id
		 delBtn.attr("del1-id",item.orderId); 
		var btnTd = $("<td></td>").append(editBtn).append(" ").append(commentBtn).append(" ").append(delBtn);  
		//append方法执行完成以后还是返回原来的元素
		$("<tr></tr>").append(checkBoxTd)
			.append(orderIdTd)
			 .append(userId)
			.append(scenicName)
			 .append(ticketNum)
			.append(ticketPrice)
			.append(orderComment)
			.append(orderUsed)
			.append(orderbuildTime)
			.append(orderuseTime)
			.append(visitorName)
			.append(visitorPhone)
			.append(code)
			.append(btnTd)  
			.appendTo("#order_table tbody");
	});
}



//解析显示分页信息
function build_page_info(result){
	 $("#page_info_area").empty();
	$("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
			result.extend.pageInfo.pages+"页,总"+
			result.extend.pageInfo.total+"条记录");
	totalRecord = result.extend.pageInfo.total;
	currentPage = result.extend.pageInfo.pageNum; 
}

function build_page_info1(result){
	 $("#page_info_area1").empty();
	$("#page_info_area1").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
			result.extend.pageInfo.pages+"页,总"+
			result.extend.pageInfo.total+"条记录");
	totalRecord1 = result.extend.pageInfo.total;
	currentPage1 = result.extend.pageInfo.pageNum; 
}



function build_page_nav(result){
	//page_nav_area
	$("#page_nav_area").empty();
	var ul = $("<ul></ul>").addClass("pagination");
	
	//构建元素
	var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
	var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
	if(result.extend.pageInfo.hasPreviousPage == false){
		firstPageLi.addClass("disabled");
		prePageLi.addClass("disabled");
	}else{
		//为元素添加点击翻页的事件
		firstPageLi.click(function(){
			to_page(1);
		});
		prePageLi.click(function(){
			to_page(result.extend.pageInfo.pageNum -1);
		});
	}
	var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
	var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
	if(result.extend.pageInfo.hasNextPage == false){
		nextPageLi.addClass("disabled");
		lastPageLi.addClass("disabled");
	}else{
		nextPageLi.click(function(){
			to_page(result.extend.pageInfo.pageNum +1);
		});
		lastPageLi.click(function(){
			to_page(result.extend.pageInfo.pages);
		});
	}
	
	//订单管理切换待使用
	 $("#used").click(function(){
		var orderUsed="1"; 
				  $.ajax({
					  url:"${APP_PATH}/findorderused",
					  data:{
						  orderUsed:orderUsed
					  },
					  type:"GET",
					  success:function(result){
						  $("#order_table tbody").empty();
						  var order=result.extend.orderinfo;
						  $.each(order,function(index,item){
								var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
								var orderIdTd=$("<td></td>").append(item.orderId);
							   var userId = $("<td></td>").append(item.userId);
							   var scenicName=$("<td></td>").append(item.scenicName);
							   var ticketNum=$("<td></td>").append(item.ticketNum);
							   var ticketPrice=$("<td></td>").append(item.ticketPrice);						   
							   var orderComment=$("<td></td>").append(item.orderComment=="1"?"待评论":"已评论");
							   var orderUsed=$("<td></td>").append(item.orderUsed=="1"?"已使用":"待使用");
							   var orderbuildTime=$("<td></td>").append(item.orderbuildTime);
							   var orderuseTime=$("<td></td>").append(item.orderuseTime);
							   var visitorName=$("<td></td>").append(item.visitorName);
							   var visitorPhone=$("<td></td>").append(item.visitorPhone);
							   var code=$("<td></td>").append(item.code);				
							   if(item.orderUsed =="0"){
							    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm replay_btn")
							 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批");
							 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
							 		 editBtn.attr("edit1-id",item.orderId); 
							    }else{
							    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm disabled replay_btn")
								 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批"); 	
							    }
							   var commentBtn = $('<button id="editBtn1"></button>').addClass("btn btn-info btn-sm comment_btn")
						 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("查看评论");
						 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
						 		 commentBtn.attr("comment-id",item.commentId); 
						 		 commentBtn.attr("order-id",item.orderId); 
							  var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete1_btn")
										.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
							//为删除按钮添加一个自定义的属性来表示当前删除的员工id
								delBtn.attr("del1-id",item.orderId); 
								var btnTd = $("<td></td>").append(editBtn).append(" ").append(commentBtn).append(" ").append(delBtn); 
								//append方法执行完成以后还是返回原来的元素
								$("<tr></tr>").append(checkBoxTd)
								.append(orderIdTd)
								 .append(userId)
								.append(scenicName)
								 .append(ticketNum)
								.append(ticketPrice)
								.append(orderComment)
								.append(orderUsed)
								.append(orderbuildTime)
								.append(orderuseTime)
								.append(visitorName)
								.append(visitorPhone)
								.append(code)
								.append(btnTd)  
								.appendTo("#order_table tbody");
						  });
					  }			 
				  })		  
		});
	
	//订单管理切换待使用
	 $("#replay").click(function(){
		var orderUsed="0"; 
				  $.ajax({
					  url:"${APP_PATH}/findorderused",
					  data:{
						  orderUsed:orderUsed
					  },
					  type:"GET",
					  success:function(result){
						  $("#order_table tbody").empty();
						  var order=result.extend.orderinfo;
						  $.each(order,function(index,item){
								var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
								var orderIdTd=$("<td></td>").append(item.orderId);
							   var userId = $("<td></td>").append(item.userId);
							   var scenicName=$("<td></td>").append(item.scenicName);
							   var ticketNum=$("<td></td>").append(item.ticketNum);
							   var ticketPrice=$("<td></td>").append(item.ticketPrice);						   
							   var orderComment=$("<td></td>").append(item.orderComment=="1"?"待评论":"已评论");
							   var orderUsed=$("<td></td>").append(item.orderUsed=="1"?"已使用":"待使用");
							   var orderbuildTime=$("<td></td>").append(item.orderbuildTime);
							   var orderuseTime=$("<td></td>").append(item.orderuseTime);
							   var visitorName=$("<td></td>").append(item.visitorName);
							   var visitorPhone=$("<td></td>").append(item.visitorPhone);
							   var code=$("<td></td>").append(item.code);				
							   if(item.orderUsed =="0"){
							    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm replay_btn")
							 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批");
							 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
							 		 editBtn.attr("edit1-id",item.orderId); 
							    }else{
							    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm disabled replay_btn")
								 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批"); 	
							    }
							   var commentBtn = $('<button id="editBtn1"></button>').addClass("btn btn-info btn-sm comment_btn")
						 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("查看评论");
						 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
						 		 commentBtn.attr("comment-id",item.commentId); 
						 		 commentBtn.attr("order-id",item.orderId); 
							  var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete1_btn")
										.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
							//为删除按钮添加一个自定义的属性来表示当前删除的员工id
								delBtn.attr("del1-id",item.orderId); 
								var btnTd = $("<td></td>").append(editBtn).append(" ").append(commentBtn).append(" ").append(delBtn); 
								//append方法执行完成以后还是返回原来的元素
								$("<tr></tr>").append(checkBoxTd)
								.append(orderIdTd)
								 .append(userId)
								.append(scenicName)
								 .append(ticketNum)
								.append(ticketPrice)
								.append(orderComment)
								.append(orderUsed)
								.append(orderbuildTime)
								.append(orderuseTime)
								.append(visitorName)
								.append(visitorPhone)
								.append(code)
								.append(btnTd)  
								.appendTo("#order_table tbody");
						  });
					  }			 
				  })		  
		});
	

		//订单管理切换待回复
		 $("#comment").click(function(){
			var orderComment="1"; 
					  $.ajax({
						  url:"${APP_PATH}/findordercomment",
						  data:{
							  orderComment:orderComment
						  },
						  type:"GET",
						  success:function(result){
							  $("#order_table tbody").empty();
							  var order=result.extend.orderinfo;
							  $.each(order,function(index,item){
									var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
									var orderIdTd=$("<td></td>").append(item.orderId);
								   var userId = $("<td></td>").append(item.userId);
								   var scenicName=$("<td></td>").append(item.scenicName);
								   var ticketNum=$("<td></td>").append(item.ticketNum);
								   var ticketPrice=$("<td></td>").append(item.ticketPrice);						   
								   var orderComment=$("<td></td>").append(item.orderComment=="1"?"待评论":"已评论");
								   var orderUsed=$("<td></td>").append(item.orderUsed=="1"?"已使用":"待使用");
								   var orderbuildTime=$("<td></td>").append(item.orderbuildTime);
								   var orderuseTime=$("<td></td>").append(item.orderuseTime);
								   var visitorName=$("<td></td>").append(item.visitorName);
								   var visitorPhone=$("<td></td>").append(item.visitorPhone);
								   var code=$("<td></td>").append(item.code);				
								   if(item.orderUsed =="0"){
								    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm replay_btn")
								 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批");
								 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
								 		 editBtn.attr("edit1-id",item.orderId); 
								    }else{
								    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm disabled replay_btn")
									 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批"); 	
								    }
								   var commentBtn = $('<button id="editBtn1"></button>').addClass("btn btn-info btn-sm comment_btn")
							 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("查看评论");
							 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
							 		 commentBtn.attr("comment-id",item.commentId); 
							 		 commentBtn.attr("order-id",item.orderId); 
								  var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete1_btn")
											.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
								//为删除按钮添加一个自定义的属性来表示当前删除的员工id
									delBtn.attr("del1-id",item.orderId); 
									var btnTd = $("<td></td>").append(editBtn).append(" ").append(commentBtn).append(" ").append(delBtn); 
									//append方法执行完成以后还是返回原来的元素
									$("<tr></tr>").append(checkBoxTd)
									.append(orderIdTd)
									 .append(userId)
									.append(scenicName)
									 .append(ticketNum)
									.append(ticketPrice)
									.append(orderComment)
									.append(orderUsed)
									.append(orderbuildTime)
									.append(orderuseTime)
									.append(visitorName)
									.append(visitorPhone)
									.append(code)
									.append(btnTd)  
									.appendTo("#order_table tbody");
							  });
						  }			 
					  })		  
			});
		
		//订单管理切换待回复
		 $("#commented").click(function(){
			var orderComment="0"; 
					  $.ajax({
						  url:"${APP_PATH}/findordercomment",
						  data:{
							  orderComment:orderComment
						  },
						  type:"GET",
						  success:function(result){
							  $("#order_table tbody").empty();
							  var order=result.extend.orderinfo;
							  $.each(order,function(index,item){
									var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
									var orderIdTd=$("<td></td>").append(item.orderId);
								   var userId = $("<td></td>").append(item.userId);
								   var scenicName=$("<td></td>").append(item.scenicName);
								   var ticketNum=$("<td></td>").append(item.ticketNum);
								   var ticketPrice=$("<td></td>").append(item.ticketPrice);						   
								   var orderComment=$("<td></td>").append(item.orderComment=="1"?"待评论":"已评论");
								   var orderUsed=$("<td></td>").append(item.orderUsed=="1"?"已使用":"待使用");
								   var orderbuildTime=$("<td></td>").append(item.orderbuildTime);
								   var orderuseTime=$("<td></td>").append(item.orderuseTime);
								   var visitorName=$("<td></td>").append(item.visitorName);
								   var visitorPhone=$("<td></td>").append(item.visitorPhone);
								   var code=$("<td></td>").append(item.code);				
								   if(item.orderUsed =="0"){
								    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm replay_btn")
								 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批");
								 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
								 		 editBtn.attr("edit1-id",item.orderId); 
								    }else{
								    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm disabled replay_btn")
									 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批"); 	
								    }
								   var commentBtn = $('<button id="editBtn1"></button>').addClass("btn btn-info btn-sm comment_btn")
							 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("查看评论");
							 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
							 		 commentBtn.attr("comment-id",item.commentId); 
							 		 commentBtn.attr("order-id",item.orderId); 
								  var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete1_btn")
											.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
								//为删除按钮添加一个自定义的属性来表示当前删除的员工id
									delBtn.attr("del1-id",item.orderId); 
									var btnTd = $("<td></td>").append(editBtn).append(" ").append(commentBtn).append(" ").append(delBtn); 
									//append方法执行完成以后还是返回原来的元素
									$("<tr></tr>").append(checkBoxTd)
									.append(orderIdTd)
									 .append(userId)
									.append(scenicName)
									 .append(ticketNum)
									.append(ticketPrice)
									.append(orderComment)
									.append(orderUsed)
									.append(orderbuildTime)
									.append(orderuseTime)
									.append(visitorName)
									.append(visitorPhone)
									.append(code)
									.append(btnTd)  
									.appendTo("#order_table tbody");
							  });
						  }			 
					  })		  
			});
		
		
	
	
		
	
	//景点管理新增
	$("#scenic_add_btn").click(function(){  
		reset_form("#scenicAddModal form"); 
		getWorld("#scenicAddModal #worldName");
		getTheme("#scenicAddModal #themeName");
		$("#scenicAddModal").modal({
			backdrop:"static"
		});
	});
	

	
	//清空表单样式及内容
	function reset_form(ele){
		$(ele)[0].reset();
		$(ele).find(".form-control").text("");
	}
	
	//景点管理完成全选/全不选功能
	$("#check_all").click(function(){
		//attr获取checked是undefined;
		//我们这些dom原生的属性；attr获取自定义属性的值；
		//prop修改和读取dom原生属性的值
		$(".check_item").prop("checked",$(this).prop("checked"));
	});
	
	//景点管理模块搜索功能
	$("#scenic_find_btn").click(function(){
		    var scenic=$("#scenic_find").val();  
		  if(scenic==""){
			  to_page(1);
		  }else{
			  $.ajax({
				  url:"${APP_PATH}/findscenicinfo",
				  data:{
					  scenicName:scenic
				  },
				  type:"GET",
				  success:function(result){
					  $("#scenic_table tbody").empty();
					  var scenic1=result.extend.scenic;
					  $.each(scenic1,function(index,item){
							var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
							var scenicIdTd=$("<td></td>").append(item.scenicId);
						   var scenicName = $("<td></td>").append(item.scenicName);
						   var level=$("<td></td>").append(item.level);
						   var score=$("<td></td>").append(item.score);
						   var worldName=$("<td></td>").append(item.world.worldName);
						   var addressName=$("<td></td>").append(item.address1.addressName);
						   var regionName=$("<td></td>").append(item.region.regionName);
						   var themeName=$("<td></td>").append(item.theme.themeName);
						   var isRecommend=$("<td></td>").append(item.isRecommend=="1"?"是":"否");
						   var isCheap=$("<td></td>").append(item.isCheap=="1"?"是":"否");
						   var searchNum=$("<td></td>").append(item.searchNum);
						   var typeOne=$("<td></td>").append(item.typeOne);
						   var typeTwo=$("<td></td>").append(item.typeTwo);
						   var typeThree=$("<td></td>").append(item.typeThree);
						   var adultprice=$("<td></td>").append(item.adultticket.price);
						   var olderprice=$("<td></td>").append(item.olderticket.olderPrice);
						   var childprice=$("<td></td>").append(item.childticket.childPrice);
						   var location=$("<td></td>").append(item.location);
						   var latitude=$("<td></td>").append(item.latitude);
						   var longitude=$("<td></td>").append(item.longitude);
						   var scenicpresentOne=$("<td></td>").append(item.scenicpresentOne);
						   var scenicpresentTwo=$("<td></td>").append(item.scenicpresentTwo);
						  /*  var wheelImgOne=$("<td></td>").append(item.wheelImgOne);
						   var wheelImgTwo=$("<td></td>").append(item.wheelImgTwo);
						   var wheelImgThree=$("<td></td>").append(item.wheelImgThree);
						   var wheelImgFour=$("<td></td>").append(item.wheelImgFour);
						   var wheelImgFive=$("<td></td>").append(item.wheelImgFive);
						  var photoOne=$("<td></td>").append(item.photoOne);
						   var photoTwo=$("<td></td>").append(item.photoTwo);
						   var photoThree=$("<td></td>").append(item.photoThree);
						   var photoFour=$("<td></td>").append(item.photoFour);	 */
						    var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
							.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
							//为编辑按钮添加一个自定义的属性，来表示当前员工id
							 editBtn.attr("edit-id",item.scenicId); 	
							 editBtn.attr("adultticket-id",item.adultId); 
							 editBtn.attr("childticket-id",item.childId); 
							 editBtn.attr("olderticket-id",item.olderId); 
	
						  var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
									.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
						//为删除按钮添加一个自定义的属性来表示当前删除的员工id
							delBtn.attr("del-id",item.scenicId); 
							var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);  
							//append方法执行完成以后还是返回原来的元素
							$("<tr></tr>").append(checkBoxTd)
								.append(scenicIdTd)
								 .append(scenicName)
								.append(level)
								 .append(score)
								.append(worldName)
								.append(addressName)
								.append(regionName)
								.append(themeName)
								.append(isRecommend)
								.append(isCheap)
								.append(searchNum)
								.append(typeOne)
								.append(typeTwo)
								.append(typeThree)
								.append(adultprice)
								.append(olderprice)
								.append(childprice)
								.append(location)
								.append(latitude)
								.append(longitude)
								.append(scenicpresentOne)
								.append(scenicpresentTwo)
								/* .append(wheelImgOne)
								.append(wheelImgTwo)
								.append(wheelImgThree)
								.append(wheelImgFour)
								.append(wheelImgFive)
								.append(photoOne)
								.append(photoTwo)
								.append(photoThree)
								.append(photoFour) */
								.append(btnTd)  
								.appendTo("#scenic_table tbody");
					  });
				  }
				 
			  })
			  
		  }
	});
	
	//添加首页和前一页 的提示
	ul.append(firstPageLi).append(prePageLi);
	//1,2，3遍历给ul中添加页码提示
	$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
		
		var numLi = $("<li></li>").append($("<a></a>").append(item));
		if(result.extend.pageInfo.pageNum == item){
			numLi.addClass("active");
		}
		numLi.click(function(){
			to_page(item);
		});
		ul.append(numLi);
	});
	//添加下一页和末页 的提示
	ul.append(nextPageLi).append(lastPageLi);
	
	//把ul加入到nav
	var navEle = $("<nav></nav>").append(ul);
	navEle.appendTo("#page_nav_area");
}
	
	
function build_page_nav1(result){
	//page_nav_area
	$("#page_nav_area1").empty();
	var ul = $("<ul></ul>").addClass("pagination");
	//构建元素
    var firstPageLi1 = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
	 var prePageLi1 = $("<li></li>").append($("<a></a>").append("&laquo;"));
	if(result.extend.pageInfo.hasPreviousPage == false){
		firstPageLi1.addClass("disabled");
		prePageLi1.addClass("disabled");
	}else{
		//为元素添加点击翻页的事件
		firstPageLi1.click(function(){
			to_page1(1);
		});
		prePageLi1.click(function(){
			to_page1(result.extend.pageInfo.pageNum -1);
		});
	}
	var nextPageLi1 = $("<li></li>").append($("<a></a>").append("&raquo;"));
	var lastPageLi1 = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
	if(result.extend.pageInfo.hasNextPage == false){
		nextPageLi1.addClass("disabled");
		lastPageLi1.addClass("disabled");
	} else{
		nextPageLi1.click(function(){
			to_page1(result.extend.pageInfo.pageNum +1);
		});
		lastPageLi1.click(function(){
			to_page1(result.extend.pageInfo.pages);
		}); 
	}  
	

	//订单管理模块搜索框
	$("#order_find_btn").click(function(){
		    var code=$("#order_find").val();  
		  if(code==""){
			  to_page1(1);
		  }else{
			  $.ajax({
				  url:"${APP_PATH}/findordercode",
				  data:{
					  code:code
				  },
				  type:"GET",
				  success:function(result){
					  $("#order_table tbody").empty();
					  var order=result.extend.orderinfo;
					  $.each(order,function(index,item){
							var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
							var orderIdTd=$("<td></td>").append(item.orderId);
						   var userId = $("<td></td>").append(item.userId);
						   var scenicName=$("<td></td>").append(item.scenicName);
						   var ticketNum=$("<td></td>").append(item.ticketNum);
						   var ticketPrice=$("<td></td>").append(item.ticketPrice);						   
						   var orderComment=$("<td></td>").append(item.orderComment=="1"?"待评论":"已评论");
						   var orderUsed=$("<td></td>").append(item.orderUsed=="1"?"已使用":"待使用");
						   var orderbuildTime=$("<td></td>").append(item.orderbuildTime);
						   var orderuseTime=$("<td></td>").append(item.orderuseTime);
						   var visitorName=$("<td></td>").append(item.visitorName);
						   var visitorPhone=$("<td></td>").append(item.visitorPhone);
						   var code=$("<td></td>").append(item.code);				
						   if(item.orderUsed =="0"){
						    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm replay_btn")
						 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批");
						 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
						 		 editBtn.attr("edit1-id",item.orderId); 
						    }else{
						    	 var editBtn = $('<button id="editBtn1"></button>').addClass("btn btn-success btn-sm disabled replay_btn")
							 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("审批"); 	
						    }
						   var commentBtn = $('<button id="editBtn1"></button>').addClass("btn btn-info btn-sm comment_btn")
					 		.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("查看评论");
					 		//为编辑按钮添加一个自定义的属性，来表示当前员工id
					 		 commentBtn.attr("comment-id",item.commentId); 
					 		 commentBtn.attr("order-id",item.orderId); 
						  var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete1_btn")
									.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
						//为删除按钮添加一个自定义的属性来表示当前删除的员工id
							delBtn.attr("del1-id",item.orderId); 
							var btnTd = $("<td></td>").append(editBtn).append(" ").append(commentBtn).append(" ").append(delBtn); 
							//append方法执行完成以后还是返回原来的元素
							$("<tr></tr>").append(checkBoxTd)
							.append(orderIdTd)
							 .append(userId)
							.append(scenicName)
							 .append(ticketNum)
							.append(ticketPrice)
							.append(orderComment)
							.append(orderUsed)
							.append(orderbuildTime)
							.append(orderuseTime)
							.append(visitorName)
							.append(visitorPhone)
							.append(code)
							.append(btnTd)  
							.appendTo("#order_table tbody");
					  });
				  }
				 
			  })
			  
		  }
	});
	
	ul.append(firstPageLi1).append(prePageLi1);
	//1,2，3遍历给ul中添加页码提示
	$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
		
		var numLi1 = $("<li></li>").append($("<a></a>").append(item));
		if(result.extend.pageInfo.pageNum == item){
			numLi1.addClass("active");
		}
		numLi1.click(function(){
			to_page1(item);
		});
		ul.append(numLi1);
	});
	//添加下一页和末页 的提示
	ul.append(nextPageLi1).append(lastPageLi1);
	
	//把ul加入到nav
	var navEle = $("<nav></nav>").append(ul);
	navEle.appendTo("#page_nav_area1");
}


 

/* function deletescenic(){
 
	
} */

//查出境内境外信息并显示在下拉列表中
function getWorld(ele){
	//清空之前下拉列表的值
	$(ele).empty();
	$.ajax({
		url:"${APP_PATH}/getWorld",
		type:"GET",
		success:function(result){
			$.each(result.extend.world,function(){				
				var optionEle = $("<option></option>").append(this.worldName).attr("value",this.worldId);
				optionEle.appendTo(ele);
			});
		}
	});
	
}

//查出所属区域信息并显示在下拉列表中
function getAddress(ele,param){
	//清空之前下拉列表的值
	$(ele).empty();
	$.ajax({
		url:"${APP_PATH}/getAddress",
		data:{
			worldId:param
		},
		type:"GET",
		success:function(result){
			$.each(result.extend.address,function(){				
				var optionEle = $("<option></option>").append(this.addressName).attr("value",this.addressIdd);
				optionEle.appendTo(ele);
			});
		}
	});
	
}

//不带参数的
function getAddressnoparam(ele){
	//清空之前下拉列表的值
	$(ele).empty();
	$.ajax({
		url:"${APP_PATH}/getAddressnoparam",
		type:"GET",
		success:function(result){
			$.each(result.extend.address,function(){				
				var optionEle = $("<option></option>").append(this.addressName).attr("value",this.addressIdd);
				optionEle.appendTo(ele);
			});
		}
	});
	
}


//查出地区信息显示在下拉列表中
function getRegion(ele,param){
	//清空之前下拉列表的值
	$(ele).empty();
	$.ajax({
		url:"${APP_PATH}/getRegion",
		data:{
			addressId:param
		},
		type:"GET",
		success:function(result){
			$.each(result.extend.region,function(){				
				var optionEle = $("<option></option>").append(this.regionName).attr("value",this.regionId);
				optionEle.appendTo(ele);
			});
		}
	});
	
}

//不带参数
function getRegionnoparam(ele){
	//清空之前下拉列表的值
	$(ele).empty();
	$.ajax({
		url:"${APP_PATH}/getRegionnoparam",
		type:"GET",
		success:function(result){
			$.each(result.extend.region,function(){				
				var optionEle = $("<option></option>").append(this.regionName).attr("value",this.regionId);
				optionEle.appendTo(ele);
			});
		}
	});
	
}


document.getElementById('worldName').onchange = function () {
	getAddress("#scenicAddModal #addressName",worldName.value);
	//getRegion("#scenicAddModal #regionName");
}

document.getElementById('addressName').onchange = function () {
	getRegion("#scenicAddModal #regionName",addressName.value);
	
	
}

//查出主题信息并显示在下拉列表中
function getTheme(ele){
	//清空之前下拉列表的值
	$(ele).empty();
	$.ajax({
		url:"${APP_PATH}/getTheme",
		type:"GET",
		success:function(result){
			$.each(result.extend.theme,function(){				
				var optionEle = $("<option></option>").append(this.themeName).attr("value",this.themeId);
				optionEle.appendTo(ele);
			});
		}
	});
	
}

//根据编辑景点Id查询景点信息
function scenicsearch(id){
		$.ajax({
			url:"${APP_PATH}/scenicsearch/"+id,
			type:"GET",
			success:function(result){
				var scenic = result.extend.scenic;
				$("#scenicName_update_input").val(scenic.scenicName);
				$("#level_update_input").val(scenic.level);
				$("#score_update_input").val(scenic.score);
				$("#address_update_input").val(scenic.address);
				$("#typeOne_update_input").val(scenic.typeOne);
				$("#typeTwo_update_input").val(scenic.typeTwo);
				$("#typeThree_update_input").val(scenic.typeThree);
				$("#searchNum_update_input").val(scenic.searchNum);
				$("#location_update_input").val(scenic.location);
				$("#longitude_update_input").val(scenic.longitude);
				$("#latitude_update_input").val(scenic.latitude);
				$("#scenicpresentOne_update_input").val(scenic.scenicpresentOne);
				$("#scenicpresentTwo_update_input").val(scenic.scenicpresentTwo);
				$("#wheelImgOne_update_input").val(scenic.wheelImgOne);
				$("#wheelImgTwo_update_input").val(scenic.wheelImgTwo);
				$("#wheelImgThree_update_input").val(scenic.wheelImgThree);					
				$("#wheelImgFour_update_input").val(scenic.wheelImgFour);
				$("#wheelImgFive_update_input").val(scenic.wheelImgFive);
				$("#photoOne_update_input").val(scenic.photoOne);
				$("#photoTwo_update_input").val(scenic.photoTwo);
				$("#photoThree_update_input").val(scenic.photoThree);
				$("#price_update_input").val(scenic.adultticket.price);
	            $("#childPrice_update_input").val(scenic.childticket.childPrice);			
	        	$("#olderPrice_update_input").val(scenic.olderticket.olderPrice);		        			     	        	
	        	$("#scenicUpdateModal input[name=isRecommend]").val([scenic.isRecommend]);
	        	/* $("#scenicUpdateModal input[name=isCheap]").val([scenic.isCheap]);	*/         						
				$("#scenicUpdateModal #worldId_update_input").val([scenic.worldId]);
				$("#scenicUpdateModal #addressId_update_input").val([scenic.addressId]);
				$("#scenicUpdateModal #regionId_update_input").val([scenic.regionId]);
				$("#scenicUpdateModal #themeId_update_input").val([scenic.themeId]);  
			}
		});
	} 

function update_order_used(id){
	 var orderUsed="1";
	$.ajax({
		url:"${APP_PATH}/updateorder/"+id,
		data:{
			orderUsed:orderUsed
		},
		type:"PUT",
		
		success:function(result){
			console.log("更新订单使用状态成功");
			to_page1(1);
		}
	});
}

function commentsearch(id){
	$.ajax({
		url:"${APP_PATH}/commentsearch/"+id,
		type:"GET",	
		success:function(result){
			console.log(result);
			$("#commentModal #visitorcomment").val(result.extend.comment.visitorContent);
			$("#commentModal #admincomment").val(result.extend.comment.adminContent);
		}
	});
}

//保存新增景点信息
$("#scenic_save_btn").click(function(){

	//先插入儿童票价格
	  $.ajax({
			url:"${APP_PATH}/saveaddchild",
			type:"POST",
			data:$("#scenicAddModal form").serialize(),
			success:function(result){ 
				
				 } 
	 });  
	
	//插入成人票价格
	 $.ajax({
			url:"${APP_PATH}/saveaddadult",
			type:"POST",
			data:$("#scenicAddModal form").serialize(),
			success:function(result){
				console.log("成人票成功");
				}
	});  
	//插入老人票票价格
	  $.ajax({
			url:"${APP_PATH}/saveaddolder",
			type:"POST",
			data:$("#scenicAddModal form").serialize(),
			success:function(result){
				console.log("老人票成功");
				}
	});  
	
	//插入信息到景点表
	  $.ajax({
		url:"${APP_PATH}/saveaddscenic",
		type:"POST",
		data:$("#scenicAddModal form").serialize(),
		success:function(result){
				/* $("#scenicAddModal").modal('hide');			
				to_page(totalRecord);	*/	
			}
});  
	
	//查询各自门票ID并更新到
	   $.ajax({
		url:"${APP_PATH}/searchaddchildId",
		type:"GET",
		success:function(result){
			//alert(result.extend.childticket[0].childId);
			var childId=result.extend.childticket[0].childId;
			$.ajax({
				url:"${APP_PATH}/searchaddolderId",
				type:"GET",
				success:function(result){
					//alert(result.extend.childticket[0].childId);	
					var olderId=result.extend.olderticket[0].olderId;
					$.ajax({
						url:"${APP_PATH}/searchaddadultId",
						type:"GET",
						success:function(result){
							//alert(result.extend.childticket[0].childId);	
							var adultId=result.extend.adultticket[0].adultId;
							$.ajax({
								url:"${APP_PATH}/searchaddscenic",
								type:"GET",
								success:function(result){
									var id=result.extend.scenic[0].scenicId;
									$.ajax({
							    		url:"${APP_PATH}/updatescenic/"+id,
							    		data:{	
							    			childId:childId,
							    			olderId:olderId,
							    			adultId:adultId
							    		},
							    		type:"PUT",
							    		success:function(result){
							    			console.log(result);
							    			$("#scenicAddModal").modal('hide');			
							    			to_page(totalRecord); 
							    		}
							    	}) ; 
								}
							});
							 
						}
				     }); 
				}
		     }); 
		}
     }); 
	
	
		
	 
	  
	
	
	
   
	


});
</script>


</body>
<script>
  $("#tabs-menu1").load("page/table/table.html");
  $("#tabs-menu2").load("page/login/login.html");
  $("#tabs-menu3").load("page/register/register.html");
  $("#tabs-menu4").load("page/orderinfo/orderinfo.html");
  $("#modals-menu1").load("page/modal/modal1.html");
  
</script>
<script src="js/tabs/custom-tabs.js"></script>
</html>