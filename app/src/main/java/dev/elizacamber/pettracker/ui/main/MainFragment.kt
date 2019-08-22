package dev.elizacamber.pettracker.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import dev.elizacamber.pettracker.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

        cv_details.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_petDetailsFragment))
        cv_medical.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_petMedicalInfoFragment))
        cv_stats.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_petStatsFragment))
        cv_reminders.setOnClickListener (Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_remindersFragment))
    }

}
