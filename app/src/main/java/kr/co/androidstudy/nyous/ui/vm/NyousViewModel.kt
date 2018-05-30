package kr.co.androidstudy.nyous.ui.vm

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import kr.co.androidstudy.nyous.model.NyousResponse
import kr.co.androidstudy.nyous.repository.NyousRepository

/**
 * Created by leejongjin on 2018. 5. 29..
 */
class NyousViewModel(private val repository: NyousRepository) : ViewModel(), LifecycleObserver {

//    val headlineNyous : MutableLiveData<NyousResponse> = MutableLiveData()
//
//    val categoryHeadlineNyous : MutableLiveData<NyousResponse> = MutableLiveData()
//    //    "614eb38392ca4a0ab90477bb19ac5433", "kr"
//
//    val headlineResult = repository.headlineNyous( "614eb38392ca4a0ab90477bb19ac5433", "kr")
//
//
//    val categoryHeadlineResult = repository.categoryHeadlineNyous("614eb38392ca4a0ab90477bb19ac5433", "kr" , "health")
}