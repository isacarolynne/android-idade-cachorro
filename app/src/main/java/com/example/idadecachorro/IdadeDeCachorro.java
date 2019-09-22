package com.example.idadecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IdadeDeCachorro extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_idade_de_cachorro);

        caixaTexto = (EditText) findViewById(R.id.textoId);
        botaoIdade = (Button) findViewById(R.id.botaoId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //recuperar o que foi digitado
              String textoDigitado =  caixaTexto.getText().toString();

              if(textoDigitado.isEmpty()){

                  resultadoIdade.setText("Digite uma idade");
              }else{
                  int valorDigitado = Integer.parseInt(textoDigitado);

                  int resultadoFinal = valorDigitado*7;

                  resultadoIdade.setText("A idade do cachorro em anos humanos é "+resultadoFinal+" anos");
              }

            }
        });
    }
}
