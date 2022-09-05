package com.example.diceactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val die1 = findViewById<TextView>(R.id.dice1)
        val die2 = findViewById<TextView>(R.id.dice2)
        val die3 = findViewById<TextView>(R.id.dice3)
        val lnum1 = findViewById<TextView>(R.id.luck1)
        val lnum2 = findViewById<TextView>(R.id.luck2)
        val lnum3 = findViewById<TextView>(R.id.luck3)
        val Ch = findViewById<CheckBox>(R.id.checkBox)
        val But = findViewById<Button>(R.id.button)
        val nam = findViewById<EditText>(R.id.editText)
        var count:Int = 0
        But.setOnClickListener{
            val Roll = DiceHelper()
            die1.setText("Dice 1 Results: "+Roll.d1)
            die2.setText("Dice 2 Results: "+Roll.d2)
            die3.setText("Dice 3 Results: "+Roll.d3)
            var count = 0
            if (Roll.d1Res==true){
                lnum1.setText("Lucky")
                count++
            } else {
                lnum1.setText("Lose")
            }
            if (Roll.d2Res==true){
                lnum2.setText("Lucky")
                count++
            } else {
                lnum2.setText("Lose")
            }
            if (Roll.d3Res==true){
                lnum3.setText("Lucky")
                count++
            } else {
                lnum3.setText("Lose")
            }
            if (Ch.isChecked){
                if (count!=0){
                    val toast = Toast.makeText(applicationContext,nam.text.toString()+", You Won "+count.toString()+" out of 3!",Toast.LENGTH_SHORT)
                    toast.show()
                } else {
                    val toast = Toast.makeText(applicationContext,nam.text.toString()+", Try Again ",Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}