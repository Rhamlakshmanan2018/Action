package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sampeling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rhamlakshmanan\\eclipse-workspace\\Action\\driver\\chromedriver.exe");
		WebDriver allow =new ChromeDriver();
		allow.get("https://demo.guru99.com/test/drag_drop.html");
		allow.manage().window().maximize();
		Thread.sleep(3000);
		//To create object in Action
		Actions a = new Actions(allow);
		//To find the Bank webElement 
		WebElement Bankbtn = allow.findElement(By.xpath("//a[text()=' BANK ']"));
		//To find the Debit side account Drag and Drop
		WebElement Debitstr = allow.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(Bankbtn, Debitstr).perform();
		//To find the Sale webElements
		WebElement Salebtn = allow.findElement(By.xpath("//a[text()=' SALES ']"));
		//To find the credit side account Drag and Drop
		WebElement Creditstr = allow.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        a.dragAndDrop(Salebtn, Creditstr).perform();
		//To find the BankAmt(5000) webElement 
        WebElement Bankamt = allow.findElement(By.xpath("//a[text()=' 5000 ']"));
       //To find the Debit side BankAmt Drag and Drop
        WebElement Debitamt = allow.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        a.dragAndDrop(Bankamt, Debitamt).perform();
       //To find the SaleAmt(5000) webElement 
        WebElement Saleamt = allow.findElement(By.xpath("//a[text()=' 5000 ']"));
      //To find the credit side BankAmt Drag and Drop
        WebElement Creditamt = allow.findElement(By.xpath("(//li[@class='placeholder'])"));
        a.dragAndDrop(Saleamt, Creditamt).perform();
        
        
        
        
        
	}

}
