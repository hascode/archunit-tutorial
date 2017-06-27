package com.hascode.tutorial.comp1;

import com.hascode.tutorial.comp2.OtherComponent;
import java.util.logging.Logger;

@Deprecated
public class SomeComponent {

  OtherComponent comp = new OtherComponent();

  Logger log = Logger.getLogger(getClass().getName());

  public void foo() {
    log.info("logging with java.util logger...");
    comp.bar();
  }
}
