plugins {
    kotlin("jvm") version "1.9.10"
    java
    idea
}

group = "org.example.julian"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")

    val junitVersion = "5.10.0"
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testImplementation("org.junit.platform:junit-platform-launcher:1.10.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

java {
    version = JavaVersion.VERSION_17
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

idea {
    module {
        isDownloadJavadoc = true
    }
}