package com.example.criminalintent

import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.criminalintent.databinding.ListItemCrimeBinding
class CrimeHolder(
    private val binding: ListItemCrimeBinding
) : RecyclerView.ViewHolder(binding.root){
    fun bind(crime: crime){
        binding.crimeTitle.text = crime.title
        //DateFormat Challenge
        //binding.crimeDate.text = crime.date.toString()//old date format
        binding.crimeDate.text = DateFormat.format("EEE dd MMM yyyy, hh:mm", crime.date)

        binding.root.setOnClickListener {
            Toast.makeText(
                binding.root.context,
                "${crime.title} clicked!",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}
class CrimeListAdapter(private val crimes: List<crime>) : RecyclerView.Adapter<CrimeHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrimeHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemCrimeBinding.inflate(inflater, parent, false)
        return CrimeHolder(binding)
    }

    override fun onBindViewHolder(holder: CrimeHolder, position: Int) {
        val crime = crimes[position]
        holder.bind(crime)

    }
    override fun getItemCount() = crimes.size
}