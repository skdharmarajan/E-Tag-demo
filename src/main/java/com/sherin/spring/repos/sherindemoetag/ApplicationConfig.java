package com.sherin.spring.repos.sherindemoetag;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {


  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {

    RestTemplate template = restTemplateBuilder.build();

    /*
     * try { TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) ->
     * true;
     * 
     * SSLContext sslContext; sslContext = org.apache.http.ssl.SSLContexts.custom()
     * .loadTrustMaterial(null, acceptingTrustStrategy).build(); SSLConnectionSocketFactory csf =
     * new SSLConnectionSocketFactory(sslContext);
     * 
     * CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
     * 
     * HttpComponentsClientHttpRequestFactory requestFactory = new
     * HttpComponentsClientHttpRequestFactory();
     * 
     * requestFactory.setHttpClient(httpClient); template.setRequestFactory(requestFactory);
     * 
     * } catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
     * 
     */

    return template;
  }
}
