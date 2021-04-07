# Spring AOP Demo
## 作用
在程序运行期间，在不修改源码的情况下对方法进行功能增强

## 优势
减少重复代码，提高开发效率，并且易于维护

## 原理：Java动态代理
根据Target对象生成一个proxy对象，proxy方法执行时进行增强功能的介入，再去调用target对象的方法，从而完成功能的增强。。

## 两种方式： jdk和cglib
两者不同是，jdk需要TargetInterface。<br>
如果Target类有接口，就使用jdk的方式。 <br>
如果Target类没有接口，就使用cglib的方式。

## 代码
动态代理示例：proxy包 <br>
aop示例：aop包 <br>
注解实现aop示例：anno包 <br>