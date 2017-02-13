package nyc.c4q.tarynking.tarynfinalexam;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tarynking on 2/12/17.
 */

public class SettingsViewHolder extends RecyclerView.ViewHolder{

    private TextView textView;

    public SettingsViewHolder(View itemView) {//get views
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.settings_item_list_textview_id);
    }

    public void bind (int position){
        textView.setText("Setting - " + String.valueOf(position));
    }
}
