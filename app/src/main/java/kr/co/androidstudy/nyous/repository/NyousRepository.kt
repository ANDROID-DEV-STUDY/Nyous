package kr.co.androidstudy.nyous.repository

import android.arch.lifecycle.LiveData
import kr.co.androidstudy.nyous.model.NyousResponse

/**
 * Created by leejongjin on 2018. 5. 30..
 */

interface NyousRepository {
    // 일반 헤드라인 뉴우스
    fun headlineNyous(apiKey: String, country: String) : LiveData<NyousResponse>

    // 카테고리 설정 헤드라인 뉴우스
    fun categoryHeadlineNyous(apiKey: String, country: String, category: String) : LiveData<NyousResponse>
}