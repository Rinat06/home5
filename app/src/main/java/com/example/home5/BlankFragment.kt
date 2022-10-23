package com.example.home5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.home5.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding
    private var number: Int = 1
    private lateinit var result: String



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener() {
            fun onClick(view: View) {
                binding.text1.text = "0"
                if (number > 0) {
                    binding.btn.text = "+1"
                    number++
                    result = number.toString()
                    binding.text1.text = result
                }else if (number < 10){
                    binding.btn.text = "-1"
                    number--
                    result = number.toString()
                    binding.text1.text = result
                }
            }
        }
    }
}



