package com.nadarzy.springdevops.bootstrap.profilessysout;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/** Created by Julian Nadarzy on 12/09/2021 */
@Component
@Profile("default")
public class DefaultProfileSysout {

  //  not needed anymore in newer spring boot application
  //  @Autowired
  public DefaultProfileSysout(@Value("${com.nadarzy.profile.message}") String profileMessage) {
    System.out.println("default " + profileMessage);
  }
}
