package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int sqrmin, int sqrmax) {
        int z = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= sqrmin && i * i <= sqrmax) {
                z = z + 1;
            }
        }
        return z;
    }
}
