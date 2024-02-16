package com.example.fastcampus3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerHomework : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_homework)

        var chatList:MutableList<Chat> = mutableListOf()

        for(i in 0..3){
            chatList.add(Chat("안녕하세요",true))
            chatList.add(Chat("네 안녕하세요",false))
            chatList.add(Chat("반가워요",true))
            chatList.add(Chat("네 반갑습니다",false))
            chatList.add(Chat("조심히 들어가세요",true))
            chatList.add(Chat("네 그쪽도요",false))
        }
        with(findViewById<RecyclerView>(R.id.chatRecyclerView)){
            this.layoutManager=LinearLayoutManager(this@RecyclerHomework)
            this.adapter=ChatRecyclerViewAdapter(
                chatList=chatList,
                inflater = LayoutInflater.from(this@RecyclerHomework)
                )
        }

   }
}
class ChatRecyclerViewAdapter(
    val chatList:MutableList<Chat>,
    val inflater:LayoutInflater
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder1(itemView:View):RecyclerView.ViewHolder(itemView){
        val RightTextView:TextView
        init {
            RightTextView=itemView.findViewById(R.id.right_text)
        }
    }
    class ViewHolder2(itemView:View):RecyclerView.ViewHolder(itemView){
        val lefTextView:TextView
        init {
            lefTextView=itemView.findViewById(R.id.left_text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var viewtype:View
        when(viewType){
            0->{
                val view1=inflater.inflate(R.layout.right_chat,parent,false)
                viewtype=view1
                return ViewHolder1(viewtype)
            }
            1-> {
                val view2 = inflater.inflate(R.layout.left_chat, parent, false)
                viewtype=view2
                return ViewHolder2(viewtype)
            }
        }
        val view1=inflater.inflate(R.layout.right_chat,parent,false)
        viewtype=view1
        return ViewHolder1(viewtype)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat=chatList.get(position)
        if(chat.is_right==true){
            (holder as ViewHolder1).RightTextView.text=chat.message
        }else{
            (holder as ViewHolder2).lefTextView.text=chat.message
        }
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun getItemViewType(position: Int): Int {
        val chat=chatList.get(position)
        if(chat.is_right==true) return 0
        else return 1
    }
}

class Chat(val message:String, val is_right:Boolean )
