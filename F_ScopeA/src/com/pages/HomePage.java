package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
		
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By searchField=By.xpath("//textarea[@id='APjFqb']");
	By searchBTN=By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]");
	By serachAfterBTN=By.xpath("//body/div[@id='searchform']/div[2]/form[1]/div[1]/div[1]/div[3]/button[1]");
	
	public void searchFiled(String s) {
		driver.findElement(searchField).sendKeys(s);
	}
	
	public void SearchBTN() {
		driver.findElement(searchBTN).click();
	}
	public void clear() {
		
		driver.findElement(searchField).clear();
		
	}
	
	public void searchafterhome() {
		
		driver.findElement(serachAfterBTN).click();
	}
	

}
