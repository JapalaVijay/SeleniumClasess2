package seleniumSessions_2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//5.2
public class ElementUtil {
	
	private WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		this.driver =driver;
	}
	
	public By getBy(String locatorType, String locatorValue) {
		By locator = null;
		
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "cssselector":
			locator = By.cssSelector(locatorValue);
			break;	
		case "linktext":
			locator = By.linkText(locatorValue);
			break;	

		default:
			System.out.println("plaese pass the right locator type and value");
			break;
		}
		
		return locator;
	}
	

	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
    public  WebElement getElement(String locatorType,String locatorValue) {		
		return driver.findElement(getBy(locatorType, locatorValue));
	}
	
    public void doSendKeys(By locator , String value) {	
		getElement(locator).sendKeys(value);
	}
	
    public void doSendKeys(String locatorType , String locatorValue,String value) {	
		getElement(locatorType, locatorValue).sendKeys(value);
	}
    
    public void doClick(By locator) {
    	getElement(locator).click();
    }
    
    public void doClick(By locatorType,String locatorValue) {
		getElement(locatorType).click();
	}
	
    public boolean isElementExist(By locator) {
		int elementCount = getElementsCount(locator);
		System.out.println("total elemnts found  " + elementCount);
		if (elementCount >=1) {
			System.out.println("total elemnts found  " + locator);
			return true;	
		}
		else {
			System.out.println("element is not found..." + locator);
			return false;
		}	
	}
   
    
    public List<String> getElementsTexList(By locator){
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e: eleList){
			String eleText = e.getText();
			if(!eleText.isEmpty()) {
				eleTextList.add(eleText);
			}
		}
		return eleTextList;
		
	}
	
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public void printElementValues(List<String> eleList) {
		for(String e : eleList) {
			System.out.println(e);
		}
	}
	
	public  List<String> getAttributeList(By locator , String attributeName) {
		List<WebElement> eleList = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		
		
		for(WebElement e: eleList){
			String attrValue = e.getAttribute(attributeName);
			attrList.add(attrValue);
		}
		return attrList;
	}
	
	/******************Drop Down Utils****************************************/
	
	public void doDropDownSelectByIndex(By locator , int index) {
		Select select = new Select(getElement(locator)); 
		select.selectByIndex(index);
	}
	
	public void doDropDownSelectByVisibleText(By locator , String text) {
		Select select = new Select(getElement(locator)); 
		select.selectByVisibleText(text);
	}
	
	public void doDropDownSelectByValue(By locator , String value) {
		Select select = new Select(getElement(locator)); 
		select.selectByVisibleText(value);
	}
	
	

}
