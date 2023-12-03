rootProject.name = "springboot-backend"
include(
    "model",
    "phonebook-service"
)

pluginManagement {
    val springBootVersion: String by settings
    val kotlinVersion: String by settings
    val dependencyManagementVersion: String by settings

    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version dependencyManagementVersion
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
    }

    repositories {
        mavenCentral()
    }
}

dependencyResolutionManagement {

    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}