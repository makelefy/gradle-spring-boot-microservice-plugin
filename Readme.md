Gradle Spring Boot Plugin for microservices![Build Status](https://travis-ci.org/makelefy/gradle-spring-boot-microservice-plugin.svg?branch=master)
========================================


This plugin serves as a foundation for[spring boot](http://projects.spring.io/spring-boot/) microservices.

## How to use:
Check the [plugin portal](https://plugins.gradle.org/plugin/io.github.makelefy.gradle-spring-boot-microservice-plugin) 
Add this configuration to use this plugin:

    buildscript {
        repositories {
            mavenLocal()
            maven { url "https://plugins.gradle.org/m2/" }
        }
    
        dependencies {
            classpath "org.springframework.boot:spring-boot-gradle-plugin:1.5.2.RELEASE"
            classpath "gradle.plugin.io.github.makelefy:gradle-spring-boot-microservice-plugin:+"
        }
    }
    
    apply plugin: 'io.github.makelefy.gradle-spring-boot-microservice-plugin'
    
## Preconditions
- Support of [Spring Boot](http://projects.spring.io/spring-boot/) 1.5.2.RELEASE
- plugin tested with [Gradle](http://gradle.org/) 3.3 in single projects setup

##Project
The following standard Gradle plugins will be applied automatically:

+ groovy
+ java
+ org.springframework.boot
+ checkstyle
+ pmd
+ findbugs
+ jacoco
+ maven-publish
+ idea


## Testing
 1. Publish new changes with a new version number `./gradlew publishToMavenLocal 
 2. Use local maven cache in you test gradle project
 
    ```
    buildscript {
        repositories {
            mavenLocal()
        }
    }    
    ```
