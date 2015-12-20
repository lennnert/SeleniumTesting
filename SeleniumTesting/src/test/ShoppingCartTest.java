package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ShoppingCartTest {
	private WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
	}
	
	@After
	public void clean(){
		driver.quit();
	}
	
	@Test
	 public void test_arraylist_size_is_plus_one_when_adding_to_chart() {
	
	 }
	
	@Test
	 public void test_quantity_given_is_greater_than_null() {
		 driver.get("http://java.cyclone2.khleuven.be:38034/WebShop_ModelSolution/Controller?action=productOverview");

	        WebElement element = driver.findElement(By.name("quantity"));

	        element.sendKeys("-6");

	        element.submit();
	        
	        assertEquals("Geef een geldige hoeveelheid op.", driver.findElement(By.name("error")).getText());
	 }
	
	@Test
	 public void test_quantity_given_not_equals_null() {
		 driver.get("http://java.cyclone2.khleuven.be:38034/WebShop_ModelSolution/Controller?action=productOverview");

	        WebElement element = driver.findElement(By.name("quantity"));

	        element.sendKeys("a");

	        element.submit();
	        
	        assertEquals("Geef een geldige hoeveelheid op.", driver.findElement(By.name("error")).getText());
	 }
	
	@Test
	 public void test_default_quantity_given_equals_one() {
		 driver.get("http://java.cyclone2.khleuven.be:38034/WebShop_ModelSolution/Controller?action=productOverview");

	        WebElement element = driver.findElement(By.name("quantity"));
	        
	        assertEquals("1", element.getAttribute("value"));
	 }
	
	@Test
	 public void test_form_amount_order_in_link_is_same_as_arraylist_size() {
	
	 }
	
	

	
}
