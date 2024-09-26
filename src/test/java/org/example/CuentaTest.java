package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
class CuentaTest {
    @Test
    public void testNombreCuenta(){
        Cuenta cuenta = new Cuenta("Yesser", new BigDecimal(0));
        String nombre_actual = cuenta.getNombre();
        String nombre_esperado = "Yesser";
        assertEquals(nombre_esperado, nombre_actual);
    }

    @Test
    public void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("", new BigDecimal(  100));
        BigDecimal saldo_actual = cuenta.getSaldo();
        assertTrue(saldo_actual.compareTo(new BigDecimal(0)) >= 0);
    }
}