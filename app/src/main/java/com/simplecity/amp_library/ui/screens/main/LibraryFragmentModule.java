package com.simplecity.amp_library.ui.screens.main;

import android.support.v4.app.Fragment;
import com.simplecity.amp_library.di.app.activity.fragment.FragmentModule;
import com.simplecity.amp_library.di.app.activity.fragment.FragmentScope;
import dagger.Binds;
import dagger.Module;
import javax.inject.Named;

@Module(includes = FragmentModule.class)
public abstract class LibraryFragmentModule {

    @Binds
    @Named(FragmentModule.FRAGMENT)
    @FragmentScope
    abstract Fragment fragment(LibraryController libraryController);
}