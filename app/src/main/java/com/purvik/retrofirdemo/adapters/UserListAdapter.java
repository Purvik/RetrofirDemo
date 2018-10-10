package com.purvik.retrofirdemo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.purvik.retrofirdemo.R;
import com.purvik.retrofirdemo.singleton.SingleUser;

import java.util.List;

/**
 * Created by Purvik Rana on 10-10-2018.
 */
public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder> {

    private List<SingleUser> singleUserList;

    public UserListAdapter(List<SingleUser> singleUserList) {
        this.singleUserList = singleUserList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main, parent, false);
        //create layout and specify here in previous line

        UserViewHolder vh = new UserViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

        //display data from single user node

        SingleUser singleUser = singleUserList.get(position);




    }

    @Override
    public int getItemCount() {
        return singleUserList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder{

        //layout widgets


        public UserViewHolder(View itemView) {
            super(itemView);
            //bind view to widgets
        }
    }
}
