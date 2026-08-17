plugins {
    id("java")
}

group = "br.com.dio"
version = "1.0-SNAPSHOT"
val mapstructVersion = "1.6.3"
var lombokVersion = "1.18.42"
val lombokMapstructBinding = "0.2.0"
repositories {
    mavenCentral()
}

dependencies {
    implementation("org.mapstruct:mapstruct:$mapstructVersion")
    implementation("org.projectlombok:lombok-mapstruct-binding:0.2.0")

    compileOnly("org.projectlombok:lombok:1.18.46")

    annotationProcessor("org.mapstruct:mapstruct:$mapstructVersion")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")

    annotationProcessor("org.projectlombok:lombok:1.18.46")
}

tasks.test {
    useJUnitPlatform()
}
