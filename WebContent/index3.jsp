<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
         // url:"json3.do?name="+ $("#name").val() +"&_=" + new Date().getTime(),
         // 这样做的目的是为了避免浏览器缓存
	     $(function(){	    	 
	    	 $("#btn").click(function(){                             
                  $.ajax({
                	 type:"GET",
                	 url:"json3.do?name="+ $("#name").val() +"&_=" + new Date().getTime(),
                	 success:function(data){
                		$("#div0").html(data); 
                	 }		                 	 
                 });                                                 	    			    		 
	    	 });	    	 
	     });
		
	</script>
     <input type="text" name="name" id="name">
     <input type="button" id="btn" value="使用jquery的ajax()方法向服务器发送Ajax GET异步请求">    
    <div id="div0"></div>
</body>
</html>
