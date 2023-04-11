import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/news/mot-to-hop-kien-truc-van-hoa-tinh-than-an-minh-ben-trong-nha-hang-sushi-hokkaido-sachi-au-tien-cua-ha-noi')

'step 1: Add visual checkpoint at Page_news_mot-to-hop-kien-truc-van-hoa-tinh-than-an-minh-ben-trong-nha-hang-sushi-hokkaido-sachi-au-tien-cua-ha-noi'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00001_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
