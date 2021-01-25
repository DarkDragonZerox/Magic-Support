package cl.darkdragonzerox.magicsupport.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import cl.darkdragonzerox.magicsupport.databinding.FragmentListBinding
import cl.darkdragonzerox.magicsupport.databinding.FragmentMenuBinding
import cl.darkdragonzerox.magicsupport.model.CardViewModel


class MenuFragment: Fragment()   {
   private lateinit var binding: FragmentMenuBinding
   private val viewModel:CardViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentMenuBinding.inflate(layoutInflater)
        return binding.root
    }


}