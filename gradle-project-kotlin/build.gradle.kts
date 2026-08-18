plugins {
    id("java")
    checkstyle
}

group = "br.com.dio"
version = "1.0-SNAPSHOT"

val mapstructVersion = "1.6.3"
val lombokVersion = "1.18.46"
val lombokMapstructBinding = "0.2.0"

repositories {
    mavenCentral()
}

dependencies {
    // Código principal
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    implementation("org.mapstruct:mapstruct:$mapstructVersion")

    // Processadores de Anotação (A ordem exata abaixo é obrigatória)
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:$lombokMapstructBinding")
    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")

    // Testes
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Checkstyle>().configureEach {
    reports{
        xml.required = true
        html.required = true
    }
}

tasks.checkstyleMain{
    source = fileTree("src/main/java")
}

tasks.test {
    useJUnitPlatform()
}
