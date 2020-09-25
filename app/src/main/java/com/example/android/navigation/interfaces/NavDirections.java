package com.example.android.navigation.interfaces;

import android.os.Bundle;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

/**
 * An interface that describes a navigation operations: action's id and arguments
 * */
public interface NavDirections {

    /**
     * Returns an actions id to navigate with
     *
     * @return id of an action*/
    @IdRes
    int getActionId();

    /**
     * Returns arguments to pass to the description*/
    @NonNull
    Bundle getArguments();
}

