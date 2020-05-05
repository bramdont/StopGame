package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
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

        binding.nextButton.setOnClickListener {
            next(it, args.rounds, args.letter)
        }

        return binding.root
    }

    private fun next (view: View, rounds: Int, letter: String){
        view.findNavController().navigate(LastNameFragmentDirections.actionLastNameFragmentToFoodFragment(rounds, letter))
    }

}
