package cl.darkdragonzerox.magicsupport.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.darkdragonzerox.magicsupport.data.MagicCards
import cl.darkdragonzerox.magicsupport.data.Repository
import kotlinx.coroutines.launch



class CardViewModel : ViewModel() {
    private val repository=Repository()
    val cardlist =repository.magicList
    val vidas = MutableLiveData<Int>(20)
    val coin = MutableLiveData<String>()
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
    fun aumentar() {
        vidas.value = vidas.value?.plus(1)

    }

    fun disminuir(){
        vidas.value= vidas.value?.minus(1)

    }
    fun reset(){
        vidas.value=20

    }
    fun moneda(){
        val rndm=(0..1).random()
        if(rndm==0){
          coin.value="Cara"
        }
        else{
          coin.value="Sello"
        }
    }
}