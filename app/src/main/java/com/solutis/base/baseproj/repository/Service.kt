package com.solutis.base.baseproj.repository

import com.solutis.base.baseproj.repository.consulta.LoginConsulta
import com.solutis.base.baseproj.repository.entidade.Usuario
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * Created by osiascarneiro on 07/11/17.
 */

interface Service {

    @POST("api/v1/oauth/autenticar")
    @Headers("Content-Type: application/json")
    fun login(@Body consulta: LoginConsulta): Single<Usuario>

}