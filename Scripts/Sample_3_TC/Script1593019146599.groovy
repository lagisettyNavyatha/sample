import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


//open browser
WebUI.openBrowser( "https://lifecharger.org/")

//click
WebUI.click(  findTestObject('Object Repository/Sample_3_OR/Page_Life Charger   a new beginning/a_2 Minute Rule')  )
// set text
WebUI.setText(  findTestObject('Object Repository/Sample_3_OR/Page_Life Charger   a new beginning/input_Search for_s')  , "life")

//verify element
not_run:WebUI.verifyElementPresent( findTestObject('Object Repository/Sample_3_OR/Page_Life Charger   a new beginning/a_Home')   , 4)
//close browser
WebUI.closeBrowser()

	

