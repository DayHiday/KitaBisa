Feature: Test donation details page KitaBisa

	Scenario: Check validation message if data is empty
	Given Open donation details page
	When click on lanjutkan pembayaran button
	Then verify validation message data is empty

	Scenario: Check validation message if input nominal donation below 10000
	Given Open donation details page
	When input nominal donation below ten thousand
	Then click nominal title
	Then verify validation message donation below ten thousand

	Scenario: Check validation message if Nominal input is not a multiple of 1000
	Given Open donation details page
	When input nominal is not a multiple of one thousand
	Then click nominal title
	Then verify validation message nominal is not a multiple of one thousand

	Scenario: Check the payment method options with gopay
	Given Open donation details page
	When input nominal valid
	Then click pilih button
	Then choice the payment method options with gopay

	Scenario: Check validation message if the full name is filled in with numbers
	Given Open donation details page
	When input fullname with numbers
	Then click nominal title
	Then verify validation message fullname

	Scenario: Check validation message if "Nomor wa atau email" is  filled in except "Nomor wa atau email"
	Given Open donation details page
	When input random string
	Then click nominal title
	Then verify validation message wa number and email

	Scenario: Check the input view for comments
	Given Open donation details page
	When click nominal title
	Then click toogle tulis komentar
	Then scroll up donation details page
	
	Scenario: Check the "Masuk" button
	Given Open donation details page 
	When click nominal title
	Then click masuk button
	Then view akun page

	Scenario: Check the "Pilih" button
	Given Open donation details page 
	When input nominal valid
	Then click pilih button
	Then view payment method page





	
	