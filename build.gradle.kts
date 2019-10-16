plugins {
    java
}

group = "com.chirikhin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("org.springframework.boot", "spring-boot-starter", "2.1.4.RELEASE")
    compile("org.springframework.boot", "spring-boot-starter-web", "2.1.4.RELEASE")
    compile("org.springframework.boot", "spring-boot-starter-data-jpa", "2.1.4.RELEASE")

    compile("org.hibernate", "hibernate-core", "5.4.2.Final")

    compile("org.postgresql", "postgresql", "42.2.8")

    compile("org.projectlombok", "lombok", "1.18.10")
    annotationProcessor ("org.projectlombok", "lombok", "1.18.10")

    testCompile("junit", "junit", "4.12")
}