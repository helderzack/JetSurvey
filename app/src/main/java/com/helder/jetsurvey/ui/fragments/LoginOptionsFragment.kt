package com.helder.jetsurvey.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.helder.jetsurvey.R
import com.helder.jetsurvey.databinding.FragmentLoginOptionsBinding

class LoginOptionsFragment: Fragment(R.layout.fragment_login_options) {
    private lateinit var binding: FragmentLoginOptionsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentLoginOptionsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSignInNormal.setOnClickListener {
            val action = LoginOptionsFragmentDirections.actionLoginOptionsFragmentToSignInActivity()
            view.findNavController().navigate(action)
        }
    }
}