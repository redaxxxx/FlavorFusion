package com.android.dev.prof.flavorfusion.homeScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.android.dev.prof.flavorfusion.R
import com.android.dev.prof.flavorfusion.databinding.FragmentAllBinding

class AllFragment : Fragment() {

    private lateinit var binding: FragmentAllBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_all, container, false)


        return binding.root
    }

}