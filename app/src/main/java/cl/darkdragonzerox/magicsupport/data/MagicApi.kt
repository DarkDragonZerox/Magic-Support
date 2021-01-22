package cl.darkdragonzerox.magicsupport.data

import retrofit2.Response
import retrofit2.http.GET

interface MagicApi {
    @GET("cards?page=1")
    suspend fun getMagicCards(): Response<List<MagicCards>>
}
