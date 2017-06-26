package com.hascode.tutorial.predicate;

import com.tngtech.archunit.base.DescribedPredicate;
import com.tngtech.archunit.core.domain.JavaClass;

public class Component1PackagePredicate extends DescribedPredicate<JavaClass> {

  private static final String PACKAGE = "com.hascode.tutorial.comp1";

  public Component1PackagePredicate() {
    super("resides in package " + PACKAGE);
  }

  @Override
  public boolean apply(JavaClass javaClass) {
    return javaClass.getPackage().startsWith(PACKAGE);
  }
}
