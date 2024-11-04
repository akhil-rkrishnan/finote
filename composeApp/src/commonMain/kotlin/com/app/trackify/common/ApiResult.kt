package com.app.trackify.common

sealed interface ApiResult<T> {
    data class Success<T>(val data: T): ApiResult<T>
    data class Error<R>(val error: R): ApiResult<R>
    data object Loading: ApiResult<Nothing>
}