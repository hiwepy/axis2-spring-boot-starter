package org.apache.axis2.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>Configuration properties.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@ConfigurationProperties(Axis2Properties.PREFIX)
public class Axis2Properties {

	public static final String PREFIX = "spring.axis2";

	/**
	 * Enable Axis2.
	 */
	private boolean enabled = true;


	
}