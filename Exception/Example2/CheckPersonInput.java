package com.company;

import java.util.ArrayList;
import java.util.List;

public class CheckPersonInput
{
    List<PersonInputValue> mPersonList = new ArrayList<>();

    public void addPerson(PersonInputValue personInputValue)
    {
        mPersonList.add(personInputValue);
    }

    public void addPerson(PersonInputValue... personInputValue)
    {
        if(personInputValue == null) return;

        for(PersonInputValue p: personInputValue)
        {
            addPerson(p);
        }
    }

    /**
     *   判斷輸入小於0的數值，且大於100的數值
     */
    public void checkAll()
    {
        for (PersonInputValue person: mPersonList)
        {
            try
            {
                String name = person.getName();
                if(person.getInputValue() > 100)
                    throw new CustomException(name + "輸入大於100");
                if(person.getInputValue() < 0)
                    throw new CustomException(name + "輸入小於0");

                System.out.println(name + "輸入成功");
            }
            catch (CustomException e)
            {
                e.showErrorMessage();
                e.contactWithUs();
            }
        }

    }
}
