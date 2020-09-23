package com.kim344.kotlinbasicsample

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kim344.kotlinbasicsample.databinding.PopUpBinding
import kotlinx.android.synthetic.main.activity_full.*


class Day24Activity : AppCompatActivity() {
    var isShow = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full)

        title_text.setOnClickListener {
            if (isShow) {
                Util.APP_THEME
                dim_popup.visibility = View.GONE
                isShow = false
            } else {
                Util.DIM_THEME
                dim_popup.visibility = View.VISIBLE
                isShow = true
            }
        }
    }
}

class PopUp @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) :
    FrameLayout(context, attrs, defStyleAttr) {

    /*
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    private val view: View = layoutInflater.inflate(
        R.layout.pop_up, // Custom view/ layout
        root_layout, // Root layout to attach the view
        false // Attach with root layout or not
    )
    */

    private var binding = DataBindingUtil.inflate<PopUpBinding>(
        LayoutInflater.from(context),
        R.layout.pop_up, this, false
    )

    init {
        var params = binding.root.layoutParams as FrameLayout.LayoutParams
        params.gravity = Gravity.CENTER
        addView(binding.root)
    }
}


