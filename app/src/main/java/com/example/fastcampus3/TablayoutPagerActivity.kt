package com.example.fastcampus3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TablayoutPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout_pager)
        val tablayout=findViewById<TabLayout>(R.id.tablayout)
        val viewPager=findViewById<ViewPager>(R.id.pager)
        //탭 레이아웃에 탭을 추가하는 방법
        tablayout.addTab(tablayout.newTab().setText("1번쨰"))
        tablayout.addTab(tablayout.newTab().setText("2번쨰"))
        tablayout.addTab(tablayout.newTab().setText("3번쨰"))
        //pager에 adapter를 장착하는방법
        viewPager.adapter=FragmentPagerAdapter(supportFragmentManager,3)
        tablayout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
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
class FragmentPagerAdapter(
    fragmentManager: FragmentManager,
      val tabCount:Int
):FragmentStatePagerAdapter(fragmentManager){
    override fun getCount(): Int {
        return tabCount
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0->{return FragmentFirst()}
            1->{return FragmentFirst()}
            else->{return FragmentFirst()}
        }
    }
}
