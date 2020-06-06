package com.gamingfella.relax.screen.title

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController

import com.gamingfella.relax.R
import com.gamingfella.relax.databinding.FragmentTitleBinding
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

 lateinit var binding:FragmentTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)

        // Breathing Frament
        binding.playGameButton.setOnClickListener {
//            findNavController().navigate(R.id.action_titleFragment_to_breathingFragment)
            view?.let { it1 -> Snackbar.make(it1,"Use Headphones for better Experience",Snackbar.LENGTH_LONG).show() }
            findNavController().navigate(R.id.action_titleFragment_to_breathingFragment)

        }


//About Fragment
        binding.setTime.setOnClickListener {
            findNavController().navigate(R.id.action_titleFragment_to_aboutFragment)
        }
   return binding.root


    }

    fun use_earphone() {
        val builder = AlertDialog.Builder(context)
        val inflater = layoutInflater

//        val dialogLayout = inflater.inflate(R.layout.dialog_box, null)
        builder.setTitle("Use earphone for better experience \uD83C\uDFA7")
//        builder.setView(dialogLayout)

        builder.setPositiveButton("OK")
        {
                dialogInterface, i ->
            //navigates to Breathing Fragment
            findNavController().navigate(R.id.action_titleFragment_to_breathingFragment)
        }
        builder.show()
    }


}
