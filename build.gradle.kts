plugins {
    id("java")
}

group = "de.shortexception"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    // https://mavenlibs.com/maven/dependency/com.googlecode.json-simple/json-simple
    implementation("com.googlecode.json-simple:json-simple:1.1.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}