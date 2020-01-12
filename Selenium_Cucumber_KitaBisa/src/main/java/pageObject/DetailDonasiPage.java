package pageObject;

import org.openqa.selenium.By;

public class DetailDonasiPage {
	
	// Input
	public static By input_nominal_donasi = By.cssSelector("#contribute_inputfield_amount-donation");
	public static By input_fullname = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > div.style__UserContainer-sc-1l6tpe1-0.dVkQpa > div:nth-child(2) > input");
	public static By input_email = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > div.style__UserContainer-sc-1l6tpe1-0.dVkQpa > div:nth-child(3) > input");
	public static By input_email_akun_page = By.cssSelector("#login_inputfield_wa-email");
	public static By input_password_akun_page = By.cssSelector("#login_inputfield_password");
	public static By input_comment_writing_area = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > div.style__CommentContainer-sc-1l6tpe1-4.fTRGIM");
	
	// Button
	public static By button_lanjut_pembayaran = By.cssSelector("#contribute_button_lanjutkan-pembayaran");
	public static By button_pilih_metode_pembayaran = By.cssSelector("#contribute_button_pilih-metode-pembayaran");
	public static By button_masuk = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > div.style__UserContainer-sc-1l6tpe1-0.dVkQpa > div:nth-child(1) > a");
	public static By button_facebook = By.cssSelector("#button_masuk-facebook");
	public static By button_gmail = By.cssSelector("#button_masuk-google");
	public static By button_toogle_komentar = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > label");
	
	// Choice
	public static By choice_gopay_payment_method = By.cssSelector("#__next > main > div:nth-child(2) > div:nth-child(1)");
	public static By choice_jenius_payment_method = By.cssSelector("#__next > main > div:nth-child(2) > div:nth-child(2)");
	// View
	public static By view_title_nominal = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > p.style__DonationInputTitle-nfgh9x-2.cjqVUz");
	public static By view_payment_method_detail_donasi = By.cssSelector("#contribute_itemlist_list-pembayaran-20");
	
	// Error Message
	public static By view_error_message_nominal = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > p.style__ErrorText-sc-9kghrx-0.hzIHnV");
	public static By view_error_message_payment_method = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > div.style__PaymentContainer-sc-1wfxixd-0.UJsVU > p");
	public static By view_error_message_fullname = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > div.style__UserContainer-sc-1l6tpe1-0.dVkQpa > span:nth-child(3)");
													//By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > div.style__UserContainer-sc-1l6tpe1-0.dVkQpa > span")
	public static By view_error_message_email = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > div.style__UserContainer-sc-1l6tpe1-0.dVkQpa > span:nth-child(5)");
	public static By view_error_message_email_2 = By.cssSelector("#contribute-page > form.style__Form-sc-12bsx5v-1.dETokB > div.style__UserContainer-sc-1l6tpe1-0.dVkQpa > span");
}
