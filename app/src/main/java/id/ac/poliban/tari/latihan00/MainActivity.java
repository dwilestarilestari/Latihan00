package id.ac.poliban.tari.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //konten view dihubungkan dengan koding
        //java kita
        setContentView(R.layout.activity_main);

        //menghubungkan view dengan object button
        //dalam source code kita
        Button btPertama = findViewById(R.id.btPertama);
        Button btKedua = findViewById(R.id.btKedua);
        Button btKetiga = findViewById(R.id.btKetiga);
        Button btKeempat = findViewById(R.id.btKeempat);

        //interface onClickListener merupakan interface yang adad di kelas view
        //hanya berisi satu method onClick(View view)

        //berikut kode memasang event listener onClick pada object Button
        btPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan tombol Pertama", Toast.LENGTH_SHORT).show();
            }
        });

        btKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan tombol Kedua ", Toast.LENGTH_SHORT).show();
            }
        });

        btKetiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan tombol Ketiga", Toast.LENGTH_SHORT).show();
            }
        });

        btKeempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan tombol Keempat", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
