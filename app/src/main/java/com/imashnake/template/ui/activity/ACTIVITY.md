# Activities

The [developer docs](https://developer.android.com/guide/components/activities/intro-activities) are a good starting point.

# Introduction

Activities serve as an entry point, kinda like `main()` in most other programming languages.
This is because, on Android devices you sometimes want to enter certain parts of other apps,
in other words, you can invoke the activity that concerns you instead of dealing with an app.

An activity has an associated window for the UI to be drawn. This usually fills the screen 
but can be smaller - floating windows, etc?

`MainActivity` is the default entry activity for most Android apps. 

_There seems to be some code in the manifest which specifies this (`<intent-filter>`)._

In present day, having multiple activities is not desirable. Especially with Compose: A single
activity can host one root composable that can navigate to other composables.

_Reading: [The beautiful story of Android developers, multiple Activities, and the chained elephant](https://medium.com/swlh/the-beautiful-story-of-android-developers-multiple-activities-and-the-chained-elephant-2a3083a9cb19)._