package com.sippitechnologies.edittextdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_reset.setOnClickListener{
            editText_email.text=null
            editText_phone.text=null
            editText_date.text=null
            editText_multiline.text=null
        }
        btn_submit.setOnClickListener{
            if(!TextUtils.isEmpty(editText_email.text) && !TextUtils.isEmpty(editText_phone.text)&& !TextUtils.isEmpty(editText_date.text) &&
                !TextUtils.isEmpty(editText_multiline.text)
            )
            {
                textView.text = resources.getString(R.string.sucess)
                editText_email.text=null
                editText_phone.text=null
                editText_date.text=null
                editText_multiline.text=null
            }
            else
            {
                if(TextUtils.isEmpty(editText_email.text)) {
                    editText_email.error = resources.getString(R.string.error_email)
                    return@setOnClickListener
                }
                else if(TextUtils.isEmpty(editText_phone.text))
                {
                    editText_phone.error= resources.getString(R.string.error_phone)
                    return@setOnClickListener
                }
                else if(TextUtils.isEmpty(editText_date.text))
                {
                    editText_date.error= resources.getString(R.string.error_date)
                    return@setOnClickListener
                }
                else if(TextUtils.isEmpty(editText_multiline.text))
                {
                    editText_multiline.error= resources.getString(R.string.error_description)
                    return@setOnClickListener
                }
            }


        }
        editText_phone.addTextChangedListener(object:TextWatcher{
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
}
