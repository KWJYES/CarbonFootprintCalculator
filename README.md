# 碳足迹计算器
> 数据结构大作业"碳足迹计算器"后端部分

## 配置信息

clone到本地运行，注意 `application.properties` 配置文件中的mysql 数据连接信息
如：

```yaml
spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false
spring.datasource.username = root
spring.datasource.password = 123456
```

数据库中有两个表，结构分别如下：

表：t_user

| 名    | 类型    | 长度 | 小数点 | 不是null | 虚拟 | 键   | 注释 |
| ----- | ------- | ---- | ------ | -------- | ---- | ---- | ---- |
| uname | varchar | 255  |        | ✔        |      | ✔    |      |
| pwd   | varchar | 255  |        | ✔        |      |      |      |

表：t_item

| 名        | 类型     | 长度 | 小数点 | 不是null | 虚拟 |
| --------- | -------- | ---- | ------ | -------- | ---- |
| carbonNum | double   |      |        | ✔        |      |
| date      | datetime |      |        | ✔        |      |
| uname     | varchar  | 255  |        | ✔        |      |