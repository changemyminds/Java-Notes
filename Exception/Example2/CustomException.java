package com.company;

public class CustomException extends Exception
{
    public CustomException(String message) {
        super(message);
    }

    public void showErrorMessage()
    { System.out.println("輸入資料錯誤，錯誤訊息為: " + super.getMessage());}

    public void contactWithUs()
    { System.out.println("很抱歉你填寫的資料錯誤，請重新填寫。"); }
}
