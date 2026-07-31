plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.seleniumhq.selenium:selenium-java:4.34.0")
    testImplementation("org.testng:testng:7.10.2")
}

application {
    mainClass.set("org.example.Main")
}

tasks.test {
    useTestNG()
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}