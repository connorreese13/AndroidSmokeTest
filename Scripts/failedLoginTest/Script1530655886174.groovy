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

Mobile.tap(findTestObject('Application/android.widget.FrameLayout11 (1)'), 0)

Mobile.tap(findTestObject('Application/android.widget.EditText0 (1)'), 0)

Mobile.setText(findTestObject('Application/android.widget.EditText0 (2)'), 'john doe', 0)

Mobile.tap(findTestObject('Application/android.widget.EditText1 (1)'), 0)

Mobile.setText(findTestObject('Application/android.widget.EditText1 (2)'), 'meh', 0)

Mobile.tap(findTestObject('Application/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Application/android.widget.TextView0 - Login (1)'), 0)

Mobile.closeApplication()

