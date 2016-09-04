#重构-改善既有代码的设计
Refactoring-Improving the Design of Existing Code
##第3章 代码的坏味道
3.1 Duplicated Code(重复代码)<br>
3.2 Long Method(过长函数)<br>
3.3 Large Class(过大的类)<br>
3.4 Long Parameter List(过长参数列)<br>
3.5 Divergent Change(发散式变化)<br>
3.6 Shotgun Surgery(san弹式修改)<br>
3.7 Feature Envy(依恋情结)<br>
3.8 ...
##第6章 重新组织函数
6.1 Extract Method(提炼函数)[src](https://github.com/lujiango/RefactoringInJava/blob/master/src/_06/_06_01_ExtractMethod.java)<br>
```
有一段代码可以被组织在一起并独立起来。
将这段代码放进一个独立函数中，并让函数名称解释该函数的用途。
```
6.2 Inline Method(内联函数)[src](https://github.com/lujiango/RefactoringInJava/blob/master/src/_06/_06_02_InlineMethod.java)<br>
6.3 Inline Temp(内联临时变量)[src]()
```
有一个临时变量，只被一个简单表达式赋值一次，而它妨碍了其它重构手法。
<br>将所有对该变量的引用动作，替换为对它赋值的那个表达式自身。
```
6.4 Replace Temp with Query(以查询取代临时变量)[src]()<br>
```
程序以一个临时变量保存某一表达式的运算结果。
<br>将这个表达式提炼到一个独立函数中，将这个临时变量的所有引用点替换为对新函数的调用，此后，新函数就可被其它函数使用。
```
6.5 Introduce Explaining Variable(引入解释性变量)<br>
6.6 ...
##第7章 在对象之间搬移特性
7.1 Move Method(搬移函数)<br>
7.2 Move Field(搬移字段)<br>
7.3 Extract Class(提炼类)<br>
7.4 Inline Class(将类内联化)<br>
7.5 Hide Delegat(隐藏“委托关系”)<br>
7.6 ...
##第8章 重新组织数据
8.1 Self Encapsulate Filed(自封装字段)<br>
8.2 Replace Data Value with Object(以对象取代数据值)<br>
8.3 Change Value to Reference(将值对象改为值对象)<br>
8.4 ...
##第9章 简化条件表达式
9.1 Decompose Conditional(分解条件表达式)<br>
9.2 Consolidate Conditional Expression(合并条件表达式)<br>
9.3 Consolidate Duplicate Conditional Fragments(合并重复的条件片段)<br>
9.4 ...
##第10章 简化函数调用
10.1 Rename Method(函数改名)<br>
10.2 Add Parameter(添加参数)<br>
10.3 Remove Parameter(移除参数)<br>
10.4 ...
##第11章 处理概括关系
11.1 Pull Up Field(字段上移)<br>
11.2 Pull Up Method(函数上移)<br>
11.3 Pull Up Constructor Body(构造函数本体上移)<br>
11.4 ...






