package com.helder.jetsurvey.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.helder.jetsurvey.R
import com.helder.jetsurvey.databinding.FragmentFreeTimeActivitiesBinding

class FreeTimeActivitiesFragment: Fragment(R.layout.fragment_free_time_activities) {
    private lateinit var binding: FragmentFreeTimeActivitiesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentFreeTimeActivitiesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.materialButtonNext.setOnClickListener {
            val action = FreeTimeActivitiesFragmentDirections
                .actionFreeTimeActivitiesFragmentToComicCharacterFragment()
            findNavController().navigate(action)
        }
    }
}