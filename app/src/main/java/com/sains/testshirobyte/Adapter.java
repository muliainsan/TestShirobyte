package com.sains.testshirobyte;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private List<Data.DataBean> list;
    private Context context;

    public Adapter(List<Data.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, final int i) {
        Log.i("fffff",String.valueOf(getItemCount()));
        holder.title.setText(list.get(i).getName());
        holder.desc.setText(list.get(i).getApk_name());
        holder.rate.setText(String.valueOf(list.get(i).getVersion()));
//        holder.image.setText(list.get(i).getTitle());
        Picasso picasso = Picasso.with(context);
        picasso.setIndicatorsEnabled(true);
        picasso.load("http://test.shirobyte.com/image/"+list.get(i).getImage()) //Load the image
////                    .placeholder(R.drawable.ic_placeholder) //Image resource that act as placeholder
////                    .error(R.drawable.ic_error) //Image resource for error
////                    .resize(300, 500)  // Post processing - Resizing the image
                .into(holder.image); // View where image is loaded.

//        holder.ll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Data.DataBean list2 = list.get(i);
//                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra("value", list2);
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout moviesLayout;
        private  TextView title;
        private  TextView desc;
        private TextView rate;
        private ImageView image;
        private LinearLayout ll;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            moviesLayout = itemView.findViewById(R.id.movies_layout);
            title = itemView.findViewById(R.id.tv_judul);
            desc = itemView.findViewById(R.id.tv_desc);
            rate = itemView.findViewById(R.id.tv_rate);
            image = itemView.findViewById(R.id.iv_poster);
            ll = itemView.findViewById(R.id.movies_layout);

        }
    }
}
