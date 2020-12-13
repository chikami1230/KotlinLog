package jp.techacademy.masahito.chikami.kotlinlog

import android.util.Log

class Human: Animal, Thinkable{

    constructor(name: String, age: Int,hobby: String): super(name, age, hobby) {
    }

    override fun say() {

        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest","年は" +this.age +"です。")
    }


    override fun think() {
        Log.d("kotlintest","私は" + this.hobby+ "について考える")
    }
}