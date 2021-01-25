package cl.darkdragonzerox.magicsupport.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {
        private const val BASE_URL = "http://api.magicthegathering.io/"
        fun retrofitCliente(): MagicApi {
            val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
                GsonConverterFactory.create()).build()

            return retrofit.create(MagicApi::class.java)
        }
    }
}