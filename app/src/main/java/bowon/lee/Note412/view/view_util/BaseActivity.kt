package bowon.lee.Note412.view.view_util

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * 레이아웃을 인자로 받아 데이터 바인딩을 실행해준다
 * */

abstract class BaseActivity<T:ViewDataBinding> :Activity(){

    lateinit var viewBinder :T

    abstract val layoutResource: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinder = DataBindingUtil.setContentView(this, layoutResource)
    }

}