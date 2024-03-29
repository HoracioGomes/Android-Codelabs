package com.horacio.androidcodelabs.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.horacio.androidcodelabs.R
import com.horacio.androidcodelabs.databinding.FragmentToastSnakeBinding
import com.horacio.androidcodelabs.extensions.toast

class ToastSnakeFragment : Fragment(R.layout.fragment_toast_snake) {

    lateinit var binding: FragmentToastSnakeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentToastSnakeBinding.bind(view)

        binding.toast.setOnClickListener {
            Toast.makeText(requireContext(), "Toast ativado!", Toast.LENGTH_SHORT).show()
        }

        binding.snake.setOnClickListener {
            Snackbar.make(view, "Snake ativado!", Snackbar.LENGTH_SHORT).show()
        }

        binding.snakeAction.setOnClickListener {
            Snackbar.make(view, "Snake com action ativda!", Snackbar.LENGTH_SHORT)
                .setAction("Clique") {
                    toast("Toast da ação do Snakebar!")
                }.show()
        }
    }

}

