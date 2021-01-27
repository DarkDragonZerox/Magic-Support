package cl.darkdragonzerox.magicsupport.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels

import cl.darkdragonzerox.magicsupport.databinding.FragmentCardBinding
import cl.darkdragonzerox.magicsupport.model.CardViewModel
import coil.load
import coil.transform.RoundedCornersTransformation


class CardFragment(id:String): Fragment() {
    lateinit var binding: FragmentCardBinding
    val viewModel:CardViewModel by viewModels()
    private val idcode=id
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      binding= FragmentCardBinding.inflate(layoutInflater)
       viewModel.getCardDetail(idcode).observe(viewLifecycleOwner,{
           it?.let{
               binding.ivFull.load(it.imageUrl){
                   crossfade(true)
                   crossfade(250)
                                  }
           }
       })


        return binding.root
    }
}