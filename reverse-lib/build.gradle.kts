plugins {
    `cpp-library`
    `cpp-unit-test`
}

repositories {
    maven(url = "https://repo.gradle.org/gradle/libs-snapshots-local/")
}

unitTest {
    dependencies {
        implementation("org.gradle.cpp-samples:googletest:1.9.0-gr3-SNAPSHOT")
    }
    binaries.configureEach {
        if (toolChain is Gcc && targetPlatform.operatingSystem.isLinux) {
            tasks.withType<LinkExecutable> {
                linkerArgs.add("-lpthread")
            }
        }
    }
}