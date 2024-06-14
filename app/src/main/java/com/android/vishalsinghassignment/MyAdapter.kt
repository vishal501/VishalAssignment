package com.android.vishalsinghassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.vishalsinghassignment.databinding.ItemProfileBinding


class MyAdapter(private val profileList: ArrayList<Profile>) :
    RecyclerView.Adapter<MyAdapter.ProfileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val binding = ItemProfileBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val profile = profileList[position]
        with(holder.binding) {
            profileInitials.text = profile.initials
            profileName.text = profile.name
            profileLocation.text = profile.location
            profileDistance.text = profile.distance
            profileScore.progress = profile.score
            profileMessage.text = profile.message
            profileExperience.text = profile.experience

            when (profile.fragName) {
                "1" -> contactDetails.visibility = View.GONE
                "2" -> {
                    contactDetails.visibility = View.VISIBLE
                    icLocation.visibility = View.GONE
                    iconset.visibility = View.GONE
                }
                "3" -> {
                    contactDetails.visibility = View.VISIBLE
                    iconset.visibility = View.GONE
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return profileList.size
    }

    inner class ProfileViewHolder(val binding: ItemProfileBinding) : RecyclerView.ViewHolder(binding.root)

}