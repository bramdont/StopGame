package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.stopgame.databinding.FragmentLastNameBinding


/**
 * A simple [Fragment] subclass.
 */
class LastNameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentLastNameBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_last_name, container, false)

        val args = LastNameFragmentArgs.fromBundle(requireArguments())

        binding.letterChosen.text = "Letter chosen: ${args.letter}"

        return binding.root
    }

}
