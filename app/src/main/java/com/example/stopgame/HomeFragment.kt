package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.stopgame.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentHomeBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.playButton.setOnClickListener {
            playGame(it)
        }

        return binding.root
    }

    private fun playGame (view: View){
        Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToRoundSelectorFragment())
    }

}
