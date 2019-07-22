package bowon.lee.note412.view.view_util

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * 레이아웃을 인자로 받아 데이터 바인딩을 실행해준다
 * */

abstract class BaseFragment<T:ViewDataBinding> :Fragment(){

    lateinit var viewBinder : T

    abstract val layoutResource : Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewBinder = DataBindingUtil.inflate(inflater,layoutResource,container,false)

        return super.onCreateView(inflater, container, savedInstanceState)
    }


}