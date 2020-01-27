package com.mtjin.androidmoveapp_mvvm.data.api

import com.mtjin.androidmoveapp_mvvm.data.vo.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface TheMovieDBInterface {
    // https://api.themoviedb.org/3/movie/popular?api_key=6e63c2317fbe963d76c3bdc2b785f6d1&page=1  ==> 인기영화목록
    // https://api.themoviedb.org/3/movie/299534?api_key=6e63c2317fbe963d76c3bdc2b785f6d1  ==> ID로 해당영화 상세정보
    // https://api.themoviedb.org/3/ ==> base url

    @GET("movie/{movie_id}")
    fun  getMovieDetails(@Path("movie_id") id: Int) : Single<MovieDetails>
}