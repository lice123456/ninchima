package com.ninchima.app.data.source;


import com.ninchima.app.data.utils.SiteHelper;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/***
 * 饿了么
 * @author ASUS
 *
 */
public class Elm implements PageProcessor{
	
	// 设置编码 ，超时时间，重试次数，
	private Site site = SiteHelper.getEleSite();
	
	@Override
	public void process(Page page) {
		System.out.println(page.getHtml().toString());
	}
	
	public static void main(String[] args) {
		int offset = 100;
		//个人主页的网址
		String url = "https://www.ele.me/restapi/shopping/restaurants?"
				+ "extras[]=activities&"
				+ "geohash=wx4g6z98pzb&"
				+ "latitude=38.976128&"
				+ "limit=24&longitude=117.698896&"
				+ "offset="+offset+"&terminal=web";
		Spider.create(new Elm())
				.addUrl(url)
//				.addPipeline(new GetquestionUrlPipeline())
				.thread(5)
				.run();
	}
	
	@Override
	public Site getSite() {

		return site;
	}

}
