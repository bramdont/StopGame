package com.example.stopgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.stopgame.databinding.FragmentThingBinding

/**
 * A simple [Fragment] subclass.
 */
class ThingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding: FragmentThingBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_thing, container, false)

        return binding.root
    }

}
