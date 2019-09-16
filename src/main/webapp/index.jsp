<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@   page   import= "com.atguigu.crud.test.* "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title><!--西瓜太郎-->

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%
request.setCharacterEncoding("UTF-8"); //这句是关键所在可以避免中文乱码
%>

<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/login.css" rel="stylesheet">
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${APP_PATH }/static/index/index.css" rel="stylesheet">

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
function checkCookie(adminname){
    setCookie("username",adminname,30);
	} 
	
</script>

</head>
<body onload="checkcode()">

<!-- <button id="abcd">景点详情里面查询是否收藏</button>
<button id="a1">收藏页面所有收藏</button>
<button id="a2">查询一个数组的景点id的信息</button>
<button id="a3">查询景点详情信息</button>
<button id="a4">查询热门景点</button>
<button id="a5">查询推荐景点</button>
在分类地区页面
<button id="a7">按地区分类查询景点</button>
<button id="a9">按照主题查询景点</button>
<button id="a16">在详情页面查询评论</button>
在summary页面按评分高低查询
<button id="a6">按评分高低查询</button>
在summary页面查询全部热门景点票价 
<button id="a8">查询全部热门景点票价</button>

<button id="a10">测试模糊查询</button>

查询收藏页面的
<button id="a14">查询收藏页面</button>

//在景点详情页面删除收藏
<button id="a15">删除收藏</button>


在用户中心登录后将用户信息插入用户表
<button id="a11">将用户信息插入用户表</button>
<button id="a12">查询该用户是否已经注册</button>
<button id="a13">更新该用户的个人信息</button>


在出行人信息页面插入出行人信息
<button id="a17">插入出行人信息</button>
<button id="a18">删除出行人信息</button>

<button id="a19">支付成功插入订单表</button> -->

<div  class="container ">
<div class="backone"></div>
<div class="backtwo"></div>
<div class="login">
    <H3 style="text-align:center;margin-top:20PX;">景区门票管理1</H3>
    <form name="form" class="form-horizontal"  method="post" action="admin.jsp" >
	  <div class="form-group" style="margin-top:20px;margin-left:30px;width:100%;height:75px;position:relative;">
	    
	    <div class="col-sm-9">
	    
	      <span class="form-control-feedback"><span class="glyphicon glyphicon-user" style="font-size:2em;"></span></span>
	      <input type="text" class="form-control fc-clear"  style="height:50PX;position:absolute" name="adminname" placeholder="请输入正确的登录名">
	    </div>
	  </div>
	  <div class="form-group" style="margin-left:30px;width:100%;height:75px;position:relative;">
	   
	     <div class="col-sm-9">
	     <span class="form-control-feedback"><span class="glyphicon glyphicon-lock" style="font-size:2em;"></span></span>
	      <input type="password" style="height:55PX;position:absolute"class="form-control" name="password" placeholder="请输入正确的密码">
	    </div>
	  </div> 
	  
	   <div class="form-group" style="margin-left:30px;width:100%;height:75px;position:relative;">
	  <div class="col-sm-9"> 
	   
       <input type="text" style="height:55PX;width:63%;position:absolute"class="form-control"  placeholder="请输入验证码"	name="validationCode" id="validationCode"/>  
               
                 <img src="validate.jsp"  style="float:right;width:55px;width:25%;" id="picture" onClick="change()" id="picture">
                <script>  
              function change(){  
              var pic=document.getElementById("picture");  
              var i=Math.random();//目的是使页面不一样  
              pic.src="validate.jsp?id="+i;  
                 }   
                 </script>   
	  </div>
	  </div>
	  
	  <div class="form-group" style="margin-left:8%;width:80%;height:80px;position:relative;">
	    <div class="col-sm-12">
	      <button type="submit" onclick="return check(this.form)" style="width:100%;height:55PX;position:absolute" class="btn btn-info">登录</button>
	    </div>
	  </div>
	</form>
</div>

</div>




<%-- <%


String name="sss";

session.setAttribute("name", name); %> --%>


<script>

 
 
  function checkcode(){
	 <%--  <%
	  HttpSession session1 = request.getSession();  
	  String aa=(String)session1.getAttribute("randomCode1");
	  System.out.println(session1.getAttribute("randomCode1"));
	  %>
	  alert(<%=aa%>); --%>
  }

        //查询管理员姓名和密码
		function check(form){
			var adminname=form.adminname.value.trim();
			var password=form.password.value.trim();

			if(adminname==""||adminname==null){
				return false;
			 }else{
				 var a="";
				  $.ajax({
					url:"${APP_PATH}/findadmin" ,		
					data:{
						adminName:adminname,
						password:password
					},
					type:"GET",
					async:false,
					success:function(result){	
						console.log(result);	
						if(result.extend.admin.length>0){
          				  a=true;
          				  checkCookie(adminname);
						}else{						
						  a=false;
						 
						
						  alert("用户名或者密码错误");
						}
					}
				 });   
				 return a;
			}
				 		
		}
   
      //查询所有地区
      
    

    //查询热门景点  和对应门票价格        //传数组到后台查询的一个例子
    /* $("#a4").click(function(){
    	var str=["3", "10", "11", "13"];
    	var ticketCategoryId="1";
    	$.ajax({
    		url:"${APP_PATH}/searchHot",
    		type:"GET",
    		success:function(result){
    			console.log(result);		
    			$.ajax({
    				url:"${APP_PATH}/searchHotticket",
    				data:{
    					str:str,
    					ticketCategoryId:ticketCategoryId
    				},
    				type:"GET",
    				traditional:true,
    				success:function(result){
    					console.log(result);
    				}
    			});
    		}
    	});
    }); */
    
    $("#a4").click(function(){
    	$.ajax({
    		url:"${APP_PATH}/searchHot",
    		type:"GET",
    		success:function(result){
    			console.log(result);
    		}
    	});
    })
    
    
    //在summary页面查询全部热门景点票价
   /*  $("#a8").click(function(){
    	console.log("SS");
    	 var ticketCategoryId="1";
    	 $.ajax({
    		url:"${APP_PATH}/searchHotticketAll" ,
    		data:{
    			ticketCategoryId:ticketCategoryId
    		},
    		type:"GET",
    		success:function(result){
    			console.log(result);
    		}
    	 });
    }); */
    
    //查询推荐景点
     $("#a5").click(function(){
    	 console.log("SS");
    	 var isRecommend="1";
    	    $.ajax({
    	    	 url:"${APP_PATH}/searchRecommend",
    	    	 data:{
    	    		 isRecommend:isRecommend
    	    	 },
    	    	 type:"GET",
    	    	 success:function(result){
    	    		 console.log(result);
    	    	 }
    	    });
     });
    
     //搜索框进行模糊查询
      $("#a10").click(function(){
    	     var scenicName="水";
    	    $.ajax({
    	    	 url:"${APP_PATH}/scenicNamesearch",
    	    	 data:{
    	    		 scenicName:scenicName
    	    	 },
    	    	 type:"GET",
    	    	 success:function(result){
    	    		 console.log(result);
    	    	 }
    	    });
     });
    
    //在summary查询国内游
    var worldId="1";
     $.ajax({
    	url:"${APP_PATH}/chinasearch" ,
    	data:{
    		worldId:worldId
    	},
    	type:"GET",
    	success:function(result){
    		console.log(result);
    	}	
     });
     
     //在summary查询特价游
     var isCheap = "1";
     $.ajax({
    	url:"${APP_PATH}/ischeapsearch",
    	data:{
    		isCheap:isCheap
    	},
    	type:"GET",
    	success:function(result){
    		console.log(result);
    	}
     });
   
   //按地区分类查询景点
    $("#a7").click(function(){
    	var regionId="1"
    	$.ajax({
    		url:"${APP_PATH}/categorysearch",
    		data:{
    			regionId:regionId
    		},
    		type:"GET",
    		success:function(result){
    			console.log(result);
    		}
    	});
    });
   
    //在分类页面按主题查询景点
    $("#a9").click(function(){
        var themeId="1"	;
        $.ajax({
        	 url:"${APP_PATH}/themesearch",
        	 data:{
        		 themeId:themeId
        	 },
        	 type:"GET",
        	 success:function(result){
        		 console.log(result);
        	 }
        });
    });
    
   
    //在分类地区条件下   按评分高低查询
      $("#a6").click(function(){
    	 var regionId="1";
    	 $.ajax({
     		url:"${APP_PATH}/categoryscoresearch",
     		data:{
     			regionId:regionId
     		},
     		type:"GET",
     		success:function(result){
     			console.log(result);
     		}
     	});
    });  
    
   //查询景点详情信息
    $("#a3").click(function(){
    	var id="1";
    	$.ajax({
    		   url:"${APP_PATH}/scenicsearch/"+id,
    		   type:"GET",
    		   success:function(result){
    			   console.log(result);
    		   }
    	   }); 
    });
    
   //在详情页面查询儿童票价格
    	var childId="1";
    	$.ajax({
    		   url:"${APP_PATH}/childticketsearch/"+childId,
    		   type:"GET",
    		   success:function(result){
    			   console.log(result);
    		   }
    	   }); 
   
     //在详情页面查询老人票价格
    var olderId="1";
    $.ajax({
    	url:"${APP_PATH}/olderticketsearch/"+olderId,
        type:"GET",
        success:function(result){
    	 console.log(result);
         }
    	   }); 
    
   //在详情页面查询评论
   $("#a16").click(function(){
	   var scenicId="1";
	   $.ajax({
		  url:"${APP_PATH}/findcomment",
		  data:{
			  scenicId:scenicId
		  },
		  type:"GET",
		  success:function(result){
		    	 console.log(result);
		         }
	   });
   });
   
   
   //收藏部分  查询条件是跟userId相同的
  /*  $("#abcd").click(function(){
	 
	   var userId="1";
	   var scenicId="3";
   $.ajax({
	   url:"${APP_PATH}/findcollect",
	   data:{
		   userId:userId,
		   scenicId:scenicId,   
	   },
	   type:"GET",
	   success:function(result){
		   console.log(result);
		   var isCollection="1";
		   var isCollection1="0";
		  
		   if(result.extend.collect.length == 0){
			   $.ajax({
				   url:"${APP_PATH}/insertcollect",
				   type:"POST",
				   data:{
					   userId:userId,
					   scenicId:scenicId,  
					   isCollection:isCollection
				   },
				   success:function(result){
					   
				   }
			   });
		   }else{
			   var id = result.extend.collect[0].collectionId;
			   $.ajax({
				   url:"${APP_PATH}/updatecollect/"+id,
				   type:"PUT",
				   data:{
					   isCollection:isCollection1
				   },
				   success:function(result){
					   
				   }
			   });
		   }
		   
		  
	   }
   });
   }); */
   
   
   //查询该用户所有收藏
     /* $("#a1").click(function(){
    	 var userId="1";
    	 var isCollection="1";
    	 $.ajax({
      	   url:"${APP_PATH}/findAllcollect",
      	   data:{
      		 userId:userId,
      	     isCollection:isCollection
      	   },
      	   type:"GET",
      	   success:function(result){
      		   console.log(result);
      	   }
           });
     }); */
      
   
   //查询一个数组的景点id的信息     测试查询多个主键
   
    /* $("#a2").click(function(){
      var testlist=["1","7","8"];
	 $.ajax({
  	   url:"${APP_PATH}/findarray",
  	   data:{
  		 testlist:testlist
  	   },
  	   type:"GET",
  	 traditional:true,
  	   success:function(result){
  		   console.log(result);
  	   }
       });
 }); */
   
/*      $.ajax({
    	url:"${APP_PATH}/scenicsearch/"+id,
        type:"GET",
        success:function(result){
        
        }	
    });  
    
     $.ajax({
    	url:"${APP_PATH}/ticket/"+id,
        type:"GET",
        success:function(result){
        }	
    }); */
 
     /* $("#abcd").click(function(){
    	 $.ajax({
    	     	 url:"${APP_PATH}/save",
    	         type:"POST", */
    	     /*     data:{
    	        	 ticketId:"7",
    	        	 ticketCategoryId:"20",
    	        	 
    	        	 number:"666"
    	         }, */
    	        /*  success:function(result){
    	        	 
    	         }	 */ 
    		 /* url:"${APP_PATH}/ticket/"+id,
    	        type:"GET",
    	        success:function(result){
    	        }	 */
    	        
    	/* 	 url:"${APP_PATH}/depts",
				type:"GET",
				success:function(result){
				
				} */
    	   /*   }); 
     }); */
     
     //查询收藏页面的 
     $("#a14").click(function(){
    	 var userId="6";
    	 $.ajax({
    		url:"${APP_PATH}/findallcollect",
    		data:{
    			userId:userId
    		},
    		type:"GET",
    		success:function(result){
    		    var scenicId=[];
    		     for(var i=0;i<result.extend.collect.length;i++){
    		    	scenicId.push(result.extend.collect[i].scenicId);
    		    }
    		    console.log(scenicId); 
    		    $.ajax({
    		    	url:"${APP_PATH}/findcollectscenic",
    		    	data:{
    		    		scenicId:scenicId
    		    	},
    		    	type:"GET",
    		    	 traditional:true,
    		    	success:function(result){
    		    		console.log(result);
    		    	}
    		    });
    		   
    		}
    	 });
     });
     
     //插入出行人信息
      $("#a17").click(function(){
    	 var userId="9";
    	 var userName="小明";
    	 var visitorPhone="13172355221"
    	$.ajax({
    		url:"${APP_PATH}/insertvisitor",
    		data:{
    			userId:userId,
    			visitorName:userName,
    			visitorPhone:visitorPhone
    			
    		},
    		type:"POST",
    		success:function(result){
    			console.log(result);
    		}
    	}) ;
     });
     
     //删除一条出行人信息
     $("#a18").click(function(){
    	 var visitorId="7";
    	$.ajax({
    		url:"${APP_PATH}/deletevisitor/"+visitorId,
    		type:"DELETE",
    		success:function(result){
    			console.log("删除成功");
    		}
    	}) ;
     });
     //查出该用户的出行人信息
     var userId="6";
     $.ajax({
    		url:"${APP_PATH}/findallvisitor",
    		data:{
    			userId:userId
    		},
    		type:"GET",
    		success:function(result){
    			console.log(result);
    		}
     });
     
      //编辑一条用户出行人信息  查出单条
      visitorId="10";
      $.ajax({
  		url:"${APP_PATH}/findonevisitor/"+visitorId,
  		type:"GET",
  		success:function(result){
  			console.log(result);
  		}
   });
     
     //先查询该用户是否已经注册
      $("#a12").click(function(){
    	  var openId="oUazE5BToX0_seQxlfZKjoLXhre0";
    	  $.ajax({
       		url:"${APP_PATH}/finduser",
       		data:{
       			openId:openId
       		},
       		type:"GET",
       		success:function(result){
       			console.log(result);
       		}
       	});
      });
     
     
     
     //登录后将用户信息插入到user表
     $("#a11").click(function(){
    	 var code="1";
    	 var userName="2";
    	 var userImg="3";
    	$.ajax({
    		url:"${APP_PATH}/insertuser",
    		data:{
    			code:code,
    			userName:userName,
    			userImg:userImg
    		},
    		type:"POST",
    		success:function(result){
    			console.log(result);
    		}
    	}) ;
     });
     
     //更新用户信息到user表
    $("#a13").click(function(){
    	var id="2";
    	var userName="3";
    	$.ajax({
    		url:"${APP_PATH}/updateuser/"+id,
    		data:{
    			
    			userName:userName
    			
    		},
    		type:"PUT",
    		success:function(result){
    			console.log(result);
    		}
    	}) ;
     });
     
     //更新订单信息
     var id="100003";
     var orderComment="0";
     $.ajax({
    		url:"${APP_PATH}/updateorder/"+id,
    		data:{		
    			orderComment:orderComment		
    		},
    		type:"PUT",
    		success:function(result){
    			console.log(result);
    		}
    	});
     
     //在star页面查询用户的支付密码
     var userId="6";
     $.ajax({
    	  url:"${APP_PATH}/finduserpsw",
    	  data:{
    		  userId:userId
    	  },
    	  type:"GET",
    	  success:function(result){
    		  console.log(result);
    	  }
     });
     
  //在景点详情页面删除收藏
   $("#a15").click(function(){
	  var collectId="17";
	  $.ajax({
		  url:"${APP_PATH}/deletecollect/"+collectId,
		  type:"DELETE",
		  success:function(result){
			  consolt.log(result);
		  }
	  });
   });

  
  
  //支付成功插入订单表
  $("#a19").click(function(){
	   var userId="6";
	  $.ajax({
     		url:"${APP_PATH}/insertorder",
     		data:{
     			userId:userId
     		},
     		type:"POST",
     		success:function(result){
     			console.log(result);
     		}
     	}); 
  });
  
  //查询该用户的订单详情
  var userId="6";
  $.ajax({
	  url:"${APP_PATH}/findorderinfo",
	  data:{
		  userId:userId
	  },
	  type:"GET",
	  success:function(result){
		  console.log(result);
	  }
  });
  
  //查询某一个订单
  var orderId="100012";
  $.ajax({
	  url:"${APP_PATH}/findorderinfodetail/"+orderId,
	  type:"GET",
	  success:function(result){
		  console.log(result);
	  }
  })
  
//插入评论
/* var scenicId="2";
$.ajax({
	  url:"${APP_PATH}/insertcomment/",
	  data:{
		  scenicId:scenicId
	  },
	  type:"POST",
	  success:function(result){
		  console.log(result);
	  }
}); */


    //判断验证码  
   /*  $("#validationCode").on("change",function(){
    	alert(session.getAttribute("randomCode"));
    }) */
     /* if($("#validationCode").val()==null || $("#validationCode").val()==""){  
        alert("验证码不能为空");  
        var validatetext=session.getAttribute("randomCode");
    }   */ 
     


 
 
</script>

     
  
    


</body>
</html>