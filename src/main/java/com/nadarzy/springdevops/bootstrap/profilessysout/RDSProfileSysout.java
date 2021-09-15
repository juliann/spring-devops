package com.nadarzy.springdevops.bootstrap.profilessysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/** Created by Julian Nadarzy on 15/09/2021 */
@Component
@Profile("rds")
public class RDSProfileSysout {

  public RDSProfileSysout() {
    System.out.println("########### RDS PROFILE");
  }
}
