package cl.darkdragonzerox.magicsupport.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import cl.darkdragonzerox.magicsupport.databinding.FragmentUtilityBinding
import cl.darkdragonzerox.magicsupport.model.CardViewModel

class UtilityFragment : Fragment() {
    private lateinit var binding: FragmentUtilityBinding
    private val viewModel : CardViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentUtilityBinding.inflate(layoutInflater)
        viewModel.vidas.observe(viewLifecycleOwner,{
            binding.tvVidas.text=it.toString()
        })
        binding.btAumentar.setOnClickListener {
           viewModel.aumentar()
        }
        binding.btDisminuir.setOnClickListener {
          viewModel.disminuir()
        }
        binding.btReset.setOnClickListener {
            viewModel.reset()
        }
        binding.btCoin.setOnClickListener {
            viewModel.moneda()
        }
        viewModel.coin.observe(viewLifecycleOwner,{
            binding.tvCoin.text=it
        })


    return binding.root
    }


}