package ru.praktikum.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import static ru.praktikum.config.ApplicationConfig.APP_URL;

public class PageMain
{
    private final WebDriver driver;

    public PageMain(WebDriver driver)
    {
        this.driver = driver;
        driver.get(APP_URL);
    }

    // MainPage
    public static By orderButtonAbove = By.xpath(".//button[@class='Button_Button__ra12g']");
    // кнопка Заказать в шапке сайта
    public static By orderButtonCenter = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");
    // кнопка заказать по центру сайта
    private final By questionImportant = By.xpath(".//div[text()='Вопросы о важном']");
    // Заголовок Вопросы о важном
    private final By cookieButton = By.id("rcc-confirm-button");  // кнопка с куки

    //------------Вопросы-----------------------------------------
    public static By questionOne = By.id("accordion__heading-0");
    //вопрос №1 Сколько это стоит? И как оплатить?
    public static By questionTwo = By.id("accordion__heading-1");
    //вопрос №2 Хочу сразу несколько самокатов! Так можно?
    public static By questionThree = By.id("accordion__heading-2");
    //вопрос №3 Как рассчитывается время аренды?
    public static By questionFour = By.id("accordion__heading-3");
    //вопрос №4 Можно ли заказать самокат прямо на сегодня?
    public static By questionFive = By.id("accordion__heading-4");
    //вопрос №5 Можно ли продлить заказ или вернуть самокат раньше?
    public static By questionSix = By.id("accordion__heading-5");
    //вопрос №6 Вы привозите зарядку вместе с самокатом?
    public static By questionSeven = By.id("accordion__heading-6");
    //вопрос №7 Можно ли отменить заказ?
    public static By questionEight = By.id("accordion__heading-7");
    //вопрос №8 Я живу за МКАДом, привезёте?

    //------------Ответы на вопросы ----------------------------------
    public static By answerOne = By.id("accordion__panel-0");//Ответ на вопрос №1
    public static By answerTwo = By.id("accordion__panel-1"); //Ответ на вопрос №2
    public static By answerThree = By.id("accordion__panel-2");  //Ответ на вопрос №3
    public static By answerFour = By.id("accordion__panel-3"); //Ответ на вопрос №4
    public static By answerFive = By.id("accordion__panel-4");  //Ответ на вопрос №5
    public static By answerSix = By.id("accordion__panel-5"); //Ответ на вопрос №6
    public static By answerSeven = By.id("accordion__panel-6"); //Ответ на вопрос №7
    public static By answerEight = By.id("accordion__panel-7"); //Ответ на вопрос №8


    public void scrollToElement()
    {
        WebElement element = driver.findElement(questionImportant); //проскролить до заголовка Вопросы о важном
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickCookie()
    {
        driver.findElement(cookieButton).click();  //кликнуть на принятие куки
    }

    public void clickOrderButton(By orderButton)
    {
        driver.findElement(orderButton).click();     //нажать на кнопу Заказать
    }

    public void clickButtonOneQuestion(By questionOne)
    {
        driver.findElement(questionOne).click();  //нажать на вопрос 1
    }

    public String getTextQuestionOne()
    {
        driver.findElement(answerOne).getText();
        return questionOneText;
    }

    public void clickButtonTwoQuestion(By questionTwo)
    {
        driver.findElement(questionTwo).click(); //нажать на вопрос 2
    }

    public String getTextQuestionTwo()
    {
        driver.findElement(answerTwo).getText();
        return questionTwoText;
    }

    public void clickButtonThreeQuestion(By questionThree)
    {
        driver.findElement(questionThree).click(); //нажать на вопрос 3
    }

    public String getTextQuestionThree()
    {

        driver.findElement(answerThree).getText();
        return questionThreeText;
    }

    public void clickButtonFourQuestion(By questionFour)
    {
        driver.findElement(questionFour).click(); //нажать на вопрос 4
    }

    public String getTextQuestionFour()
    {
        return driver.findElement(answerFour).getText();
    }

    public void clickButtonFiveQuestion(By questionFive)
    {
        driver.findElement(questionFive).click(); //нажать на вопрос 5
    }

    public String getTextQuestionFive()
    {
        return driver.findElement(answerFive).getText();
    }

    public void clickButtonSixQuestion(By questionSix)
    {
        driver.findElement(questionSix).click(); //нажать на вопрос 6
    }

    public String getTextQuestionSix()
    {
        return driver.findElement(answerSix).getText();
    }

    public void clickButtonSevenQuestion(By questionSeven)
    {
        driver.findElement(questionSeven).click(); //нажать на вопрос 7
    }

    public String getTextQuestionSeven()
    {
        return driver.findElement(answerSeven).getText();
    }

    public void clickButtonEightQuestion(By questionEight)
    {
        driver.findElement(questionEight).click(); //нажать на вопрос 8
    }

    public String getTextQuestionEight()
    {
        return driver.findElement(answerEight).getText();
    }

}

