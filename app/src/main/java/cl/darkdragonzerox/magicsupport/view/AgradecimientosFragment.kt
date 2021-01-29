package cl.darkdragonzerox.magicsupport.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.darkdragonzerox.magicsupport.databinding.FragmentAgradecimientosBinding
import cl.darkdragonzerox.magicsupport.databinding.FragmentCardBinding

class AgradecimientosFragment :Fragment(){
    lateinit var binding: FragmentAgradecimientosBinding
    val agradecimiento = " Primero que todo quiero expresar mi gratitud con todos mis compañeros, por el camino que hemos construido como equipo, sin su ayuda los errores generarian mayor frustracion," +
            " gracias a Mauricio  y a Kevin por la guia que nos han entregado y la ayuda prestada. " +
            "\n Esta aplicacion va dedicada a mi Pequeña Aeris quien ha sido la fuerza para continuar " +
            "y a mis amigos caidos en batalla Francisco Iturra y Gustavo Puga, Grandes compañeros de juego y que se adelantaron para preparan la mesa para nuestras partidas eternas "

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentAgradecimientosBinding.inflate(layoutInflater)
    binding.tvAgradecimiento.text=agradecimiento
        return binding.root
    }

}