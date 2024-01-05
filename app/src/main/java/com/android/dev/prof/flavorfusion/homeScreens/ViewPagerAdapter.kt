package com.android.dev.prof.flavorfusion.homeScreens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getCount(): Int = 6

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> AllFragment()
            1 -> EgyptianFragment()
            2 -> GreekFragment()
            3 -> IndianFragment()
            4 -> ItalianFragment()
            5 -> MexicanFragment()
            else -> throw IllegalArgumentException("Invalid Position")
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "All"
            1-> "Egyptian"
            2-> "Greek"
            3-> "Indian"
            4-> "Italian"
            5-> "Mexican"
            else-> throw IllegalArgumentException("Invalid Position")
        }
    }
}