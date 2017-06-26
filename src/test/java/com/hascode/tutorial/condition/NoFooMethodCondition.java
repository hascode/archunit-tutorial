package com.hascode.tutorial.condition;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class NoFooMethodCondition extends ArchCondition<JavaClass> {

  public NoFooMethodCondition() {
    super("not contain a method named <foo>");
  }

  @Override
  public void check(JavaClass javaClass, ConditionEvents conditionEvents) {
    javaClass.getCodeUnits().stream().filter(c -> c.getName().equals("foo"))
        .forEach(c -> conditionEvents
            .add(SimpleConditionEvent
                .violated(c, "class " + javaClass.getName() + " contains a method named foo")));
  }
}
