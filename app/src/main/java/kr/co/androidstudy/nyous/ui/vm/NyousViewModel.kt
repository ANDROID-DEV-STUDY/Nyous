package kr.co.androidstudy.nyous.ui.vm

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import kr.co.androidstudy.nyous.model.NyousResponse
import kr.co.androidstudy.nyous.repository.NyousRepository

/**
 * Created by leejongjin on 2018. 5. 29..
 */
class NyousViewModel(private val repository: NyousRepository) : ViewModel() {

    private val headlineNyous : MutableLiveData<NyousResponse> = MutableLiveData()

    private val categoryHeadlineNyous : MutableLiveData<NyousResponse> = MutableLiveData()

}