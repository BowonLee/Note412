package bowon.lee.note412.model.vo

import bowon.lee.note412.model.type.NoteType


/**
 * 저장되는 매모의 타입
 *
 * <pre>
 *     우선은 간단하게 텍스트 타입만 적용
 *     이미지의 혼용은 이후에 생각
 * </pre>
 * */
data class MemoModel(
    val type :NoteType = NoteType.NORMAL,
    var title:String = "",
    var content :String = ""
)