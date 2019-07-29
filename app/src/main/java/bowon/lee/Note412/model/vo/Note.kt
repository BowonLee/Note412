package bowon.lee.note412.model.vo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import bowon.lee.note412.model.type.NoteType
import java.util.*


/**
 * 저장되는 매모의 타입
 *
 * <pre>
 *     우선은 간단하게 텍스트 타입만 적용
 *     이미지의 혼용은 이후에 생각
 * </pre>
 * */

@Entity(tableName = "note")
data class Note(
    // 이미지의 타입 - 기본 타입은 일반 타입으로 지정
    val type :NoteType = NoteType.NORMAL,

    // 노트의 제목 - 기본 타입은 우선 공란으로 지정
    var title:String = "",

    // 노트의 전체 내용 - 우선은 스트링 타입으로 지정한다.  이미지 혼용에 따라 타입이 변경될 수 있음
    var content :String = "",

    //노트가 마지막으로 수정 된 시각 
    var date:String,

    // 메모의 카테고리 - 색상으로 카테고리를 지정하도록 한다.
    var colorCategory:String,

    // UUID 생성 단계에서 단 한번 만들어진다.
    val id : String
){
    //rowID
    @PrimaryKey @ColumnInfo(name = "id")
    var rowid:Int = 0

}