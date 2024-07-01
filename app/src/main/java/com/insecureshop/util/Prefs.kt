package com.insecureshop.util

import android.content.Context
import android.content.SharedPreferences
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import android.util.Base64
import androidx.security.crypto.EncryptedSharedPreferences

object Prefs {

    lateinit var sharedpreferences: SharedPreferences
    var prefs : Prefs? = null

    fun getInstance(context: Context): Prefs {
        if (prefs == null) {
            sharedpreferences =
                context.getSharedPreferences("Prefs", Context.MODE_PRIVATE)
            prefs = this
        }
        return prefs!!
    }

    var data: String?
        get() = sharedpreferences.getString("data","")
        set(value) {
            sharedpreferences.edit().putString("data", value).apply()
        }

    var username: String?
        get() = sharedpreferences.getString("username","")
        set(value) {
//            sharedpreferences.edit().putString("username", value).apply()
           sharedpreferences.edit().putString("username", value?.let { encrypt(it) }).apply()
        }

    var password: String?
        get() = sharedpreferences.getString("password","")
        set(value) {
//            sharedpreferences.edit().putString("password", value).apply()
            sharedpreferences.edit().putString("password", value?.let { encrypt(it) }).apply()
        }

    var productList: String?
        get() = sharedpreferences.getString("productList","")
        set(value) {
            sharedpreferences.edit().putString("productList", value).apply()
        }


    fun clearAll(){
        sharedpreferences.edit().clear().apply()
    }

    private const val KEY = "E54E78BF1B581SHWEWET5232"


    fun encrypt(value: String): String {
        val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
        cipher.init(Cipher.ENCRYPT_MODE, SecretKeySpec(KEY.toByteArray(), "AES"))
        val encryptedBytes = cipher.doFinal(value.toByteArray())
        return Base64.encodeToString(encryptedBytes, Base64.DEFAULT)
    }


    fun decrypt(value: String): String {
        val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
        cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(KEY.toByteArray(), "AES"))
        val decryptedBytes = cipher.doFinal(Base64.decode(value, Base64.DEFAULT))
        return String(decryptedBytes)
    }


//    private fun saveCredentials(username: String, password: String) {
//        val sharedPrefs = EncryptedSharedPreferences.create("secure_prefs",
//        masterKey,
//        applicationContext,
//        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
//        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
//        )
//
//        val editor = sharedPrefs.edit()
//        editor.putString(\"username\", username)
//        editor.putString(\"password\", password)
//        editor.apply()
//    }
}