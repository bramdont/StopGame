package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
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

        binding.nextButton.setOnClickListener {
            next(it, args.round, args.letter)
        }

        return binding.root
    }

    private fun next (view: View, round: Int, letter: String){
        view.findNavController().navigate(FoodFragmentDirections.actionFoodFragmentToAnimalsFragment(round,letter))
    }

}
