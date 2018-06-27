# spring

## 1.基础

### 1.1. 创建spring工程

​        创建Maven项目，加入如下依赖

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.0.7.RELEASE</version>
</dependency>
```

### 1.2. 创建spring配置文件

<font id="1"/>

<img src="assets/image-20180623194713236.png" width="500px"/> 

初始文件内容如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

</beans>
```

## 2. HelloWorld

### 2.1. 创建1个类

```java
@Data
public class Hello {
    private String str;

    public void say(){
        System.out.println("hello " + str);
    }
}
```

### 2.2. spring配置文件

> 在类路径下创建1个spring配置文件，参见[创建spring配置文件](### 1.2. 创建spring配置文件)





