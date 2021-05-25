package com.yalantis.ucrop.callback;

import android.net.Uri;

import androidx.annotation.NonNull;

public interface BitmapCropCallback {

    //Mariano.py
    //void onBitmapCropped(@NonNull Uri resultUri, int offsetX, int offsetY, int imageWidth, int imageHeight, float imageAngle);
    void onBitmapCropped(@NonNull Uri resultUri, int offsetX, int offsetY, int imageWidth, int imageHeight, float imageAngle);

    void onCropFailure(@NonNull Throwable t);

}
