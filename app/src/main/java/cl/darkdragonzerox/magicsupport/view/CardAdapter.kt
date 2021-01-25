package cl.darkdragonzerox.magicsupport.view

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import cl.darkdragonzerox.magicsupport.data.MagicCards
import cl.darkdragonzerox.magicsupport.databinding.ItemListCardBinding
import coil.load

class CardAdapter(val listener:OnItemClickListener): RecyclerView.Adapter<CardVH>() {
    private val cardList= mutableListOf<MagicCards>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardVH {
        val binding =ItemListCardBinding.inflate(LayoutInflater.from(parent.context))
        return CardVH(binding)
    }

    override fun onBindViewHolder(holder: CardVH, position: Int) {
        val card=cardList[position]
        holder.itemView.setOnClickListener{
            listener.onClick(card.id)
        }
        holder.bind(card)
    }

    override fun getItemCount(): Int {
       return cardList.size
    }
    fun updateCard(magicList: List<MagicCards>){
        cardList.clear()
        cardList.addAll(magicList)
        notifyDataSetChanged()
        Log.d("update","$magicList")
    }
}

class CardVH (private val binding: ItemListCardBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(magicCards: MagicCards){
        binding.tvName.text=magicCards.name
        binding.tvManaCost.text=magicCards.manaCost
        binding.tvTipo.text=magicCards.type
        binding.tvSet.text=magicCards.setName
        binding.ivCard.load(magicCards.imageUrl)
    }

}
