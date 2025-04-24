plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.20"
    id("me.philippheuer.configuration") version "0.16.3"
}

version = properties["version"] as String

projectConfiguration {
    type.set(me.philippheuer.projectcfg.domain.ProjectType.LIBRARY)
    language.set(me.philippheuer.projectcfg.domain.ProjectLanguage.KOTLIN)
    javaVersion.set(JavaVersion.VERSION_1_8)
    artifactGroupId.set("io.github.cidverse.test")
    artifactId.set("kotlin-library-gradle")
    artifactDisplayName.set("Library - Kotlin Gradle")
    artifactDescription.set("A simple Kotlin library for testing purposes")

    pom = { pom ->
        pom.url.set("https://github.com/cidverse/test-library-kotlin-gradle")
        pom.issueManagement {
            system.set("GitHub")
            url.set("https://github.com/cidverse/test-library-kotlin-gradle/issues")
        }
        pom.inceptionYear.set("2025")
        pom.developers {
            developer {
                id.set("PhilippHeuer")
                name.set("Philipp Heuer")
                email.set("git@philippheuer.de")
                roles.addAll("maintainer")
            }
        }
        pom.licenses {
            license {
                name.set("MIT Licence")
                distribution.set("repo")
                url.set("https://github.com/cidverse/test-library-kotlin-gradle/blob/main/LICENSE")
            }
        }
        pom.scm {
            connection.set("scm:git:https://github.com/cidverse/test-library-kotlin-gradle.git")
            developerConnection.set("scm:git:git@github.com:cidverse/test-library-kotlin-gradle.git")
            url.set("https://github.com/cidverse/test-library-kotlin-gradle")
        }
    }
}

dependencies {
    // annotations
    compileOnly("org.jetbrains:annotations:26.0.2")

    // test
    testImplementation(kotlin("test"))
}
