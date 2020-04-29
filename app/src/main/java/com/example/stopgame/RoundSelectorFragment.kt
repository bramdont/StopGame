package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.stopgame.databinding.FragmentRoundSelectorBinding
import kotlin.math.round

/**
 * A simple [Fragment] subclass.
 */
class RoundSelectorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentRoundSelectorBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_round_selector, container, false)
        binding.startGameButton.setOnClickListener {
           var rounds = getRoundsSelected(binding.roundsSelectorRadioGroup)

            callChooseLetterFragment(rounds, it)
        }

        return binding.root
    }

    private fun getRoundsSelected (radioGroup: RadioGroup): Int {
        return when (radioGroup.checkedRadioButtonId){

            R.id.fiveRounds_radioButton -> 5
            R.id.tenRounds_radioButton -> 10
            else -> 0
        }
    }

    private fun callChooseLetterFragment(rounds: Int, view: View){

        Navigation.findNavController(view).navigate(R.id.action_roundSelectorFragment_to_letterSelectorFragment)
    }

}
