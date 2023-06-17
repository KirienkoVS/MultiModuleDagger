package com.example.multimoduledagger.secondfeature.presentation.view.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.multimoduledagger.firstfeature.R

class SecondFeatureFragment : Fragment(R.layout.fragment_second_feature) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = requireView().findViewById<Button>(R.id.button)
        button.setOnClickListener {  }
    }
}
