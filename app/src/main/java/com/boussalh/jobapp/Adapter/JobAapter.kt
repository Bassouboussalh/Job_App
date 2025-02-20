package com.boussalh.jobapp.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.boussalh.jobapp.Activity.DetailJobActivity
import com.boussalh.jobapp.Model.JobModel
import com.boussalh.jobapp.databinding.ViewholderJobBinding
import com.bumptech.glide.Glide

class JobAapter(private val items: List<JobModel>) :
    RecyclerView.Adapter<JobAapter.Viewholder>() {

    private lateinit var context: Context

    inner class Viewholder(val binding: ViewholderJobBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobAapter.Viewholder {
        context = parent.context
        val binding =
            ViewholderJobBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: JobAapter.Viewholder, position: Int) {
        val item = items[position]
        holder.binding.titleTxt.text = item.title
        holder.binding.companyTxt.text = item.company
        holder.binding.locationTxt.text = item.location
        holder.binding.timeTxt.text = item.time
        holder.binding.modelTxt.text = item.model
        holder.binding.levelTxt.text = item.level
        holder.binding.salaryTxt.text = item.salary

        val drawableResourceId = holder.itemView.resources
            .getIdentifier(item.picUrl,"drawable",holder.itemView.context.packageName)

        Glide.with(holder.itemView.context)
            .load(drawableResourceId)
            .into(holder.binding.pic)

        holder.itemView.setOnClickListener {
            val intent = Intent(context,DetailJobActivity::class.java)
            intent.putExtra("object",item)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = items.size
}