package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	// Elementos VehicleData
		public By make = By.xpath("//option[@value='Ford']");
		public By engine = By.id("engineperformance");
		public By dateMan = By.id("dateofmanufacture");
		public By numSeats = By.xpath("//option[@value='2']");
		public By fuel = By.xpath("//option[@value='Gas']");
		public By price = By.id("listprice");
		public By plate = By.id("licenseplatenumber");
		public By mileage = By.id("annualmileage");
		public By btnNext1 = By.id("nextenterinsurantdata");
		
		// Elementos InsurantData
		public By firstName = By.id("firstname");
		public By lastName = By.id("lastname");
		public By dateBirth = By.id("birthdate");
		public By gender = By.xpath("//div[@class='field']/p[@class='group']/label[@class='ideal-radiocheck-label']");
		public By street = By.xpath("//input[@id='streetaddress']");
		public By country = By.xpath("//option[@value='Brazil']");
		public By zipCode = By.id("zipcode");
		public By city = By.id("city");
		public By occupation = By.xpath("//option[@value='Employee']");
		public By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
		public By website = By.id("website");
		public By btnNext2 = By.id("nextenterproductdata");
		
		// Elementos ProductData
		public By startDate = By.id("startdate");
		public By sum = By.xpath("//option[@value='3000000']");
		public By merit = By.xpath("//option[@value='Bonus 1']");
		public By damage = By.xpath("//option[@value='Full Coverage']");
		public By optProduct = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]");
		public By courtesy = By.xpath("//option[@value='Yes']");
		public By btnNext3 = By.id("nextselectpriceoption");
		
		//Elementos PriceOption
		public By selectPlan = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]");
		public By btnNext4 = By.id("nextsendquote");
		
		//Elementos Senquaote
		public By email= By.id("email");
		public By phone = By.id("phone");
		public By username = By.id("username");
		public By password= By.id("password");
		public By confirmPassword = By.id("confirmpassword");
		public By comments = By.id("Comments");
		public By btnSend = By.id("sendemail");
		public By btnConfirm = By.xpath("/html/body/div[4]/div[7]/div/button");
						
}



