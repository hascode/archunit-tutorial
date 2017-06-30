# ArchUnit Tutorial

Examples using [ArchUnit] for validating architectural constraints.

```bash
src
├── main
│   ├── java
│   │   └── com
│   │       └── hascode
│   │           └── tutorial
│   │               ├── comp1
│   │               │   └── SomeComponent.java
│   │               └── comp2
│   │                   └── OtherComponent.java
│   └── resources
└── test
    └── java
        ├── architecture
        │   ├── CyclicDependenciesExampleTest.java
        │   ├── NoDeprecatedClassesExampleTest.java
        │   ├── NoFooMethodConditionExampleTest.java
        │   ├── PackageAccessExampleTest.java
        │   └── PredefinedRulesExampleTest.java
        └── com
            └── hascode
                └── tutorial
                    ├── condition
                    │   └── NoFooMethodCondition.java
                    └── predicate
                        └── Component1PackagePredicate.java
```

## Running the Tests

Simply run the tests using [Maven], they should all be failing to prove that the given architecture does not match the defined rules:

```bash
mvn test
```

------

**2017 Micha Kops / hasCode.com**

   [ArchUnit]:https://github.com/TNG/ArchUnit
   [Maven]:http://maven.apache.org/