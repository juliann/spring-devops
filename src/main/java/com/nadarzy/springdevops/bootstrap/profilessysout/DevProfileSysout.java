package com.nadarzy.springdevops.bootstrap.profilessysout;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/** Created by Julian Nadarzy on 12/09/2021 */
@Component
@Profile("dev")
public class DevProfileSysout {
  public DevProfileSysout(@Value("${com.nadarzy.profile.message}") String msg) {
    System.out.println("dev " + msg);
  }
}
