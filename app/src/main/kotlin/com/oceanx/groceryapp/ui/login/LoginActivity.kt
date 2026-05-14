package com.oceanx.groceryapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.oceanx.groceryapp.databinding.ActivityLoginBinding
import com.oceanx.groceryapp.ui.home.HomeActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val FAKE_OTP = "1234"
    private var generatedOtp = FAKE_OTP

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendOtp.setOnClickListener {
            val phone = binding.etPhone.text.toString().trim()
            if (phone.length != 10) {
                binding.etPhone.error = "Enter valid 10-digit mobile number"
                return@setOnClickListener
            }
            showOtpSection()
            startResendTimer()
            Toast.makeText(this, "OTP sent! Use: $FAKE_OTP", Toast.LENGTH_LONG).show()
        }

        binding.btnVerifyOtp.setOnClickListener {
            val otp = binding.etOtp.text.toString().trim()
            if (otp.isEmpty()) {
                binding.etOtp.error = "Enter OTP"
                return@setOnClickListener
            }
            if (otp == generatedOtp) {
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            } else {
                binding.etOtp.error = "Invalid OTP. Hint: $FAKE_OTP"
            }
        }

        binding.tvResend.setOnClickListener {
            Toast.makeText(this, "OTP resent! Use: $FAKE_OTP", Toast.LENGTH_LONG).show()
            startResendTimer()
        }
    }

    private fun showOtpSection() {
        binding.layoutOtp.visibility = View.VISIBLE
        binding.btnSendOtp.text = "Resend OTP"
        binding.etPhone.isEnabled = false
    }

    private fun startResendTimer() {
        binding.tvResend.isEnabled = false
        object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.tvResend.text = "Resend in ${millisUntilFinished / 1000}s"
            }
            override fun onFinish() {
                binding.tvResend.text = "Resend OTP"
                binding.tvResend.isEnabled = true
            }
        }.start()
    }
}
