package com.example.fastcampus3

import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AsyncActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)

        val backgroundTask=backgroundAsyncTask(
            findViewById(R.id.progressBar),
            findViewById(R.id.prograssBarText)
        )

        findViewById<TextView>(R.id.start).setOnClickListener {
            backgroundTask.execute()
        }

        findViewById<TextView>(R.id.stop).setOnClickListener {
            backgroundTask.cancel(true)
        }
        findViewById<TextView>(R.id.shot).setOnClickListener {
            Log.d("testt","SHOT!!")
        }
    }
}

class backgroundAsyncTask(
    val progressBar: ProgressBar,
    val progressText: TextView
) : AsyncTask<Int, Int, Int>() {
    //Params, Progress, Result
    //Params->doInbackground에서 사용할 타입
    //progress->onProgressUpdate에서 사용할 타입
    //result->onPostExeute에서 사용할 타입
    //deprecated->더 이상 사용을 권장하지 않는다.
    //코루틴 -> 멀티태스킹 동기/비동기 처리
    var percent: Int = 0
    override fun doInBackground(vararg p0: Int?): Int {
        while (isCancelled() == false) {
            percent++
            if (percent > 100) break
            else {
                publishProgress(percent)
            }
            Thread.sleep(100)
        }
        return percent
    }

    override fun onPreExecute() {
        percent = 0
        progressBar.setProgress(percent)
    }

    override fun onPostExecute(result: Int?) {
        progressText.text = "작업이 완료되었습니다."
    }


    override fun onProgressUpdate(vararg values: Int?) {
        progressBar.setProgress(values[0] ?: 0)
        progressText.text = "퍼센트: " + values[0]
        super.onProgressUpdate(*values)
    }

    override fun onCancelled() {
        progressBar.setProgress(0)
        progressText.text = "작업이 취소되었습니다."
    }
}