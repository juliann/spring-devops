package com.nadarzy.springdevops.test.external.props;

import com.nadarzy.springdevops.test.jms.FakeJmsBroker;
import com.nadarzy.springdevops.test.props.ExternalPropsMultiFileTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = ExternalPropsMultiFileTest.class)
@ExtendWith(SpringExtension.class)
public class PropertySourceMultiFileTest {

  @Autowired FakeJmsBroker fakeJmsBroker;

  @Test
  public void testPropsSet() throws Exception {
    assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
    assertEquals(3330, fakeJmsBroker.getPort().intValue());
    assertEquals("Ron", fakeJmsBroker.getUser());
    assertEquals(")=?()&", fakeJmsBroker.getPassword());
  }
}
