package bowon.lee.note412.view.main_note

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import bowon.lee.note412.databinding.ListItemMainBinding

class ViewHolderMainNote : RecyclerView.ViewHolder {

    private val _itemView : ListItemMainBinding

    constructor(itemView : ListItemMainBinding): super(itemView.root){
        _itemView = itemView
    }

    fun bind(){

    }
}