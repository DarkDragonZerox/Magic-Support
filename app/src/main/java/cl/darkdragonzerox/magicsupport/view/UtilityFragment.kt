package cl.darkdragonzerox.magicsupport.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.darkdragonzerox.magicsupport.databinding.FragmentUtilityBinding

class UtilityFragment : Fragment() {
    private lateinit var binding: FragmentUtilityBinding
    var vidas=20
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentUtilityBinding.inflate(layoutInflater)
    return binding.root
    }
}