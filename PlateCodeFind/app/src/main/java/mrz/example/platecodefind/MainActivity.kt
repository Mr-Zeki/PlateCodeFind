package mrz.example.plakabul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import mrz.example.plakabul.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val mainBinding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding.findButton.setOnClickListener{
            val cities = arrayOf("Adana","Adıyaman","Afyon","Ağrı","Amasya","Ankara","Antalya","Artvin","Aydın","Balıkesir",)
            if (mainBinding.iPlate.text.toString().isNotEmpty()){
                var plateCode = mainBinding.iPlate.text.toString().toInt()
                try {
                    mainBinding.cityName.text = cities[plateCode-1]
                }
                catch (e:ArrayIndexOutOfBoundsException) {
                    mainBinding.cityName.text = "Bulunamadı"
                }
            }
            else{
                mainBinding.cityName.text = "Şehir plaka kodu giriniz"
            }
            mainBinding.iPlate.text.clear()



        }

    }
}