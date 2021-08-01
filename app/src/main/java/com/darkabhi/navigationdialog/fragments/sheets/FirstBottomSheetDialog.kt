package com.darkabhi.navigationdialog.fragments.sheets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.darkabhi.navigationdialog.databinding.FirstSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * Created by Abhishek AN <abhishek@iku.earth> on 8/1/2021.
 */
class FirstBottomSheetDialog : BottomSheetDialogFragment() {
    private var _binding: FirstSheetBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FirstSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.firstToSecondSheetBtn.setOnClickListener {
            dismiss()
            findNavController().navigate(FirstBottomSheetDialogDirections.actionFirstSheetToSecondSheet())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}