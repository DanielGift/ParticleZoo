public class Runner {
    public static void main(String[] args){
        int option = 1;
        try{
            option = Integer.getInteger(args[0]);
        }catch(Exception e){};
        if (option == 1){
            System.out.println("Testing Quark validity (\"!\" indicates something that is supposed to be true):");
            Quark q1 = new Quark(+2./3, 4.7, 0.5, "red");
            System.out.println(q1.isValid()+"!");
            Quark q2 = new Quark(+2./3, 4.7, -0.5, "blue");
            System.out.println(q2.isValid()+"!");
            Quark q3 = new Quark(-1./3, 5.7, 0.5, "green");
            System.out.println(q3.isValid()+"!");
            Quark qx1 = new Quark(+1, 0.5, 0.5, "red");
            System.out.println(qx1.isValid());
            Quark qx2 = new Quark(+2./3, -.2, 0.5, "red");
            System.out.println(qx2.isValid());
            Quark qx3 = new Quark(+2./3, 0.5, 1, "antired");
            System.out.println(qx3.isValid());
            Quark qx4 = new Quark(2./3, 0.5, 0, "red");
            System.out.println(qx4.isValid());
            Quark qx5 = new Quark(+2./3, 0.5, 0.5, "yellow");
            System.out.println(qx5.isValid());
            Quark q4 = new Quark(+2./3, 4.7, 0.5, "antigreen");
            Quark q5 = new Quark(-1./3, 4.7, -0.5, "antired");
            Quark q6 = new Quark(-1./3, 5.7, 0.5, "antiblue");
            System.out.println(q4.isValid()+"!");
            System.out.println(q5.isValid()+"!");
            System.out.println(q6.isValid()+"!");
        }
        if (option == 2) {
            System.out.println("Testing Lepton validity (\"!\" indicates something that is supposed to be true):");
            Lepton l1 = new Lepton(1, .5, 0.5, 1, 0, 0);
            System.out.println(l1.isValid() + "!");
            Lepton l2 = new Lepton(0, 0, 0.5, -1, 0, 0);
            System.out.println(l2.isValid() + "!");
            Lepton lx1 = new Lepton(-1, -.2, 0.5, 1, 0, 0);
            System.out.println(lx1.isValid());
            Lepton lx2 = new Lepton(-1, .2, 1.5, 1, 0, 0);
            System.out.println(lx2.isValid());
            Lepton lx3 = new Lepton(-1, 20, 0, 1, 0, 0);
            System.out.println(lx3.isValid());
            Lepton lx4 = new Lepton(-1, .2, 0.5, 2, 0, 0);
            System.out.println(lx4.isValid());
            Lepton lx5 = new Lepton(-1, .2, 0.5, 1, 1, 0);
            System.out.println(lx5.isValid());
        }
        if (option == 3) {
            System.out.println("Testing Fermion validity (\"!\" indicates something that is supposed to be true):");
            Fermion f1 = new Fermion(1.5, -1, 0.2, 1.5);
            System.out.println(f1.isValid() + "!");
            Fermion fx2 = new Fermion(2.0, -1, 0.2, 1.5);
            System.out.println(fx2.isValid());
            Fermion fx3 = new Fermion(1.5, -1, 0.2, -2.5);
            System.out.println(fx3.isValid());
        }
        if (option ==4){
            System.out.println("Testing Gluon validity (\"!\" indicates something that is supposed to be true):");
            Gluon g1 = new Gluon(-1, "antigreen", "antired");
            System.out.println(g1.isValid() + "!");
            Gluon gx2 = new Gluon(1, "red", "purple");
            System.out.println(gx2.isValid());
            Gluon gx3 = new Gluon(2, "red", "antiblue");
            System.out.println(gx3.isValid());
        }
        if (option ==5) {
            System.out.println("Testing Photon validity (\"!\" indicates something that is supposed to be true):");
            Photon p1 = new Photon(0);
            System.out.println(p1.isValid() + "!");
            Photon px2 = new Photon(-2);
            System.out.println(px2.isValid());
        }
        if (option ==6) {
            System.out.println("Testing WeakBoson validity (\"!\" indicates something that is supposed to be true):");
            WeakBoson wb1 = new WeakBoson(1, 48000, -1);
            System.out.println(wb1.isValid() + "!");
            WeakBoson wbx2 = new WeakBoson(1, 48000, -13);
            System.out.println(wbx2.isValid());
            WeakBoson wbx3 = new WeakBoson(1, -2, -1);
            System.out.println(wbx3.isValid());
        }
        if (option ==7) {
            System.out.println("Testing Higgs validity (\"!\" indicates something that is supposed to be true):");
            Higgs h1 = new Higgs();
            System.out.println(h1.isValid()+"!");
        }
        if (option ==8) {
            System.out.println("Testing Boson validity (\"!\" indicates something that is supposed to be true):");
            Boson b1 = new Boson(2,-3,412,0 );
            System.out.println(b1.isValid()+"!");
            Boson bx2 = new Boson(2,-3,412,3 );
            System.out.println(bx2.isValid());
            Boson bx3 = new Boson(2,-3,-2000,-1 );
            System.out.println(bx3.isValid());
        }
        if (option ==9) {
            System.out.println("Testing Particle validity (\"!\" indicates something that is supposed to be true):");
            Particle pa1 = new Particle(5.5, -1./3, 430000, 4.5);
            System.out.println(pa1.isValid()+"!");
            Particle pa2 = new Particle(3, 2./3, 0, -3);
            System.out.println(pa2.isValid()+"!");
            Particle pax3 = new Particle(5.5, -1./3, 430000, -4.6);
            System.out.println(pax3.isValid());
            Particle pax4 = new Particle(5.7, -1./3, 430000, 4.7);
            System.out.println(pax4.isValid());
            Particle pax5 = new Particle(5.5, -1./3, -2, -4.5);
            System.out.println(pax5.isValid());
        }
        if (option ==10) {
            Quark q1 = new Quark(+2. / 3, 4.7, 0.5, "red");
            Quark q2 = new Quark(+2. / 3, 4.7, -0.5, "blue");
            Quark q3 = new Quark(-1. / 3, 5.7, 0.5, "green");
            Quark q4 = new Quark(+2. / 3, 4.7, 0.5, "antigreen");
            Quark q5 = new Quark(-1. / 3, 4.7, -0.5, "antired");
            Quark q6 = new Quark(-1. / 3, 5.7, 0.5, "antiblue");
            System.out.println("Testing CollectionOfParticles validity (\"!\" indicates something that is supposed to be true):");
            CollectionOfParticles proton1 = new CollectionOfParticles(new Particle[]{q1, q2, q3});
            System.out.println(proton1.isValid() + "!");
            Lepton l1 = new Lepton(1, .5, 0.5, 1, 0, 0);
            Lepton l2 = new Lepton(0, 0, 0.5, -1, 0, 0);
            CollectionOfParticles proton2 = new CollectionOfParticles(new Particle[]{q4, q5, q6, l1, l2});
            System.out.println(proton2.isValid() + "!");
            WeakBoson w1 = new WeakBoson(1, 97000, 1);
            CollectionOfParticles proton3 = new CollectionOfParticles(new Particle[]{q4, q5, q6, w1});
            System.out.println(proton3.isValid() + "!");
            Quark q7 = new Quark(-1. / 3, 5.7, 0.5, "antired");
            Gluon g0 = new Gluon(0, "red", "antiblue");
            CollectionOfParticles proton4 = new CollectionOfParticles(new Particle[]{q4, q5, q7, g0, w1});
            System.out.println(proton4.isValid() + "!");
            CollectionOfParticles cx1 = new CollectionOfParticles(new Particle[]{q4, q5, w1});
            System.out.println(cx1.isValid());
            CollectionOfParticles cx2 = new CollectionOfParticles(new Particle[]{q4, q5, g0});
            System.out.println(cx2.isValid());
        }
        Particle pe1 = new Particle(.5, 1, 100, .5);
        Particle pe2 = new Particle(.5, 1, 100, .5);
        if(option == 11){
            System.out.println("Testing Particle equality (\"!\" indicates something that is supposed to be true):");
            System.out.println(pe1.equals(pe2)+"!");
            System.out.println(pe2.equals(pe1)+"!");
            Particle pe3 = new Particle(1, 1, 100, -.5);
            System.out.println(pe1.equals(pe3));
        }
        Lepton le1 = new Lepton(1, 100, .5, 1, 0, 0);
        if(option == 12) {
            System.out.println("Testing Lepton equality (\"!\" indicates something that is supposed to be true):");
            System.out.println(le1.equals(pe1));
            System.out.println(pe1.equals(le1) + "!");
            Lepton le2 = new Lepton(-1, 100, .5, 1, 0, 0);
            System.out.println(le1.equals(le2));
            Lepton le3 = new Lepton(1, 100, .5, 0, 1, 0);
            System.out.println(le1.equals(le3));
            Lepton le4 = new Lepton(1, 100, .5, 0, 0, 1);
            System.out.println(le1.equals(le4));
            Lepton le5 = new Lepton(1, 100, -.5, 1, 0, 0);
            System.out.println(le1.equals(le5));
            Lepton le6 = new Lepton(1, 100, .5, 1, 0, 0);
            System.out.println(le1.equals(le6) + "!");
        }
        Quark qe1 = new Quark(1, 100, .5, "red");

        if(option == 13) {
            System.out.println("Testing Quark equality (\"!\" indicates something that is supposed to be true):");
            System.out.println(le1.equals(qe1));
            System.out.println(qe1.equals(le1));
            System.out.println(pe1.equals(qe1) + "!");
            System.out.println(qe1.equals(pe1));
            Quark qe2 = new Quark(1, 100, -.5, "red");
            System.out.println(qe1.equals(qe2));
            Quark qe3 = new Quark(1, 100, .5, "blue");
            System.out.println(qe1.equals(qe3));
            Quark qe4 = new Quark(1, 100, -.5, "antired");
            System.out.println(qe1.equals(qe4));
            Quark qe5 = new Quark(1, 100, .5, "red");
            System.out.println(qe1.equals(qe5) + "!");
        }
        if(option == 14) {
            System.out.println("Testing Fermion equality (\"!\" indicates something that is supposed to be true):");
            Fermion fe1 = new Fermion(.5, 1, 100, .5);
            System.out.println(pe1.equals(fe1) + "!");
            System.out.println(fe1.equals(pe1) + "!");
            System.out.println(qe1.equals(fe1));
            System.out.println(fe1.equals(qe1)+"!");
            System.out.println(le1.equals(fe1));
            System.out.println(fe1.equals(le1)+"!");
            Fermion fe2 = new Fermion(.5, 1, 100, -.5);
            System.out.println(fe1.equals(fe2));
            Fermion fe3 = new Fermion(.5, 1, 100, -.5);
            System.out.println(fe1.equals(fe3));
        }
        if(option == 15) {
            System.out.println("Testing Boson equality (\"!\" indicates something that is supposed to be true):");
            Particle pe4 = new Particle(1, 1, 500, 0);
            Boson be1 = new Boson(1, 1, 500, 0);
            System.out.println(pe4.equals(be1) + "!");
            System.out.println(be1.equals(pe4) + "!");
            Boson be2 = new Boson(1, 1, 100, 0);
            System.out.println(be1.equals(be2));
            Boson be3 = new Boson(0, 1, 500, 0);
            System.out.println(be1.equals(be3));
            Boson be4 = new Boson(1, 1, 500, 0);
            System.out.println(be1.equals(be4) + "!");
        }
        Particle pe5 = new Particle(1, 0, 0, -1);
        Boson be5 = new Boson(1, 0, 0, -1);
        if(option == 16) {
            System.out.println("Testing Gluon equality (\"!\" indicates something that is supposed to be true):");
            Gluon ge1 = new Gluon(-1,"red","antired");
            System.out.println(ge1.equals(pe5));
            System.out.println(pe5.equals(ge1)+"!");
            Gluon ge2 = new Gluon(-1, "blue", "antiblue");
            System.out.println(ge1.equals(ge2));
            Gluon ge3 = new Gluon(-1, "antired", "red");
            System.out.println(ge1.equals(ge3)+"!");
            Gluon ge4 = new Gluon(1, "red", "antired");
            System.out.println(ge1.equals(ge4));
        }
            if(option == 17) {
                System.out.println("Testing Photon equality (\"!\" indicates something that is supposed to be true):");
                Photon phe1 = new Photon(-1);
                System.out.println(phe1.equals(pe5)+"!");
                System.out.println(pe5.equals(phe1)+"!");
                System.out.println(phe1.equals(be5)+"!");
                System.out.println(be5.equals(phe1)+"!");
                Photon phe2 = new Photon(0);
                System.out.println(phe1.equals(phe2));
            }
                if(option == 18) {
                    System.out.println("Testing Higgs equality (\"!\" indicates something that is supposed to be true):");
                    Higgs he1 = new Higgs();
                    Boson be6 = new Boson(1, 0, 123000,  0);
                    System.out.println(he1.equals(be6)+"!");
                    System.out.println(be6.equals(he1)+"!");
                }
                    if(option == 19) {
                        System.out.println("Testing WeakBoson equality (\"!\" indicates something that is supposed to be true):");
                        WeakBoson we1 = new WeakBoson(1, 97000,0);
                        Boson be7 = new Boson(1, 1, 97000,0);
                        System.out.println(we1.equals(be7)+"!");
                        System.out.println(be7.equals(we1)+"!");
                        WeakBoson we2 = new WeakBoson(-1,97000,0);
                        System.out.println(we1.equals(we2));
                    }
        if(option == 20) {
            Quark q1 = new Quark(+2. / 3, 4.7, 0.5, "red");
            Quark q2 = new Quark(+2. / 3, 4.7, -0.5, "blue");
            Quark q3 = new Quark(-1. / 3, 5.7, 0.5, "green");
            Quark q4 = new Quark(+2. / 3, 4.7, 0.5, "antigreen");
            Quark q5 = new Quark(-1. / 3, 4.7, -0.5, "antired");
            Quark q6 = new Quark(-1. / 3, 5.7, 0.5, "antiblue");
            CollectionOfParticles proton1 = new CollectionOfParticles(new Particle[]{q1, q2, q3});
            Lepton l1 = new Lepton(1, .5, 0.5, 1, 0, 0);
            Lepton l2 = new Lepton(0, 0, 0.5, -1, 0, 0);
            CollectionOfParticles proton2 = new CollectionOfParticles(new Particle[]{q4, q5, q6, l1, l2});
            System.out.println("Testing CollectionOfParticles equality (\"!\" indicates something that is supposed to be true):");
            System.out.println(proton1.equals(proton2)+"!");
            CollectionOfParticles proton25 = new CollectionOfParticles(new Particle[]{q4, q5, l1, l2});
            System.out.println(proton1.equals(proton25));
            WeakBoson w1 = new WeakBoson(1, 97000, 1);
            CollectionOfParticles proton3 = new CollectionOfParticles(new Particle[]{q4, q5, q6, w1});
            System.out.println(proton3.isValid() + "!");
            Quark q7 = new Quark(-1. / 3, 5.7, 0.5, "antired");
            Gluon g0 = new Gluon(0, "red", "antiblue");
            CollectionOfParticles proton4 = new CollectionOfParticles(new Particle[]{q4, q5, q7, g0, w1});
            System.out.println(proton1.equals(proton3)+"!");
            System.out.println(proton2.equals(proton4)+"!");
            Lepton lc1 = new Lepton(-1, 500,.5, 1, 0, 0);
            Lepton lc2 = new Lepton(1, 500,.5, -1, 0, 0);
            Lepton lc3 = new Lepton(-1, 500,.5, 0, 0, 1);
            Quark qc1 = new Quark(2./3, .5, .5, "red");
            Quark qc2 = new Quark(2./3, .5, .5, "antired");
            Quark qc3 = new Quark(-1./3, .5, .5, "red");
            Quark qc4 = new Quark(-1./3, .5, .5, "blue");
            Quark qc5 = new Quark(-2./3, .5, .5, "green");
            WeakBoson wc1 = new WeakBoson(-1, 53000, 0);
            Lepton lc4 = new Lepton(-1, 400, -.5, 0, 0, 1);
            Photon pc1 = new Photon(0);
            Particle ppc1 = new Particle(2, -1, 0, -1);
            CollectionOfParticles c1 = new CollectionOfParticles(new Particle[]{lc1, lc2, lc3, qc1,qc2,qc3,qc4,qc5,wc1});
            CollectionOfParticles c2 = new CollectionOfParticles(new Particle[]{lc4,pc1,ppc1});
            CollectionOfParticles c3 = new CollectionOfParticles(new Particle[]{ppc1,wc1});
            System.out.println(c1.equals(c2)+"!");
            System.out.println(c1.equals(c3));
            Gluon g10 = new Gluon(1, "red", "antiblue");
            Gluon g11 = new Gluon(1, "red", "antigreen");
            Gluon g12 = new Gluon(1, "blue", "antired");
            Quark q10 = new Quark(+2./3, 32, -.5,"antired");
            Quark q11 = new Quark(-1./3, 32, -.5,"antired");
            Quark q12 = new Quark(-1./3, 32, -.5,"antiblue");
            CollectionOfParticles c4 = new CollectionOfParticles(new Particle[]{q10,lc4, ppc1, q11,g10,g11,g12,q12});
            System.out.println(c2.equals(c4)+"!");
        }





    }
}
