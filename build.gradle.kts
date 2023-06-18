plugins {
    kotlin("jvm") version "1.8.0"
}

group = "tech.marlonr"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.Minestom:Minestom:954e8b3915")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}