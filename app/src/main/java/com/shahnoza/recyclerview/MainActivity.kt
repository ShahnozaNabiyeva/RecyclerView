package com.shahnoza.myrecylcerview

import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import com.shahnoza.myrecylcerview.adapters.MyRecyclerAdapter
import com.shahnoza.myrecylcerview.modul.MyContact
import com.shahnoza.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var list:ArrayList<MyContact>
    lateinit var myRecyclerAdapter: MyRecyclerAdapter
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()
        list.add(MyContact("Fragrant","+998907769796"))
        list.add(MyContact("Bobur","+998906665544"))
        list.add(MyContact("Dior","+998919546754"))
        list.add(MyContact("Sardor sinfdosh","+998995645333"))
        list.add(MyContact("Iqbol","+998935432134"))
        list.add(MyContact("Bobur 2","+998906665543"))
        list.add(MyContact("Sherzod","+998906666754"))
        list.add(MyContact("Ozodbek","+998996365954"))
        list.add(MyContact("Aziz","+998935433321"))
        list.add(MyContact("Hurshid","+998998763422"))
        list.add(MyContact("Aziz 2","+998907779564"))
        list.add(MyContact("Zohir","+998957669544"))
        list.add(MyContact("Farhod","+998916768994"))
        list.add(MyContact("Isroil","+998919675344"))
        list.add(MyContact("Otabek","+998917365544"))
        list.add(MyContact("Dominic","+998907769796"))
        list.add(MyContact("Bobur","+998906665544"))
        list.add(MyContact("Dior","+998919546754"))
        list.add(MyContact("Sardor sinfdosh","+998995645333"))
        list.add(MyContact("Iqbol","+998935432134"))
        list.add(MyContact("Bobur 2","+998906665543"))
        list.add(MyContact("Sherzod","+998906666754"))
        list.add(MyContact("Ozodbek","+998996365954"))
        list.add(MyContact("Aziz","+998935433321"))
        list.add(MyContact("Hurshid","+998998763422"))
        list.add(MyContact("Aziz 2","+998907779564"))
        list.add(MyContact("Zohir","+998957669544"))
        list.add(MyContact("Farhod","+998916768994"))
        list.add(MyContact("Isroil","+998919675344"))
        list.add(MyContact("Otabek","+998917365544"))

        myRecyclerAdapter = MyRecyclerAdapter(this,list,object :MyRecyclerAdapter.MyClick{
            override fun onClick(myContact: MyContact) {
                Toast.makeText(this@MainActivity, "Ishlayapti..!", Toast.LENGTH_SHORT).show()
            }
        })

        binding.rv.adapter = myRecyclerAdapter

    }
}