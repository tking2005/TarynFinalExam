package nyc.c4q.tarynking.tarynfinalexam;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tarynking on 2/12/17.
 */

public class NavigationViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;
    ImageView heartIcon;
    ImageView emailIcon;
    ImageView contactsIcon;
    ImageView logoutIcon;

//    public NavigationViewHolder(View itemView) {//get views
//        super(itemView);
//        textView = (TextView)itemView.findViewById(R.id.drawer_list_item_textview);
//        imageView = (ImageView)itemView.findViewById(R.id.drawer_list_item_imageview);
//        heartIcon = (ImageView) itemView.findViewById(R.id.heart_icon);
//        emailIcon = (ImageView) itemView.findViewById(R.id.email_icon);
//        contactsIcon = (ImageView) itemView.findViewById(R.id.contacts_icon);
//        logoutIcon = (ImageView) itemView.findViewById(R.id.logout_icon);
//    }
    public NavigationViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        textView = (TextView)itemView.findViewById(R.id.drawer_list_item_textview);
        imageView = (ImageView)itemView.findViewById(R.id.drawer_list_item_imageview);

    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.drawer_list_item, parent, false);
    }


//    public void bind (ImageViewList imageViewList){
//        textView.setText(imageViewList.getimageText());
////        imageView.setImageResource(imageViewList.getImageViewListID());
//
//    }

    public void bind(final ImageViewList imageViewList) {
        imageView.findViewById(R.id.email_icon);
        textView.setText(R.string.button_1);
    }




}
