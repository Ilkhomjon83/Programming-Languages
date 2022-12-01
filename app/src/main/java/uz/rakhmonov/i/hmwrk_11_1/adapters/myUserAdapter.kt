package uz.rakhmonov.i.hmwrk_11_1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import uz.rakhmonov.i.hmwrk_11_1.R
import uz.rakhmonov.i.hmwrk_11_1.databinding.MyItemBinding
import uz.rakhmonov.i.hmwrk_11_1.models.User

class myUserAdapter(context: Context, var list:ArrayList<User>):ArrayAdapter<User>(context, R.layout.my_item, list ){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var myItemBinding = MyItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        myItemBinding.tvName.text=list[position].name
        myItemBinding.tvImage.setImageResource(list[position].image)



        return myItemBinding.root
    }


}