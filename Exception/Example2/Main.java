package com.company;

public class Main {

    public static void main(String[] args) {
        PersonInputValue p1 = new PersonInputValue("David", -1);
        PersonInputValue p2 = new PersonInputValue("Darren", 101);
        PersonInputValue p3 = new PersonInputValue("Lucky", 50);
        PersonInputValue p4 = new PersonInputValue("Lucy", 0);
        PersonInputValue[] p = new PersonInputValue[]{p1, p2, p3, p4};

        CheckPersonInput checkPersonInput = new CheckPersonInput();
        checkPersonInput.addPerson(p);
        checkPersonInput.checkAll();

        /*  印出結果
            輸入資料錯誤，錯誤訊息為: David輸入小於0
            很抱歉你填寫的資料錯誤，請重新填寫。
            輸入資料錯誤，錯誤訊息為: Darren輸入大於100
            很抱歉你填寫的資料錯誤，請重新填寫。
            Lucky輸入成功
            Lucy輸入成功
        */
    }
}
