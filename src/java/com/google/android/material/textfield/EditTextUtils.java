package com.google.android.material.textfield;

import android.widget.EditText;

/* loaded from: classes.dex */
public class EditTextUtils {
    public static boolean isEditable(EditText editText) {
        return editText.getInputType() != 0;
    }
}
