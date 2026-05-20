package ro.ase.cts.ChainOfResp;

//Spitalul doreste eficientizarea triajului pacientilor in functie de gravitatea starii lor de sanatate.
// Atunci cand un pacient se prezinta la primiri urgente, starea lui este evaluata cu un punctaj de gravitate
// de la 1 la 100. Sistemul trebuie sa paseze pacientul prin urmatoarele niveluri de decizie:
// daca codul de gravitate este sub 30, de pacient se poate ocupa o Asistenta; daca gravitatea este intre 30 si 70,
// pacientul este pasat automat catre un Medic; daca starea este extrem de critica (peste 70),
// pacientul este trimis de urgenta la SefulDeSectie. Sa se dezvolte modulul bazat pe un lant de responsabilitate
// care asigura distribuirea automata a pacientilor catre personalul competent.

import ro.ase.cts.ChainOfResp.clase.*;

public class Main {
    public static void main(String[] args) {
        TriajHandler asistenta = new TriajAsistenta();
        TriajHandler medic = new TriajMedic();
        TriajHandler sefSectie = new TriajSefSectie();

        asistenta.setUrmTriaj(medic);
        medic.setUrmTriaj(sefSectie);

        Pacient p1 = new Pacient("Flavi", 71);
        asistenta.trimiteSpreTriaj(p1);
    }
}
