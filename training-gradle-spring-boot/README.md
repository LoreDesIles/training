# Training Spring Boot
My Spring Boot Training Project


##buildScript vs repositories
The repositories in the buildScript block are used to fetch the dependencies of your buildScript dependencies. 
These are the dependencies that are put on the classpath of your build and that you can refer to from your build file. 
For instance extra plugins that exist on the internet.

The repositories on the root level are used to fetch the dependencies that your project depends on. 
So all the dependencies you need to compile your project.

## Executable JAR
add dependency 'org.springframework.boot:spring-boot-starter'

## Executable AWR
add dependency 'org.springframework.boot:spring-boot-starter-web'