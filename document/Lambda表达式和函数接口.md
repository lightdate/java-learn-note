Lambda 表达式和函数式接口是 Java 8 引入的两个关键特性，用于支持函数式编程。它们的出现旨在让开发者更容易地编写简洁、灵活、可读性强的代码。

### Lambda 表达式：

Lambda 表达式是一种简洁、紧凑的语法，用于表示函数式接口（只包含一个抽象方法的接口）的实例。Lambda 表达式的基本语法如下：

```java
(parameters) -> expression
```

或者

```java
(parameters) -> { statements; }
```

其中，`parameters` 表示参数列表，`expression` 或 `statements` 表示Lambda体。Lambda 表达式可以用于替代匿名内部类的语法，使得代码更加简洁。

例如，以下是一个使用 Lambda 表达式实现的简单的线程创建示例：

```java
// 使用 Lambda 表达式创建线程
Runnable runnable = () -> System.out.println("Hello, Lambda!");
Thread thread = new Thread(runnable);
thread.start();
```

### 函数式接口：

函数式接口是一个只包含一个抽象方法的接口，用 `@FunctionalInterface` 注解标记。函数式接口可以包含多个默认方法或静态方法，但只能有一个抽象方法。

以下是一个简单的函数式接口的例子：

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
```

函数式接口可以使用 Lambda 表达式来实例化：

```java
MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hello, Functional Interface!");
myFunctionalInterface.myMethod();
```

Java 中提供了一些常用的函数式接口，如 `Runnable`、`Callable`、`Consumer`、`Supplier`、`Function` 等，这些接口可以用于各种函数式编程场景。

Lambda 表达式和函数式接口的引入使得 Java 在函数式编程方面更加灵活和强大。