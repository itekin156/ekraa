package com.example.user.electricschool.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.user.electricschool.R;


public class viewHolderDetail extends RecyclerView.ViewHolder
        {
           public ImageView imageSubdetail;
            public TextView txtsubnamedetail;
            public TextView txtTeacherName;
            public viewHolderDetail(View view)
            {
                super(view);
                imageSubdetail = view.findViewById(R.id.imageSubdetail);
                txtsubnamedetail = (TextView)view.findViewById(R.id.txtsubnamedetail);
                txtTeacherName = (TextView)view.findViewById(R.id.txtTeacherName);
            }
}
