package app.rigs.emaily

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = EmailRecyclerViewAdapter()
        recyclerViewEmails.adapter = adapter
        val fakeEmails = listOf(
            Email("Rebecca Franks", "Hello Rebecca", "I would like to invite you to Disneyland...", "10.40AM", "https://source.unsplash.com/100x100/?lego"),
            Email("Bob Free", "DisneyLand 2019", "Have you seen disney land", "11:23AM", "https://source.unsplash.com/100x100/?profile+picture"),
            Email("Becky Hunde", "Lunch today?", "Let's meet at 12:00 for Taco's 🌮?", "11:23AM", "https://source.unsplash.com/100x100/?architecture"),
            Email("Brain Game", "Brain Game 🔥", "Try this app, it really is awesome! 🎉", "11:40AM", "https://source.unsplash.com/100x100/?flowers"),
            Email("Bob Free", "DisneyLand 2019", "Have you seen disney land", "11:23AM", "https://source.unsplash.com/100x100/?people"))
        adapter.submitList(fakeEmails)

        Glide.with(imageViewProfilePic)
            .setDefaultRequestOptions(RequestOptions()
                .circleCrop())
            .load("https://source.unsplash.com/100x100/?candy")
            .into(imageViewProfilePic)
    }
}
