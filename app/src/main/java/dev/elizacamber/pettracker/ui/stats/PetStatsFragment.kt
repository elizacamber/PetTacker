package dev.elizacamber.pettracker.ui.stats

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import dev.elizacamber.pettracker.R

class PetStatsFragment : Fragment() {

    companion object {
        fun newInstance() = PetStatsFragment()
    }

    private lateinit var viewModel: PetStatsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.pet_stats_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PetStatsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
