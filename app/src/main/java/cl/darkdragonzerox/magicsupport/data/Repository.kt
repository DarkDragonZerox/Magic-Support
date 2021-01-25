package cl.darkdragonzerox.magicsupport.data

import android.util.Log
import androidx.lifecycle.LiveData

class Repository {
    private val magicDatabase =MagicApplication.magicDatabase!!
    val magicList= magicDatabase.MagicDao().getMagicCards()
    suspend fun getCardsFromApi(){
        val response =RetrofitClient.retrofitCliente().getMagicCards()
        when(response.isSuccessful){
            true ->{
                response.body()?.let {
                    magicDatabase.MagicDao().LoadAllCards(it)
                    Log.d("CARGA Api","${it.size}")
                }


            }
            false -> {
                    Log.d("carga", "no carga")
            }
        }
    }
    fun getCard(idCode :String): LiveData<MagicCards>{
        return  magicDatabase.MagicDao().getCardDetail(idCode)
    }

    fun loadCard():LiveData<List<MagicCards>>{
        return magicDatabase.MagicDao().getMagicCards()
    }

}