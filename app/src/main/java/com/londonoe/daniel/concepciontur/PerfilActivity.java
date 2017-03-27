package com.londonoe.daniel.concepciontur;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    TextView tUsername;
    TextView tCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tUsername = (TextView) findViewById(R.id.tUsename);
        tCorreo = (TextView) findViewById(R.id.tCorreo);

        Bundle extras= getIntent().getExtras();
        tUsername.setText(extras.getString("username"));
        tCorreo.setText(extras.getString("correo"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.mPrincipal:
                finish();
                break;
            case R.id.mLogOut:
                Intent intent2 = new Intent(PerfilActivity.this, Login.class);
                startActivity(intent2);
                finish();
                break;
        }
        return true;
    }
}
