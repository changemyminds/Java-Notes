package com.company;

import java.util.HashMap;


/* another write
   public class Adder<T extends Object>
*/
public class Adder<T>
{
    private T mNumOneT;
    private T mNumTwoT;

    public Adder(T mNumOneT, T mNumTwoT)
    {
        this.mNumOneT = mNumOneT;
        this.mNumTwoT = mNumTwoT;
    }

    public T getAdd()
    {
        NumberType numberType1 = checkType(mNumOneT);
        NumberType numberType2 = checkType(mNumTwoT);
        return add(numberType1, numberType2);
    }

    private NumberType checkType(T check)
    {
        if(check == null) return null;

        String type = "";
        if(check instanceof Byte)
            type = "Byte";
        else if(check instanceof Short)
            type = "Short";
        else if(check instanceof Integer)
            type = "Integer";
        else if(check instanceof Long)
            type = "Long";
        else if(check instanceof Float)
            type = "Float";
        else if(check instanceof Double)
            type = "Double";
        else if(check instanceof Boolean)
            type = "Boolean";
        else if(check instanceof Character)
            type = "Character";

        return (type.equals("")) ? null : new NumberType<>(type, check);
    }

    @SuppressWarnings("unchecked")
    private T add(NumberType numberType1, NumberType numberType2)
    {
        if(numberType1 == null || numberType2 == null ||
          !numberType1.type.equals(numberType2.type))
            return null;

        try
        {
            switch (numberType1.type.toString())
            {
                case "Byte" :
                    return (T)(Object)((byte)numberType1.object + (byte)numberType2.object);
                case "Short" :
                    return (T)(Object)((short)numberType1.object + (short)numberType2.object);
                case "Integer" :
                    return (T)(Object)((int)numberType1.object + (int)numberType2.object);
                case "Long" :
                    return (T)(Object)((long)numberType1.object + (long)numberType2.object);
                case "Float" :
                    return (T)(Object)((float)numberType1.object + (float)numberType2.object);
                case "Double" :
                    return (T)(Object)((double)numberType1.object + (double)numberType2.object);
                case "Boolean" :
                    int num1 = ((boolean)numberType1.object) ? 1 : 0;
                    int num2 = ((boolean)numberType2.object) ? 1 : 0;
                    return (T)(Object)(num1 + num2);
                case "Character" :
                    return (T)(Object)((char)numberType1.object + (char)numberType2.object);
                default:
                    return null;
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

    class NumberType<K, V>
    {
        K type = null;
        V object = null;

        NumberType(K type, V object) {
            this.type = type;
            this.object = object;
        }
    }

}



