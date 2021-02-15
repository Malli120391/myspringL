package springdepndinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javadevsguide.springframework.di.config.AppConfiguration;

public class TestApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        //FieldBasedInjection  fieldBasedInjection = applicationContext.getBean(FieldBasedInjection.class);
        //fieldBasedInjection.processMsg("twitter message sending ");
	}

}