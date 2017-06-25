package architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = {"com.hascode.tutorial.comp1", "com.hascode.tutorial.comp2"})
public class ArchitectureTest {

  @ArchTest
  public static final ArchRule comp2_must_not_access_comp1 = noClasses().that()
      .resideInAPackage("com.hascode.tutorial.comp2").should().accessClassesThat()
      .resideInAPackage("com.hascode.tutorial.comp1");


  @ArchTest
  public static final ArchRule no_deprecated_classes_in_comp1_package = noClasses().that()
      .areAnnotatedWith(Deprecated.class).should()
      .resideInAnyPackage("com.hascode.tutorial.comp1");
}
