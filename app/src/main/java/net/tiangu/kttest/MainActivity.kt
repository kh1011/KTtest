package net.tiangu.kttest

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview.text = "first kotlin !!"
        button.text="点击"
        button.onClick {
            //startActivity<MainActivity>()
            toast("..")
        }
        layoutActyUI().setContentView(this)
        toast("..")
    }

    companion object {
        val a="123123"
        val b=123123
    }

        fun sum(a:Int,b:Int):Int{
            toast(a+b)
            return a+b
        }

        fun add(a:Int,b:Int):Int=a+b



        class layoutActyUI:AnkoComponent<MainActivity>{
        val ET_ID = 0x1001
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
            verticalLayout {
                val name = editText("LayoutActyUI") {
                    id = ET_ID
                }
                button("Say Hello") {
                    onClick {
                        ctx.toast("Hello, ${name.text}!")
                        name.textColor = 0xffff0000.toInt()
                    }
                }
            }
        }
    }
}

