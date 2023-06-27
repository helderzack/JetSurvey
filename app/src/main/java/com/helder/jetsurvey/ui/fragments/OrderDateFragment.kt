package com.helder.jetsurvey.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.helder.jetsurvey.R
import com.helder.jetsurvey.databinding.FragmentOrderDateBinding

class OrderDateFragment: Fragment(R.layout.fragment_order_date) {
    private lateinit var binding: FragmentOrderDateBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        binding = FragmentOrderDateBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.materialButtonPrevious.setOnClickListener {
            val action = OrderDateFragmentDirections.actionOrderDateFragmentToComicCharacterFragment()
            findNavController().navigate(action)
        }
    }
}