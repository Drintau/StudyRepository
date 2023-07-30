官网手册：https://rocketmq.apache.org/zh/docs/domainModel/01main

消息：数据的最小单元。一条消息属于一个topic，一条消息可以有一个tag。

主题（topic）：一个主题有许多消息。

标签（tag）：消息过滤，同一个topic下的不同消息可以有不同tag。

队列：一个队列存储一个topic的消息，一个topic可以使用多个队列。

消息标识：生产者生产消息有一个唯一标识msgId，业务可以指定一个唯一标识key，broker端也会生成一个唯一标识offerMsgId

生产者与生产者组：一个生产者可以生产多个topic的消息，多个生产者属于一个生产者组。

消费者与消费者组：一个消费者只能消费一个topic的消息，消费者组包含多个消费者，这些消费者必须订阅相同的topic和tag，否则就属于订阅关系错乱。

订阅关系错乱：https://www.bilibili.com/video/BV1cf4y157sz?p=60

tag错乱：https://zhuanlan.zhihu.com/p/485024760