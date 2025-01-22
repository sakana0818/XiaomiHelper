@file:Suppress("UnstableApiUsage")

include(":magic")


pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://api.xposed.info/")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io/")
        maven("https://api.xposed.info/")
    }
}

rootProject.name = "XiaomiHelper"
include(":app", ":blockmiui", ":hyperx------BEGIN SSH SIGNATURE-----
U1NIU0lHAAAAAQAAADMAAAALc3NoLWVkMjU1MTkAAAAgvhiaVIl3mMEFNt14UjrX7GdAjp
bDySHS+hgFFjNDeg4AAAAHHNwb3NlZAAAAAAAAAAGc2hhNTEyAAAAUwAAAAtzc2gtZWQy
NTUxOQAAAEA000vS6oquD9ru0qaJAhAFD7H7RV1Sj6jV1mP/wp2ToOYo80Kq5hc1rf/NmD
VoJvjEpQ5Ia7VjKTSOr2pcIhEL
-----END SSH SIGNATURE-----compose")