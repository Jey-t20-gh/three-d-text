# 3D Text 🎨

A lightweight Android library to render **3D-styled text** using **Jetpack Compose**.  

---

## ✨ Highlights

- **Composable 3D Text View**  
  A reusable Jetpack Compose component that simulates depth and shadow for text rendering.

- **Customizable Styling**  
  Easily tweak colors, depth offset, and shadow intensity to match your app's design.

- **Lightweight & Modular**  
  Built with clean architecture principles for easy integration and future extension.

---

## 🚀 Getting Started

### Step 1. Add the JitPack repository  
Add the JitPack repository to your **settings.gradle.kts** file:

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

### Step 2. Add the dependency

Add the library dependency to your **app module's `build.gradle.kts`** file:

```kotlin
dependencies {
    implementation("com.github.Jey-t20-gh:three-d-text:1.0.0")
}


