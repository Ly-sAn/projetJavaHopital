package com.company;

public class Regsex {

   /* RegexName : ^([A-Z][a-zÀ-ÖØ-öø-ÿ]+)([- ][A-Z][a-zÀ-ÖØ-öø-ÿ]+){0,1}$
    RegexEmail : ^[a-zA-Z0-9.-]+@[a-zA-Z0-9.-]{2,}.[a-z]{2,4}$
    RegexNuméro : ^((06|07))([-. ]?[0-9]{2}){4}$
    RegexCarteVital : ^[12][ .-]?[0-9]{2}[ .-]?(0[1-9]|[1][0-2])[ .-]?([0-9]{2})[ .-]?[0-9]{3}[ .-]?[0-9]{3}[ .-]?[0-9]{2}$
    RegexAdressByLucky : ^[0-9]{3}([ .-][a-zA-ZÀ-ÖØ-öø-ÿ]{1,50}){2,6}$ */

    String courriel;

    boolean matchRegex = courriel.matches("^[a-zA-Z0-9.-]+@[a-zA-Z0-9.-]{2,}.[a-z]{2,4}$");


}
