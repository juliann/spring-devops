package com.nadarzy.springdevops.bootstrap.profilessysout;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/** Created by Julian Nadarzy on 12/09/2021 */
@Component
@Profile("qa")
public class QAProfileSysout {
  public QAProfileSysout() {
    System.out.println("qa");
  }
}
