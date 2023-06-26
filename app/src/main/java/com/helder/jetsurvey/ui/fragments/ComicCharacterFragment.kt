package com.helder.jetsurvey.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.helder.jetsurvey.R
import com.helder.jetsurvey.databinding.FragmentComicCharacterBinding

class ComicCharacterFragment: Fragment(R.layout.fragment_comic_character) {
    private lateinit var binding: FragmentComicCharacterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentComicCharacterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.materialButtonPrevious.setOnClickListener {
            val action = ComicCharacterFragmentDirections.actionComicCharacterFragmentToFreeTimeActivitiesFragment()
            findNavController().navigate(action)
        }
    }
}