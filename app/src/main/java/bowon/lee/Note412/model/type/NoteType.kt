package bowon.lee.note412.model.type

/**
 * 메모의 종류
 *
 * <pre>
 *     기본적으로 다르게 처리해야 할 메모의 타입
 * </pre>
 * */
enum class NoteType(
    //기본값은 일반 타입으로 지정
    val nomal: Int = 0
){

    NORMAL(0),

    PRIVATE(1)
}