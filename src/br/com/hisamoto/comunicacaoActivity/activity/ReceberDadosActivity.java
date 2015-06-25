package br.com.hisamoto.comunicacaoActivity.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Leandro Shindi
 * @version 1.0 25/06/15.
 */
public class ReceberDadosActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();
        String parametroRecebido = i.getExtras().getString("MeuParametro");

        Toast.makeText(getApplicationContext(), "Mensagem: " + parametroRecebido, Toast.LENGTH_SHORT).show();

        Button btnVoltar = new Button(getApplicationContext());
        btnVoltar.setText("Voltar");

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        setContentView(btnVoltar);
    }

//    @Override
//    protected void onStart() {
//
//        super.onStart();
//        Log.i("CicloDeVida", "Método onStart() chamado");
//    }
//
//    @Override
//    protected void onResume() {
//
//        super.onResume();
//        Log.i("CicloDeVida", "Método onResume() chamado");
//    }
//
//    @Override
//    protected void onPause() {
//
//        super.onPause();
//        Log.i("CicloDeVida", "Método onPause() chamado");
//    }
//
//    @Override
//    protected void onStop() {
//
//        super.onStop();
//        Log.i("CicloDeVida", "Método onStop() chamado");
//    }
//
//    @Override
//    protected void onDestroy() {
//
//        super.onDestroy();
//        Log.i("CicloDeVida", "Método onDestroy() chamado");
//    }
//
//    @Override
//    protected void onRestart() {
//
//        super.onRestart();
//        Log.i("CicloDeVida", "Método onRestart() chamado");
//    }

}