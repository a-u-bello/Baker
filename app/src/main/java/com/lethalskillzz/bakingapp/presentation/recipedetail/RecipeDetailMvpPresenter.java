package com.lethalskillzz.bakingapp.presentation.recipedetail;

import com.lethalskillzz.bakingapp.di.PerActivity;
import com.lethalskillzz.bakingapp.presentation.base.MvpPresenter;

/**
 * Created by ibrahimabdulkadir on 21/06/2017.
 */

@PerActivity
public interface RecipeDetailMvpPresenter<V extends RecipeDetailMvpView> extends MvpPresenter<V> {

    void loadRecipeNameFromRepo(int recipeId);

    void loadIngredientsFromRepo(int recipeId);

    void loadStepsFromRepo(int recipeId);

    void openStepDetails(int recipeId, int stepId);


}

