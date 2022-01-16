package com.example.rv_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rv_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val list = arrayListOf<ItemModel>()
        list.add(ItemModel(R.drawable.ic_time,"Time 1"))
        list.add(ItemModel(R.drawable.ic_android,"Android 1"))
        list.add(ItemModel(R.drawable.ic_time,"Time 2"))
        list.add(ItemModel(R.drawable.ic_android,"Android 2"))
        list.add(ItemModel(R.drawable.ic_time,"Time 3"))
        list.add(ItemModel(R.drawable.ic_android,"Android 3"))
        list.add(ItemModel(R.drawable.ic_time,"Time 4"))
        list.add(ItemModel(R.drawable.ic_android,"Android 4"))

        viewBinding.rv.layoutManager = LinearLayoutManager(this)
        viewBinding.rv.adapter = RVAdapter(list)

    }
}
