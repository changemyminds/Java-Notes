package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentDemo
{
    public void show()
    {

        List<Student> list = new ArrayList<>();
        Student darren = new Student("Darren", 18, 13);
        Student leo = new Student("Leo", 19, 11);
        Student kristin = new Student("Kristin", 19, 11);
        Student[] students = new Student[]{darren, leo, kristin};

        Collections.addAll(list, students);

        //使用 wildcard type java.util.Collection<?> 接受任何型態
        printCollectionWildcardType(list);

        //使用generics 接受自己本身的型態
        printCollectionGenerics(list);

        // 編譯出現錯誤，因為接收的值java.util.Collection<Object> 而無法接受 java.util.Collection<Student>
        //printCollectionObject(list);

        List<Object> test = new ArrayList<>();
        test.add("Darren");
        test.add("Leo");
        test.add("Kristin");

        printCollectionWildcardType(test);
        printCollectionGenerics(test);
        printCollectionObject(test);
    }


    /**
     * @param c
       wildcard type (通配型)
　　　　角括號內若使用問號 "?" 而不是 class 或 interface 名稱，表示宣告泛型型別為通用型別，可使用任何的參考型態。
　　　　"?" 表示未知型態(unknown type)。
     */
    void printCollectionWildcardType(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    void printCollectionObject(List<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    <T> void printCollectionGenerics(Collection<T> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
}
