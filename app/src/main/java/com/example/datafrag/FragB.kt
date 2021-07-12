package com.example.datafrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.datafrag.databinding.FragmentFragBBinding


class FragB : Fragment() {
    lateinit var binding: FragmentFragBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentFragBBinding.inflate(layoutInflater)

        bundlerBin()

        return binding.root
    }

    private fun bundlerBin(p:String="dd") {

        val data= requireArguments()?.getString("key")
        binding.textView.text=data?:"nessun valore"?:"nn"

    }


}