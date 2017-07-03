package architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchIgnore;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.hascode.tutorial")
public class IgnoringATest {

  @ArchIgnore
  @ArchTest
  public static ArchRule IGNORED_TEST = classes().that()
      .resideInAPackage("com.hascode.tutorial.comp1")
      .should().notBePublic();

}
