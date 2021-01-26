package cl.darkdragonzerox.magicsupport.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import cl.darkdragonzerox.magicsupport.R
import cl.darkdragonzerox.magicsupport.databinding.FragmentListBinding
import cl.darkdragonzerox.magicsupport.databinding.FragmentMenuBinding
import cl.darkdragonzerox.magicsupport.model.CardViewModel


class MenuFragment: Fragment()   {
   private lateinit var binding: FragmentMenuBinding
   private val viewModel:CardViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentMenuBinding.inflate(layoutInflater)
        binding.ibCartas.setOnClickListener { activity?.let {  it.supportFragmentManager.beginTransaction()
                .replace(R.id.main_container,ListFragment()).addToBackStack("back").commit()  } }
        binding.ibUtilidades.setOnClickListener { activity?.let {  it.supportFragmentManager.beginTransaction()
                .replace(R.id.main_container,UtilityFragment()).addToBackStack("back").commit()  } }
        binding.ibAgradecimientos.setOnClickListener { activity?.let {  it.supportFragmentManager.beginTransaction()
                .replace(R.id.main_container,AgradecimientosFragment()).addToBackStack("back").commit()  } }
        return binding.root
    }


}