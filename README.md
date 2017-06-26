# ArchUnit Tutorial

Example using [ArchUnit] for validating architectural constraints.

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
        │   ├── ArchitectureTest.java
        │   └── NoFooMethodConditionExampleTest.java
        └── com
            └── hascode
                └── tutorial
                    ├── condition
                    │   └── NoFooMethodCondition.java
                    └── predicate
                        └── Component1PackagePredicate.java
```

## Running the Tests

Simply run the tests using [Maven]:

```bash
mvn test
```

------

**2017 Micha Kops / hasCode.com**

   [ArchUnit]:https://github.com/TNG/ArchUnit
   [Maven]:http://maven.apache.org/