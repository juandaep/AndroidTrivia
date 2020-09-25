package com.example.android.navigation.directions;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

import com.example.android.navigation.R;

public class TitleFragmentDirections {
    private TitleFragmentDirections() {

    }

    @NonNull
    public static NavDirections actionTitleFragmentToGameFragment() {
        return new ActionOnlyNavDirections(R.id.action_titleFragment_to_gameFragment);
    }
}
