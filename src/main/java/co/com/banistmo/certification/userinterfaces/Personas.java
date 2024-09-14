package co.com.banistmo.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Personas {
    public static final Target APREDEFACIL  = Target.the("footer aprende facil").locatedBy("//*[@id=\"footer-content\"]/div[2]/div/div/div[2]/div/ul/li[6]/a");
    public static final Target COOKIES  = Target.the("COOKIE").locatedBy("//button[@id=\"btn-aceptar-cookies\"]");

}
