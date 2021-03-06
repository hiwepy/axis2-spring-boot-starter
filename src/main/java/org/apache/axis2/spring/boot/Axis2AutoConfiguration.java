package org.apache.axis2.spring.boot;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
 

@Configuration
@ConditionalOnProperty(prefix = Axis2Properties.PREFIX, value = "enabled", havingValue = "true")
@EnableConfigurationProperties({ Axis2Properties.class })
@AutoConfigureOrder(Ordered.LOWEST_PRECEDENCE - 8)
public class Axis2AutoConfiguration implements ApplicationContextAware {

	private ApplicationContext applicationContext;
 
	@Bean
	public ConfigurationContext configContext() throws Exception {
		return ConfigurationContextFactory.createDefaultConfigurationContext();
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}
