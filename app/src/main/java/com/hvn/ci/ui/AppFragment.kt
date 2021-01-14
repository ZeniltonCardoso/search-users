package com.hvn.ci.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hvn.ci.databinding.AppFragmentBinding

class AppFragment : Fragment() {


    private lateinit var binding: AppFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = AppFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

}