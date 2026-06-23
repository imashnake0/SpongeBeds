# Activities

The [developer docs](https://developer.android.com/guide/components/activities/intro-activities) are a good starting point.

# Introduction

- Activities serve as an entry point, kinda like `main()` in most other programming languages.
This is because, on Android devices you sometimes want to enter certain parts of other apps,
in other words, you can invoke the activity that concerns you instead of dealing with an app.

- An activity has an associated window for the UI to be drawn. This usually fills the screen 
but can be smaller - floating windows, etc?

- `MainActivity` is the default entry activity for most Android apps. 

_There seems to be some code in the manifest which specifies this (`<intent-filter>`)._

- In present day, having multiple activities is not desirable. Especially with Compose: A single
activity can host one root composable that can navigate to other composables.

_Reading: [The beautiful story of Android developers, multiple Activities, and the chained elephant](https://medium.com/swlh/the-beautiful-story-of-android-developers-multiple-activities-and-the-chained-elephant-2a3083a9cb19)._

# Manifest

- The manifest file has app metadata that the system can access conveniently without having to parse
the entire APK. The manifest is parsed and cached when the app is installed. See [`PackageInfo`](https://android.googlesource.com/platform/frameworks/base/+/refs/heads/main/core/java/android/content/pm/PackageInfo.java).

- Classes like [activities, services, content providers, etc.,](https://stackoverflow.com/a/20047214) are declared in the manifest.

- Activities are declared like:
```xml
<manifest>
    <application>
        <activity android:name=".ExampleActivity" />
        <!-- ... -->
    </application>
    <!-- ... -->
</manifest >
```

`name` is the only required attribute, see [other attributes](https://developer.android.com/guide/topics/manifest/activity-element).

# Intent Filters

- Intent filters are elements that the system can look up when it needs to start an activity 
via an explicit or implicit `Intent`.

- Other elements in the `intent-filter` can be used to configure when and how the system 
looks for an activity to pass the intent to.

```xml
<activity
    android:name=".ui.activity.SpongeActivity"
    android:exported="true">
    <intent-filter>
        <action android:name="android.intent.action.SEND" />
        <category android:name="android.intent.category.DEFAULT" />
        <data android:mimeType="text/plain" />
    </intent-filter>
</activity>
```

- The entry point `MainActivity` has this signature by default:
```xml
<activity
    android:name=".MainActivity"
    android:exported="true"
    android:theme="@style/Theme.AndroidTemplate">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />

        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```