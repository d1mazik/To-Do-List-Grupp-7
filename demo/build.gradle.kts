plugins {
	java
	id("org.springframework.boot") version "3.1.4"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation ("org.springframework.boot:spring-boot-test")

	runtimeOnly("com.h2database:h2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation ("org.springframework.boot:spring-boot-starter-test")
	testImplementation ("org.junit.jupiter:junit-jupiter-api:5.7.0")
	testImplementation ("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.named<Test>("test") {
	// Use JUnit Platform for unit tests.
	useJUnitPlatform()

	// Add detailed test logging
	testLogging {
		events("passed", "skipped", "failed")
	}
}
