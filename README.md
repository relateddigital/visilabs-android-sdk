# Visilabs Android

The Visilabs Android Sdk is a java implementation of an Android client for Visilabs.

## Installation

You need to add  ``` implementation "com.visilabs.android:visilabs-android:3.0.3" ``` to app level build.gradle 

This version uses AndroidX

Also you can check  [Visilabs Demo Application](https://github.com/relateddigital/visilabs-android-sdk/releases/tag/3.0.3) for demo purpose

#### Note that: 

If you do not use AndroidX, you may use  [Visilabs Module - Support library](https://github.com/relateddigital/visilabs-android-sdk/releases/tag/3.0.3-module-supportlibrary). But we will not contribute support library in the future. This is our last supported version. 

For use this module, 
1- Plese download first ;
2- Open your project which you want to use Visilabs
3- Follow steps : Android Studio -> File -> New -> Import Module and select path where you want to locate module and rename it.
4- Please do not forget to link module adding  ```   implementation project(path: ':visilabs-android') ```to your build.gradle


Also you can check  [Visilabs support library demo application](https://github.com/relateddigital/visilabs-android-sdk/releases/tag/3.0.3-supportlib) for demo purpose. Also you can use its module. 


### Using the SDK

Mobile Tagging for Visilab and more information :  [Please check this](https://docs.relateddigital.com/display/KB/Android+-+API+Setup). 

### Licence


 [Related Digital ](https://www.relateddigital.com/)
