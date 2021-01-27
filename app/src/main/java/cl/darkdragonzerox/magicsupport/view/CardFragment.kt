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

class CardFragment(id:String): Fragment() {
    lateinit var binding: FragmentCardBinding
    val viewModel:CardViewModel by activityViewModels()
    private val idcode=id
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       viewModel.getCardDetail(idcode).observe(viewLifecycleOwner,{
           it?.let{
               binding.ivFull.load(it.imageUrl)
           }
       })


        return binding.root
    }
}