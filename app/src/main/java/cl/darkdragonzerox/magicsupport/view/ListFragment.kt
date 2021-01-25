package cl.darkdragonzerox.magicsupport.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import cl.darkdragonzerox.magicsupport.R
import cl.darkdragonzerox.magicsupport.databinding.FragmentListBinding
import cl.darkdragonzerox.magicsupport.model.CardViewModel


class ListFragment : Fragment(), OnItemClickListener {
    private lateinit var binding: FragmentListBinding
    private val viewModel : CardViewModel by viewModels()



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        binding = FragmentListBinding.inflate(layoutInflater)
        val adapter= CardAdapter(this)
        val recycler=binding.rvCard
        recycler.adapter=adapter
        recycler.layoutManager= LinearLayoutManager(context)

        viewModel.cardlist.observe(viewLifecycleOwner, {cardlist->cardlist?.let {
            adapter.updateCard(it)

            Log.d("listener","listener ${it.size}")
        }

        })

        Log.d("oncreate ", "prueba on create")
        return binding.root
    }

    override fun onClick(id: String) {
      /*  activity?.supportFragmentManager?.
        beginTransaction()?.
        replace(R.id.main_container,DetailFragment(id))?.
        addToBackStack("back")?.
        commit()
*/
    }




}

