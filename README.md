# Java 筆記

## 類別命名方式
- class命名方式
    - 起頭為大寫之後採用駝峰式命名法。例如:
    ```java 
    Demo.class
    ```
- Interface命名方式
    - 若作為介面等等，則起頭加上大寫I，例如：
    ```java 
    IAction.class
    ```
    - 若作為callback使用時(即作為listener)，則命名結尾加上listener，例如：
    ```java 
    IStateListener.class
    ```    
- Abstract命名方式
    - 起頭加上Abs，例如：
    ```java 
    AbsAnimal.class
    ```        

## 變數和方法命名方式
- static變數
    - 若無其他修飾詞時，如final等時，則一率小寫如：
    ```java 
    private static int count = 0;
    ```
static變數，則為一率為小寫。如：private static int count = 0;<br>
static變數，加上修飾詞final。如：private static final int COUNT = 0;<br>
class field變數，命名方式再起頭加上m之後藉由駝峰式命名法，如: private boolean mIsThredStop = false;<br>
function方法，命名方式為起頭小寫之後藉由駝峰式命名法<br>
如：getter 、 setter<br>
public int getCount(){return 0;}<br>
public void setCount(int count){mCount = count;}<br>


## 題目練習區
- [泛型(Generics)](https://github.com/changemyminds/Java-Notes/tree/master/Generics)
- [例外機制(Exception)](https://github.com/changemyminds/Java-Notes/tree/master/Exception)
- [Java8 Lambda](https://github.com/changemyminds/Java-Notes/tree/master/Lambda)
- [Wait() and Notify()](https://github.com/changemyminds/Java-Notes/tree/master/WaitAndNotify)
