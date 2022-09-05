package com.example.diceactivity


class DiceHelper {
    var d1 = (1..6).random()
    var d2 = (1..15).random()
    var d3 = (1..35).random()
    val l1 = 5
    val l2 = 15
    val l3 = 25
    var d1Res:Boolean = false
    var d2Res:Boolean = false
    var d3Res:Boolean = false

    private fun numChecker(){
        if (d1 == l1){
            d1Res = true
        } else {
            d1Res = false
        }
        if (d2 == l2){
            d2Res = true
        } else {
            d2Res = false
        }
        if (d3 == l3){
            d3Res = true
        } else {
            d3Res = false
        }
    }
    val call = numChecker()
}

