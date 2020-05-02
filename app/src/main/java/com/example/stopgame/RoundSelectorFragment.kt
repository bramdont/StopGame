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
import androidx.navigation.findNavController
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
            val rounds = getRoundsSelected(binding.roundsSelectorRadioGroup)

            callChooseLetterFragment(it, rounds)
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

    private fun callChooseLetterFragment(view: View, rounds: Int){

        view.findNavController().navigate(
            RoundSelectorFragmentDirections
                .actionRoundSelectorFragmentToLetterSelectorFragment(rounds))
    }


}
