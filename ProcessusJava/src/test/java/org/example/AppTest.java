package org.example;



import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest{

 @ParameterizedTest(name = "{0}+{1} le resultat doit etre {1}")
 @CsvSource ({"1,8,9", "0,6,6"})
 void sommeTest(int a , int b, int c) {

     assertEquals(c, App.somme(a , b) ) ;
     assertThat(c).isEqualTo(App.somme(a,b) ) ;
 }
}

