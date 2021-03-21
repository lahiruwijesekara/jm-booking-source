This application initiates booking done by the customer and places them as messages onto the
queue configured in `application.properties`.

The target messaging system is determined by Spring Cloud Stream based
on the Autoconfiguration mechanism for Spring Boot.

Therefore, Kafka messaging is used.

```xml
<dependency>
	<groupId>org.springframework.kafka</groupId>
	<artifactId>spring-kafka</artifactId>
</dependency>
``` 