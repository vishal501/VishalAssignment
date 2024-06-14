package com.android.vishalsinghassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.vishalsinghassignment.databinding.FragmentBusinessesBinding
import com.android.vishalsinghassignment.databinding.FragmentServicesBinding


class ServicesFragment : Fragment() {
    private val  profileAdapter by lazy {
        MyAdapter(profileList)
    }
    private var profileList = ArrayList<Profile>()

    private lateinit var binding: FragmentServicesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentServicesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.setLayoutManager(LinearLayoutManager(context))
        binding.recyclerView.adapter = profileAdapter

        profileList.add(
            Profile(
                "PD", "Piyushhh Dravyakarrr", "Noida | Testing", "Within 500-600 m", 50,
                "Hi community! I am open to new connections 😊", "I have 1 year experience...","2"
            )
        )

        profileList.add(
            Profile(
                "VS", "Vishal Singh", "Delhi | Student", "Within 600-700 m", 18,
                "Hi community! I am open to new connections 😊", "I have 1 year experience...","2"
            )
        )

        profileList.add(
            Profile(
                "AD", "Abhishek Dravyakarrr", "Noida | Testing", "Within 500-600 m", 50,
                "Hi community! I am open to new connections 😊", "I have 1 year experience...","2"
            )
        )

        profileList.add(
            Profile(
                "RT", "Rohit Taneja", "Delhi | Student", "Within 600-700 m", 18,
                "Hi community! I am open to new connections 😊", "I have 1 year experience...","2"
            )
        )

    }
}