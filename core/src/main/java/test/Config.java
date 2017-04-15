package test;

import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@PropertySource("classpath:core.properties")
@Configuration
public class Config extends WebMvcConfigurerAdapter {

	private static final int MAX_CONNECTIONS = 20;
	private static final int CONNECT_TIMEOUT = 5000;

	@Bean
	CloseableHttpClient httpClient() {
		RequestConfig requestConfig = RequestConfig.custom()
				.setConnectTimeout(CONNECT_TIMEOUT)
				.setConnectionRequestTimeout(CONNECT_TIMEOUT)
				.setSocketTimeout(CONNECT_TIMEOUT)
				.setCookieSpec(CookieSpecs.IGNORE_COOKIES)
				.build();

		return HttpClientBuilder.create()
				.setDefaultRequestConfig(requestConfig)
				.setMaxConnPerRoute(MAX_CONNECTIONS)
				.setMaxConnTotal(MAX_CONNECTIONS)
				.build();
	}

}
