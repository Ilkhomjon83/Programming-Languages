package uz.rakhmonov.i.hmwrk_11_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.rakhmonov.i.hmwrk_11_1.databinding.ActivityMain2Binding
import uz.rakhmonov.i.hmwrk_11_1.databinding.ActivityMainBinding
import uz.rakhmonov.i.hmwrk_11_1.models.User

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val user:User=intent.getSerializableExtra("key") as User
        binding.infoText.text=user.info


    }
}