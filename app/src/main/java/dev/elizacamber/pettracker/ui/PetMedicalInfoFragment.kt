package dev.elizacamber.pettracker.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import dev.elizacamber.pettracker.R

class PetMedicalInfoFragment : Fragment() {

    companion object {
        fun newInstance() = PetMedicalInfoFragment()
    }

    private lateinit var viewModel: PetMedicalInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.pet_medical_info_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PetMedicalInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
