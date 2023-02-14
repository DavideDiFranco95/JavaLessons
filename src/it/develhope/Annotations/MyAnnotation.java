package it.develhope.Annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
//con il @Target... Method viene applicata solo ad un metodo, non alla class
//RetentionPolicy.ClASS = quando la classe viene instanziata, se muore, muore tutto
//RetentionPolicy.RUNTIME = durante il RunTime dell'applicazione
//RetentionPolicy.SOURCE = solo quando sto sviluppando
public @interface MyAnnotation {

    boolean isInProgress();

}
