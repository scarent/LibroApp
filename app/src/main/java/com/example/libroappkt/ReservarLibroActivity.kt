package com.example.libroappkt

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ReservarLibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservar_libro)

        // obtener libro d la intencion
        val libro = intent.getSerializableExtra("libro") as Libro

        // info del libro
        findViewById<TextView>(R.id.textoTitulo).text = libro.titulo
        findViewById<TextView>(R.id.textoAutor).text = libro.autor
        findViewById<TextView>(R.id.textoPrecio).text = libro.precio

        // Cconfig bottom bar
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_mis_libros -> {
                    startActivity(Intent(this, MisLibrosActivity::class.java))
                    true
                }
                R.id.nav_buscar -> {
                    // intentar abrir la busqueda
                    true
                }
                R.id.nav_catalogo -> {
                    startActivity(Intent(this, CatalogoActivity::class.java))
                    true
                }
                R.id.nav_wishlist -> {
                    startActivity(Intent(this, WishlistActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}





