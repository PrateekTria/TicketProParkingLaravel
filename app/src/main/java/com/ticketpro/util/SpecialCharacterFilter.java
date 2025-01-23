package com.ticketpro.util;

import android.text.InputFilter;
import android.text.Spanned;

public class SpecialCharacterFilter implements InputFilter {

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        // Regular expression that matches special characters
        String regex = "[^a-zA-Z0-9 ]";  // Only allows alphabets, numbers, and spaces

        // If the input contains special characters, it will be replaced with an empty string
        if (source.toString().matches(regex)) {
            return "";  // Reject the special character
        }

        return null;  // Allow normal characters
    }
}
