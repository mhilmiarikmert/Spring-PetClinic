package petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableCaching
@EnableJpaAuditing(auditorAwareRef = "petClinicAuditorAware")
@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties(Properties.class)
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
        System.out.println("Spring boot application works..");
    }
}
