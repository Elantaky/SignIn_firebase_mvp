package com.abdelazim.x.signin_firebase_mvp.Utils;

import android.support.annotation.NonNull;

import com.abdelazim.x.signin_firebase_mvp.signin.SignInContract;
//hold firebase
/*import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;*/

public class AuthManager {

    private SignInContract.ModelCallbacks modelCallbacks;

    //hold firebase
    //private FirebaseAuth firebaseAuth;

    public AuthManager(SignInContract.ModelCallbacks modelCallbacks) {

        this.modelCallbacks = modelCallbacks;
        //hold firebase
        //firebaseAuth = FirebaseAuth.getInstance();
    }

    public void signIn(String email, String password) {
//hold firebase
        /*firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        modelCallbacks.onSignInSuccess();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        modelCallbacks.onSignInFailure(e.getMessage());
                    }
                });*/
    }

    public void register(final String email, final String password, final String userName, final String phoneNumber) {
//hold firebase
        /*firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        modelCallbacks.onRegisterSuccess(firebaseAuth.getUid(), email, password, userName, phoneNumber);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        modelCallbacks.onRegisterFailure(e.getMessage());
                    }
                });*/
    }
}
