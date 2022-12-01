package uz.rakhmonov.i.hmwrk_11_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.rakhmonov.i.hmwrk_11_1.adapters.myUserAdapter
import uz.rakhmonov.i.hmwrk_11_1.databinding.ActivityMainBinding
import uz.rakhmonov.i.hmwrk_11_1.models.User
import uz.rakhmonov.i.hmwrk_11_1.utils.Data.addList
import uz.rakhmonov.i.hmwrk_11_1.utils.Data.list


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        addList()


        val myUserAdapter = myUserAdapter(this, list)

        binding.listview.adapter = myUserAdapter

        binding.listview.setOnItemClickListener { s, view, position, l ->
//        val a = list[position].name.toString()
//            Toast.makeText(this, a, Toast.LENGTH_SHORT).show()
            val intent=Intent(this,MainActivity2::class.java)
            val user=User(list[position].name,list[position].image, list[position].info)
            intent.putExtra("key", user)
            startActivity(intent)


        }
    }
}