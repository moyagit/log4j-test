## 最简单的实例
输出的结果如下所示
```flow java
17 [main] INFO  test.SimplestTest - test log info
```
这个例子是不是和我们平常看到的例子很相似，但是在时间上有一些区别呢，
这个是我故意的，稍后我们会讲到这些。

``` java
public class SimplestTest {
    protected static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        log.info("test log info");
    }
}
```
上面这段代码构造了一个非常简单的例子，输入一句简单的话

配置文件格式如下

```java
<?xml version="1.0" encoding="UTF-8"?>
<configuration status="INFO">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH} [%t] %-5level %logger{5} - %msg%n"/>
        </Console>
    </Appenders>
    <Loggers>
        <Root level="INFO"> <!-- 全局配置 -->
            <AppenderRef ref="Console" />
        </Root>

    </Loggers>

</configuration>
```
这块就不详细解释了，下一篇文章会非常详细的解释