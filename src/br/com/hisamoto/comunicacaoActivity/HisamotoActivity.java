package br.com.hisamoto.comunicacaoActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import br.com.hisamoto.comunicacaoActivity.activity.BuscarDadosActivity;
import br.com.hisamoto.comunicacaoActivity.activity.ReceberDadosActivity;

public class HisamotoActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);

        /** Rotina para chamar uma activity para buscar um conteúdo **/
        Button botaoBuscarDados = new Button(getApplicationContext());

        botaoBuscarDados.setText("Buscar Conteúdo");

        botaoBuscarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), BuscarDadosActivity.class);

                // Chave da requisição
                int requestCode = 123;

                startActivityForResult(i, requestCode);
            }
        });
        layout.addView(botaoBuscarDados);

        /** Rotina para chamar uma activity e passar conteúdo para ela **/
        Button botaoPassarDados = new Button(getApplicationContext());

        botaoPassarDados.setText("Enviar conteúdo");

        botaoPassarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ReceberDadosActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("MeuParametro", "Leandro Shindi Ekamoto");
                i.putExtras(bundle);

                startActivity(i);
            }
        });
        layout.addView(botaoPassarDados);

        setContentView(layout);
    }

    // Callback
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String parametroRecebido = data.getExtras().getString("ParametroRetorno");

        Log.i("ParametroRetorno", "RC[" + requestCode + "] RSC[" + resultCode + "]");
        Log.i("ParametroRetorno", "Dados: " + parametroRecebido);

        Toast.makeText(getApplicationContext(), "RC[" + requestCode + "] RSC[" + resultCode + "]", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Mensagem: " + parametroRecebido, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.i("CicloDeVida", "Método onStart() chamado");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.i("CicloDeVida", "Método onResume() chamado");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.i("CicloDeVida", "Método onPause() chamado");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.i("CicloDeVida", "Método onStop() chamado");
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.i("CicloDeVida", "Método onDestroy() chamado");
    }

    @Override
    protected void onRestart() {

        super.onRestart();
        Log.i("CicloDeVida", "Método onRestart() chamado");
    }

}
