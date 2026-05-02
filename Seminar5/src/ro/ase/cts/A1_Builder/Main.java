package ro.ase.cts.A1_Builder;

import ro.ase.cts.A1_Builder.builder1.AbstractBuilder;
import ro.ase.cts.A1_Builder.builder1.Internare;
import ro.ase.cts.A1_Builder.builder1.InternareBuilder;
import ro.ase.cts.A1_Builder.builder2.AbstractBuilder2;
import ro.ase.cts.A1_Builder.builder2.Internare2;
import ro.ase.cts.A1_Builder.builder2.InternareBuilder2;

public class Main {
    public static void main(String[] args) {
        Internare int1 = new Internare();
        int1.setNumePacient("Flavia Tanasescu");
        int1.setPatRabatabil(true);

        Internare int2 = new Internare();
        int1.setNumePacient("Cineva Suspect");
        int1.setHalat(true);

        AbstractBuilder builder = new InternareBuilder("Flavi");
        Internare int3 = builder.setPatRabatabil(true).build();
        Internare int4 = builder.setPapuci(true).setNume("Ducu").build();

        System.out.println(int3.toString());
        System.out.println(int4.toString());
        System.out.println();


        AbstractBuilder2 builder2 = new InternareBuilder2();
        builder2.setMicDejun(true);

        Internare2 int5 = builder2.build("Flavi");
        Internare2 int6 = builder2.build("FlaviMic");
        System.out.println(int5.toString());
        System.out.println(int6.toString());
        System.out.println();
        int5.setHalat(true);
        System.out.println(int5.toString());


    }
}
