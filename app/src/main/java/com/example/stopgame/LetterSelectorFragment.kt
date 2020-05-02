package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
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
        var args = LetterSelectorFragmentArgs.fromBundle(requireArguments())
        var letter = binding.letterChosen.text
        binding.playButton.setOnClickListener {
            play(it, args.rounds, letter.toString())
        }


        return binding.root
    }

    private fun play (view: View, rounds: Int, letter: String){
        var roundNum: Int =  rounds - 1
        view.findNavController().navigate(
            LetterSelectorFragmentDirections.actionLetterSelectorFragmentToNameFragment(roundNum, letter))
    }

/*
    private fun isTheFirstRound(roundNum: Int): Boolean {
        return when (roundNum){
            0 -> true
            1 -> false
            else -> false
        }
    }  */

}
