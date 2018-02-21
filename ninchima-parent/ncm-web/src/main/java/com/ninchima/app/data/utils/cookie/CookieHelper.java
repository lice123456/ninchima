package com.ninchima.app.data.utils.cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/***
 * 
  * @ClassName(类名)      : CookieHelper
  * @Description(描述)    : 使用 phantomjs 模拟登陆 获取网站cookie （定时更新）
  * @author(作者)         ：吴桂镇
  * @date (开发日期)      ：2018年2月18日 下午9:54:20
  *
 */
@Configuration
@PropertySource(value= {"classpath:params/cookie_param.properties"},encoding="utf-8") 
public class CookieHelper {
	
	private static final Runtime RT = Runtime.getRuntime();//Runtime.getRuntime()可以取得当前JVM的运行时环境，这也是在Java中唯一一个得到运行时环境的方法
	
	//#phantomJs 地址
	@Value("${phantomJsPath}")
	private String phantomJsPath;
	
	//#饿了么登录页面
	@Value("${eleLoginViewUrl}")
	private String eleLoginViewUrl;
	
	//#饿了么登录js地址
	@Value("${eleLoginUseJs}")
	private String eleLoginUseJs;
	
	
	public String getEleCookie() {
	  Process process = null;  
	  StringBuilder sbf = new StringBuilder();  
	  try {  
		   process = RT.exec(phantomJsPath +" "+eleLoginUseJs+ " "+eleLoginViewUrl);//将命令行的数据输入到运行环境中并执行,其中的路径最好写成绝对路径，
	       InputStream in = process.getInputStream();  //这一部分就是通过java流的方式来获取到抓取下来的网页信息，
	       InputStreamReader reader = new InputStreamReader(in, "UTF-8");  
	       BufferedReader br = new BufferedReader(reader);
	       String tmp = "";  
	       while((tmp = br.readLine())!=null){      
	    	   sbf.append(tmp);      
	       }  
	    } catch (IOException e) {  
	    	   e.printStackTrace();  
	    }  
	   return sbf.toString();
			
	}
	
	@Override
	public String toString() {
		return "CookieHelper [phantomJsPath=" + phantomJsPath + ", eleLoginViewUrl=" + eleLoginViewUrl
				+ ", eleLoginUseJs=" + eleLoginUseJs + "]";
	}
}
