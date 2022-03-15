![ScreenShoot Apps](docs/image/ss_banner.png?raw=true)
## About This Project (release-and-work-in-progress 👷🔧️👷‍♀️⛏)

[![Android CI](https://github.com/frogobox/frogo-android-animation/actions/workflows/android-ci.yml/badge.svg)](https://github.com/frogobox/frogo-android-animation/actions/workflows/android-ci.yml)
[![Scan with Detekt](https://github.com/frogobox/frogo-android-animation/actions/workflows/detekt.yml/badge.svg)](https://github.com/frogobox/frogo-android-animation/actions/workflows/detekt.yml)

## Version Release
This Is Latest Release

    ~ Beta Release
    $version_release = 0.0.1-beta09

What's New??

    * SDK Android and Desktop *
    * Beta Release *

## Screen Shot
<img width="360" alt="Android View Animations in Java" src="https://gayanvoice.github.io/android-animations/static/media/2-android-view-animations-java.1fe3487e.gif"> <img width="360" alt="Android View Animations in Java" src="https://gayanvoice.github.io/android-animations/static/media/0-android-view-animations-java.57f29c80.gif">

## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle : Project)

#### <Option 1> Groovy Gradle

    // Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }

#### <Option 2> Kotlin DSL Gradle

```kotlin
// Add it in your root build.gradle.kts at the end of repositories:

allprojects {
    repositories {
        ...
        maven { url = uri("https://jitpack.io") }
    }
}
```

### Step 2. Add the dependency (build.gradle : Module)

    #### <Option 1> Groovy Gradle

        dependencies {
            // library frogo-sdk
            implementation 'com.github.frogobox:frogo-sdk:0.0.1-beta09'
        }

    #### <Option 2> Kotlin DSL Gradle

        dependencies {
            // library frogo-sdk
            implementation("com.github.frogobox:frogo-sdk:0.0.1-beta09")
        }

## Step 3. Call FrogoAnimation
#### Import render animations

```java
import render.animations.*
```

#### Start animation

```java
// Declare TextView
val textView: TextView = findViewById(R.id.TextView)

// Create Render Class
 val render = Render(this)

// Set Animation
render.setAnimation(Bounce().InDown(textView))
render.start()
```

## Animations

To animate the view, add the class name and specific animation method name`setAnimation` to an view. You can include the method `setDuration` to specify duration of animation. Default value for `duration` is `1000 Milliseconds`. Finally you need to add one of the following classes to the view:

| Class Name  |             |             |             |             |             |		  |
| ----------- | ----------- | ----------- | ----------- | ----------- | ----------- | ----------- |
| `Attention` | `Bounce`    | `Fade`      | `Flip   `   | `Rotate`    | `Slide`     | `Zoom`      |

### Attention

| `Attention`       |                    |  		      |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `Bounce`|<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/1-attention-bounce.c6335f3d.gif">| `Flash`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/2-attention-flash.27fb56e5.gif">|
| `Pulse`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/3-attention-pulse.ee6d1fae.gif">| `Ruberband`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/4-attention-ruberband.a701fa5b.gif">|
| `Shake`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/5-attention-shake.62d9243a.gif">| `Standup`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/6-attention-standup.553e1945.gif">|
| `Swing`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/7-attention-swing.602dd7aa.gif">| `Tada`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/8-attention-tada.faa9f3c1.gif">|
| `Wave`            |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/9-attention-wave.9a37979d.gif">| `Wobble`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/10-attention-wobble.42ac8c56.gif">|

### Bounce

| `Bounce`	    |                    |       	      |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `InDown`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/15-bounce-in-down.6aad1cbd.gif">| `InUp`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/13-bounce-in-up.7a1d7c17.gif">|
| `InLeft`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/11-bounce-in-left.ebc9bc0f.gif">| `InRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/12-bounce-in-right.a66d3b31.gif">|
| `In`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/14-bounce-in.2ef584a6.gif">	|		|		|

### Fade

| `Fade`            |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `InDown`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/18-fade-in-down.24e645e6.gif">| `InUp`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/19-fade-in-up.a2b79fa7.gif">|
| `InLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/16-fade-in-left.6e93da17.gif">| `InRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/17-fade-in-right.59345f8c.gif">|
| `OutDown`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/22-fade-out-down.4f4ebc27.gif">| `OutUp`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/25-fade-out-up.75f60e2d.gif">|
| `OutLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/20-fade-out-left.7f1583e0.gif">| `OutRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/21-fade-out-right.ff6adf09.gif">|
| `In`               |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/23-fade-in.532822b1.gif">| `Out`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/24-fade-out.a3ee0d3a.gif">|

### Flip

| `Flip`            |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `InX`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/26-flip-in-x.1de9f264.gif">| `InY`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/27-flip-in-y.8f45c5e1.gif">|
| `OutX`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/28-flip-out-x.09be8ac3.gif">| `OutY`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/29-flip-out-y.f5c532a8.gif">|

### Rotate

| `Rotate`          |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `InDownLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/30-rotate-in-down-left.cdd124aa.gif">| `InDownRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/31-rotate-in-down-right.f0693f8b.gif">|
| `InUpLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/32-rotate-in-up-left.f818146d.gif">| `InUpRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/33-rotate-in-up-right.537606e2.gif">|
| `OutDownLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/34-rotate-out-down-left.de06d895.gif">| `OutDownRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/35-rotate-out-down-right.f4505ac5.gif">|
| `OutUpLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/39-rotate-up-left.de13c028.gif">| `OutUpRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/36-rotate-out-up-right.ddb7df75.gif">|
| `In`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/37-rotate-in.08924c36.gif">| `Out`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/38-rotate-out.b127d7a8.gif">|

### Slide

| `Slide`           |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `InDown`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/40-slide-in-down.efa18709.gif">| `InUp`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/43-slide-in-up.0f918432.gif">|
| `InLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/41-slide-in-left.da5a9127.gif">| `InRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/42-slide-in-right.f0e33c31.gif">|
| `OutDown`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/44-slide-out-down.269616ff.gif">| `OutUp`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/47-slide-out-up.7efa439e.gif">|
| `OutLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/45-slide-out-left.4226eca7.gif">| `OutRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/46-slide-out-right.f283b64b.gif">|

### Zoom

| `Zoom`            |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `InDown`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/48-zoom-in-down.6e41a799.gif">| `InUp`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/51-zoom-in-up.40e3a26e.gif">|
| `InLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/49-zoom-in-left.82604bb4.gif">| `InRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/50-zoom-in-right.a419ab92.gif">|
| `OutDown`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/52-zoom-out-down.cb3ee254.gif">| `OutUp`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/57-zoom-out-up.0c74d038.gif">|
| `OutLeft`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/53-zoom-out-left.79cb419d.gif">| `OutRight`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/54-zoom-out-right.7a3ac74d.gif">|
| `In`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/55-zoom-in.1c0c5d5a.gif">| `Out`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/56-zoom-out.f0c52b21.gif">|

This android view animations library supports number of animations. Go to the java version of this library to see the gallery of animations. Click here https://github.com/gayanvoice/android-view-animations-java#animations

## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- [Gayan Kuruppu](https://github.com/gayanvoice)
- [代码家](https://github.com/daimajia)
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

## Inspiration
- https://github.com/gayanvoice/android-animations-kotlin
- https://github.com/gayanvoice/android-view-animations-java
- https://github.com/daimajia/AndroidViewAnimations

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account

![ScreenShoot Apps](docs/image/mad_score.png?raw=true)