package com.example.cosumerestapi.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cosumerestapi.ui.halaman.DestinasiHome
import com.example.cosumerestapi.ui.halaman.HomeScreen
import com.example.cosumerestapi.ui.kontak.screen.DestinasiEntry
import com.example.cosumerestapi.ui.kontak.screen.EntryKontakScreen

@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ){
        composable(DestinasiHome.route) {
            HomeScreen(
                navigasitoItemEntry = { navController.navigate(DestinasiEntry.route) },
                onDetailClick ={} )
        }
        composable(DestinasiEntry.route) {
            EntryKontakScreen(
                navigateBack = {
                    navController.navigate(DestinasiHome.route) {
                        popUpTo(
                            DestinasiHome.route
                        ) { inclusive = true }
                    }
                },
            )
        }
    }
}