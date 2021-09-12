package com.nadarzy.springdevops.test.dstest;

import com.nadarzy.springdevops.config.DataSourceConfig;
import com.nadarzy.springdevops.test.ds.FakeDataSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/** Created by Julian Nadarzy on 12/09/2021 */
@ContextConfiguration(classes = DataSourceConfig.class)
@ExtendWith(SpringExtension.class)
// @ActiveProfiles("qa")
public class DataSourceTest {

  private FakeDataSource fakeDataSource;

  @Autowired
  public void setFakeDataSource(FakeDataSource fakeDataSource) {
    this.fakeDataSource = fakeDataSource;
  }

  @Test
  void testDataSource() {
    System.out.println(fakeDataSource.getConnectionInfo());
  }
}
