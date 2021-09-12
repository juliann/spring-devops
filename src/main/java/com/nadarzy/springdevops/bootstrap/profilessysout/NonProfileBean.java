package com.nadarzy.springdevops.bootstrap.profilessysout;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/** Created by Julian Nadarzy on 12/09/2021 */
@Component
@Profile("default")
public class NonProfileBean {

  //  not needed anymore in newer spring boot application
  //  @Autowired
  public NonProfileBean(@Value("${com.nadarzy.profile.message}") String profileMessage) {
    System.out.println("################ " + profileMessage);
  }
}
