package cl.darkdragonzerox.magicsupport.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MagicDao{
    @Insert(onConflict= OnConflictStrategy.REPLACE)
    suspend fun LoadAllCards(cardList:List<MagicCards>)

    @Query("SELECT * FROM magiccards")
    fun getMagicCards(): LiveData<List<MagicCards>>

    @Query("SELECT * FROM magiccards WHERE id=:idCode")
    fun getCardDetail(idCode:String): LiveData<MagicCards>

}

@Database(entities = [MagicCards::class],version = 1)
@TypeConverters(Converters::class)
abstract class MagicDatabase : RoomDatabase(){
    abstract fun MagicDao():MagicDao
}
class MagicApplication : Application(){
    companion object{
        var magicDatabase: MagicDatabase? =null
    }

    override fun onCreate() {
        super.onCreate()
        magicDatabase=Room
            .databaseBuilder(this,MagicDatabase::class.java,"db_MagicCards").build()
    }
}