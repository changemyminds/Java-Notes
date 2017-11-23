# 例外機制(Exception)

* Example1(顯示例外機制的錯誤訊息)
  * ``` System.out.println("ArithmeticException: " + arEx.getMessage()); ```
  * ``` arrayEx.printStackTrace(new PrintWriter(stringWriter));
        System.out.println(stringWriter.toString()); 
    ```
  * ```StackTraceElement[] ste = e.getStackTrace();
       for (StackTraceElement stackTraceElement : ste)
       System.out.println(stackTraceElement.toString());
    ```     

## Example2 (自訂例外機制)
- 若輸入的數值小於0或大於100的數值，則引發例自定外機制。