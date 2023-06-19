package com.example.multimoduledagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimoduledagger.core.di.MediatorsMap
import com.example.multimoduledagger.firstfeatureapi.FirstFeatureMediator
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var firstFeatureMediator: FirstFeatureMediator

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        firstFeatureMediator.start(R.id.fragmentContainer, supportFragmentManager)
    }
}
