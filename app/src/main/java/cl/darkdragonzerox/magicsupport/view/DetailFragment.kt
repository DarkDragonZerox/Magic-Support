package cl.darkdragonzerox.magicsupport.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import cl.darkdragonzerox.magicsupport.R
import cl.darkdragonzerox.magicsupport.databinding.FragmentDetailBinding
import cl.darkdragonzerox.magicsupport.model.CardViewModel
import coil.load

class DetailFragment(id:String) : Fragment() {
    lateinit var binding: FragmentDetailBinding
    private val viewModel:CardViewModel by viewModels()
    private val idcode=id
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentDetailBinding.inflate(layoutInflater)
        viewModel.getCardDetail(idcode).observe(viewLifecycleOwner,{
         it?.let{
             binding.ivCardDet.load(it.imageUrl)
             binding.tvNameDetail.text=it.name
             binding.tvTipoDetalle.text=it.type
             binding.tvTextDetail.text=it.text
             binding.tvflavor.text=it.flavor
             binding.tvArtista.text=it.artist
             binding.tvedicion.text=it.setName
             binding.ivCardDet.setOnClickListener { activity?.let {  it.supportFragmentManager.beginTransaction()
                     .replace(R.id.main_container,CardFragment(idcode)).addToBackStack("back").commit()  } }
        }

        })

        return binding.root
    }




}