package aaa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudPorduct2Start {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPorduct2Start.class,args);
    }
}
