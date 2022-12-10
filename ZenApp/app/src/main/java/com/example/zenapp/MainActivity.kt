package com.example.zenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
            val chip =findViewById<Chip>(R.id.chip)
            val chip2 =findViewById<Chip>(R.id.chip2)
            val chip3 =findViewById<Chip>(R.id.chip3)
            val chip4 =findViewById<Chip>(R.id.chip4)
            val chip5 =findViewById<Chip>(R.id.chip5)
            val chip6 =findViewById<Chip>(R.id.chip6)
            val chip7 =findViewById<Chip>(R.id.chip7)
            val chip8 =findViewById<Chip>(R.id.chip8)
            val chip9 =findViewById<Chip>(R.id.chip9)
            val chip10 =findViewById<Chip>(R.id.chip10)
            val chip11 =findViewById<Chip>(R.id.chip11)
            val chip12 =findViewById<Chip>(R.id.chip12)
            val chip13 =findViewById<Chip>(R.id.chip13)
            val chip14 =findViewById<Chip>(R.id.chip14)
            val chip15 =findViewById<Chip>(R.id.chip15)
            val chip16 =findViewById<Chip>(R.id.chip16)
            val chip17 =findViewById<Chip>(R.id.chip17)
            val chip18 =findViewById<Chip>(R.id.chip18)
            val chip19 =findViewById<Chip>(R.id.chip19)
            val chip20 =findViewById<Chip>(R.id.chip20)
            val chip21 =findViewById<Chip>(R.id.chip21)
            val chip22 =findViewById<Chip>(R.id.chip22)
            val chip23 =findViewById<Chip>(R.id.chip23)
            val chip24 =findViewById<Chip>(R.id.chip24)
            val chip25 =findViewById<Chip>(R.id.chip25)
            val proceed =findViewById<Button>(R.id.button2)
            val chipGroup =findViewById<ChipGroup>(R.id.chiGroup)
            val size = chipGroup.checkedChipIds.size

        chip.setOnClickListener{
            chip.isChipIconVisible = !chip.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip2.setOnClickListener{
            chip2.isChipIconVisible = !chip2.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip3.setOnClickListener{
            chip3.isChipIconVisible = !chip3.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip4.setOnClickListener{
            chip4.isChipIconVisible = !chip4.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip5.setOnClickListener{
            chip5.isChipIconVisible = !chip5.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip6.setOnClickListener{
            chip6.isChipIconVisible = !chip6.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip7.setOnClickListener{
            chip7.isChipIconVisible = !chip7.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip8.setOnClickListener{
            chip8.isChipIconVisible = !chip8.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip9.setOnClickListener{
            chip9.isChipIconVisible = !chip9.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip10.setOnClickListener{
            chip10.isChipIconVisible = !chip10.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip11.setOnClickListener{
            chip11.isChipIconVisible = !chip11.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip12.setOnClickListener{
            chip12.isChipIconVisible = !chip12.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip13.setOnClickListener{
            chip13.isChipIconVisible = !chip13.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip14.setOnClickListener{
            chip14.isChipIconVisible = !chip14.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip15.setOnClickListener{
            chip15.isChipIconVisible = !chip15.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip16.setOnClickListener{
            chip16.isChipIconVisible = !chip16.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip17.setOnClickListener{
            chip17.isChipIconVisible = !chip17.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip18.setOnClickListener{
            chip18.isChipIconVisible = !chip18.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip19.setOnClickListener{
            chip19.isChipIconVisible = !chip19.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip20.setOnClickListener{
            chip20.isChipIconVisible = !chip20.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip21.setOnClickListener{
            chip21.isChipIconVisible = !chip21.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip22.setOnClickListener{
            chip22.isChipIconVisible = !chip22.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip23.setOnClickListener{
            chip23.isChipIconVisible = !chip23.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip24.setOnClickListener{
            chip24.isChipIconVisible = !chip24.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

        chip25.setOnClickListener{
            chip25.isChipIconVisible = !chip25.isChecked
            if (chipGroup.checkedChipIds.isEmpty()) {
                proceed.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "выберите хотя бы одну категорию, чтобы продолжить",
                    Toast.LENGTH_SHORT).show()

            } else {
                proceed.visibility = VISIBLE
            }
        }

    }


}