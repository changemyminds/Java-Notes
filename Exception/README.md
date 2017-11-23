# 例外機制(Exception)

* [Example1(顯示例外機制的錯誤訊息)](https://github.com/changemyminds/Java-Notes/tree/master/Exception/Example1)
  * ```java
  		System.out.println("ArithmeticException: " + arEx.getMessage()); ```
  	```
  * ```java 
        arrayEx.printStackTrace(new PrintWriter(stringWriter));
        System.out.println(stringWriter.toString()); 
    ```
  * ```java 
       StackTraceElement[] ste = e.getStackTrace();
       for (StackTraceElement stackTraceElement : ste)
       System.out.println(stackTraceElement.toString());
    ```     

## [Example2 (自訂例外機制)](https://github.com/changemyminds/Java-Notes/tree/master/Exception/Example2)
- 若輸入的數值小於0或大於100的數值，則引發例自定外機制。