package com.example.week6day1;

import android.arch.lifecycle.ViewModel;
import android.content.Intent;
import android.view.View;

public class UserViewModel extends ViewModel{
    User user;

    public UserViewModel() {
        user  = new User("", "", "");
    }


//public String getUserName(){
//        return user.getName();
//}
//
//public String getFavBook(){
//        return user.getFavBook();
//}
//
//public String getFavMovie(){
//        return user.getFavMovie();
//}

public void nameUserChanged(CharSequence s){
    user.setName(s.toString());
}

public void favBookChanged(CharSequence s){
        user.setFavBook(s.toString());
}

public void favMovieChanged(CharSequence s){
        user.setFavMovie(s.toString());
}

public void handleClick(View view){
    Intent intent = new Intent(view.getContext(), Main2Activity.class);
    intent.putExtra("user", user);
    view.getContext().startActivity(intent);
}
}
