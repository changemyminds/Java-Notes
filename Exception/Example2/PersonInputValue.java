package com.company;

public class PersonInputValue
{
    private String mName = "";
    private int mInputValue = 0;

    public PersonInputValue(String mName, int mInputValue)
    {
        this.mName = mName;
        this.mInputValue = mInputValue;
    }

    public String getName()
    { return mName; }

    public int getInputValue()
    { return mInputValue; }
}
