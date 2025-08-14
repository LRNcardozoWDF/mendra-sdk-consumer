
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}

repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/LRNcardozoWDF/mendra-sdk-publisher")
        credentials {
            username = System.getenv("GITHUB_ACTOR") ?: "USERNAME_PLACEHOLDER"
            password = System.getenv("GITHUB_TOKEN") ?: "TOKEN_PLACEHOLDER"
        }
    }
    mavenCentral()
}
