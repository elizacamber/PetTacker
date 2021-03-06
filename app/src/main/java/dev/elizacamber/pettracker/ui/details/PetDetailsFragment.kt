package dev.elizacamber.pettracker.ui.details

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import dev.elizacamber.pettracker.R

class PetDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = PetDetailsFragment()
    }

    private lateinit var viewModel: PetDetailsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.pet_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PetDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
