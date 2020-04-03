package com.berum.myapplication;

        import androidx.annotation.IntRange;
        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;

public class Sale {

    public @Nullable
    int[] decryptData(@NonNull int[] price,
                      @IntRange(from = 1) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {
//TODO реализовать метод
        int[] drescryptResult = new int[readLength+1];

        for (int i = offset; i<(readLength+1); i++) {
            drescryptResult[i] = (int)Math.floor(price[i]*(100 - discount)/100);
        }

        return drescryptResult;
    }

}
