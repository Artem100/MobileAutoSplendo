# MobileAutoSplendo

## General info
Try to create autotests on java for mobile app Splendo.
Test created in Linux OS.


## Technologies
* JDK 1.8;
* Maven;
* Appium;
* Allure;

## Setup
Intall on your server or PC the softwares:
* Appium Desktop - https://github.com/appium/appium-desktop/releases/
* Android Studio and Android SDK - https://developer.android.com/studio/index.html

##Сontiditions
*Run Appium;
*Run any Android Virtual device;
*
```
$ mvn clean test
```
3. To look the results of tests, run the command:
```
$ mvn site
```
3.1 Go to directory with results report (/target/site/allure-maven.html) and open it in browser.
