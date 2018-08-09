package app.rigs.emaily

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_email.view.*

class EmailRecyclerViewAdapter(): ListAdapter<Email, EmailViewHolder>(DIFFER) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = getItem(position)
        holder.bind(email)
    }
    companion object {
        val DIFFER = object : DiffUtil.ItemCallback<Email>() {
            override fun areItemsTheSame(oldItem: Email, newItem: Email): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Email, newItem: Email): Boolean {
                return oldItem == newItem
            }
        }
    }
}

class EmailViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(email: Email){
        view.textViewEmailFromName.text = email.from
        view.textViewEmailTime.text = email.time
        view.textViewEmailTextExtract.text = email.content
        view.textViewEmailSubject.text = email.subject
    }
}