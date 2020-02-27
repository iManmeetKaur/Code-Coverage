# Code-Coverage
Code coverage is a measurement of how many lines/blocks/arcs of your code are executed while the automated tests are running.<br>  
Code coverage is collected by using a specialized tool to instrument the binaries to add tracing calls and run a full set of automated tests against the instrumented product. A good tool will give you not only the percentage of the code that is executed, but also will allow you to drill into the data and see exactly which lines of code were executed during a particular test.<br>
https://en.wikipedia.org/wiki/Code_coverage<br>
https://stackoverflow.com/questions/195008/what-is-code-coverage-and-how-do-you-measure-it

#### Tools that can be used for Java:
1. Corbetura https://cobertura.github.io/cobertura/
2. Jacoco http://www.eclemma.org/jacoco/

In this repository, an exemplary project has been created to depict the code coverage in Java (Maven) using Jacoco.

### Jacoco Plugin
Please check the latest plugin on the [official website](https://mvnrepository.com/artifact/org.jacoco/jacoco-maven-plugin) compatible with your version of eclipse.
```xml
<plugin>
	<groupId>org.jacoco</groupId>
	<artifactId>jacoco-maven-plugin</artifactId>
	<version>0.8.5</version>
	<executions>
		<execution>
			<id>prepare-agent</id>
			<goals>
				<goal>prepare-agent</goal>
			</goals>
		</execution>
	  <execution>
      <id>report</id>
      <phase>prepare-package</phase>
      <goals>
        <goal>report</goal>
      </goals>
    </execution>
    <execution>
      <id>post-unit-test</id>
      <phase>test</phase>
      <goals>
        <goal>report</goal>
      </goals>
      <configuration>
        <!-- Sets the path to the file which contains the execution data. -->
        <dataFile>target/jacoco.exec</dataFile>
        <!-- Sets the output directory for the code coverage report. -->
        <outputDirectory>target/jacoco-code-coverage-reports</outputDirectory>
      </configuration>
    </execution>
  </executions>
  <configuration>
    <systemPropertyVariables>
      <jacoco-agent.destfile>target/jacoco.exec</jacoco-agent.destfile>
    </systemPropertyVariables>
  </configuration>
</plugin>
```

