package cl.darkdragonzerox.magicsupport.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "magiccards")
data class MagicCards(val name:String,
                      val manaCost:String?,
                      val cmc:Int,
                      val colors :List<String>,
                      val colorIdentity :List<String>,
                      val type:String,
                      val supertypes:List<String>,
                      val types:List<String>,
                      val subtypes:List<String>,
                      val rarity:String,
                      val set:String,
                      val setName:String,
                      val text:String?,
                      val artist:String,
                      val number:String,
                      val layout:String,
                     //val multiverseid:Int?,
                      val imageUrl:String?,
                     // val rulings:List<Rulings>?,
                   //   @Embedded(prefix ="foreing_ ") val foreignNames: ForeignNames?,
                      val printings:List<String>,
                      val originalText:String?,
                      val originalType:String?,
                     // @Embedded (prefix="legal_")val legalities:Legalities,
                      @PrimaryKey val id :String
                      )
//data class Rulings(val date:String,val text:String)
/*data class ForeignNames (val name:String,
                         val text: String,
                         val flavor:String?,
                         val imageUrl:String,
                         val language:String,
                         val multiverseid:Int )*/
//data class Legalities(val format:String, val legality:String)
data class Recibidor(val cards:List<MagicCards> )
