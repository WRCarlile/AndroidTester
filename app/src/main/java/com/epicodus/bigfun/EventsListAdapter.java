package com.epicodus.bigfun;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class EventsListAdapter extends RecyclerView.Adapter<EventsListAdapter.EventViewHolder> {
    private ArrayList<UserEvents> mEvents = new ArrayList<>();
    private Context mContext;

    public EventsListAdapter(Context context, ArrayList<UserEvents> events) {
        mContext = context;
        mEvents = events;
    }

    @Override
    public EventsListAdapter.EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list, parent, false);
        EventViewHolder viewHolder = new EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EventsListAdapter.EventViewHolder holder, int position) {
        holder.bindEvent(mEvents.get(position));
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.eventName)
        TextView mNameTextView;
        @Bind(R.id.eventDescription) TextView mDescriptionTextView;
        private Context mContext;

        public EventViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindEvent(UserEvents events) {
            mNameTextView.setText(events.getName());
            mDescriptionTextView.setText(events.getDescription());

        }
    }
}