import java.util.Scanner;

public class Main{
    
    /** 
     * @param pps Arreglo de caracteres que se pueden pasar por terminal (opcionales)
     */
    public static void main(String [] pps){


        Arena arena = new Arena();
        Bitacora bitacora = new Bitacora();
        Korby korby = new Korby();
        MeganMan meganMan = new MeganMan();
        Dittuu dittuu = new Dittuu();
        String ganador = "";
        String TO_STRING_PERSONAJES = korby.toString() + meganMan.toString() +  dittuu.toString();
        Espectador espectador2 = new Espectador("Alan", "Dittuu", arena);
        Espectador espectador1 = new Espectador("Beto", "Korby", arena);
        Espectador espectador3 = new Espectador("Carla", "MeganMan", arena);
        Espectador espectador4 = new Espectador("Daniela", "MeganMan", arena);
        arena.agregar(espectador1);
        arena.agregar(espectador2);
        arena.agregar(espectador3);
        arena.agregar(espectador4);
        System.out.print("\n----PracticaUno----\nEjecute uno de los casos simulados:\nCaso 1:Korby Gana\nCaso 2: MeganMan gana\nCaso 3:Dittuu gana\nCaso 4: Intercalado de Golpes\nSeleccione: ");
        Scanner scanner = new Scanner(System.in);
        int decision = scanner.nextInt();
        switch(decision){
            case 1:
                System.out.print(TO_STRING_PERSONAJES);
                arena.setSucesos(TO_STRING_PERSONAJES);
                arena.comunicarEspectador();
                while(meganMan.estaVivo()){
                    korby.atacar(meganMan);
                    System.out.print(korby.atacarToString(meganMan));
                    arena.setSucesos(korby.atacarToString(meganMan));
                    arena.comunicarEspectador();
                    if(!meganMan.estaVivo()){
                        System.out.print("\n" + meganMan.getNombrePersonaje() + " ha muerto");
                        arena.setSucesos("\n" + meganMan.getNombrePersonaje() + " ha muerto");
                        arena.comunicarEspectador();
                    }
                }
                korby.cambiarAtaque(new MaldicionEterna());
                System.out.print(korby.cambioAtaqueToString(new MaldicionEterna().getNombreAtaque()));
                arena.setSucesos(korby.cambioAtaqueToString(new MaldicionEterna().getNombreAtaque()));
                arena.comunicarEspectador();
                dittuu.cambiarDefensa(new ConDefensa());
                System.out.print(dittuu.cambioDefensaToString(new ConDefensa().getNombre()));
                arena.setSucesos(dittuu.cambioDefensaToString(new ConDefensa().getNombre()));
                while(dittuu.estaVivo()){
                    korby.atacar(dittuu);
                    System.out.print(korby.atacarToString(dittuu));
                    arena.setSucesos(korby.atacarToString(dittuu));
                    arena.comunicarEspectador();
                    if(!dittuu.estaVivo()){
                        System.out.print("\n" + dittuu.getNombrePersonaje() + " ha muerto");
                        arena.setSucesos("\n" + dittuu.getNombrePersonaje() + " ha muerto");
                        arena.comunicarEspectador();
                    }
                }
                ganador = korby.getNombrePersonaje();
                break;
            case 2:
                System.out.print(TO_STRING_PERSONAJES);
                arena.setSucesos(TO_STRING_PERSONAJES);
                arena.comunicarEspectador();
                korby.cambiarDefensa(new ConDefensa());
                System.out.print(korby.cambioDefensaToString(new ConDefensa().getNombre()));
                arena.setSucesos(korby.cambioDefensaToString(new ConDefensa().getNombre()));
                while(korby.estaVivo()){
                    meganMan.atacar(korby);
                    System.out.print(meganMan.atacarToString(korby));
                    arena.setSucesos(meganMan.atacarToString(korby));
                    arena.comunicarEspectador();
                    if(!korby.estaVivo()){
                        System.out.print("\n" + korby.getNombrePersonaje() + " ha muerto");
                        arena.setSucesos("\n" + korby.getNombrePersonaje() + " ha muerto");
                        arena.comunicarEspectador();
                    }
                }
                meganMan.cambiarAtaque(new TruenoFeroz());
                System.out.print(meganMan.cambioAtaqueToString(new TruenoFeroz().getNombreAtaque()));
                arena.setSucesos(meganMan.cambioAtaqueToString(new TruenoFeroz().getNombreAtaque()));
                arena.comunicarEspectador();
                while(dittuu.estaVivo()){
                    meganMan.atacar(dittuu);
                    System.out.print(meganMan.atacarToString(dittuu));
                    arena.setSucesos(meganMan.atacarToString(dittuu));
                    arena.comunicarEspectador();
                    if(!dittuu.estaVivo()){
                        System.out.print("\n" + dittuu.getNombrePersonaje() + " ha muerto");
                        arena.setSucesos("\n" + dittuu.getNombrePersonaje() + " ha muerto");
                        arena.comunicarEspectador();
                    }
                }
                ganador = meganMan.getNombrePersonaje();
                break;
            case 3:
                System.out.print(TO_STRING_PERSONAJES);
                arena.setSucesos(TO_STRING_PERSONAJES);
                arena.comunicarEspectador();
                while(meganMan.estaVivo()){
                    dittuu.atacar(meganMan);
                    System.out.print(dittuu.atacarToString(meganMan));
                    arena.setSucesos(dittuu.atacarToString(meganMan));
                    arena.comunicarEspectador();
                    if(!meganMan.estaVivo()){
                        System.out.print("\n" + meganMan.getNombrePersonaje() + " ha muerto");
                        arena.setSucesos("\n" + meganMan.getNombrePersonaje() + " ha muerto");
                        arena.comunicarEspectador();
                    }
                }
                dittuu.cambiarAtaque(new LluviaDeCuchillos());
                System.out.print(dittuu.cambioAtaqueToString(new LluviaDeCuchillos().getNombreAtaque()));
                arena.setSucesos(dittuu.cambioAtaqueToString(new LluviaDeCuchillos().getNombreAtaque()));
                arena.comunicarEspectador();
                dittuu.cambiarDefensa(new ConDefensa());
                System.out.print(dittuu.cambioDefensaToString(new ConDefensa().getNombre()));
                arena.setSucesos(dittuu.cambioDefensaToString(new ConDefensa().getNombre()));
                while(korby.estaVivo()){
                    dittuu.atacar(korby);
                    System.out.print(dittuu.atacarToString(korby));
                    arena.setSucesos(dittuu.atacarToString(korby));
                    arena.comunicarEspectador();
                    if(!korby.estaVivo()){
                        System.out.print("\n" + korby.getNombrePersonaje() + " ha muerto");
                        arena.setSucesos("\n" + korby.getNombrePersonaje() + " ha muerto");
                        arena.comunicarEspectador();
                    }
                }
                ganador = dittuu.getNombrePersonaje();
                break;
            case 4:
                System.out.print(TO_STRING_PERSONAJES);
                arena.setSucesos(TO_STRING_PERSONAJES);
                arena.comunicarEspectador();
                meganMan.cambiarDefensa(new ConDefensa());
                System.out.print(meganMan.cambioDefensaToString(new ConDefensa().getNombre()));
                arena.setSucesos(meganMan.cambioDefensaToString(new ConDefensa().getNombre()));
                while(meganMan.estaVivo() && korby.estaVivo()){
                    korby.atacar(meganMan);
                    System.out.print(korby.atacarToString(meganMan));
                    arena.setSucesos(korby.atacarToString(meganMan));
                    arena.comunicarEspectador();
                    if(!meganMan.estaVivo()){
                        System.out.print("\n" + meganMan.getNombrePersonaje() + " ha muerto");
                        arena.setSucesos("\n" + meganMan.getNombrePersonaje() + " ha muerto");
                        arena.comunicarEspectador();
                    }
                    meganMan.atacar(korby);
                    System.out.print(meganMan.atacarToString(korby));
                    arena.setSucesos(meganMan.atacarToString(korby));
                    arena.comunicarEspectador();
                    if(!korby.estaVivo()){
                        System.out.print("\n" + korby.getNombrePersonaje() + " ha muerto");
                        arena.setSucesos("\n" + korby.getNombrePersonaje() + " ha muerto");
                        arena.comunicarEspectador();
                    }
                }
                dittuu.cambiarAtaque(new LluviaDeCuchillos());
                System.out.print(dittuu.cambioAtaqueToString(new LluviaDeCuchillos().getNombreAtaque()));
                arena.setSucesos(dittuu.cambioAtaqueToString(new LluviaDeCuchillos().getNombreAtaque()));
                arena.comunicarEspectador();
                dittuu.atacar(meganMan);
                System.out.print(dittuu.atacarToString(meganMan));
                arena.setSucesos(dittuu.atacarToString(meganMan));
                arena.comunicarEspectador();
                dittuu.atacar(meganMan);
                System.out.print(dittuu.atacarToString(meganMan));
                arena.setSucesos(dittuu.atacarToString(meganMan));
                arena.comunicarEspectador();
                if(!meganMan.estaVivo()){
                    System.out.print("\n" + meganMan.getNombrePersonaje() + " ha muerto");
                    arena.setSucesos("\n" + meganMan.getNombrePersonaje() + " ha muerto");
                    arena.comunicarEspectador();
                }
                ganador = dittuu.getNombrePersonaje();
                break;
            default:
                System.out.print("\nSolo se cuenta con 4 casos. Intente de nuevo : )");
                break;
        }
        for (Espectador espectador : arena.getEspectadores())
            espectador.ganador(ganador);
    }
}