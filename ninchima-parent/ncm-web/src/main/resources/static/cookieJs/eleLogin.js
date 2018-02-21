system = require('system');//这里是获取java文件里的送到虚拟机中的命令行数据
var address = system.args[1];//从这里我们可以得到csdn登录页的url
var page = require('webpage').create();//创建一个page,可查看相关的文档了解
page.open(address,function(status){
if(status === 'success'){
		var cookiesStr="";
        var cookies=page.cookies;
        for(var i in cookies){
            cookiesStr=cookiesStr+cookies[i].name+"="+cookies[i].value+";";         
        }
        console.log(cookiesStr);
        page.evaluate(function() {
			document.getElementsByTagName("input")[0].value='15922115103';//这里填写帐号
			document.getElementsByTagName("input")[1].value='19930204';//这里填写密码
			document.getElementsByTagName("button")[0].click();//登录按钮的动作
        });
		//console.log("........................");
		var cookiesStra = "";
		var cookiesc = page.cookies;
		for(var j in cookiesc){
		            cookiesStra=cookiesStra+cookiesc[j].name+"="+cookiesc[j].value+";";
		        }
		//console.log(JSON.stringify(cookiesc));
		setTimeout('print_cookies()',10000);
}else{
		console.log("error.....");
		phantom.exit();
}
});
//当登陆成功后,跳转到想要取得页面，并把网页的数据抓下来
function print_cookies(){
   // console.info(JSON.stringify(page.cookies, undefined, 4));
	var page1 = require('webpage').create();
	//phantom.addcookie
	page1.open("https://www.ele.me/place/wx4g6z98pzb",function(status){
		if(status === 'success'){
			//console.log(page1.content);
			var cookiesStrb="";
		    var cookiesb=page1.cookies;
		    for(var k in cookiesb){
		        cookiesStrb=cookiesStrb+cookiesb[k].name+"="+cookiesb[k].value+";";         
		    }
			console.log(cookiesStrb);
			
			page1.evaluate(function(){
			});
			phantom.exit()
		}else{
			console.log("error.....");
			phantom.exit();
		}
	});
}