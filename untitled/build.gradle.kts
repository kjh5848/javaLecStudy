plugins {
    kotlin("jvm") version "1.6.0"
    kotlin("kapt") version "1.6.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    // lombok plugin
    implementation("org.projectlombok:lombok:1.18.20")
    kapt("org.projectlombok:lombok:1.18.20")

    // test 환경
    testImplementation("org.projectlombok:lombok:1.18.20")
    kaptTest("org.projectlombok:lombok:1.18.20")
}


