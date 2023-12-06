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
            val cities = arrayOf(" ","Adana","Adıyaman","Afyon","Ağrı","Amasya","Ankara","Antalya","Artvin","Aydın","Balıkesir",)
            if (mainBinding.iPlate.text.toString().isNotEmpty()){
                var plateCode = mainBinding.iPlate.text.toString().toInt()
                when (plateCode){
                    1 -> mainBinding.cityName.text = cities[1]
                    2 -> mainBinding.cityName.text = cities[2]
                    3 -> mainBinding.cityName.text = cities[3]
                    4 -> mainBinding.cityName.text = cities[4]
                    5 -> mainBinding.cityName.text = cities[5]
                    6 -> mainBinding.cityName.text = cities[6]
                    7 -> mainBinding.cityName.text = cities[7]
                    8 -> mainBinding.cityName.text = cities[8]
                    9 -> mainBinding.cityName.text = cities[9]
                    10 -> mainBinding.cityName.text = cities[10]
                    else ->{
                        mainBinding.cityName.text = "Bulunamadı"
                    }
                }
            }
            else{
                mainBinding.cityName.text = "Şehir plaka kodu giriniz"
            }
            mainBinding.iPlate.text.clear()



        }

    }
}