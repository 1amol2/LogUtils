
# LogUtils

[![0.1.0](https://jitpack.io/v/1amol2/LogUtils.svg)](https://jitpack.io/#1amol2/LogUtils)

## Adding the Library:
To get a Git project into your build:

- ***Add the JitPack repository to your build.gradle file***


```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### Checkout [releases](https://github.com/1amol2/LogUtils/releases) for the latest version.

```gradle
dependencies {
    implementation 'com.github.1amol2:LogUtils:0.1.2'
}
```
## Implementing the code (Instructions)

```java
LogUtils utils = new LogUtils();

//For Debug Log
utils.logDebug("Tag","mssg");

//For Error Log
utils.logError("Tag","mssg");

//For Info Log
utils.logInfo("Tag","mssg");

//For Verbose Log
utils.logVerbose("Tag","mssg");

//For Warning Log
utils.logWarning("Tag","mssg");

//For wtf Log
utils.logWtf("Tag","mssg");



```


