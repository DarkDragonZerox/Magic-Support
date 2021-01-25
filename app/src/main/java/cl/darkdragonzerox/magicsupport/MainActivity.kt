package cl.darkdragonzerox.magicsupport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.darkdragonzerox.magicsupport.databinding.ActivityMainBinding
import cl.darkdragonzerox.magicsupport.view.MenuFragment


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.main_container,MenuFragment()).addToBackStack("Back").commit()
    }
}