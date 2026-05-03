import org.gradle.external.javadoc.JavadocMemberLevel
import org.gradle.external.javadoc.StandardJavadocDocletOptions

plugins {
    application
}

group = "es.ies"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.datafaker:datafaker:2.5.4")
}

application {
    mainClass.set("es.ies.simulador.SimuladorFutbolApp")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.javadoc {
    description = "Genera la documentación JavaDoc del proyecto"
    group = "documentation"
    destinationDir = layout.buildDirectory.dir("docs/javadoc").get().asFile
    title = "Documentación API del simulador de fútbol"
    options.encoding = "UTF-8"
    options.memberLevel = JavadocMemberLevel.PROTECTED

    (options as StandardJavadocDocletOptions).apply {
        author(true)
        version(true)
        charSet("UTF-8")
        docEncoding("UTF-8")
    }
}
