package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.stopgame.databinding.FragmentFoodBinding

/**
 * A simple [Fragment] subclass.
 */
class FoodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentFoodBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_food, container, false)

        val args = FoodFragmentArgs.fromBundle(requireArguments())

        binding.letterChosen.text = "Letter chosen: ${args.letter}"

        return binding.root
    }

}
