package com.heronet.compon.ui.data

import android.content.Context
import androidx.room.Room
import com.heronet.compon.ui.data.db.ComponDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideComponDb(@ApplicationContext context: Context) = Room
        .databaseBuilder(context, ComponDb::class.java, "compon_db")
        .fallbackToDestructiveMigration()
        .build()

    @Singleton
    @Provides
    fun provideComponDao(db: ComponDb) = db.getComponDao()
}