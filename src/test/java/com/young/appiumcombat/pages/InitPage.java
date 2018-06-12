package com.young.appiumcombat.pages;

import org.openqa.selenium.By;

/**@author Young
 * @description APP每次初始化出现的元素 页面元素类
 * */

public class InitPage {
	/**现在开启*/
	 public static final By IP_BUTTON_START = By.id("com.microsoft.bing:id/tutorial_finish_button"); 
	/**取消定位*/
	 public static final By IP_BUTTON_CANCEL = By.id("android:id/button2"); 
	 
	 /**元素组*/
	public static  By byElements[] = {IP_BUTTON_START,IP_BUTTON_CANCEL};
	

}
