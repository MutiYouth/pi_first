## war包方式，将springboot工程部署到远程服务器
将target中 `maven lifecycle package`生成的war包，放到远程树莓派tomcat的webapp下即可。



测试：
```
# 启动远程tomcat9
o_tomcat_9

# 本地测试
http://192.168.10.106:8080/j4pi_app/test_json/map
```