## redis-web

### 目的
 学习redis

### 简介
redis是一个Key-Value内存数据库存储系统，但它本身支持MQ功能，所以完全可以当做一个轻量级的队列服务来使用。
少量数据存储，高速读写访问。此类产品通过数据全部in-momery 的方式来保证高速访问，同时提供数据落地的功能（定时进行持久化），实际这正是Redis最主要的适用场景。


Redis最适合所有数据in-momory的场景，虽然Redis也提供持久化功能，但实际更多的是一个disk-backed的功能，跟传统意义上的持久化有比较大的差别，那么可能大家就会有疑问，似乎Redis更像一个加强版的Memcached。

## 帮助
redis命令手册：http://doc.redisfans.com/


## 版本说明

#### >2016/04/12
1. 基于spring-data-redis-1.0.2