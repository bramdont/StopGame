package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.stopgame.databinding.FragmentAnimalsBinding

/**
 * A simple [Fragment] subclass.
 */
class AnimalsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentAnimalsBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_animals, container, false)

        val args = AnimalsFragmentArgs.fromBundle(requireArguments())
        binding.letterChosen.text = "Letter chosen: ${args.letter}"


        return binding.root
    }

}
