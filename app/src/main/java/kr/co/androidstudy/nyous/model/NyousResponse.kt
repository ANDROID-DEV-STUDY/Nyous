package kr.co.androidstudy.nyous.model

/**
 * Created by leejongjin on 2018. 5. 30..
 */
data class NyousResponse(

        val status : String,
        val totalResults : Int,
        val articles : List <NyousPost>

)

