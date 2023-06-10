plugins {
    id(Plugins.moduleJavaLib)
    id(Plugins.kotlinJvm)
    kotlin(Plugins.kotlinSerialization) version ProjectConfig.kotlinVersion
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.characterDomain))

    implementation(KotlinX.jsonSerialization)

    implementation(Ktor.core)
    implementation(Ktor.androidClient)
    implementation(Ktor.clientSerialization)
    implementation(Ktor.contentNegotiation)
    implementation(Ktor.logging)
}