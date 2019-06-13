package com.example.user.electricschool.Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.user.electricschool.Model.detail;

import com.example.user.electricschool.R;
import com.example.user.electricschool.ViewHolder.viewHolderDetail;

import java.util.ArrayList;

public class adapterRecyclerDetail  extends RecyclerView.Adapter<viewHolderDetail>
{

    private Context context;
    private ArrayList<detail> details;
    public adapterRecyclerDetail(Context context, ArrayList<detail> details)
    {
        this.context = context;
        this.details = details;
    }


    @NonNull
    @Override
    public viewHolderDetail onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_detaid_fragment2, viewGroup,false);
        viewHolderDetail viewHolderDetail = new viewHolderDetail(view);
        return viewHolderDetail ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderDetail viewHolderDetail, int position)
    {



        viewHolderDetail.txtsubnamedetail.setText(details.get(position).getNameSubdetail());
        viewHolderDetail.txtTeacherName.setText(details.get(position).getNameTeacherdetail());
        viewHolderDetail.imageSubdetail.setImageResource(details.get(position).getImgSubdetail());

    }

    @Override
    public int getItemCount() {
        return details.size();
    }
}
