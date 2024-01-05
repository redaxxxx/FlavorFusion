package com.android.dev.prof.flavorfusion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.android.dev.prof.flavorfusion.databinding.FragmentHomeBinding
import com.android.dev.prof.flavorfusion.homeScreens.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        val adapter = ViewPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = adapter

        binding.tabLayout.setupWithViewPager(binding.viewPager)

        binding.tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.view?.setBackgroundColor(resources.getColor(R.color.green))
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tab?.view?.setBackgroundColor(resources.getColor(R.color.white))
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                tab?.view?.setBackgroundColor(resources.getColor(R.color.green))
            }

        })
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        val adapter = ViewPagerAdapter(childFragmentManager)
//
//        binding.viewPager.adapter = adapter
//        binding.tabLayout.setupWithViewPager(binding.viewPager.rootView as ViewPager?)

//        binding.tabLayout.setupWithViewPager(binding.viewPager)

        // Set PageTransformer for scrolling effect
//        binding.viewPager.setPageTransformer(false, ViewPager.PageTransformer{ page, position ->
//        val normalizedPostion = Math.abs(position)
//            page.scaleX = 1 - normalizedPostion / 2
//
//        })
    }
}