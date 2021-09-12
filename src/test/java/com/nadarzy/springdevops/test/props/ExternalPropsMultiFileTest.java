package com.nadarzy.springdevops.test.props;

import com.nadarzy.springdevops.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/** Created by Julian Nadarzy on 12/09/2021 */
@Configuration
@PropertySource({"classpath:testing.properties", "classpath:encrypted-testing.properties"})
public class ExternalPropsMultiFileTest {
  @Autowired Environment environment;

  @Bean
  public FakeJmsBroker fakeJmsBrokerMultiFile() {
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setUrl(environment.getProperty("guru.jms.server"));
    fakeJmsBroker.setPort(environment.getProperty("guru.jms.port", Integer.class));
    fakeJmsBroker.setUser(environment.getProperty("guru.jms.user"));
    fakeJmsBroker.setPassword(environment.getProperty("guru.jms.encrypted.password"));
    return fakeJmsBroker;
  }
}
