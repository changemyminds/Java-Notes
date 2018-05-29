# Java 筆記

## 類別命名方式
- class
    - 起頭為大寫之後採用駝峰式命名法。例如:
    ```java 
    Demo.class
    ```
- Interface
    - 若作為介面等等，則起頭加上大寫I，例如：
    ```java 
    IAction.class
    ```
    - 若作為callback使用時(即作為listener)，則命名結尾加上listener，例如：
    ```java 
    IStateListener.class
    ```    
- Abstract
    - 起頭加上Abs，例如：
    ```java 
    AbsAnimal.class
    ```        

## 變數和方法命名方式
- static變數
    - 若無其他修飾詞時，則一率小寫，例如：
    ```java 
    private static int count = 0;
    ```
    - 加上修飾詞final時，則一率大寫，例如：
    ```java 
    private static final int COUNT = 0;
    ```
- class field變數
    - 起頭加上m之後藉由駝峰式命名法
    ```java 
    private boolean mIsThredStop = false;
    ```
- function
    - 起頭小寫之後藉由駝峰式命名法，盡量使用getXXX、setXXX、isXXX等方式命名，例如：
    getter、 setter
    ```java 
    public int getCount(){return 0;}
    public void setCount(int count){mCount = count;}
    ```

## 題目練習區
- [泛型(Generics)](https://github.com/changemyminds/Java-Notes/tree/master/Generics)
- [例外機制(Exception)](https://github.com/changemyminds/Java-Notes/tree/master/Exception)
- [Java8 Lambda](https://github.com/changemyminds/Java-Notes/tree/master/Lambda)
- [Wait() and Notify()](https://github.com/changemyminds/Java-Notes/tree/master/WaitAndNotify)
