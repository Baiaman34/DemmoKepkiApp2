package com.example.demmokepkiapp

import ImageSlideAdapter
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.core.content.ContentProviderCompat.requireContext
//import androidx.viewpager.widget.ViewPager
//import me.relex.circleindicator.CircleIndicator
//
//class ImageSlideFragment {private var imagesModel:ImagesModel? = null
//    lateinit var viewPagerAdapter: ImageSlideAdapter
//    lateinit var indicator: CircleIndicator
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.item2, container, false)
//    }
//
//
//    @Override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        imagesModel?.images?.let{
//            viewPagerAdapter = ImageSlideAdapter(requireContext(), it)
//            ViewPager.adapter = viewPagerAdapter
//            indicator = requireView().findViewById(R.id.indicator) as CircleIndicator
//            indicator.setViewPager(viewpager)
//        }
//    }
//
//}