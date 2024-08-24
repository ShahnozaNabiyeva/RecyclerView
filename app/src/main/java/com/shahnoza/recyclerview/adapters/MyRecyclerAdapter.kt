

package com.shahnoza.myrecylcerview.adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shahnoza.myrecylcerview.modul.MyContact
import com.shahnoza.recyclerview.R


class MyRecyclerAdapter(var context:Context, var contactList: ArrayList<MyContact>, var myClick: MyClick):RecyclerView.Adapter<MyRecyclerAdapter.VH>() {

    inner class VH(var itemView:View):RecyclerView.ViewHolder(itemView){
        fun onBind(myContact: MyContact){
            var contactName = itemView.findViewById<TextView>(R.id.itemTextViewContactName)
            var contactNumber = itemView.findViewById<TextView>(R.id.itemTextViewContactNumber)
            var call = itemView.findViewById<ImageView>(R.id.itemImageViewCall)
            contactName.text = myContact.name
            contactNumber.text = myContact.number
            call.setOnClickListener {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.setData(Uri.parse("tel:${myContact.number}"))
                context.startActivity(intent)
            }

            itemView.setOnClickListener {
                myClick.onClick(myContact)
            }
            anim(itemView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent,false)
        val vh = VH(itemView)
        return vh
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val myContact = contactList[position]
        holder.onBind(myContact)
    }
    fun anim(view:View){
        val animation = AnimationUtils.loadAnimation(context,R.anim.rotate)
        view.startAnimation(animation)
    }
    interface MyClick{
        fun onClick(myContact: MyContact)
    }

}