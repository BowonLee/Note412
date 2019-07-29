package bowon.lee.note412.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import bowon.lee.note412.model.vo.Note

/**
 * Note 타입 Dao
 * */
@Dao
interface NoteDao : BaseDao<Note>{

    fun getNoteById():LiveData<Note>
}