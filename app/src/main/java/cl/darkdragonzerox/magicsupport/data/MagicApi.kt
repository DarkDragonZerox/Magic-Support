package cl.darkdragonzerox.magicsupport.data

import retrofit2.Response
import retrofit2.http.GET

interface MagicApi {
    @GET("/v1/cards")
    suspend fun getMagicCards(): Response<List<MagicCards>>
}
