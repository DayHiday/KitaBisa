package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.DetailDonasiPage;

public class stepDefinition {

	WebDriver driver;

	@Given("^Open donation details page")
	public void Open_donation_details_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kitabisa.com/campaign/wujudkanpauddintt/contribute?slug=wujudkanpauddintt");
	}

	@Then("^verify validation message data is empty$")
	public void verify_validation_message_data_is_empty() throws Throwable {
		String errorMessageNominal=driver.findElement(DetailDonasiPage.view_error_message_nominal).getText();
		Assert.assertEquals("Nominal tidak boleh kosong.", errorMessageNominal);

		String errorMessagePembayaran=driver.findElement(DetailDonasiPage.view_error_message_payment_method).getText();
		Assert.assertEquals("Metode pembayaran tidak boleh kosong", errorMessagePembayaran);

		String errorMessageNama=driver.findElement(DetailDonasiPage.view_error_message_fullname).getText();
		Assert.assertEquals("Nama lengkap tidak boleh kosong", errorMessageNama);

		String errorMessageEmail=driver.findElement(DetailDonasiPage.view_error_message_email).getText();
		Assert.assertEquals("Nomor WhatsApp atau Email tidak boleh kosong.", errorMessageEmail);

		driver.quit();
	}

	@When("^input nominal donation below ten thousand$")
	public void input_nominal_donation_below_ten_thousand() throws Throwable {
		driver.findElement(DetailDonasiPage.input_nominal_donasi).sendKeys("1000");
	}

	@When("^input nominal is not a multiple of one thousand$")
	public void input_nominal_is_not_a_multiple_of_one_thousand() throws Throwable {
		driver.findElement(DetailDonasiPage.input_nominal_donasi).sendKeys("12345");
	}

	@When("^click on lanjutkan pembayaran button$")
	public void click_on_lanjutkan_pembayaran_button() throws Throwable {
		driver.findElement(DetailDonasiPage.button_lanjut_pembayaran).click();
	}

	@Then("^click nominal title$")
	public void click_nominal_title() throws Throwable {
		driver.findElement(DetailDonasiPage.view_title_nominal).click();
	}

	@Then("^verify validation message donation below ten thousand$")
	public void verify_validation_message_donation_below_ten_thousand() throws Throwable {
		String errorMessage=driver.findElement(DetailDonasiPage.view_error_message_nominal).getText();
		Assert.assertEquals("Jumlah donasi minimal Rp 10.000.", errorMessage);
		driver.quit();
	}

	@Then("^verify validation message nominal is not a multiple of one thousand$")
	public void verify_validation_message_nominal_is_not_a_multiple_of_one_thousand() throws Throwable {
		String errorMessage=driver.findElement(DetailDonasiPage.view_error_message_nominal).getText();
		Assert.assertEquals("Jumlah donasi harus dalam kelipatan ribuan.", errorMessage);
		driver.quit();
	}

	@When("^input nominal valid$")
	public void input_nominal_valid() throws Throwable {
		driver.findElement(DetailDonasiPage.input_nominal_donasi).sendKeys("10000");
	}

	@Then("^click pilih button$")
	public void click_pilih_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(DetailDonasiPage.button_pilih_metode_pembayaran).click();
	}

	@Then("^choice the payment method options with gopay$")
	public void choice_the_payment_method_options_with_gopay() throws Throwable {
		Thread.sleep(2000);
		String gopay1=driver.findElement(DetailDonasiPage.choice_gopay_payment_method).getText();
		driver.findElement(DetailDonasiPage.choice_gopay_payment_method).click();
		Thread.sleep(2000);
		String gopay2=driver.findElement(DetailDonasiPage.view_payment_method_detail_donasi).getText();
		Assert.assertEquals(gopay1, gopay2);
		driver.quit();
	}

	@When("^input fullname with numbers$")
	public void input_fullname_with_numbers() throws Throwable {
		driver.findElement(DetailDonasiPage.input_fullname).sendKeys("12345678");
	}

	@Then("^verify validation message fullname$")
	public void verify_validation_message_fullname() throws Throwable {
		String errorMessageNama=driver.findElement(DetailDonasiPage.view_error_message_fullname).getText();
		Assert.assertEquals("Nama lengkap hanya boleh huruf, titik (.) dan apostrof (')", errorMessageNama);
		driver.quit();
	}

	@When("^input random string$")
	public void input_random_string() throws Throwable {
		driver.findElement(DetailDonasiPage.input_email).sendKeys("werwerwerwe");
	}

	@Then("^verify validation message wa number and email$")
	public void verify_validation_message_wa_number_and_email() throws Throwable {
		String errorMessageEmail=driver.findElement(DetailDonasiPage.view_error_message_email_2).getText();
		Assert.assertEquals("Hanya diisi dengan nomor WhatsApp atau email.", errorMessageEmail);
		driver.quit();
	}
	
	@Then("^click masuk button$")
	public void click_masuk_button () throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(DetailDonasiPage.button_masuk).click();
	}

	@Then("^view akun page$")
	public void view_akun_page() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(DetailDonasiPage.input_email_akun_page).isDisplayed();
	    driver.findElement(DetailDonasiPage.input_password_akun_page).isDisplayed();
	    driver.findElement(DetailDonasiPage.button_facebook).isDisplayed();
	    driver.findElement(DetailDonasiPage.button_gmail).isDisplayed();
	    driver.quit();
	}
	
	@Then("^click toogle tulis komentar$")
	public void click_toogle_tulis_komentar() throws Throwable {
	    driver.findElement(DetailDonasiPage.button_toogle_komentar).click();
	}

	
	@Then("^scroll up donation details page$")
	public void scroll_up_donation_details_page () throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(DetailDonasiPage.input_comment_writing_area).isDisplayed();
	    driver.quit();
	}
	
	@Then("^view payment method page$")
	public void view_payment_method_page() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(DetailDonasiPage.choice_gopay_payment_method).isDisplayed();
	    driver.findElement(DetailDonasiPage.choice_jenius_payment_method).isDisplayed();
	    driver.quit();
	}


}
