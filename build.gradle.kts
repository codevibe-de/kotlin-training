plugins {
    kotlin("jvm") version "2.2.21"
}

group = "de.codevibe"
version = "1.10"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.21")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.21.1")

    implementation(kotlin("test"))
    implementation("org.junit.jupiter:junit-jupiter:6.0.3")
    implementation("org.assertj:assertj-core:3.27.7")
    implementation("io.mockk:mockk-jvm:1.14.9")
    implementation("io.kotest:kotest-runner-junit5-jvm:6.1.11")
    implementation("io.kotest:kotest-assertions-core-jvm:6.1.11")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}