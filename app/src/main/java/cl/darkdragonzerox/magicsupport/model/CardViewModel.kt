package cl.darkdragonzerox.magicsupport.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.darkdragonzerox.magicsupport.data.MagicCards
import cl.darkdragonzerox.magicsupport.data.Repository
import kotlinx.coroutines.launch

class CardViewModel : ViewModel() {
    private val repository=Repository()
    val cardlist =repository.magicList

    init{
        viewModelScope.launch { repository.getCardsFromApi() }
    }
    fun getCardVm(): LiveData<List<MagicCards>>{
        return repository.loadCard()
    }

    fun getCardDetail(idCode:String): LiveData<MagicCards>
    {
        return repository.getCard(idCode)
    }
}