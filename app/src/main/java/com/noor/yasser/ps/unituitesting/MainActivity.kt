package com.noor.yasser.ps.unituitesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.noor.yasser.ps.unituitesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), GenericAdapter.OnListItemViewClickListener<User> {
    private val mBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val mAdapter by lazy {
        GenericAdapter<User>(R.layout.recycler_view_item, BR.user, this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)

        mAdapter.data = mData

        mBinding.rcData.adapter = mAdapter



    }

    override fun onClickItem(itemViewModel: User, type: Int) {
        Toast.makeText(
            applicationContext,
            "Click from test ${itemViewModel.name}",
            Toast.LENGTH_LONG
        ).show()
    }
}