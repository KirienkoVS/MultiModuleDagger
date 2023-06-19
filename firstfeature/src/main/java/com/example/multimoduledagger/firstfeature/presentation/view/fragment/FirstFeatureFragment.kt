package com.example.multimoduledagger.firstfeature.presentation.view.fragment

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.multimoduledagger.firstfeature.R
import com.example.multimoduledagger.firstfeature.di.DaggerFirstFeatureComponent
import com.example.multimoduledagger.firstfeature.di.FirstFeatureComponent
import com.example.multimoduledagger.firstfeature.di.FirstFeatureComponentDependencies
import com.example.multimoduledagger.secondfeatureapi.SecondFeatureMediator
import javax.inject.Inject

class FirstFeatureFragment : Fragment(R.layout.fragment_first_feature) {

    @Inject
    lateinit var secondFeatureMediator: SecondFeatureMediator

    private val component: FirstFeatureComponent by lazy {
        DaggerFirstFeatureComponent
            .factory()
            .create(
//                dependencies = requireActivity().application as FirstFeatureComponentDependencies
            )
    }

    override fun onAttach(context: Context) {
        component.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = requireView().findViewById<Button>(R.id.button)
        button.setOnClickListener {
//            secondFeatureMediator.start(android.R.id.content, parentFragmentManager)
        }
    }
}
