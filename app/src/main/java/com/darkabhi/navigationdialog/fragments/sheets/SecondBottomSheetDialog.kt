package com.darkabhi.navigationdialog.fragments.sheets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.darkabhi.navigationdialog.databinding.FirstSheetBinding
import com.darkabhi.navigationdialog.databinding.SecondSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * Created by Abhishek AN <abhishek@iku.earth> on 8/1/2021.
 */
class SecondBottomSheetDialog : BottomSheetDialogFragment() {
    private var _binding: SecondSheetBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SecondSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}