package com.rvmarra17.piedrapapeltijeralagartospock.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.rvmarra17.piedrapapeltijeralagartospock.R;
import com.rvmarra17.piedrapapeltijeralagartospock.core.jugador;

public class MainActivity extends AppCompatActivity {
    private jugador jugador1 = new jugador();
    private jugador jugador2 = new jugador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button = this.findViewById(R.id.papel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jugar(jugador.opciones.PAPEL);
            }
        });


        button = this.findViewById(R.id.tijeras);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jugar(jugador.opciones.TIJERAS);
            }
        });

        button = this.findViewById(R.id.piedra);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jugar(jugador.opciones.PIERDA);
            }
        });

        button = this.findViewById(R.id.lagarto);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jugar(jugador.opciones.LAGARTO);
            }
        });

        button = this.findViewById(R.id.spock);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jugar(jugador.opciones.SPOCK);
            }
        });

    }



    private void jugar(jugador.opciones opcion) {
        jugador1.setOpcion(opcion);
        jugador2.setOpcion(jugador2.getRandom());

        final TextView usuario = this.findViewById(R.id.usuario);
        usuario.setText(jugador1.getOpcion().getLabel());
        final TextView robot = this.findViewById(R.id.robot);
        robot.setText(jugador2.getOpcion().getLabel());

        jugador temp = null;

        //jugador 1 - papel
        if (jugador1.getOpcion() == jugador.opciones.PAPEL && jugador2.getOpcion() == jugador.opciones.PIERDA) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.PAPEL && jugador2.getOpcion() == jugador.opciones.TIJERAS) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.PAPEL && jugador2.getOpcion() == jugador.opciones.PAPEL) {
            temp = null;
        }

        if (jugador1.getOpcion() == jugador.opciones.PAPEL && jugador2.getOpcion() == jugador.opciones.SPOCK) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.PAPEL && jugador2.getOpcion() == jugador.opciones.LAGARTO) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        //jugador 1 -piedra
        if (jugador1.getOpcion() == jugador.opciones.PIERDA && jugador2.getOpcion() == jugador.opciones.PIERDA) {
            temp = null;
        }

        if (jugador1.getOpcion() == jugador.opciones.PIERDA && jugador2.getOpcion() == jugador.opciones.TIJERAS) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.PIERDA && jugador2.getOpcion() == jugador.opciones.PAPEL) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.PIERDA && jugador2.getOpcion() == jugador.opciones.SPOCK) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.PIERDA && jugador2.getOpcion() == jugador.opciones.LAGARTO) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }


        //jugador 1 -tijeras
        if (jugador1.getOpcion() == jugador.opciones.TIJERAS && jugador2.getOpcion() == jugador.opciones.PIERDA) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.TIJERAS && jugador2.getOpcion() == jugador.opciones.TIJERAS) {
            temp = null;
        }

        if (jugador1.getOpcion() == jugador.opciones.TIJERAS && jugador2.getOpcion() == jugador.opciones.PAPEL) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.TIJERAS && jugador2.getOpcion() == jugador.opciones.SPOCK) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.TIJERAS && jugador2.getOpcion() == jugador.opciones.LAGARTO) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }

        //jugador1 spock
        if (jugador1.getOpcion() == jugador.opciones.SPOCK && jugador2.getOpcion() == jugador.opciones.PIERDA) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.SPOCK && jugador2.getOpcion() == jugador.opciones.TIJERAS) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.SPOCK && jugador2.getOpcion() == jugador.opciones.PAPEL) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.SPOCK && jugador2.getOpcion() == jugador.opciones.SPOCK) {
            temp = null;
        }

        if (jugador1.getOpcion() == jugador.opciones.SPOCK && jugador2.getOpcion() == jugador.opciones.LAGARTO) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        //jugador1 lagarto
        if (jugador1.getOpcion() == jugador.opciones.LAGARTO && jugador2.getOpcion() == jugador.opciones.PIERDA) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.LAGARTO && jugador2.getOpcion() == jugador.opciones.TIJERAS) {
            temp = jugador2;
            jugador2.setPuntos(jugador2.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.LAGARTO && jugador2.getOpcion() == jugador.opciones.PAPEL) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.LAGARTO && jugador2.getOpcion() == jugador.opciones.SPOCK) {
            temp = jugador1;
            jugador1.setPuntos(jugador1.getPuntos() + 1);
        }

        if (jugador1.getOpcion() == jugador.opciones.LAGARTO && jugador2.getOpcion() == jugador.opciones.LAGARTO) {
            temp = null;
        }

        final TextView resultadoUsuario = this.findViewById(R.id.resultado_usuario);
        resultadoUsuario.setText(Integer.toString(jugador1.getPuntos()));
        final TextView resultadoRobot = this.findViewById(R.id.resultado_robot);
        resultadoRobot.setText(Integer.toString(jugador2.getPuntos()));


    }

}