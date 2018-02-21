package com.ninchima.app.data.utils;



import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;

/***
 * 
  * @ClassName(类名)      : SiteHelper
  * @Description(描述)    : webMagic 使用的site创建
  * @author(作者)         ：吴桂镇
  * @date (开发日期)      ：2018年2月18日 下午9:52:26
  *
 */
public class SiteHelper {
	
	/***
	 * 
	 * @Description(功能描述)    :  饿了么使用site
	 * @author(作者)             ：  吴桂镇
	 * @date (开发日期)          :  2018年2月18日 下午9:52:55 
	 * @exception                : 
	 * @param cookieStr
	 * @return  Site
	 */
	public static Site getEleSite() {
		Site site = Site.me().setRetryTimes(10).setSleepTime(5000).setTimeOut(5000);
		site.setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.89 Safari/537.36");
		//site.addCookie("_utrace", "19eb6ea576be5e3d2c5e8248fb1aef90_2018-02-18");
		site.addCookie("USERID", "14450799");
		return site;
	}
	
}
