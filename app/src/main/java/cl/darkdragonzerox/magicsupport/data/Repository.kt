package cl.darkdragonzerox.magicsupport.data

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
                }


            }
            false -> {

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