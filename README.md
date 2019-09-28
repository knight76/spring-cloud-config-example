# Config Repository / Spring Cloud Config

source : config-server

# Run

gradle bootRun

# encryption

Applied encryption using com.github.ulisesbocchio:jasypt-spring-boot-starter

```java
spring.cloud.config.server.git.username=knight76
spring.cloud.config.server.git.password=ENC(...)
```
