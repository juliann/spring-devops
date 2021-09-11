package com.nadarzy.springdevops.test.external.props;

import com.nadarzy.springdevops.props.ExternalPropsEnvironment;
import com.nadarzy.springdevops.props.ExternalPropsPropertySourceTestConfig;
import com.nadarzy.springdevops.test.jms.FakeJmsBroker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Created by Julian Nadarzy on 11/09/2021 */
@ContextConfiguration(classes = ExternalPropsEnvironment.class)
@ExtendWith(SpringExtension.class)
public class PropertySourceEnvTest {
  @Autowired FakeJmsBroker fakeJmsBroker;

  @Test
  public void testPropsSet() {
    assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
    assertEquals(3330, fakeJmsBroker.getPort().intValue());
    assertEquals("Ron", fakeJmsBroker.getUser());
    assertEquals("Burgundy", fakeJmsBroker.getPassword());
  }
}
