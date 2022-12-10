package com.akscorp.core.di

/**
 * Can contain anything. F.e we can make an observable pattern
 */
abstract class SharedModuleModel<T> {
    abstract var value: T
}