package com.example.mygram.api

import com.example.mygram.data.DetailUserResponse
import com.example.mygram.data.GithubResponse
import com.example.mygram.data.ItemsItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("users")
    fun getUsers():Call<ArrayList<ItemsItem>>

    @GET("users/{username}")
    fun getDetailUser(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("search/users")
    fun findUsers(
        @Query("q") q: String
    ): Call<GithubResponse>

    @GET("users/{username}/following")
    fun getUserFollowings(
        @Path("username") username: String
    ): Call<ArrayList<ItemsItem>>

    @GET("users/{username}/followers")
    fun getUserFollowers(
        @Path("username") username: String
    ): Call<ArrayList<ItemsItem>>

}