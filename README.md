﻿# Java 筆記

## 類別命名方式
class的命名方式為大寫。如:Demo.class。<br>
Interface若作為介面等等，則命名方式加上I，如：IAction等。<br>
Interface若作為callback使用時(即作為listener)，則命名結尾加上listener，如:IStateListener等。<br>
Abstract的命名方式為起頭加上Abs，如：AbsAnimal等。<br>

## 變數和方法命名方式
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
