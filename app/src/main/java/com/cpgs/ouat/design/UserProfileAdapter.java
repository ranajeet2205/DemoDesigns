package com.cpgs.ouat.design;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserProfileAdapter extends RecyclerView.Adapter<UserProfileAdapter.UserProfileViewHolder> {
    private final Context context;
    private List<UserModel> items;

    public UserProfileAdapter(List<UserModel> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public UserProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                    int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_list_item, parent, false);
        return new UserProfileViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UserProfileViewHolder holder, int position) {
        final UserModel item = items.get(position);
        holder.set(item);
        holder.phoneImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+item.getUserMobileNo()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (items == null) {
            return 0;
        }
        return items.size();
    }

    public class UserProfileViewHolder extends RecyclerView.ViewHolder {

        private ImageView userImageView,phoneImageView;
        private TextView userNameTextView,userRollNoTextView;

        public UserProfileViewHolder(View itemView) {
            super(itemView);
            userImageView = itemView.findViewById(R.id.profile_image);
            userNameTextView = itemView.findViewById(R.id.user_name_txt);
            userRollNoTextView = itemView.findViewById(R.id.roll_no_txt);
            phoneImageView = itemView.findViewById(R.id.phone_user_img_view);
        }

        public void set(UserModel item) {
            //UI setting code
            userImageView.setImageResource(item.getUserImage());
            userNameTextView.setText(item.getUserName());
            userRollNoTextView.setText(item.getUserRollNo());
        }
    }
}