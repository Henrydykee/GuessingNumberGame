package com.example.guessingnumber

import android.content.Context
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var question : TextView =findViewById(R.id.question_textview)
        question_textview.text = resources.getString(R.string.first_question)
        number = 5
    }

    fun arrowDown(view: View) {
     if(number==5){
        number=3
         question_textview.text = resources.getString(R.string.second_question)
     }else if (number==3){
         number = 2
         question_textview.text = resources.getString(R.string.third_question)
     }else if (number== 2){
         number = 1
         question_textview.text = resources.getString(R.string.fourth_question)
     }else if (number== 7){
         number = 6
         question_textview.text = resources.getString(R.string.seventh_question)
     }else if (number== 9){
         number = 8
         question_textview.text = resources.getString(R.string.nineth_question)
     }
    }


    fun successFunction(view: View) {
        tv_success.visibility = View.VISIBLE
        question_textview.visibility = View.INVISIBLE
        targeted_number.visibility = View.INVISIBLE
        targeted_number.text = String.format(resources.getString(R.string.targeted_number_text_view),number)

    }

    fun arrowUp(view: View) {
        if(number==3){
            number=4
            question_textview.text = resources.getString(R.string.fifth_question)
        }else if (number==5){
            number = 7
            question_textview.text = resources.getString(R.string.sixth_question)
        }else if (number== 7){
            number = 9
            question_textview.text = resources.getString(R.string.eight_question)
        }else if (number== 9){
            number = 10
            question_textview.text = resources.getString(R.string.tenth_question)
        }
    }

    fun restButton(view: View) {
        question_textview.text = resources.getString(R.string.first_question)
        tv_success.visibility = View.INVISIBLE
        targeted_number.visibility = View.INVISIBLE
        number = 5
        question_textview.visibility = View.INVISIBLE

    }
}
