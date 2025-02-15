//package com.example.final_project.adapters
//
//import android.content.Intent
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.example.final_project.databinding.ItemAreaBasedTourismBinding
//import com.example.final_project.models.DetailTourism
//import com.example.final_project.ui.activities.DetailTourismActivity
//
//class AreaBasedTourismAdapter(private val detail_tourism: ArrayList<DetailTourism>):RecyclerView.Adapter<AreaBasedTourismAdapter.AreaBasedTourismViewHolder>() {
//    inner class AreaBasedTourismViewHolder(val binding: ItemAreaBasedTourismBinding): RecyclerView.ViewHolder(binding.root)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AreaBasedTourismViewHolder {
//        val binding = ItemAreaBasedTourismBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return AreaBasedTourismViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: AreaBasedTourismViewHolder, position: Int) {
//        with(holder) {
//            with(detail_tourism[position]) {
//                Glide.with(itemView.context).load(this.tourismImage).into(binding.ivTourismPicture)
//                binding.tvAbTourismName.text = this.tourismName
//                binding.chipTourismType.text = this.tourismType
//                binding.tvAbTourismLocation.text = this.tourismAddress
//                binding.tvAbRating.text = this.tourismRating.toString()
//
//                holder.itemView.setOnClickListener {
//                    val intent = Intent(it.context, DetailTourismActivity::class.java)
//
////                    intent.putExtra("tourism_detail", DetailTourismObjects.detail_tourism_objects[position])
//                    it.context.startActivity(intent)
//                }
//            }
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return detail_tourism.size
//    }
//
//}