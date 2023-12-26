package com.example.cosumerestapi.repositori

import com.example.cosumerestapi.modeldata.Kontak
import com.example.cosumerestapi.service_api.KontakService

interface KontakRepository{
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
): KontakRepository{
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}