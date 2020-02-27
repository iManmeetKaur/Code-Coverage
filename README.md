# Code-Coverage
An exemplary project to depict the code coverage in Java with Maven using Jacoco plugin.

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

