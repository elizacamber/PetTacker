package dev.elizacamber.pettracker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        onNewIntent(intent)
    }

    override fun onNewIntent(intent: Intent) {
        val action = intent.action
        val data = intent.dataString
        if (Intent.ACTION_VIEW == action && data != null) {
            val destination = data.substring(data.lastIndexOf("/"))
            if (destination == "/details") {
                Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_petDetailsFragment)
            }
        }
    }

}
