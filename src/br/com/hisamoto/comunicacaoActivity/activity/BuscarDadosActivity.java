package br.com.hisamoto.comunicacaoActivity.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * @author Leandro Shindi
 * @version 1.0 25/06/15.
 */
public class BuscarDadosActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("ParametroRetorno", "Entrou na activity para busca de dados");

        Button botao = new Button(getApplicationContext());

        botao.setText("Retornar informação");

        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = getIntent();

                // Posso utilizar para retornar chave de dados
                int resultCode = 321;

                i.putExtra("ParametroRetorno", "Conteúdo do parâmetro de retorno.");

                setResult(resultCode, i);
                finish();
            }
        });

        setContentView(botao);
    }

}