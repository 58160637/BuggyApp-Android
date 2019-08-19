package scb.academy.jinglebell.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Property
import kotlinx.android.synthetic.main.activity_greet.*
import kotlinx.android.synthetic.main.fragment_profile.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.extension.showToast
import scb.academy.jinglebell.model.Song

class GreetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)

        val name: String = intent?.getStringExtra("name") as String
        nameProfile.text= name


    }
}


