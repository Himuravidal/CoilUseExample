package com.j4f.coiluseexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import coil.load
import com.j4f.coiluseexample.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Use coil for svg
        binding.imageView1.loadSvg(
        "https://s3.us-east-2.amazonaws.com/nomics-api/static/images/currencies/btc.svg")

        //Normal image with coil
        binding.imageView2.load("https://s3.us-east-2.amazonaws.com/nomics-api/static/images/currencies/vet.png")
    }


}


