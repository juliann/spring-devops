package com.nadarzy.springdevops.props;

import com.nadarzy.springdevops.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/** Created by Julian Nadarzy on 11/09/2021 */
@Configuration
@PropertySource("classpath:testing.properties")
public class ExternalPropsEnvironment {

  @Autowired Environment environment;

  @Bean
  public FakeJmsBroker fakeJmsBrokerEnv() {
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setUrl(environment.getProperty("guru.jms.server"));
    fakeJmsBroker.setPort(environment.getProperty("guru.jms.port", Integer.class));
    fakeJmsBroker.setUser(environment.getProperty("guru.jms.user"));
    fakeJmsBroker.setPassword(environment.getProperty("guru.jms.password"));
    return fakeJmsBroker;
  }
}
