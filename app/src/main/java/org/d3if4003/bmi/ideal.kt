package org.d3if4003.bmi


import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4003.bmi.databinding.ActivityMainBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 *
 */
class ideal : Fragment() {

    //private lateinit var databinding : DataBindingUtil

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val databinding = DataBindingUtil.inflate<ActivityMainBinding>(inflater, R.layout.fragment_ideal,container,false)

        return inflater.inflate(R.layout.fragment_ideal, container, false)
    }


}
