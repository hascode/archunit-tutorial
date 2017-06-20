package architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import org.junit.runner.RunWith;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = {"com.hascode.tutorial.comp1", "com.hascode.tutorial.comp2"})
public class ArchitectureTest {

  @ArchTest
  public static void testArchitecture(JavaClasses javaClasses) throws Exception {
    noClasses().that()
        .resideInAPackage("com.hascode.tutorial.comp2").should().accessClassesThat()
        .resideInAPackage("com.hascode.tutorial.comp1").check(javaClasses);
  }
}
