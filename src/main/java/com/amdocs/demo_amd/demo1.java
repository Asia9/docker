package com.amdocs.demo_amd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class demo1 {

	public static void main(String[] args) {
		EdgeDriver dr=new EdgeDriver();
		dr.get("http://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("Flipkart");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		dr.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		dr.findElement(By.xpath("/html/body/div[3]/div/span")).click();
	    WebElement Search =dr.findElement(By.name("q"));
	    Search.sendKeys("Laptops");
	    Search.sendKeys(Keys.ENTER);
	    dr.navigate().to("https://www.flipkart.com/primebook-s-wifi-mt8183-4-gb-128-gb-emmc-storage-prime-os-pb-thin-light-laptop/p/itm04f0a66514c57?pid=COMGTBHFGBTXUGBC&lid=LSTCOMGTBHFGBTXUGBCNKRMWP&marketplace=FLIPKART&q=Laptops&store=6bo%2Fb5g&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=en_gkFfSyDQT5wDtEtlMefZkZla0pX2OE0tea_Yu2u29KxBnjeSqMhM_hXp4cpE6Fdv465nhXRbOV5j1Ll2KmjTBw%3D%3D&ppt=hp&ppn=homepage&ssid=orhqri9or40000001696406869281&qH=48b773c837465a99");
	    dr.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]")).click();
	    dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button")).click();
	}
}