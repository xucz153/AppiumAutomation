package com.young.appiumcombat.pageshelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.young.appiumcombat.pages.MorePage;
import com.young.appiumcombat.utils.AppiumUtil;
/**
 * 首页帮助类
 * 
 * */

public class MorePageHelper {
	//本类日志对象
	public static Logger logger = Logger.getLogger(MorePageHelper.class);
	
	/**
	 * @author Young
	 * @param appiumUtil Appium封装对象引用
	 * @param byElement 要点击的元素By对象
	 * @description 在更多界面上进行点击操作
	 * */
	public static  void clickOnMorePage(AppiumUtil appiumUtil,By byElement){
		appiumUtil.click(byElement);
		
		
	}

	
	/**验证首页部分文本内容*/
	public static void checkMorePageUIText(AppiumUtil appiumUtil,String ...expectedStrs){
		logger.info("正在验证APP更多界面文本内容是否正确");
		appiumUtil.isTextCorrect(appiumUtil.getText(MorePage.MP_BUTTON_LOGIN), expectedStrs[0]);
		appiumUtil.isTextCorrect(appiumUtil.getText(MorePage.MP_BUTTON_HISTORY), expectedStrs[1]);
		appiumUtil.isTextCorrect(appiumUtil.getText(MorePage.MP_BUTTON_SETTINGS), expectedStrs[2]);
		appiumUtil.isTextCorrect(appiumUtil.getText(MorePage.MP_BUTTON_FEEDBACK), expectedStrs[3]);
		logger.info("验证APP更多界面文本内容完成");
	}
	

}
