package org.hap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.sharpairlines.com.au/");
		d.manage().window().maximize();
		WebElement from = d.findElement(By.xpath("//select[@name='departure']"));
		Select s=new Select(from);
		boolean n=s.isMultiple();
		System.out.println(n);
		List<WebElement> f=s.getOptions();
		s.selectByIndex(1);
		WebElement dest=d.findElement(By.name("destination"));
		Select s1=new Select(dest);
		List<WebElement> de=s1.getOptions();
		s1.selectByIndex(2);
		WebElement depdate=d.findElement(By.name("departuredate"));
		depdate.sendKeys("25Sep2019");
		Thread.sleep(5000);
		WebElement login=d.findElement(By.xpath("(//input[@type='submit'])[1]"));
		login.click();
		
	}

}
