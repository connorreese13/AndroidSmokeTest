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

Mobile.startApplication('/Users/connorreese/Downloads/Clip-3.4.0-208-prod-release.apk', true)

Mobile.tap(findTestObject('Application/Login Selectors/login'), 0)

Mobile.tap(findTestObject('Application/Login Selectors/emailLogin'), 0)

Mobile.setText(findTestObject('Application/Login Selectors/emailLoginInput'), 'connor.reese@payclip.com', 0)

Mobile.tap(findTestObject('Application/Login Selectors/password'), 0)

Mobile.setText(findTestObject('Application/Login Selectors/passwordInput'), 'P@ssw0rd', 0)

Mobile.tap(findTestObject('Application/Login Selectors/loginButton'), 0)

Mobile.tap(findTestObject('Application/Settings/settingsButton'), 0)

Mobile.comment('Security Settings test')

Mobile.tap(findTestObject('Application/Settings/Security/securityButton'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Switch0 - OFF'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button0 - 1'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button1 - 2'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button2 - 3'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button3 - 4'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button0 - 1'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button1 - 2'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button2 - 3'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button3 - 4'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Switch0 - ON'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button0 - 1'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button1 - 2'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button2 - 3'), 0)

Mobile.tap(findTestObject('Application/Settings/Security/android.widget.Button3 - 4'), 0)

Mobile.tap(findTestObject('Application/Settings/settingsBackButton'), 0)

Mobile.comment('Clip Reader Status test')

Mobile.tap(findTestObject('Application/Settings/Clip Reader Status/clipReaderStatusButton'), 0)

Mobile.waitForElementPresent(findTestObject('Application/Settings/Clip Reader Status/setUpReaderMessage'), 0)

Mobile.tap(findTestObject('Application/Settings/settingsBackButton'), 0)

Mobile.comment('Preferences Settings test')

Mobile.tap(findTestObject('Application/Settings/Preferences/preferencesButton'), 0)

Mobile.tap(findTestObject('Application/Settings/Preferences/android.widget.Switch0 - OFF (1)'), 0)

Mobile.tap(findTestObject('Application/Settings/Preferences/android.widget.Switch1 - OFF'), 0)

Mobile.tap(findTestObject('Application/Settings/Preferences/android.widget.Switch2 - OFF'), 0)

Mobile.tap(findTestObject('Application/Settings/Preferences/tipsSwitch'), 0)

Mobile.tap(findTestObject('Application/Settings/Preferences/android.widget.TextView1 - Round up'), 0)

Mobile.waitForElementPresent(findTestObject('Application/Settings/Preferences/android.widget.TextView5 - Round up'), 0)

Mobile.tap(findTestObject('Application/Settings/Preferences/android.widget.Switch2 - ON'), 0)

Mobile.tap(findTestObject('Application/Settings/Preferences/android.widget.Switch1 - ON'), 0)

Mobile.tap(findTestObject('Application/Settings/Preferences/android.widget.Switch0 - ON'), 0)

Mobile.tap(findTestObject('Application/Settings/settingsBackButton'), 0)

Mobile.comment('Buy your reader test (currently broken) ')

not_run: Mobile.tap(findTestObject('Application/Settings/Buy Reader/buyReaderButton'), 0)

not_run: Mobile.tap(findTestObject('Application/Settings/settingsBackButton'), 0)

Mobile.comment('About Screen test')

Mobile.tap(findTestObject('Application/Settings/About/aboutButton'), 0)

Mobile.checkElement(findTestObject('Application/Settings/About/Made with love by Clip'), 0)

Mobile.checkElement(findTestObject('Application/Settings/About/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Application/Settings/settingsBackButton'), 0)

Mobile.closeApplication()

Mobile.checkElement(findTestObject(null), 0)

