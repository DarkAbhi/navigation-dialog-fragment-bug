package com.darkabhi.navigationdialog.fragments.primary

import android.os.Bundle
import android.view.View
import com.darkabhi.navigationdialog.databinding.FragmentFirstBinding
import com.darkabhi.navigationdialog.databinding.FragmentThirdBinding
import com.darkabhi.navigationdialog.fragments.AppStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.iku.base.BaseFragment

/**
 * Created by Abhishek AN <abhishek@iku.earth> on 8/1/2021.
 */
class ThirdFragment: BaseFragment<FragmentThirdBinding>(FragmentThirdBinding::inflate)  {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabsAdapter = AppStateAdapter(childFragmentManager, lifecycle)
        binding.viewPager.adapter = tabsAdapter
        val names = arrayOf("2 Hearts Won")
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = names[position]
        }.attach()
    }
}