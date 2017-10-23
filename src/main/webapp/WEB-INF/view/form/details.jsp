<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>住家申请详情</title>

<style type="text/css">

   .big{

      width:800px;

      height:400px;

   }

</style>

<script type="text/javascript">

function big1(){

      var input1= document.getElementById("1");

      

      input1.className="big";

      setTimeout(function(){

         input1.className="";

      },4000);      

}

function big2(){

    var input2= document.getElementById("2");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big3(){

    var input2= document.getElementById("3");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big4(){

    var input2= document.getElementById("4");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big5(){

    var input2= document.getElementById("5");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big6(){

    var input2= document.getElementById("6");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big7(){

    var input2= document.getElementById("7");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big8(){

    var input2= document.getElementById("8");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big9(){

    var input2= document.getElementById("9");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big10(){

    var input2= document.getElementById("10");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big10(){

    var input2= document.getElementById("10");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big11(){

    var input2= document.getElementById("11");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big12(){

    var input2= document.getElementById("12");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big13(){

    var input2= document.getElementById("13");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big14(){

    var input2= document.getElementById("14");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big15(){

    var input2= document.getElementById("15");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big16(){

    var input2= document.getElementById("16");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big17(){

    var input2= document.getElementById("17");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big18(){

    var input2= document.getElementById("18");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big19(){

    var input2= document.getElementById("19");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big20(){

    var input2= document.getElementById("20");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big21(){

    var input2= document.getElementById("21");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big22(){

    var input2= document.getElementById("22");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big23(){

    var input2= document.getElementById("23");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

function big24(){

    var input2= document.getElementById("24");

    

    input2.className="big";

    setTimeout(function(){

       input2.className="";

    },4000); 

}

</script>

</head>

<body>

   <spring:url value="/user/apply" var="list" />

   <a href="${list}">List</a>

   <table>

         <tr>

            <td>HostFormId: </td>

            <td>${HostFormId}</td>

         </tr>

         

         <tr>

            <td>KeyValue: </td>

            <td>${KeyValue}</td>

         </tr>

         

        <tr>

            <td>HostFormRole: </td>

            <td>${HostFormRole}</td>

         </tr>

         

          <tr>

            <td></br><h2>个人信息</h2></td>

         </tr>

         

         <tr>

            <td>FirstName: </td>

            <td>${FirstName}</td>

         </tr>

      

         <tr>

            <td>MiddleName: </td>

            <td>${MiddleName}</td>

         </tr>

         

          <tr>

            <td>LastName: </td>

            <td>${LastName}</td>

         </tr>

         

          <tr>

            <td>称谓: </td>

            <td>${Title}</td>

         </tr>

         

          <tr>

            <td>年龄: </td>

            <td>${Age}</td>

         </tr>

         

          <tr>

            <td>婚姻状况: </td>

            <td>${MaritalStatus}</td>

         </tr>

         

          <tr>

            <td>职业: </td>

            <td>${Occupation}</td>

         </tr>

         

         <tr>

            <td>手机: </td>

            <td>${Cellphone}</td>

         </tr>

         

         <tr>

            <td>邮箱: </td>

            <td>${Email}</td>

         </tr>

                

         <tr>

            <td>Host自我介绍: </td>

            <td>${Introducation}</td>

         </tr>



       <tr>

            <td>通过什么方式了解到我们: </td>

            <td>${WayOfService}</td>

         </tr>  

         

          <tr>

            <td></br></br><h2>房屋信息</h2></td>

         </tr>    

            

          <tr>

            <td>Country: </td>

            <td>${Country}</td>

         </tr>

         

         <tr>

            <td>Address: </td>

            <td>${Address}</td>

         </tr>

         

         <tr>

            <td>City: </td>

            <td>${City}</td>

         </tr>

         

         <tr>

            <td>State: </td>

            <td>${State}</td>

         </tr>

         

         <tr>

            <td>ZipCode: </td>

            <td>${ZipCode}</td>

         </tr>

 

         <tr>

            <td>倾向接待的学生性别: </td>

            <td>${Preferhost}</td>

         </tr>

         

         <tr>

            <td>宗教信仰: </td>

            <td>${Religious}</td>

         </tr>

         

         <tr>

            <td>家里养的宠物: </td>

            <td>${Pets}</td>

         </tr>       

                 

         <tr>

            <td>是否提供早饭</td>

            <td>${Breakfast}</td>

            <td></td>

         </tr>

         

         <tr>

            <td>是否提供午饭</td>

            <td>${Lunch}</td>

            <td></td>

         </tr>

         

         <tr>

            <td>是否提供晚饭</td>

            <td>${Dinner}</td>

            <td></td>

         </tr>

         

         <tr>

            <td>是否提供接送</td>

            <td>${Transportation}</td>

            <td></td>

         </tr>

         

         <tr>

            <td>是否提供洗衣房</td>

            <td>${Washhouse}</td>

            <td></td>

         </tr>

                  

         <tr>

            <td>是否有Wifi</td>

            <td>${Wifi}</td>

            <td></td>

         </tr>

         

         <tr>

            <td>附近是否有医院: </td>

            <td>${Hosptial}</td>

         </tr>

         

         <tr>

            <td>附近是否有超市: </td>

            <td>${Supermarket}</td>

         </tr>

         

         <tr>

            <td>附近是否有地铁站： </td>

            <td>${SubwayStation}</td>

         </tr>

         

         <tr>

            <td>附近是否有公交站: </td>

            <td>${BusStation}</td>

         </tr>

         

         <tr>

            <td>附近是否有高中: </td>

            <td>${Highschool}</td>

         </tr>

         

         <tr>

            <td>附近是否有大学: </td>

            <td>${University}</td>

         </tr>       

         

          <tr>

            <td></br></br><h2>房东及房屋照片</h2></td>

         </tr>

         

           <tr>

            <td>自拍照片: </td>

            <td><img src="${PersonPicture}" width="200" height="100"  id="21" onclick="big21();" /></td>

         </tr>

         

         <tr>

            <td>客厅照片: </td>

            <td><img src="${Drawingroom}" width="200" height="100"  id="22" onclick="big22();" /></td>

         </tr>

         

         <tr>

            <td>厨房照片: </td>

            <td><img src="${KitchenPicture}" width="200" height="100"  id="23" onclick="big23();" /></td>

         </tr>

         

          <tr>

            <td>卫生间照片: </td>

            <td><img src="${BothroomPicture}" width="200" height="100"  id="24" onclick="big24();" /></td>

         </tr>

         

         <tr>

            <td>卧室一照片1: </td>

            <td><img src="${BedroomPicture1_1}" width="200" height="100"  id="1" onclick="big1();" /></td>

         </tr>

         

         <tr>

            <td>卧室一照片2: </td>

           <td><img src="${BedroomPicture1_2}" width="200" height="100"  id="2" onclick="big2();" /></td>

        

         </tr>

         

         <tr>

            <td>卧室一价格: </td>

            <td>${P1Price}</td>

         </tr>

         

         <tr>

            <td>卧室一租期StartTime: </td>

            <td>${P1ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室一租期EndTime: </td>

            <td>${P1ShortTermLeftTime}</td>

         </tr>

         

         

         <tr>

            <td>卧室二照片: </td>

            <td><img src="${BedroomPicture2_1}" width="200" height="100"  id="3" onclick="big3();" /></td>

         </tr>

         

         <tr>

            <td>卧室二照片: </td>

            <td><img src="${BedroomPicture2_2}" width="200" height="100"  id="4" onclick="big4();" /></td>

         </tr>

         

         <tr>

            <td>卧室二价格: </td>

            <td>${P2Price}</td>

         </tr>

         

         <tr>

            <td>卧室二租期StartTime: </td>

            <td>${P2ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室二租期EndTime: </td>

            <td>${P2ShortTermLeftTime}</td>

         </tr>

         

         

         <tr>

            <td>卧室三照片: </td>

            <td><img src="${BedroomPicture3_1}" width="200" height="100"  id="5" onclick="big5();" /></td>

         </tr>

         

         <tr>

            <td>卧室三照片: </td>

            <td><img src="${BedroomPicture3_2}" width="200" height="100"  id="6" onclick="big6();" /></td>

         </tr>

        <tr>

         <td>卧室三预期价格: </td>

            <td>${P3Price}</td>

            <td><a href="<c:url value='/form/Editprice/${HostFormId}'/>">修改价格</a>

         </tr>

         

         <tr>

            <td>卧室三租期StartTime: </td>

            <td>${P3ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室三租期EndTime: </td>

            <td>${P3ShortTermLeftTime}</td>

         </tr>

         

        <%--  <tr>

            <td>卧室三长期StartTime: </td>

            <td>${P3LongTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室三长期EndTime: </td>

            <td>${P3LongTermLeftTime}</td>

         </tr> --%>

         

         <tr>

            <td>卧室四照片: </td>

            <td><img src="${BedroomPicture4_1}" width="200" height="100"  id="7" onclick="big7();" /></td>

         </tr>

         

         <tr>

            <td>卧室四照片: </td>

            <td><img src="${BedroomPicture4_2}" width="200" height="100"  id="8" onclick="big8();" /></td>

         </tr>

         

         <tr>

            <td>卧室四价格: </td>

            <td>${P4Price}</td>

         </tr>

         

         <tr>

            <td>卧室四租期StartTime: </td>

            <td>${P4ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室四租期EndTime: </td>

            <td>${P4ShortTermLeftTime}</td>

         </tr>

         

        <%--  <tr>

            <td>卧室四长期StartTime: </td>

            <td>${P4LongTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室四长期EndTime: </td>

            <td>${P4LongTermLeftTime}</td>

         </tr>  --%>

         

         <tr>

            <td>卧室五照片: </td>

            <td><img src="${BedroomPicture5_1}" width="200" height="100"  id="9" onclick="big9();" /></td>

         </tr>

         

         <tr>

            <td>卧室五照片: </td>

            <td><img src="${BedroomPicture5_2}" width="200" height="100"  id="10" onclick="big10();" /></td>

         </tr>

         

         <tr>

            <td>卧室五价格: </td>

            <td>${P5Price}</td>

         </tr>

         

         <tr>

            <td>卧室五租期StartTime: </td>

            <td>${P5ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室五租期EndTime: </td>

            <td>${P5ShortTermLeftTime}</td>

         </tr>

         

        <%--  <tr>

            <td>卧室五长期StartTime: </td>

            <td>${P5LongTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室五长期EndTime: </td>

            <td>${P5LongTermLeftTime}</td>

         </tr> --%>

        

        <tr>

            <td>卧室六照片: </td>

            <td><img src="${BedroomPicture6_1}" width="200" height="100"  id="11" onclick="big11();" /></td>

         </tr>

         

         <tr>

            <td>卧室六照片: </td>

            <td><img src="${BedroomPicture6_2}" width="200" height="100"  id="12" onclick="big12();" /></td>

         </tr>

         

         <tr>

            <td>卧室六价格: </td>

            <td>${P6Price}</td>

         </tr>

         

         <tr>

            <td>卧室六租期StartTime: </td>

            <td>${P6ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室六租期EndTime: </td>

            <td>${P6ShortTermLeftTime}</td>

         </tr>

         

         <%-- <tr>

            <td>卧室六长期StartTime: </td>

            <td>${P6LongTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室六长期EndTime: </td>

            <td>${P6LongTermLeftTime}</td>

         </tr> --%>

        

        <tr>

            <td>卧室七照片: </td>

            <td><img src="${BedroomPicture7_1}" width="200" height="100"  id="13" onclick="big13();" /></td>

         </tr>

         

         <tr>

            <td>卧室七照片: </td>

            <td><img src="${BedroomPicture7_2}" width="200" height="100"  id="14" onclick="big14();" /></td>

         </tr>

         

         <tr>

            <td>卧室七价格: </td>

            <td>${P7Price}</td>

         </tr>

         

         <tr>

            <td>卧室七租期StartTime: </td>

            <td>${P7ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室七租期EndTime: </td>

            <td>${P7ShortTermLeftTime}</td>

         </tr>

         

        <%--  <tr>

            <td>卧室七长期StartTime: </td>

            <td>${P7LongTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室七长期EndTime: </td>

            <td>${P7LongTermLeftTime}</td>

         </tr> --%>

         

         <tr>

            <td>卧室八照片: </td>

            <td><img src="${BedroomPicture8_1}" width="200" height="100"  id="15" onclick="big15();" /></td>

         </tr>

         

         <tr>

            <td>卧室八照片: </td>

            <td><img src="${BedroomPicture8_2}" width="200" height="100"  id="16" onclick="big16();" /></td>

         </tr>

         

         <tr>

            <td>卧室八价格: </td>

            <td>${P8Price}</td>

         </tr>

         

         <tr>

            <td>卧室八租期StartTime: </td>

            <td>${P8ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室八租期EndTime: </td>

            <td>${P8ShortTermLeftTime}</td>

         </tr>

         

         <%-- <tr>

            <td>卧室八长期StartTime: </td>

            <td>${P8LongTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室八长期EndTime: </td>

            <td>${P8LongTermLeftTime}</td>

         </tr> --%>

        

        <tr>

            <td>卧室九照片: </td>

            <td><img src="${BedroomPicture9_1}" width="200" height="100"  id="17" onclick="big17();" /></td>

         </tr>

         

         <tr>

            <td>卧室九照片: </td>

            <td><img src="${BedroomPicture9_2}" width="200" height="100"  id="18" onclick="big18();" /></td>

         </tr>

         

         <tr>

            <td>卧室九价格: </td>

            <td>${P9Price}</td>

         </tr>

         

         <tr>

            <td>卧室九租期StartTime: </td>

            <td>${P9ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室九租期EndTime: </td>

            <td>${P9ShortTermLeftTime}</td>

         </tr>

         

        <%--  <tr>

            <td>卧室九长期StartTime: </td>

            <td>${P9LongTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室九长期EndTime: </td>

            <td>${P9LongTermLeftTime}</td>

         </tr> --%>

         

         <tr>

            <td>卧室十照片: </td>

            <td><img src="${BedroomPicture10_1}" width="200" height="100"  id="19" onclick="big19();" /></td>

         </tr>

         

         <tr>

            <td>卧室十照片: </td>

            <td><img src="${BedroomPicture10_2}" width="200" height="100"  id="20" onclick="big20();" /></td>

         </tr>

         

         <tr>

            <td>卧室十价格: </td>

            <td>${P10Price}</td>

         </tr>

         

         <tr>

            <td>卧室十租期StartTime: </td>

            <td>${P10ShortTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室十租期EndTime: </td>

            <td>${P10ShortTermLeftTime}</td>

         </tr>

         

         <%-- <tr>

            <td>卧室十长期StartTime: </td>

            <td>${P10LongTermStartTime}</td>

         </tr>

         

         <tr>

            <td>卧室十长期EndTime: </td>

            <td>${P10LongTermLeftTime}</td>

         </tr> --%>

         

          <tr>

         <td></br></br><h2>家庭成员信息</h2></td>

         </tr>

         <tr>

            <td>家庭成员1名字: </td>

            <td>${FamilyMember1}</td>

         </tr>

         

         <tr>

            <td>家庭成员1年龄: </td>

            <td>${Age1}</td>

         </tr>

         

         <tr>

            <td>家庭成员1性别: </td>

            <td>${Sex1}</td>

         </tr>

         

         <tr>

            <td>家庭成员1职业: </td>

            <td>${Occupation1}</td>

         </tr>

         

         <tr>

            <td>家庭成员2名字: </td>

            <td>${FamilyMember2}</td>

         </tr>

       

       <tr>

            <td>家庭成员2年龄: </td>

            <td>${Age2}</td>

         </tr>

         

         <tr>

            <td>家庭成员2性别: </td>

            <td>${Sex2}</td>

         </tr>

         

         <tr>

            <td>家庭成员2职业: </td>

            <td>${Occupation2}</td>

         </tr>

       

         <tr>

            <td>家庭成员3名字: </td>

            <td>${FamilyMember3}</td>

         </tr>

       

       <tr>

            <td>家庭成员3年龄: </td>

            <td>${Age3}</td>

         </tr>

         

         <tr>

            <td>家庭成员3性别: </td>

            <td>${Sex3}</td>

         </tr>

         

         <tr>

            <td>家庭成员3职业: </td>

            <td>${Occupation3}</td>

         </tr>

         

         <tr>

            <td>家庭成员4名字: </td>

            <td>${FamilyMember4}</td>

         </tr>

       

       <tr>

            <td>家庭成员4年龄: </td>

            <td>${Age4}</td>

         </tr>

         

         <tr>

            <td>家庭成员4性别: </td>

            <td>${Sex4}</td>

         </tr>

         

         <tr>

            <td>家庭成员4职业: </td>

            <td>${Occupation4}</td>

         </tr>

         

         </table>

         

         <h3><a href="<c:url value='/form/reject/${HostFormId}'/>">拒绝</a> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <a href="<c:url value='/form/authorize/${HostFormId}'/>">通过</a></h3>

</body>

</html>