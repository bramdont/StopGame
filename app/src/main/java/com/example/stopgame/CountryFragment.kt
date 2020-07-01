package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.example.stopgame.databinding.FragmentCountryBinding

/**
 * A simple [Fragment] subclass.
 */
class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding: FragmentCountryBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_country, container, false)

        var args = CountryFragmentArgs.fromBundle(requireArguments())
        binding.letterChosen.text = "Letter chosen: ${args.letter}"

        binding.nextButton.setOnClickListener {
            next(it, args.rounds, args.letter)
        }

        return binding.root
    }

    private fun next (view: View, rounds: Int, letter: String){
        view.findNavController().navigate(CountryFragmentDirections.actionCountryFragmentToThingFragment(rounds, letter))
    }

}
