package myprojects.automation.assignment3.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

//package com.custom.listeners;

public class EventHandler implements WebDriverEventListener {

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("before Alert Accept");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("after Alert Accept");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("after Alert Dismiss");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("before Alert Dismiss");
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Navigate to " + url);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("After navigate open the page " + url);
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("before Navigate Back");
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        System.out.println("after Navigate Back");
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("before Navigate Forvard");
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {
        System.out.println("Refrash page");
    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Search for element " + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        if (element != null){
            System.out.println("Found element " + element.getTagName());
        }
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Click on element " + element.getTagName());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        if (element != null){
            System.out.println("Click on found element " + element.getTagName());
        }
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver driver, CharSequence[] charSequences) {
        System.out.println("before Change Value Of");
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver driver, CharSequence[] charSequences) {
        System.out.println("after Change Value Of");
    }

    @Override
    public void beforeScript(String script, WebDriver driver) {
        System.out.println("beforeScript");
    }

    @Override
    public void afterScript(String script, WebDriver driver) {
        System.out.println("afterScript");
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        System.out.println("onException");
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

    }
}



