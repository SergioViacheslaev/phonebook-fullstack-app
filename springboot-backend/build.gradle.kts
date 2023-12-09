import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val springBootVersion: String by project

group = "com.study.phonebook"
version = "1.0.0-RELEASE"

plugins {
    kotlin("jvm")
    id("io.spring.dependency-management")
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "io.spring.dependency-management")

    dependencyManagement {
        imports {
            mavenBom("org.springframework.boot:spring-boot-dependencies:$springBootVersion")
        }

        //example of overriding dependency version from mavenBom
        dependencies {
            dependency("org.mockito:mockito-core:5.8.0")
        }
    }

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-reflect")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += "-Xjsr305=strict"
            jvmTarget = "17"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_17
    }
}


