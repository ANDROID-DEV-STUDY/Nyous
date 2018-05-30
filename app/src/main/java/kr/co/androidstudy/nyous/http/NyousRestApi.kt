package kr.co.androidstudy.nyous.http

import kr.co.androidstudy.nyous.model.NyousResponse
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by leejongjin on 2018. 5. 29..
 */

interface NyousRestApi {
    companion object {
        //        https://newsapi.org/v2/everything?apiKey=614eb38392ca4a0ab90477bb19ac5433
        private const val BASE_URL = "https://newsapi.org/"

        fun create(httpUrl: HttpUrl): NyousRestApi {
            return Retrofit.Builder().baseUrl(httpUrl).addConverterFactory(GsonConverterFactory.create()).build().create(NyousRestApi::class.java)
        }
    }

    @GET("/v2/top-headlines")
    fun getTopHeadlines(
            @Query("apiKey") apiKey: String,
            @Query("country") country: String)
            :Call<NyousResponse>
}