package io.github.makelefy.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin

/**
 * Created by makele on 13.03.17.
 */
class SpringBootMicroservicePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.apply(plugin: 'groovy')
        project.apply(plugin: 'java')
        project.apply(plugin: 'org.springframework.boot')
        project.apply(plugin: 'checkstyle')
        project.apply(plugin: 'pmd')
        project.apply(plugin: 'findbugs')
        project.apply(plugin: 'jacoco')
        project.apply(plugin: 'maven-publish')
        project.apply(plugin: 'idea')


        project.repositories {
            jcenter()
        }

        project.afterEvaluate {
            project.dependencies.add(JavaPlugin.COMPILE_CONFIGURATION_NAME, "org.springframework.boot:spring-boot-starter-actuator")
            project.dependencies.add(JavaPlugin.COMPILE_CONFIGURATION_NAME, "org.springframework.boot:spring-boot-devtools")
            project.dependencies.add(JavaPlugin.COMPILE_CONFIGURATION_NAME, "org.springframework.boot:spring-boot-starter-security")

            project.dependencies.add(JavaPlugin.TEST_COMPILE_CONFIGURATION_NAME, "org.springframework.boot:spring-boot-starter-test")
        }

    }
}
