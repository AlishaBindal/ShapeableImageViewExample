package com.alisha.customimageview

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alisha.customimageview.databinding.ActivityMainBinding
import com.google.android.material.shape.CornerFamily

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        circularImageView()
        roundedCornerRadiusImageView()
        selectedRoundedCornerRadiusImageView()
        cornerCutImageView()
        selectedCornerCutImageView()
        setTwoCornersRound()
    }

    private fun circularImageView() {
        val radius = resources.getDimension(R.dimen.circular_image_view_radius)
        with(binding) {
            circularImageView.shapeAppearanceModel =
                    circularImageView
                            .shapeAppearanceModel
                            .toBuilder()
                            .setAllCornerSizes(radius)
                            .build()
        }
    }

    private fun roundedCornerRadiusImageView() {
        val cornerRadius = resources.getDimension(R.dimen.dp_32)
        with(binding) {
            circularImageView1.shapeAppearanceModel =
                    circularImageView1
                            .shapeAppearanceModel
                            .toBuilder()
                            .setAllCornerSizes(cornerRadius)
                            .build()
        }
    }

    private fun selectedRoundedCornerRadiusImageView() {
        val cornerRadius = resources.getDimension(R.dimen.dp_32)
        with(binding) {
            circularImageView2.shapeAppearanceModel =
                    circularImageView2
                            .shapeAppearanceModel
                            .toBuilder()
                            .setTopRightCorner(CornerFamily.ROUNDED, cornerRadius)
                            .setTopLeftCorner(CornerFamily.ROUNDED, cornerRadius)
                            .setBottomRightCorner(CornerFamily.ROUNDED, cornerRadius)
                            .build()
        }
    }

    private fun cornerCutImageView() {
        val cornerRadius = resources.getDimension(R.dimen.dp_32)
        with(binding) {
            circularImageView3.shapeAppearanceModel =
                    circularImageView3
                            .shapeAppearanceModel
                            .toBuilder()
                            .setAllCorners(CornerFamily.CUT, cornerRadius)
                            .build()
        }
    }

    private fun selectedCornerCutImageView() {
        val cornerRadius = resources.getDimension(R.dimen.dp_32)
        with(binding) {
            circularImageView4.shapeAppearanceModel =
                    circularImageView4
                            .shapeAppearanceModel
                            .toBuilder()
                            .setTopRightCorner(CornerFamily.CUT, cornerRadius)
                            .setBottomLeftCorner(CornerFamily.CUT, cornerRadius)
                            .build()
        }
    }

    private fun setTwoCornersRound() {
        val cornerRadius = resources.getDimension(R.dimen.dp_16)
        with(binding) {
            imageView.shapeAppearanceModel =
                    imageView
                            .shapeAppearanceModel
                            .toBuilder()
                            .setTopRightCorner(CornerFamily.ROUNDED, cornerRadius)
                            .setBottomRightCorner(CornerFamily.ROUNDED, cornerRadius)
                            .build()
        }
    }


}