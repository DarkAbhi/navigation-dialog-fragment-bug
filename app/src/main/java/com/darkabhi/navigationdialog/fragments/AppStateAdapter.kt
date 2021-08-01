package com.darkabhi.navigationdialog.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.darkabhi.navigationdialog.fragments.secondary.ViewPageFragment

/**
 * Created by Abhishek AN <abhishek@iku.earth> on 8/2/2021.
 */
class AppStateAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragments = arrayListOf(
        ViewPageFragment()
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}