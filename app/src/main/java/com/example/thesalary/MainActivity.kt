package com.example.thesalary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.thesalary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

      lateinit  var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.buttonSalary.setOnClickListener(){

            val resultValue = bindingClass.tPersonName.text.toString()

            when(resultValue){

                Constans.Director ->{
                    bindingClass.textView2 .visibility = View.VISIBLE
                    val tempText = "Получите Вашу зарплату  ${Constans.Director_Salary}"
                    bindingClass.textView2.text = if (bindingClass.editTextPassword.text.toString() == Constans.Director_Password)
                        tempText
                    else
                        "Не верный пароль"
                }

                Constans.Enginer ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    val tempText = "Получите Ваши ${Constans.Enginer_Salary}"
                    bindingClass.textView2.text = if (bindingClass.editTextPassword.text.toString() == Constans.Enginer_Password)
                        tempText
                    else
                        "Не верный пароль"
                }

                Constans.Driver ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    val tempText = "Получите Ваши ${Constans.Driver_Salary}"
                    bindingClass.textView2.text = if (bindingClass.editTextPassword.text.toString() == Constans.Director_Password)
                        tempText
                    else
                        "Не верный пароль"
                }

                Constans.PMHead ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    val tempText = "Получите Ваши ${Constans.PMHead_Salary}"
                    bindingClass.textView2.text = if (bindingClass.editTextPassword.text.toString() == Constans.PMHead_Password)
                        tempText
                    else
                        "Не верный пароль"
                }

                Constans.SuperHead ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    val tempText = "Получите Ваши ${Constans.SuperHead_Salary}"
                    bindingClass.textView2.text = if (bindingClass.editTextPassword.text.toString() == Constans.SuperHead_Password)
                        tempText
                    else
                        "Не верный пароль"
                }

                else ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    bindingClass.textView2.text ="Вы у нас не работаете"

                }
            }
        }
    }
}