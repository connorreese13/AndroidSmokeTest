package com.ea.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable

public class CommonUtilities {
	static KeywordLogger logger = KeywordLogger.getInstance();
	
	/**
	 * Press key on android's device.
	 * @param androidKeyCode Android's Key mapped into specific code: https://developer.android.com/reference/android/view/KeyEvent.html
	 */
	
	 @Keyword
	 def pressKey(int androidKeyCode)
	 {
	 try{
	 AppiumDriver driver = MobileDriverFactory.getDriver()
	 AndroidDriver androidDriver = (AndroidDriver) driver;
	 androidDriver.pressKeyCode(androidKeyCode);
	 logger.logInfo("Press " + androidKeyCode )
	 }
	 catch (Exception ex){
	 println (ex.toString())
	 }
	 }
}
