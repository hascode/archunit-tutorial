package com.hascode.tutorial.comp1;

import java.util.logging.Logger;

@Deprecated
public class SomeComponent {

  Logger log = Logger.getLogger(getClass().getName());

  public void foo() {
  log.info("logging with java.util logger...");
  }
}
