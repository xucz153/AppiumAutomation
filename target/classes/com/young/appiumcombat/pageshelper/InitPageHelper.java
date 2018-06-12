package com.young.appiumcombat.pageshelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.young.appiumcombat.utils.AppiumUtil;

/**
 * @author Young
 * @description 初始化界面帮助类
 * 
 * */

public class InitPageHelper {
	public static Logger logger = Logger.getLogger(InitPageHelper.class);
	
	/**
	 * 在此界面上进行点击操�?
	 * */
	public static void clickOnInitPage(AppiumUtil appiumUtil,By byElement){
		appiumUtil.click(byElement);
	}
	
	/**1、判断现在开启按钮是否显示，如果显示了点击此按钮
	 * 2、判断定位�?项是否显示出来了 ，如果显示了点击取消按钮
	 * */
	public static void clickIfButtonExist(AppiumUtil appiumUtil, By byElement){
		
		boolean flag = appiumUtil.doesElementsExist(byElement);
		if(flag){
			appiumUtil.click(byElement);
		}else{
			return;
		}
		
	}
	
	/**APP首次启动会弹出一个欢迎界面和定位窗口�?
	 * 我们�?��消除掉这两个窗口才能进行后续操作�?
	 * 这里就是处理掉这2个页�?
	 * */
	public static void handleInit(AppiumUtil appiumUtil, By byElement[]){
		//第一个处理欢迎界�?
		clickIfButtonExist(appiumUtil, byElement[0]);
		//第二个处理定位服�?
		clickIfButtonExist(appiumUtil, byElement[1]);
		
	}
	

}
