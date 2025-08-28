3D Text 🎨

A lightweight Android library to render 3D-styled text using Jetpack Compose.

✨ Highlights
Composable 3D Text View
A reusable Jetpack Compose component that simulates depth and shadow for text rendering.

Customizable Styling
Easily tweak colors, depth offset, and shadow intensity to match your app's design.

Lightweight & Modular
Built with clean architecture principles for easy integration and future extension.



🚀 Getting Started

Step 1:
Add the JitPack repository to your settings.gradle.kts file:

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}




Step 2:
Add the library dependency to your app module's build.gradle.kts file:

kotlin
dependencies {
    implementation("com.github.Jey-t20-gh:three-d-text:1.0.0")
}




🎨 Step 3: Import the Composable
In your Compose UI file:
import com.yourpackage.ui.components.ThreeDText




🧪 Step 4: Use the Composable
Here’s a basic usage example:
ThreeDText(
    text = "Compose in 3D",
    depth = 12.dp,
    textColor = Color.White,
    shadowColor = Color.Black,
    fontSize = 24.sp,
    modifier = Modifier.padding(16.dp)
)



⚙️ Parameters of ThreeDText Composable

    //  The text to render in 3D
    text: String 

    //  Optional Compose modifier for layout styling
    modifier: Modifier = Modifier

    //  Color of the front-facing text
    baseColor: Color = Color.White

    //  Color used for the depth/extrusion layers
    depthColor: Color = Color.Gray

    //  Controls the direction and spacing of the depth effect
    depthOffset: Offset = Offset(2f, 2f)

    //  Color of the drop shadow behind the text
    shadowColor: Color = Color.Black.copy(alpha = 0.5f)

    //  Position offset for the shadow (e.g., bottom-right)
    shadowOffset: Offset = Offset(10f, 10f)

    //  Blur radius for the shadow—higher values give softer shadows
    shadowBlurRadius: Float = 6f



🧼 Best Practices
- Use depth values between 8.dp and 16.dp for optimal readability.
- Avoid excessive shadow contrast on small screens—test across devices.


For more, Refer to: 
app/src/main/java/com/buttonlibrary/app/MainActivity.kt
