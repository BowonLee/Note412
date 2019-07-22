package bowon.lee.note412.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bowon.lee.note412.R
import bowon.lee.note412.databinding.FragmentMemoWriteBinding
import bowon.lee.note412.view.view_util.BaseFragment


/**
 * 메모 작성 및 열람을 위한 프레그먼트
 * 기존 메모를 불러온다면 열람 모드로 작동 - 버튼 및 텍스트 필드 저장 불가
 *
 *
 *
 * */
class WriteMemoFragment(override val layoutResource: Int = R.layout.fragment_memo_write) : BaseFragment<FragmentMemoWriteBinding>(){

    /**
     * 개발중 메모
     * TODO 우선 기본적으로 텍스트 필드는 비활성화 화면을 1회이상 터치할 경우 편집모드로 전환 텍스트 - 사진 - 손글씨 순서로 구현
     * */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    fun toggleEdit(){
        //TODO 메모작성 토글
    }

    fun saveMemo(){
        //TODO 메모 저장
    }
    fun setCategory(){
        //TODO 카테고리 지정
    }


}