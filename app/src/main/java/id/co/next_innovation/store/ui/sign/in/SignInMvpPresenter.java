package id.co.next_innovation.store.ui.sign.in;

import id.co.next_innovation.store.ui.base.MvpPresenter;

/**
 * Copyright 2017 Winnerawan T
 * Unauthorized copying of this file, via any medium is strictly
 * prohibited Proprietary and confidential
 * Written by Winnerawan T <winnerawan@gmail.com>, September 2017
 */
public interface SignInMvpPresenter<V extends SignInView> extends MvpPresenter<V> {

    void authentication(String email, String password);
}
