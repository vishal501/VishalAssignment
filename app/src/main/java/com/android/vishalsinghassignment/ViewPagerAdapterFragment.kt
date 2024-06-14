package com.android.vishalsinghassignment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fm: FragmentManager, fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
        val titles = listOf("Personal", "Services", "Businesses")
    override fun getItemCount() = titles.size

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return PersonalFragment()
            1 -> return ServicesFragment()
            2 -> return BusinessesFragment()
            else -> return PersonalFragment()
        }
    }
}