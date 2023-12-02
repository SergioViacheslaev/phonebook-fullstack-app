plugins {
    id("org.springframework.boot") version "3.2.0"
    kotlin("plugin.spring") version "1.9.20"
}

dependencies {
    implementation(project(":model"))
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

