package com.example.android.navigation.directions;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

import com.example.android.navigation.R;

public class GameWonFragmentDirections {
    private GameWonFragmentDirections() {

    }

    @NonNull
    public static NavDirections actionGameWonFragmentToGameFragment() {
        return new ActionOnlyNavDirections(R.id.action_gameWonFragment_to_gameFragment);
    }
}
