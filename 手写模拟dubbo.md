### 手写模拟dubbo
#### 项目目录
```
api ----- 模拟api-service，只提供接口
producer ----- 模拟producer-service，服务提供方
consumer ----- 模拟consumer-service，服务调用方
framework ----- 模拟dubbo框架的代码
```
#### 思路推演
1、怎么实现像dubbo那样, consumer像调用本地方法一样, 调到producer？
```
a. 首先生产者要将自己的服务信息注册到注册中心上去. 
```


