plugins {
    `cpp-application`
}

repositories {
    maven(url = "https://repo.gradle.org/gradle/libs-snapshots-local/")
}

application {
    dependencies {
        implementation(project(":reverse-lib"))
    }

    binaries.configureEach {
        if (toolChain is GccCompatibleToolChain) {
            tasks.withType<CppCompile> {
                source.from(fileTree("dir" to "src/main/c", "include" to "**/*.c"))
            }

            tasks.withType<LinkExecutable> {
                linkerArgs.set(listOf("-nodefaultlibs", "-lc"))
            }
        }
    }
}