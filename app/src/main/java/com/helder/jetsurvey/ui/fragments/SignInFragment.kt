package com.helder.jetsurvey.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.helder.jetsurvey.R
import com.helder.jetsurvey.databinding.FragmentSignInBinding

class SignInFragment: Fragment(R.layout.fragment_sign_in) {
    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentSignInBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolbarActions.setOnClickListener {
            val action = SignInFragmentDirections.actionSignInFragmentToHomeFragment()
            view.findNavController().navigate(action)
        }
    }
}