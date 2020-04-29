package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.stopgame.databinding.FragmentLetterSelectorBinding

/**
 * A simple [Fragment] subclass.
 */
class LetterSelectorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLetterSelectorBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_letter_selector, container, false)

        return binding.root
    }

}
