import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

Mobile.startApplication('/Users/connorreese/Downloads/Clip-3.4.0-208-prod-release.apk', true)

Mobile.tap(findTestObject('Application/Login Selectors/login'), 0)

Mobile.tap(findTestObject('Application/Login Selectors/emailLogin'), 0)

Mobile.setText(findTestObject('Application/Login Selectors/emailLoginInput'), 'connor.reese@payclip.com', 0)

Mobile.tap(findTestObject('Application/Login Selectors/password'), 0)

Mobile.setText(findTestObject('Application/Login Selectors/passwordInput'), 'P@ssw0rd', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Application/Login Selectors/loginButton'), 0)

Mobile.tap(findTestObject('Application/Settings/settingsButton'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/myAccountSettingsButton'), 0)

Mobile.comment('Personal Info')

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Personal Info/personalInfoButton'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Personal Info/First Name Field'), 0)

Mobile.clearText(findTestObject('Application/Settings/My Account Settings/Personal Info/PI First Name Field'), 0)

Mobile.setText(findTestObject('Application/Settings/My Account Settings/Personal Info/PI First Name Input'), 'Connor', 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Personal Info/Paternal Name Field'), 0)

Mobile.clearText(findTestObject('Application/Settings/My Account Settings/Personal Info/PI Paternal Name Field'), 0)

Mobile.setText(findTestObject('Application/Settings/My Account Settings/Personal Info/PI Paternal Name Input'), 'Ree', 0)

Mobile.verifyElementExist(findTestObject('Application/Settings/My Account Settings/Personal Info/maternalNameField'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Personal Info/meh'), 0)

Mobile.tap(findTestObject('Application/Settings/settingsBackButton'), 0)

Mobile.comment('Business Industry ')

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Info/Business Info button'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Info/Business Name Input'), 0)

Mobile.clearText(findTestObject('Application/Settings/My Account Settings/Business Info/Business Name Input'), 0)

Mobile.setText(findTestObject('Application/Settings/My Account Settings/Business Info/emptyBusinessNameField'), 'Connors Sporting Goods', 
    0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Info/businessSelectorButton'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Info/Mayoristas indsutry selection'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Info/Business Industry save changes'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Info/backArrowButton'), 0)

Mobile.comment('Business Address')

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/android.widget.TextView3 - Business Address'), 
    0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/Street Input'), 0)

Mobile.clearText(findTestObject('Application/Settings/My Account Settings/Business Address/Set Text Street'), 0)

Mobile.setText(findTestObject('Application/Settings/My Account Settings/Business Address/Set Text Street'), 'A Street', 
    0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/Num Int Input'), 0)

Mobile.clearText(findTestObject('Application/Settings/My Account Settings/Business Address/Set Text Num Int'), 0)

Mobile.setText(findTestObject('Application/Settings/My Account Settings/Business Address/Set Text Num Int'), '3', 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/Zip Code Input'), 0)

Mobile.clearText(findTestObject('Application/Settings/My Account Settings/Business Address/Set Text Zip Code'), 0)

Mobile.verifyElementVisible(findTestObject('Application/Settings/My Account Settings/Business Address/Must Be 5 digits'), 
    0)

Mobile.setText(findTestObject('Application/Settings/My Account Settings/Business Address/Set Text Zip Code'), '84126', 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/Colony Selector'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/La Paz colony'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/Business Address Header'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/Municipality Selector'), 0)

Mobile.checkElement(findTestObject('Application/Settings/My Account Settings/Business Address/Imuris Municipality'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/Business Address Header'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/State Selector'), 0)

Mobile.checkElement(findTestObject('Application/Settings/My Account Settings/Business Address/Sonora State'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/Business Address Header'), 0)

Mobile.tap(findTestObject('Application/Settings/My Account Settings/Business Address/Business Address Save button'), 0)

Mobile.pressBack()

