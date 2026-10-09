package com.example.pmdm_p1_antonigomezgarceran;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGenerateList = findViewById(R.id.btnGenerateList);
        Button btnExploreRecipes = findViewById(R.id.btnExploreRecipes);
        btnGenerateList.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, getString(R.string.btn_generar_lista), Toast.LENGTH_SHORT).show();
        });



        btnExploreRecipes.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, getString(R.string.btn_ver_recetas), Toast.LENGTH_SHORT).show();
        });
    }
}
