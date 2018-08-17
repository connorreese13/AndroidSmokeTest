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

Mobile.tap(findTestObject('Application/android.widget.FrameLayout11'), 0)

Mobile.tap(findTestObject('Application/TextInputLayout0 - Email'), 0)

Mobile.setText(findTestObject('Application/android.widget.EditText0'), 'connor.reese@payclip.com', 0)

Mobile.tap(findTestObject('Application/TextInputLayout1 - Password'), 0)

Mobile.setText(findTestObject('Application/android.widget.EditText1'), 'P@ssw0rd', 0)

Mobile.tap(findTestObject('Application/android.widget.TextView0 - Login'), 0)

Mobile.tap(findTestObject('Application/android.widget.ViewAnimator2'), 0)

Mobile.comment('Security Settings test')

Mobile.tap(findTestObject('Settings/android.widget.TextView3 - Security'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Switch0 - OFF'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button0 - 1'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button1 - 2'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button2 - 3'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button3 - 4'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button0 - 1'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button1 - 2'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button2 - 3'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button3 - 4'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Switch0 - ON'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button0 - 1'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button1 - 2'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button2 - 3'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Button3 - 4'), 0)

Mobile.tap(findTestObject('Settings/android.widget.ImageButton0'), 0)

Mobile.comment('Clip Reader Status test')

Mobile.tap(findTestObject('Settings/android.widget.TextView4 - Clip Reader Status'), 0)

Mobile.waitForElementPresent(findTestObject('Settings/android.widget.TextView0 - Setup reader'), 0)

Mobile.tap(findTestObject('Settings/android.widget.ImageButton0'), 0)

Mobile.comment('Preferences Settings test')

Mobile.tap(findTestObject('Settings/android.widget.TextView2 - Preferences'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Switch0 - OFF (1)'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Switch1 - OFF'), 0)

Mobile.tap(findTestObject('Settings/android.widget.Switch2 - OFF'), 0)

Mobile.tap(findTestObject('Settings/Preferences/android.widget.FrameLayout9'), 0)

Mobile.tap(findTestObject('Settings/Preferences/android.widget.TextView1 - Round up'), 0)

Mobile.waitForElementPresent(findTestObject('Settings/Preferences/android.widget.TextView5 - Round up'), 0)

Mobile.tap(findTestObject('Settings/Preferences/android.widget.Switch2 - ON'), 0)

Mobile.tap(findTestObject('Settings/Preferences/android.widget.Switch1 - ON'), 0)

Mobile.tap(findTestObject('Settings/Preferences/android.widget.Switch0 - ON'), 0)

Mobile.tap(findTestObject('Settings/android.widget.ImageButton0'), 0)

Mobile.comment('Buy your reader test (currently broken) ')

not_run: Mobile.tap(findTestObject('Settings/android.widget.TextView5 - Buy Your Reader'), 0)

not_run: Mobile.tap(findTestObject('Settings/android.widget.ImageButton0'), 0)

Mobile.comment('About Screen test')

Mobile.tap(findTestObject('Settings/android.widget.TextView6 - About'), 0)

Mobile.tap(findTestObject('Settings/android.widget.ImageButton0'), 0)

Mobile.checkElement(findTestObject('Settings/About/android.widget.TextView2 - Made with  by Clip'), 0)

Mobile.checkElement(findTestObject('Settings/About/android.widget.ImageView0'), 0)

Mobile.closeApplication()

Mobile.checkElement(findTestObject(null), 0)

