package app.rigs.emaily

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = EmailRecyclerViewAdapter()
        recyclerViewEmails.adapter = adapter

        val fakeEmails = listOf(
            Email("Rebecca Franks", "Hello Rebecca", "I would like to invite you to Disneyland...", "10.40AM", ""),
            Email("Bob Free", "DisneyLand 2019", "Have you seen disney land", "11:23AM", ""),
            Email("Becky Hunde", "Lunch today?", "Let's meet at 12:00 for Taco's 🌮?", "11:23AM", ""),
            Email("Brain Game", "Brain Game 🔥", "Try this app, it really is awesome! 🎉", "11:40AM", ""),
            Email("Bob Free", "DisneyLand 2019", "Have you seen disney land", "11:23AM", ""))
        adapter.submitList(fakeEmails)
    }
}
