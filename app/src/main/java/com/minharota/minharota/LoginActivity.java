package com.minharota.minharota;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by madsonfelipe on 27/07/15.
 */
public class LoginActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        setContentView(R.layout.login);
        final Button botao = (Button) findViewById(R.id.entrar);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = ((EditText) findViewById(R.id.txtusuario)).getText().toString();
                String senha = ((EditText) findViewById(R.id.txtsenha)).getText().toString();
                if (usuario.equals("teste") && senha.equals("1234")) {
                    Intent novoform = new Intent(LoginActivity.this, MenuLateral.class);
                    startActivity(novoform);

                } else {
                    Toast.makeText(getApplicationContext(), "Usuário Incorreto", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }


}
