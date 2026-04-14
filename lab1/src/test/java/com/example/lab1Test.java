package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class lab1Test {

    // =========================================
    // ISSUE #1: Statement Coverage
    // =========================================

    @Test
    void testSoChaN_StatementCoverage() {
        assertEquals("4 là số chẵn", lab1.checkEvenOdd(4));
    }

    @Test
    void testSoLe_StatementCoverage() {
        assertEquals("3 là số lẻ", lab1.checkEvenOdd(3));
    }

    // =========================================
    // ISSUE #2: Path Coverage
    // Mục tiêu: bao phủ tất cả đường đi
    // =========================================

    // Path 1: số chẵn dương
    @Test
    void testSoChanDuong() {
        assertEquals("4 là số chẵn", lab1.checkEvenOdd(4));
    }

    // Path 2: số lẻ dương
    @Test
    void testSoLeDuong() {
        assertEquals("3 là số lẻ", lab1.checkEvenOdd(3));
    }

    // Path 3: số 0 (trường hợp biên - chẵn)
    @Test
    void testSoKhong() {
        assertEquals("0 là số chẵn", lab1.checkEvenOdd(0));
    }

    // Path 4: số âm chẵn
    @Test
    void testSoAmChan() {
        assertEquals("-2 là số chẵn", lab1.checkEvenOdd(-2));
    }

    // Path 5: số âm lẻ
    @Test
    void testSoAmLe() {
        assertEquals("-1 là số lẻ", lab1.checkEvenOdd(-1));
    }
}