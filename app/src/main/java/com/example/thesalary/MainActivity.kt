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
        bindingClass.textViewAllName.text = "You name ${Constans.AllPerson}"
        bindingClass.buttonSalary.setOnClickListener(){

            val resultValue = bindingClass.tPersonName.text.toString()


            when(resultValue){

                Constans.Director ->{
                    bindingClass.textView2 .visibility = View.VISIBLE
                    val tempText = "Деректор получите Вашу зарплату ${Constans.Director_Salary} $"
                     if (bindingClass.editTextPassword.text.toString() == Constans.Director_Password) {
                         bindingClass.textView2.text = tempText
                         bindingClass.imPhoto.setImageResource(R.drawable.myavatar_4)
                     }
                    else {
                        bindingClass.imPhoto.setImageResource(R.drawable.polis)
                         bindingClass.textView2.text = "Не верный пароль"
                     }
                }

                Constans.Enginer ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    val tempText = " Инженер получите Ваши ${Constans.Enginer_Salary} $"
                    if (bindingClass.editTextPassword.text.toString() == Constans.Enginer_Password) {
                        bindingClass.textView2.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.myavatar_3)

                    }
                    else {
                        bindingClass.textView2.text = "Не верный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.polis)
                    }
                }

                Constans.Driver ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    val tempText = " Водитель получите Ваши ${Constans.Driver_Salary}$"
                     if (bindingClass.editTextPassword.text.toString() == Constans.Director_Password) {
                         bindingClass.textView2.text = tempText
                         bindingClass.imPhoto.setImageResource(R.drawable.myavatar_2)

                     }

                    else {
                         bindingClass.textView2.text ="Не верный пароль"
                         bindingClass.imPhoto.setImageResource(R.drawable.polis)
                     }
                }

                Constans.PMHead ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    val tempText = "ПМ получите Ваши ${Constans.PMHead_Salary}$"
                    if (bindingClass.editTextPassword.text.toString() == Constans.PMHead_Password) {
                        bindingClass.textView2.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.myavatar_0)
                    }
                    else {
                        bindingClass.textView2.text = "Не верный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.polis)
                    }
                }

                Constans.SuperHead ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    val tempText = "Глава департамента получите Ваши ${Constans.SuperHead_Salary}$"
                    if (bindingClass.editTextPassword.text.toString() == Constans.SuperHead_Password) {
                        bindingClass.textView2.text = tempText
                        bindingClass.imPhoto.setImageResource(R.drawable.myavatar_1)

                    }
                    else {
                        bindingClass.textView2.text = "Не верный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.polis)
                    }
                }

                else ->{
                    bindingClass.textView2.visibility = View.VISIBLE
                    bindingClass.textView2.text ="Вы у нас не работаете"
                    bindingClass.imPhoto.setImageResource(R.drawable.polis)

                }
            }
        }
    }
}