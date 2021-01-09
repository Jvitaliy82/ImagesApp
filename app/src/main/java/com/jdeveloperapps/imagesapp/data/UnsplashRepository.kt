package com.jdeveloperapps.imagesapp.data

import com.jdeveloperapps.imagesapp.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}