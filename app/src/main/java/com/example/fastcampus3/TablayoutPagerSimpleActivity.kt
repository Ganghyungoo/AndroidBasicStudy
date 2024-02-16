package com.example.fastcampus3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TablayoutPagerSimpleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout_pager_simple)
        val viewPager=findViewById<ViewPager>(R.id.pager)
        val tablayout=findViewById<TabLayout>(R.id.tablayout)

        tablayout.addTab(tablayout.newTab().setText("1번쨰"))
        tablayout.addTab(tablayout.newTab().setText("2번쨰"))
        tablayout.addTab(tablayout.newTab().setText("3번쨰"))

        viewPager.adapter=ViewPagerAdapter(LayoutInflater.from(this),3)

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
class ViewPagerAdapter(
    val layoutInflater: LayoutInflater,
    val tabCount:Int
):PagerAdapter(){
    override fun getCount(): Int {
        return tabCount
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view===`object` as View
        //== 값을 비교한다
        //=== 주소값을 비교한다
        //a=1,b=1 -> a==b(True) a === b(True,False)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object`as View)

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        when(position){
            0->{
                val view=layoutInflater.inflate(R.layout.first_fragment,container,false)
                container.addView(view)
                return view
            }
            1->{
                val view=layoutInflater.inflate(R.layout.activity_homework1,container,false)
                container.addView(view)
                return view
            }
            else->{
                val view=layoutInflater.inflate(R.layout.homework,container,false)
                container.addView(view)
                return view
            }
        }
    }
}