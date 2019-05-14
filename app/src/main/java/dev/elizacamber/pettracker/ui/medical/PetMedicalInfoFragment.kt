package dev.elizacamber.pettracker.ui.medical

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
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
