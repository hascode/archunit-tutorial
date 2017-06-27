package architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.hascode.tutorial.condition.NoFooMethodCondition;
import com.hascode.tutorial.predicate.Component1PackagePredicate;
import com.tngtech.archunit.base.DescribedPredicate;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = {"com.hascode.tutorial"})
public class NoFooMethodConditionExampleTest {

  private static final DescribedPredicate<JavaClass> IS_IN_COMP_1 = new Component1PackagePredicate();
  private static final ArchCondition<JavaClass> NO_FOO_METHOD_CONDITION = new NoFooMethodCondition();

  @ArchTest
  public static final ArchRule NO_METHOD_NAMED_FOO_IN_COMP1 = classes().that(IS_IN_COMP_1).should(
      NO_FOO_METHOD_CONDITION);


}
