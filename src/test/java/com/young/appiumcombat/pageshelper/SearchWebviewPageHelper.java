package com.young.appiumcombat.pageshelper;

import org.openqa.selenium.By;
import org.testng.log4testng.Logger;

import com.young.appiumcombat.pages.SearchWebviewPage;
import com.young.appiumcombat.utils.AppiumUtil;

public class SearchWebviewPageHelper {
	static Logger logger = Logger.getLogger(SearchWebviewPageHelper.class);
	/**进入指定的webview内容中*/
	public static void enterWebview(AppiumUtil appiumUtil,String webview){
		appiumUtil.switchWebview(webview);
	}
	
	/**等待webview页面中的元素显示出来*/
	public static void waitForSearchResultDisplay(AppiumUtil appiumUtil,int elementTimeOut){
		logger.info("正在等待搜索结果webview页面加载出来");
		appiumUtil.waitForElementToLoad(elementTimeOut, SearchWebviewPage.SWP_LINK_ALLSEARCH);
		appiumUtil.waitForElementToLoad(elementTimeOut, SearchWebviewPage.SWP_LINK_ENGLISHSEARCH);
		appiumUtil.waitForElementToLoad(elementTimeOut, SearchWebviewPage.SWP_LINK_RESULT);
		logger.info("搜索结果webview页面加载完毕");
		
	}
	
	/**验证搜索出来的结果是否含有关键字*/
	public static void checkResultFitKeyword(AppiumUtil appiumUtil,String keyword,By byElement){
		
		appiumUtil.isContains(appiumUtil.getText(byElement), keyword);
	}

}
