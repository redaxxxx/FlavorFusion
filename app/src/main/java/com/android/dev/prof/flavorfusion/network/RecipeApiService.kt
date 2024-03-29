package com.android.dev.prof.flavorfusion.network

import com.android.dev.prof.flavorfusion.dataSource.Recipe
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface RecipeService{
    @GET("filter.php")
    suspend fun getAllRecipes(@Query("c") type: String): List<Recipe>

}

object RecipeApi{
    val retrofitService: RecipeService by lazy {
        retrofit.create(RecipeService::class.java)
    }
}