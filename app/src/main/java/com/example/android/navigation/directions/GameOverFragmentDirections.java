package com.example.android.navigation.directions;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

import com.example.android.navigation.R;

public class GameOverFragmentDirections {
    private GameOverFragmentDirections() {

    }

    @NonNull
    public static NavDirections actionGameOverFragmentToGameFragment() {
        return new ActionOnlyNavDirections(R.id.action_gameOverFragment_to_gameFragment);
    }
}
