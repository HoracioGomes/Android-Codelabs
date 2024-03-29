package com.horacio.androidcodelabs.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavDirections
import com.horacio.androidcodelabs.R
import com.horacio.androidcodelabs.databinding.FragmentMainBinding
import com.horacio.androidcodelabs.extensions.navTo

class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.codelabToastSnake.setOnClickListener {
            navTo(MainFragmentDirections.actionMainFragmentToToastSnakeFragment())
        }
    }
}