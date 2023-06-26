package com.helder.jetsurvey.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.helder.jetsurvey.R
import com.helder.jetsurvey.databinding.FragmentHomeBinding

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSignInNormal.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToSignInFragment()
            view.findNavController().navigate(action)
        }

        binding.buttonSignInGuest.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToFreeTimeActivitiesFragment()
            view.findNavController().navigate(action)
        }
    }
}