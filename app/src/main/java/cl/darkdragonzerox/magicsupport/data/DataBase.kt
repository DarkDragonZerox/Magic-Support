package cl.darkdragonzerox.magicsupport.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MagigDao{
    @Insert(onConflict= OnConflictStrategy.REPLACE)
    suspend fun LoadAllCards(cardList:List<MagicCards>)

    @Query("SELECT * FROM magiccards")
    fun getMagicCards(): LiveData<List<MagicCards>>

    @Query("SELECT * FROM magiccards WHERE id=:idCode")
    fun getCardDetail(idCode:String): LiveData<MagicCards>

}

@Database(entities = [MagicCards::class], version = 1)
@TypeConverters(Converters::class)
