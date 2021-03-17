androidApp(
    packageName = "com.stepango.blockme.root.library",
    //owner = Teams.core,
    dependencies = transitiveDeps(
        androidx.core_ktx,
        androidx.appcompat,
        androidx.constraintlayout,
        google.material
    ) + deps(
        project(":root-res"),
        project(":core:theme:android-util")
    ),
    testDependencies = transitiveDeps(
        test.junit
    )
)