package com.nadarzy.springdevops.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/** Created by Julian Nadarzy on 12/09/2021 */
@Profile({"dev", "default"})
@Component
public class DevDataSource implements FakeDataSource {
  @Override
  public String getConnectionInfo() {
    return "development ds";
  }
}
