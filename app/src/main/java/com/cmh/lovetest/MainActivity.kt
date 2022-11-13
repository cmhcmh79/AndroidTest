package com.cmh.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {

    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

  //      navController = findNavController(R.id.nav_host_fragment)

        var intent = intent;
        Log.d("cmh_log", "testname : " + intent.getStringExtra("test"));


        var navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
        if (navHostFragment != null) {
            navController = navHostFragment.findNavController()
        }
    }


}


/*


    //Json lib
    implementation 'com.google.code.gson:gson:2.8.6'

    // 통신 lib
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

    //권한 요청 lib
    implementation 'pub.devrel:easypermissions:3.0.0'

    //HTTP 처리 lib
    implementation 'com.squareup.okhttp3:okhttp:4.9.3'
    implementation 'com.squareup.okhttp3:okhttp-tls:4.8.1'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.8.0'

    //로깅 처리 lib
    implementation 'com.jakewharton.timber:timber:4.7.1'

    //토스트 처리 lib
    implementation 'com.github.GrenderG:Toasty:1.4.2'


   def lifecycle_version = "2.3.1"
    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    // Lifecycles only (without ViewModel or LiveData)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")

    // Saved state module for ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")

    // Annotation processor
    kapt("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")
    // alternately - if using Java8, use the following instead of lifecycle-compiler
    implementation("androidx.lifecycle:lifecycle-common-java8:$lifecycle_version")

    // optional - helpers for implementing LifecycleOwner in a Service
    implementation("androidx.lifecycle:lifecycle-service:$lifecycle_version")

    // optional - ProcessLifecycleOwner provides a lifecycle for the whole application process
    implementation("androidx.lifecycle:lifecycle-process:$lifecycle_version")
    // optional - ReactiveStreams support for LiveData
    implementation("androidx.lifecycle:lifecycle-reactivestreams-ktx:$lifecycle_version")

    // Kotlin

    implementation 'androidx.activity:activity-ktx:1.3.1'
    implementation "androidx.fragment:fragment-ktx:1.3.6"



    // Kotlin + coroutines
    implementation "androidx.work:work-runtime-ktx:2.6.0"
    // Kotlin
    implementation "androidx.concurrent:concurrent-futures-ktx:1.1.0"

 */



