package com.example.user.electricschool.ViewHolder;

import androidx.recyclerview.widget.RecyclerView;
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
                txtsubnamedetail = view.findViewById(R.id.txtsubnamedetail);
                txtTeacherName = view.findViewById(R.id.txtTeacherName);
            }
}
