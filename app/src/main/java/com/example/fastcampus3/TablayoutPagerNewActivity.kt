package com.example.fastcampus3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class TablayoutPagerNewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout_pager_new)
        val tablayout = findViewById<TabLayout>(R.id.tablayout)
        val viewPager = findViewById<ViewPager2>(R.id.pager)
        //탭 레이아웃에 탭을 추가하는 방법
        tablayout.addTab(tablayout.newTab().setText("1번쨰"))
        tablayout.addTab(tablayout.newTab().setText("2번쨰"))
        tablayout.addTab(tablayout.newTab().setText("3번쨰"))
        //pager에 adapter를 장착하는방법
        viewPager.adapter = FragmentAdapter(this, 3)
        tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.setCurrentItem(tab!!.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }
}

class FragmentAdapter(
    fragmentActivity: FragmentActivity,
    val tabCount: Int
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return tabCount
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return FragmentFirst()
            }
            1 -> {
                return FragmentFirst()
            }
            else -> {
                return FragmentFirst()
            }
        }
    }
}