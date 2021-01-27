package cl.darkdragonzerox.magicsupport.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import cl.darkdragonzerox.magicsupport.databinding.FragmentDetailBinding
import cl.darkdragonzerox.magicsupport.model.CardViewModel

class DetailFragment(id:String) : Fragment() {
    lateinit var binding: FragmentDetailBinding
    private val viewModel:CardViewModel by viewModels()
    
}