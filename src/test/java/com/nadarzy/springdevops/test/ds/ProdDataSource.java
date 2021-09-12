package com.nadarzy.springdevops.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/** Created by Julian Nadarzy on 12/09/2021 */
@Profile("prod")
@Component
public class ProdDataSource implements FakeDataSource {
  @Override
  public String getConnectionInfo() {
    return "prod DS";
  }
}
