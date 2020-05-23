# Appium-MobileAutomation Android

> Appium-mobile-automation repository contains the automated checks with CI.
---

## Table of Contents 

- [Prerequisites](#Prerequisites)
- [Tools](#Tools)
- [Installation](#installation)
- [Usage](#Usage)
- [Support](#Support)
- [License](#license)
 
---


## Prerequisites
- BrowserStack account 
- Mac
- [Brew location](https://brew.sh/)

#### MAC-USERS
- Homebrew (below command will work for mac users)
```shell
$  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"
```
- Java  (below command will work for mac users)
```shell
$ brew update
$ brew install java
$ export JAVA_HOME=$(/usr/libexec/java_home)
$ java -v
```

---


## Tools 
- Appium
- Java
- Jenkins pipeline
- TestNg
- Android studio
- Allure test reporting

---

## Installation

> All the `code` required to get started is in bitbucket repository
 - [ Appium documentation ](http://appium.io/docs/en/about-appium/intro/)
 Installing Appium on OSX from terminal
 ```
  brew install node
  npm install -g appium
  brew install carthage
  sudo authorize-ios
  Add path to bash_profile: export PATH="/usr/local/bin:$PATH"
 ```

- Ùpload the Apk to browserstack and follow the document 
```
curl -u "user:key" \
-X POST "https://api-cloud.browserstack.com/app-automate/upload" \
-F "file=@/path/to/app/file/Application-debug.apk"
```
- [ BrowserStack Documentation for setup ](https://www.browserstack.com/app-automate/appium-testng)

#### Clone

- Clone this repo to your local machine using `https://github.com/TrishaChetani/AndroidMobileAutomationCI`

#### Setup
* Add Android path to bash_profile:Configure Android Emulator with Google APIs,  API_25 >,  x86
```
     export JAVA_HOME=$(/usr/libexec/java_home)
     export ANDROID_HOME=/Users/your username/Library/Android/sdk
     export PATH=$ANDROID_HOME/platform-tools:$PATH
     export PATH=$ANDROID_HOME/tools:$PATH`
```
- iOS Setup: Install Simulator iPhone 11 Pro with iOS 13.3
---


## Usage

```
mvn test -P local
```

---


## Support
>agarwalatrisha1212@gmail.com

---


## License

© TrishaChetani

---