package com.young.appiumcombat.pages;

import org.openqa.selenium.By;

/**@author Young
 * @description 搜索页面元素
 * */

public class SearchWebviewPage {
	/**WebView名字*/
	 public static final String WEBVIEW_NAME = "WEBVIEW_com.microsoft.bing";
	 /**搜索的结果列表*/
	 public static final By SWP_LINK_RESULT = By.xpath("//*[@class='deeplink_title']");
	 
	 /**全部搜索*/
	 public static final By SWP_LINK_ALLSEARCH = By.xpath("//*[@class='b_hList']/li[2]");
	 /**英文搜索*/
	 public static final By SWP_LINK_ENGLISHSEARCH = By.xpath("//*[@class='b_hList']/li[4]");

	 
	 
	 
	

}
