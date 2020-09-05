<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="js/jquery-1.8.3.js">
	
</script>

<script>
	$(function() {
		// 给按钮添加点击事件
		$("#btn").click(function() {
			 // jQuery给我们封装了一个ajax()方法,$.ajax()就是调用该方法
			 // type:"POST", 表名我们向服务器发送的是POST请求
			 // dataType:"json", 服务器给我们返回的是json数据
			 // url:"json1.do",请求服务器的资源url,也及时某个Servlet
			 //data:{name:"admin",password:"123456"} 向Servlet传递的数据
			 // success:function(data){} 服务器给我们返回数据成功之后,success指定的回调函数会被自动的执行
			 // 服务器返回的数据就是回调函数的参数data
             $.ajax({
            	type:"POST",  
            	dataType:"json",
            	url:"json1.do",
            	data:{
            		name:"admin",
            		password:"123456"
            	},
            	success:function(data){
            		//alert("成功的接收到服务器返回的json数据:"+data);
            		alert(data.name + "," + data.age + ","+ data.addr);
            	}             	
             });
		});
	});
</script>

</head>
<body>
	向服务器发送异步请求,服务器返回单个对象的JSON字符串
	<br>
	<input type="button" value="向服务器发送异步请求,服务器返回单个对象的JSON字符串" id="btn">
	
	
	<br>
	这是修改后的内容!
	
	<br>

	这是在主线上修改的内容!

	这是在分支上修改的内容!

	
</body>
</html>