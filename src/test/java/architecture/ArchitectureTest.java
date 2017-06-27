package architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.GeneralCodingRules.USE_JAVA_UTIL_LOGGING;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = {"com.hascode.tutorial.comp1", "com.hascode.tutorial.comp2"})
public class ArchitectureTest {

  @ArchTest
  public static final ArchRule COMP2_PACKAGE_MUST_NOT_ACCESS_COMP1 = noClasses().that()
      .resideInAPackage("com.hascode.tutorial.comp2").should().accessClassesThat()
      .resideInAPackage("com.hascode.tutorial.comp1").because(
          "classes in package com.hascode.tutorial.comp2 should not be accessed from classes in package com.hascode.tutorial.comp1");


  @ArchTest
  public static final ArchRule NO_DEPRECATED_CLASSES_IN_COMP1_PACKAGE = noClasses().that()
      .areAnnotatedWith(Deprecated.class).should()
      .resideInAnyPackage("com.hascode.tutorial.comp1")
      .because("deprecated classes should not be allowed in package com.hascode.tutorial.comp1");

  @ArchTest
  public static final ArchRule MUST_NOT_USE_JAVA_UTIL_LOGGING = noClasses()
      .should(USE_JAVA_UTIL_LOGGING)
      .because("slf4j and logback/log4j2 should be used instead of java.util logger");


  @ArchTest
  public static final ArchRule NO_CYCLIC_DEPENDENCIES =
      slices().matching("com.hascode.(tutorial).(*)").namingSlices("$2 of $1").should()
          .beFreeOfCycles();

}
