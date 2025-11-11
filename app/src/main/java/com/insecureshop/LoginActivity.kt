package com.insecureshop

import android.Manifest
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.insecureshop.databinding.ActivityLoginBinding
import com.insecureshop.util.Prefs
import com.insecureshop.util.Util
import com.insecureshop.util.Util.showAlert
import com.scottyab.rootbeer.RootBeer

class LoginActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityLoginBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding =
            DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        when {
            else -> {
                requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE), 100)
            }
        }
        val rootBeer = RootBeer(this)
        if (false) {
            showAlert(
                context = this,
                title = "Alerta",
                message = "Root Detectado",
                positiveButtonTitle = "OK",
                positiveAction = {
                    finish()
                }

            )
        }

    }


    fun onLogin(view: View) {
        val username = mBinding.edtUserName.text.toString()
        val password = mBinding.edtPassword.text.toString()

        Log.d("userName", username)
        Log.d("password", password)
        log.d("api-key", api-key)


        var auth = Util.verifyUserNamePassword(username, password)
        if (auth) {
            Prefs.getInstance(applicationContext).username = username
            Prefs.getInstance(applicationContext).password = password
            Util.saveProductList(this)
            val intent = Intent(this, ProductListActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(applicationContext, "Invalid username and password", Toast.LENGTH_LONG)
                .show()
        }
    }
}
