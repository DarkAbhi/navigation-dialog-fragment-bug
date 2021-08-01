package com.darkabhi.navigationdialog.fragments.secondary

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.darkabhi.navigationdialog.databinding.FragmentFirstBinding
import com.darkabhi.navigationdialog.databinding.FragmentViewPageBinding
import com.darkabhi.navigationdialog.fragments.primary.ThirdFragmentDirections
import com.iku.base.BaseFragment

/**
 * Created by Abhishek AN <abhishek@iku.earth> on 8/2/2021.
 */
class ViewPageFragment: BaseFragment<FragmentViewPageBinding>(FragmentViewPageBinding::inflate)  {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.clickMeButton.setOnClickListener {
            findNavController().navigate(ThirdFragmentDirections.actionProfileToFirstSheet())
        }
    }

}