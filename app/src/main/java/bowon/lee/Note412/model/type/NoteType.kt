package bowon.lee.note412.model.type

import androidx.room.TypeConverter

/**
 * 메모의 종류
 *
 * <pre>
 *     기본적으로 다르게 처리해야 할 메모의 타입
 * </pre>
 * */
enum class NoteType(
    //기본값은 일반 타입으로 지정
    val value: Int = 0
){

    NORMAL(0),

    PRIVATE(1);

    fun getInt() : Int{
        return value
    }

}

class NoteTypeConverter(){
    @TypeConverter
    fun typeToInt(type:NoteType):Int{
        return type.getInt()
    }
    @TypeConverter
    fun intToType(int: Int) : NoteType{
        return NoteType.valueOf(int.toString())
    }

}